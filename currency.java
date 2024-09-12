public class  note {
    public static void main(String[]args){
        int cur = 15530;
        int fi_th = cur/5000;
        System.out.println("Five-thousand: "+fi_th);
        cur = cur % 5000;
        int thou = cur/1000;
        System.out.println("One-thousands: " +thou);
        cur = cur % 1000;
        int fi_hun = cur/500;
        System.out.println("Five-hundred: " +fi_hun);
        cur = cur % 500;
        int hun = cur / 100;
        System.out.println("One-hundred: "+hun);
        cur = cur % 100;
        int fifty = cur / 50;
        System.out.println("Fifty: " +fifty);
        cur = cur % 50;
        int twen = cur / 20;
        System.out.println("Twenty: "+twen);
        cur = cur%20;
        int ten = cur / 10;
        System.out.println("Ten: " + ten);
    }
}