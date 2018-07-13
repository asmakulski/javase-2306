package ex_ReturnVoid;

public class ReturnVoid {

    public static void main(String[] args) {

        method();
    }

    static int i = 4;

    public static void method(){
        if(i % 2 == 0){
            return;
        }
        System.out.println("some text");
    }
}
