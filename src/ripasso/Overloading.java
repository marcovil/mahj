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

        System.out.println("Chiamate su aD");
        aD.m(theString, theInt, theLong);
        // aD.m(theString, theInt, theInt);
        aD.m(theString, theLong, theInt);
        aD.m(theString, theLong, theLong);
        aD.m(theObject, theLong, theLong);
        aD.m(theObject, theInt, theInt);

        System.out.println("Chiamate su anotherD");
        anotherD.m(theString, theInt, theLong);
        // anotherD.m(theString, theInt, theInt);
        anotherD.m(theString, theLong, theInt);
        anotherD.m(theString, theLong, theLong);
        anotherD.m(theObject, theLong, theLong);
        anotherD.m(theObject, theInt, theInt);

        System.out.println("Chiamate su aB");
        aB.m(theString, theInt, theLong);
        // aB.m(theString, theInt, theInt);
        aB.m(theString, theLong, theInt);
        aB.m(theString, theLong, theLong);
        aB.m(theObject, theLong, theLong);
        aB.m(theObject, theInt, theInt);



    }
    
}
