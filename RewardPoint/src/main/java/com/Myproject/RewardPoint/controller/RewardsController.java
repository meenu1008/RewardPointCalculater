package com.Myproject.RewardPoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Myproject.RewardPoint.entity.Customer;
import com.Myproject.RewardPoint.model.Rewards;
import com.Myproject.RewardPoint.repository.CustomerRepository;
import com.Myproject.RewardPoint.service.RewardsService;

@RestController
@RequestMapping("/customers")
public class RewardsController {

    /*@Autowired
    RewardsService rewardsService;

    @Autowired
    CustomerRepository customerRepository;*/
	@GetMapping(value = "/hi")
    public void hi() {
    	System.out.println("I am here");
    }
    
    
	/*
	 * @GetMapping(value = "/{customerId}/rewards",produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<Rewards>
	 * getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
	 * System.out.println("I am here"); Customer customer =
	 * customerRepository.findByCustomerId(customerId);
	 * System.out.println("customer" +customer); if(customer == null) { throw new
	 * RuntimeException("Invalid / Missing customer Id "); } Rewards customerRewards
	 * = rewardsService.getRewardsByCustomerId(customerId); return new
	 * ResponseEntity<>(customerRewards,HttpStatus.OK); }
	 */

}
