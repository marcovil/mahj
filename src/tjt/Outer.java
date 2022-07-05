package tjt;

class Outer {

    int x;
    int y;

    Outer() {
        int x = 0;
        int y = 0;
    }

    Outer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String n1 = "n1Outer";
    static String n2 = "n2Outer";

    class Inner {

        String n1 = "n1Inner";
        static String n2 = "n2Inner";

        void mult() {
            System.out.println(x*y);
        }

    }
}

