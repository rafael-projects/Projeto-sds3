package com.devsuperior.DsVendas.repositores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.DsVendas.dto.SaleSuccessDTO;
import com.devsuperior.DsVendas.dto.SaleSumDTO;
import com.devsuperior.DsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	@Query("SELECT new  com.devsuperior.DsVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new  com.devsuperior.DsVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
} 
