// Example 118 from page 89 of Java Precisely third edition (The MIT Press 2016)
// Author: Peter Sestoft (sestoft@itu.dk)

import java.util.Date;

class Pair<T,U> {
  public final T fst;
  public final U snd;
  public Pair(T fst, U snd) {
    this.fst = fst;
    this.snd = snd;
  } 
}

class Example118 {
  public static void main(String[] args) {
    Pair<String,Integer> p1 = new Pair<>("Niels", 1947);
    Pair<Double,Integer> p2 = new Pair<>(2.718, 1);
    Pair<Date,String> p3 = new Pair<>(new Date(), "now");
    System.out.println("(" + p1.fst + ", " + p1.snd + ")");
    System.out.println("(" + p2.fst + ", " + p2.snd + ")");
    System.out.println("(" + p3.fst + ", " + p3.snd + ")");
  }
}

