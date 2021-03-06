package com.qa.createticketservice.persistence.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tickets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "title")
	private String title;

	@Column(name = "complete")
	private Boolean complete;

	public Tickets(String name, String description, String title, Boolean complete) {
		super();
		this.name = name;
		this.description = description;
		this.title = title;
		this.complete = complete;
	}

}
