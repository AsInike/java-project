
import java.util.Scanner;
public class vehicle {
    public static void main(String[] args) {
        System.out.print("List of vehicle types : \n1.Motor Bike\n2.Car\n3.Trucks\n4.Tuk-Tuk\n\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("What type of your vehicle ?"); 
        String a = scan.nextLine() ;
        System.out.println("May we have your vehicle plate number ?");
        String b = scan.nextLine() ;
        lan_type new_lan= new lan_type(a, b);

        new_lan.confirm_message();

    }
}
 jjhgjhnhgjhgjh ngjh