
/**
 * @author Max Pattman
 * @Version 1.0
 *
 * Public class Checkout
 *
 */
public class Checkout {
    public static void main(String[] args){
        final String[] ShoppingList = {"apple","apple","orange"};
        double total = checkout(ShoppingList);
          System.out.println(" Total "+"£"+Double.toString(total));
    }

    static double checkout(String[] ShoppingList){
        double appletotal = 0;
        double orangetotal = 0;
        for (String item:
                ShoppingList) {
            switch (item){
                case ("apple"): appletotal += scanApple();
                        break;
                case ("orange"): orangetotal += scanOrange();
                        break;

                default: System.out.println("this item doesn't exist");
            }
        }
        return (appletotal + orangetotal);
    }
    static double  scanApple(){ return 0.6;}
    static double scanOrange(){return 0.25;}
    }








