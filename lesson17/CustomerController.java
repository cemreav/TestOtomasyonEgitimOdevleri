package lesson17;

import java.util.List;

public class CustomerController<Customer> {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    public void showCustomer(){
        List<Customer> customers= (List<Customer>) customerService.getAllCustomers();
        // Customers listesini işleyin.
    }
    public void addCustomer(){
        Customer customer= (Customer) new Customer3();
        // Müşteri bilgilerini alın.
        // ...
        // Müşteriyi veritabanına ekleyin.
        Customer Customer = (Customer) new Customer3();
        Customer Customer3 = null;
        //customerService.addCustomer(Customer3);
    }
    public void updateCustomer(){
        Customer customer = (Customer) new Customer3();
        // Müşteri bilgilerini alın.
        // ...
        // Müşteriyi veritabanında güncelleyin.
        Customer Customer3 = null;
        //customerService.updateCustomer(Customer3);
    }
    public void deleteCustomer(){
        int id =1;
        // Müşteriyi veritabanından silin.
        customerService.deleteCustomer(id);
    }
}

