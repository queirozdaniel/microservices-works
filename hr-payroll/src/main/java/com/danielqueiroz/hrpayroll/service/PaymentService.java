package com.danielqueiroz.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.danielqueiroz.hrpayroll.model.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		// TODO: Buscar dados de trabalhador em Serviço Worker
		
		return new Payment("Bob", 200.0, days);
	}
	
}
