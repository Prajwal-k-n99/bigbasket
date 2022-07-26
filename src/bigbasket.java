import java.util.Scanner;

class Fruits {
    int quantity;
    float rate, price1,price2,price3,price4,fruitsprice;

    void apple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the apples");
        quantity = sc.nextInt();
        System.out.println("Enter the rate/kg");
        rate = sc.nextInt();
        price1 = quantity * rate;
        System.out.printf("%d*%f = %f\n", quantity, rate, price1);
    }

    void oranges() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the oranges");
        quantity = sc.nextInt();
        System.out.println("Enter the rate/kg");
        rate = sc.nextInt();
        price2 = quantity*rate;
        System.out.printf("%d*%f = %f\n", quantity, rate, price2);
    }

    void grapes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the grapes");
        quantity = sc.nextInt();
        System.out.println("Enter the rate/kg");
        rate = sc.nextInt();
        price3 = quantity * rate;
        System.out.printf("%d*%f = %f\n", quantity, rate, price3);
    }

    void bananas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the bananas");
        quantity = sc.nextInt();
        System.out.println("Enter the rate/kg");
        rate = sc.nextInt();
        price4 = quantity * rate;
        System.out.printf("%d*%f = %f\n", quantity, rate, price4);
    }
    float fprice(){
       return fruitsprice = price1+price2+price3+price4;
    }

}
    class Vegetables {
        int quantity;
        float rate, vprice,price5,price6;

        void onions() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select the onions");
            quantity = sc.nextInt();
            System.out.println("Enter the rate/kg");
            rate = sc.nextInt();
            price5 = quantity * rate;
            System.out.printf("%d*%f = %f\n", quantity, rate, price5);
        }

        void potato() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select the potato");
            quantity = sc.nextInt();
            System.out.println("Enter the rate/kg");
            rate = sc.nextInt();
            price6 = quantity * rate;
            System.out.printf("%d*%f = %f\n", quantity, rate, price6);
        }
        float vprice(){
            return vprice = price5+price6;
        }

    }
    class Payment{
        long cardno;
        int otp,upino;
            void cardpayment() {
            System.out.println("Do the payment using debit/credit cards");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the card number,cvv");
            cardno = sc.nextLong();
            System.out.println("Enter the otp");
            otp = sc.nextInt();
            System.out.println("Confirm the payment");
        }
    void upipayment(){
        System.out.println("Do the payment using upi");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upi no");
        upino = sc.nextInt();
    }

}
class cart{
    public static void main(String[] args) {
        float payment;
        Fruits frt = new Fruits();
        Vegetables vgt = new Vegetables();
        Payment pmt = new Payment();
        payment = frt.fprice() + vgt.vprice() ;
        frt.apple();
        frt.oranges();
        frt.grapes();
        frt.bananas();
        vgt.potato();
        vgt.onions();
        System.out.println("Total payment is Rs " + payment);
        pmt.cardpayment();
        pmt.upipayment();
        System.out.println("Payment has been done5");

    }
}
