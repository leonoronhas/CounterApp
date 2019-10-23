package leonoronhas.counterapp;

public class CountOdd implements Runnable{
    private int oddNumber = 1;

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Odd numbers: " + oddNumber);
            oddNumber += 2;
        }
    }
}
