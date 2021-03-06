/*implementaçaõ básica de um serviço que depende de um repository,tendo um metodo para buscar yodos no repository*/
package com.devsuperior.DsVendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.DsVendas.dto.SaleDTO;
import com.devsuperior.DsVendas.dto.SaleSuccessDTO;
import com.devsuperior.DsVendas.dto.SaleSumDTO;
import com.devsuperior.DsVendas.entities.Sale;
import com.devsuperior.DsVendas.repositores.SaleRepository;
import com.devsuperior.DsVendas.repositores.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
	

	

	
}
