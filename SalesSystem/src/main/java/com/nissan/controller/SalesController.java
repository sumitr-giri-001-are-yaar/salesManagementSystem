package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.entity.Sales;
import com.nissan.service.ISalesService;

@CrossOrigin
@RestController
@RequestMapping("/api/salesVist")
public class SalesController {
@Autowired
private ISalesService salesService;
//	
//	private APIResponse apiResponse;
//	
//	// get all users (Purchase Manager)
	@GetMapping
	public List<Sales> getAllSales() {
		return salesService.getAll();
		
	}
//	
//	// get user(Purchase Manager) by ID 
//	@GetMapping("{id}")
//	public ResponseEntity<APIResponse> getUserById(@PathVariable Integer id) {
//		apiResponse = userService.findUserById(id);
//		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
//	}
//	

	@PostMapping("{id}")
	public Sales addUserDetails(@RequestBody Sales sales, @PathVariable Integer id)
	{
                       return salesService.addUserDetails(sales, id);

       }
//	
//	// delete user using user(Purchase Manager) id 
	@DeleteMapping("{id}")
public void deleteUser(@PathVariable Integer id) {
	salesService.deleteUserbyId(id);
	
	}
//	
//	
//	@PutMapping("{id}")
//public Sales updateUserDetails(@RequestBody Sales sales, @PathVariable Integer id) {
//return 	 salesService.updateUserDetailsById(sales, id);
//	
	
}
