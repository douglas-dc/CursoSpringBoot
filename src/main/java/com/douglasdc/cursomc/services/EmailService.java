package com.douglasdc.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.douglasdc.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
