package lesson17;

import java.util.List;

public class CustomerController {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    public void showCustomer(){
        List<Customer> customers=customerService.getAllCustomers();
        // Customers listesini işleyin.
    }
    public void addCustomer(){
        Customer customer= new Customer();
        // Müşteri bilgilerini alın.
        // ...
        // Müşteriyi veritabanına ekleyin.
        customerService.addCustomer(customer);
    }
    public void updateCustomer(){
        Customer customer = new Customer();
        // Müşteri bilgilerini alın.
        // ...
        // Müşteriyi veritabanında güncelleyin.
        customerService.updateCustomer(customer);
    }
    public void deleteCustomer(){
        int id =1;
        // Müşteriyi veritabanından silin.
        customerService.deleteCustomer(id);
    }
}

