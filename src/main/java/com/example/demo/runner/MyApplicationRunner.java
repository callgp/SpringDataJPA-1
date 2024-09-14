package com.example.demo.runner;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepositoty;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Autowired
	OrderRepositoty orderRepo;
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
 //        Order order=new Order("orderid#101001",LocalDate.of(2024,9, 13),"shipped");
 //        orderRepo.save(order);
//	}
	
	
	//save upsert method does insert as above if id exists as inserted above will do update n below step if i change status to received from shipped
//	@Override
	public void run(ApplicationArguments args) throws Exception {
 //        Order order=new Order("orderid#101001",LocalDate.of(2024,9, 13),"received");
    //     orderRepo.save(order);
	//}
	
	Optional<Order> opt=orderRepo.findById("orderid#101001");
	System.out.println("opt is"+opt);
	if(opt.isPresent()) {
		Order order = opt.get();
		System.out.println("values are "+ order.getId() + "  "+order.getStatus());
	}
	
	
	
	}
}
