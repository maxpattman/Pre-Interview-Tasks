
/**
 * @author Max Pattman
 * @Version 1.0
 *
 * Public class Checkout
 *
 */
public class Checkout {
    public static int appleCount;
    public static int orangeCount;
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
    static double  scanApple(){
           appleCount += 1;
          if (appleCount == 2){
             appleCount = 0;
             return 0;
          }else {
          return 0.6;}
    }
    static double scanOrange(){
         orangeCount+= 1;
         if (orangeCount == 3){
             orangeCount=0;
             return 0;
         }else{

          return 0.25;}
    }
}















