package com.filipemscourse.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipemscourse.hrpayroll.entities.Payment;
import com.filipemscourse.hrpayroll.entities.Worker;
import com.filipemscourse.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	public WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
