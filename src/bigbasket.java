 class bigbasket {
    String fruits;
    String vegetables;
    String snacks;
    String meat;
    String payment;
    void fruits(){
        System.out.println("Select the fruits");
    }
    void vegetables(){
        System.out.println("Select the vegetables");
    }
    void snacks(){
        System.out.println("Select the snacks");
    }
    void meat(){
        System.out.println("Select the meat");
    }
    void payment(){
        System.out.println("Do the payment");
    }
}
class ecommerce{
    public static void main(String[] args) {
        bigbasket bb = new bigbasket();
        bb.fruits();
        bb.vegetables();
        bb.snacks();
        bb.meat();
        bb.payment();
    }
}
