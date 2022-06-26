package ripasso;

public class D {
    void m(Object o, long x, long y) {
        System.out.println("D1");
    } // D1

    void m(String s, int x, long y) {
        System.out.println("D2");
    } // D2

    void m(Object o, int x, long y) {
        System.out.println("D3");
    } // D3

    void m(String s, long x, int y) {
        System.out.println("D4");
    } // D4
}
