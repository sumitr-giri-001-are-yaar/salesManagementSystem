package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.entity.Sales;

@Repository
public interface ISalesDao extends JpaRepository<Sales, Integer> {

}
