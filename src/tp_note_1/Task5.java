package tp_note_1;
import java.util.Scanner;

public class Task5{
    public static void main(String[] args){
        double dollar;
        double riels;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money from Riels into Dollars.");
        System.out.println("Convertion rate is: 1USD = 4000Riels");
        System.out.println("Please input money in Riels:");
        riels = sc.nextDouble();
        if(riels<4000){

        }
        dollar = riels / 4000;
        System.out.println(riels+"Riels = "+dollar+"USD");


    }
}