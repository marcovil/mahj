package tjt;

class OuterTest {

    public static void main(String[] args) {
        Outer outerobj = new Outer();
        Outer outerobj2 = new Outer(3,4);
        System.out.println(outerobj.n1);
        System.out.println(outerobj.n2);
        System.out.println(Outer.n2);
        Outer.Inner innerobj = outerobj.new Inner();
        Outer.Inner innerobj2 = outerobj2.new Inner();
        System.out.println(innerobj.n1);
        System.out.println(innerobj.n2);
//        System.out.println(Inner.n2);
        innerobj.mult();
        innerobj2.mult();
    }

}
