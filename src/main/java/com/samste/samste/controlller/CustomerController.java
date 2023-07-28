package com.samste.samste.controlller;

import com.samste.samste.model.Customer;
import com.samste.samste.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer") // Global path for all endpoints in this controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(String name, String email, Integer age) {}

    @PostMapping
    public Customer addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setAge(request.age);
        customer.setEmail(request.email);
        customer.setName(request.name);
        customerRepository.save(customer);
        return customer;
    }

    @DeleteMapping("{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepository.deleteById(id);
        return "Customer Deleted";
    }

    @PutMapping("{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomerRequest request) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            return null;
        } else {
            customer.setAge(request.age);
            customer.setEmail(request.email);
            customer.setName(request.name);
            return customerRepository.save(customer);
        }
    }
}
