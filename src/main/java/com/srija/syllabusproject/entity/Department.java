package com.srija.syllabusproject.entity;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Semester> semester;
	
//	  public Long getId() { return id; }
//	    public void setId(Long id) { this.id = id; }
//
//	    public String getName() { return name; }
//	    public void setName(String name) { this.name = name; }
	
	
	
	
	
	
	
}
