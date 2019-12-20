package tp_note_1;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        int duration;
        double cost;
        int hourdur,mindur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input start hour:");
        int starthour = sc.nextInt();
        System.out.println("Input start minute:");
        int startminute = sc.nextInt();
        System.out.println("Input start second:");
        int startsecond = sc.nextInt();
        System.out.println("This is your start time input.");
        System.out.println(starthour+":"+startminute+":"+startsecond);
        System.out.println("Input end hour:");
        int endhour = sc.nextInt();
        System.out.println("Input end minute:");
        int endminute = sc.nextInt();
        System.out.println("Input end second:");
        int endsecond = sc.nextInt();    
        System.out.println("This is your end time input.");
        System.out.println(endhour+":"+endminute+":"+endsecond);
        hourdur = endhour - starthour;
        mindur = endminute - startminute;
        if(hourdur>=1){
            hourdur = hourdur * 60;
        }
        duration = hourdur + mindur;
        System.out.println("The total duration in minute is "+duration+"mins");
        cost = duration * 0.05;
        System.out.println("The total cost is"+cost+"$");
    }
}
