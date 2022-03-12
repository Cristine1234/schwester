package br.com.fiap.goldenhour.questionnaire.dao.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pain_location")
public class PainLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "pain_location_id_seq")
	@SequenceGenerator(name = "pain_location_id_seq", allocationSize = 1)
	private Long id;

	private String name;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
}
