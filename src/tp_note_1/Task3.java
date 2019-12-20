package tp_note_1;
import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input hour:");
        int hour = sc.nextInt();
        System.out.println("Input minute:");
        int minute = sc.nextInt();
        System.out.println("Input second:");
        int second = sc.nextInt();
        System.out.println("This is your input.");
        System.out.println(hour+":"+minute+":"+second);
        if(hour>=1){
            hour= hour * 3600;
        }
        if(minute>=1){
            minute= minute * 60;
        }
        int total_second = hour + minute + second;
        System.out.println("The total second="+total_second);
    }
}