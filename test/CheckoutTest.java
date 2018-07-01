/**
 * @author Max Pattman
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutTest {

    @Test
    public void main() {
    }

    @Test
    public void checkout() {
        String[] items = {"apple","apple","orange","apple"};
        double result = Checkout.checkout(items);
        assertTrue( result == 2.05);
    }

    @Test
    public void scanApple() {
        String x = Double.toString(Checkout.scanApple());
        System.out.println(x);
        assertEquals("0.6",x );
    }

    @Test
    public void scanOrange() {
        String x  = Double.toString(Checkout.scanApple());
        System.out.println(x);
        assertEquals(0.25,x);
    }

     @Test
    public void buyOneGetOneFree(){
        String[] items = {"apple","apple"};
        double result = Checkout.checkout(items);
        assertTrue(result == 0.6) ;
    }
      @Test
     public void threeForTwo(){
        String[]items = {"orange","orange","orange"};
        double result = Checkout.checkout(items);
        assertTrue(result == 0.5);

}
}

