package lesson18;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Customer2 {
    public Customer2(String john, String s) {
    }

    @Test
    public <Customer1> void testCustomerName(){
        Customer1 customer = (Customer1) new Customer2("john", "john@example.com");
    }
    @Test
    public <Customer1> void testCustomerEmail(){
        Customer1 customer = (Customer1) new Customer2 ("John", "john@example.com");

        assertEquals("john@example.com", customer.getClass());
    }
}

