package com.samste.samste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SamsteApplication {
//	private final CustomerRepository customerRepository;
//
//	public SamsteApplication(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SamsteApplication.class, args);
	}
//	@GetMapping
//	public List<Customer> getCustomers(){
//		return  customerRepository.findAll();
//	}
//
//	record NewCustomerRequest(String name, String email, Integer age){}
//	@PostMapping
//	public Customer addCustomer(@RequestBody NewCustomerRequest request){
//		Customer customer=new Customer();
//		customer.setAge(request.age);
//		customer.setEmail(request.email);
//		customer.setName(request.name);
//		customerRepository.save(customer);
//		return customer;
//	}
	//My method
//    record DeleteCustomer(Integer id){}
//	@DeleteMapping
//	public String deleteCustomer(@RequestBody DeleteCustomer request){
//		customerRepository.deleteById(request.id);
//		return "Customer Deleted";
//	}

	//Amigo Method
//	@DeleteMapping("{customerId}")
//	public String deleteCustomer(@PathVariable("customerId") Integer id){
//		customerRepository.deleteById(id);
//		return "Customer Deleted";
//	}
//
//	@PutMapping("{customerId}")
//	public Customer updateCustomer(@PathVariable("customerId") Integer id,@RequestBody NewCustomerRequest request){
//		Customer customer=customerRepository.findById(id).orElse(null);
//		if(customer==null){
//			return null;
//		}
//		else{
//			customer.setAge(request.age);
//			customer.setEmail(request.email);
//			customer.setName(request.name);
//			return customerRepository.save(customer);
//
//		}
//
//	}

//	@GetMapping
//	public Customer home(){
//		return new Customer(1, "Prajwal");
//	}
//	class Customer{
//		private int Id;
//		private String name;
//		public Customer(){}
//		public Customer(int id, String name){
//			this.Id = id;
//			this.name = name;
//		}
//
//		public int getId() {
//			return Id;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//	}

}
