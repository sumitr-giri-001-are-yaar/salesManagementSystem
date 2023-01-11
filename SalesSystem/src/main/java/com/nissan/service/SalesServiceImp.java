/**
 * 
 */
package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ISalesDao;
import com.nissan.entity.Sales;

/**
 * @author NDH00880
 *
 */
@Service
public class SalesServiceImp implements ISalesService {

	@Autowired
	ISalesDao salesDao;
	@Override
	public List<Sales> getAll() {
		// TODO Auto-generated method stub
		return salesDao.findAll() ;
	}
	@Override
	public Sales addUserDetails(Sales sales, Integer id) {
		return salesDao.save(sales);
		
	}
	@Override
	public void deleteUserbyId(Integer id) {
		
		salesDao.deleteById(id);
	}
	
	
	
}
