package ex_Threads;

public class Example_Threads implements Runnable {

    private int id;

    public Example_Threads(int id){
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread: " + id);
            try {
                Thread.sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Example_Threads example_threads = new Example_Threads(4);
        example_threads.run();


    }
}
