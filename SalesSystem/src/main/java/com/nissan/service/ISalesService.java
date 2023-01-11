package com.nissan.service;

import java.util.List;

import com.nissan.entity.Sales;

public interface ISalesService {

	List<Sales> getAll();

	Sales addUserDetails(Sales sales, Integer id);

	void deleteUserbyId(Integer id);

//	Sales updateUserDetailsById(Sales sales, Integer id);

}
