package ripasso;

public class Overloading {

    public static void main(String[] args) {
        Object theObject = null;
        String theString = "CIAO";
        int theInt = 5;
        long theLong = 12;
        C aC = new C();
        D aD = new D();
        D anotherD = new C();
        B aB = new B();

        System.out.println("Chiamo p con un String");
        aC.p(theString);

        System.out.println("Chiamate su aC");
        aC.m(theObject, theInt, theLong);
        // aC.m(theString, theInt, theInt);
        aC.m(theString, theLong, theInt);
        aC.m(theString, theLong, theLong);
        aC.m(theObject, theLong, theLong);
        aC.m(theObject, theInt, theInt);

    }
    
}
