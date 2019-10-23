package leonoronhas.counterapp;

public class CountEven implements Runnable{

    private int even = 0;
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Even numbers: " + even);
            even += 2;
        }
    }
}
