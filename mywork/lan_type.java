
public class lan_type {
    String vehicle_type;
    String vehicle_plateNum;

    lan_type(String vehicle_type,String vehicle_plateNum){
        this.vehicle_type=vehicle_type;
        this.vehicle_plateNum=vehicle_plateNum;
    }
    void confirm_message(){
        System.out.println("Just to confirm !!!");
        System.out.println("\nYour vehicle type is "+vehicle_type);
        System.out.println("          & ");
        System.out.println("Your vehicle plate number is "+vehicle_plateNum);
        //System.out.println("\n\nThank q for visitig our site\n\n");
    }
}
