package fundamentals.datatypes_basics;

import java.util.Random;

public class Arrays {

    private static final int LENGTH = 6; //constant
    private static final int MAX_TICKET_NUMBER = 69;
    static Random random = new Random();

    public static void main(String[] args) {
        // Create lotto quick pick app that will generate a lotto ticket with 6 random numbers between 1-69
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        for(int i = 0; i< LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i = 0; i< LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

}
