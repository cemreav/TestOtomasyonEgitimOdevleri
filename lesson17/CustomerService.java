package lesson17;

import java.util.List;

public class CustomerService{
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
    public void updateCustomer(Customer customer){
        customerRepository.update(customer);
    }
    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }
    public interface CustomerRepository {
        List<Customer> findAll();
        void save(Customer customer);
        void update(Customer customer);
        void deleteById(int id);
    }
}
public class Main {
    public static void main(String[] args) {
        // Hibernate'i bağlayın.
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        // CustomerService nesnesi oluşturun.
        CustomerService customerService = new CustomerService(new CustomerRepository(sessionFactory));
        // Presentation Layer nesnesi oluşturun.
        CustomerController customerController = new CustomerController(customerService);

        // Müşterileri gösterin.
        customerController.showCustomers();
        // Müşteri ekleyin.
        customerController.addCustomer();
        // Müşteriyi güncelleyin.
        customerController.updateCustomer();
        // Müşteriyi silin.
        customerController.deleteCustomer();
    }
}
