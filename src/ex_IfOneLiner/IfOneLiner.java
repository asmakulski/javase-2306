package ex_IfOneLiner;

public class IfOneLiner {

    public static void main(String[] args) {

        fiveLiner();
        oneLiner();
    }

    static int a = 1;
    static int b = 2;
    static int c = 3;

    public static void fiveLiner(){
        if (a > b) {
            c = a;
        }else {
            c = b;
        }
        System.out.println("Five liner: " + c);
    }

    // inny zapis tego samego co w powyzszej metodzie:
    // (waunek) ? pierwsze_wyrazenie : drugie_wyrazenie
    public static void oneLiner(){
        int c = (a > b) ? a : b;
        System.out.println("One liner: " + c);
    }


}
