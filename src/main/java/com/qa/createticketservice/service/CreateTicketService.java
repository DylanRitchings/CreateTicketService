package com.qa.createticketservice.service;

import com.qa.createticketservice.persistence.domain.Tickets;
import com.qa.createticketservice.persistence.repo.TicketRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class CreateTicketService {

	private TicketRepo repo;


	public Tickets create(Tickets ticket) {
//		ticket.setCreatedAt(getTime());
//		TODO: Use time service here
		ticket.setCreatedAt(LocalDateTime.now());
		Tickets created = this.repo.save(ticket);
		return created;	
	}

}
