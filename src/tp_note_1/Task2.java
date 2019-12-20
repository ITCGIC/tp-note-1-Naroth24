package tp_note_1;
import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input second:");
        int second = sc.nextInt();
        int hour;
        int minute;
        hour= second / 3600;
        second = second % 3600;
        minute = second / 60;
        second = second % 60;

        System.out.println(hour+":"+minute+":"+second);
    }
}