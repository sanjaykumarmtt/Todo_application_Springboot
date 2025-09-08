package com.class_1exta_1.class_1exta_1.Entirt;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="todo")
public class todoEntity {
	
	@Id
	@GeneratedValue
//	(strategy=GenerationType.IDENTITY)
	long id;
    @NotNull
    @NotBlank
	String tital;
    @NotNull
    @NotBlank
	String descraption;
    @NotNull
    @NotBlank
	String iscompl;  
    @Email
    String email;

	public todoEntity() {
		super();
	}
	public todoEntity(long Id, String Tital, String Descraption, String Iscompl) {
		super();
		this.id = Id;
		this.tital = Tital;
		this.descraption = Descraption;
		this.iscompl = Iscompl;
	}
	
	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTital() {
		return tital;
	}

	public void setTital(String tital) {
		this.tital = tital;
	}

	public String getDescraption() {
		return descraption;
	}

	public void setDescraption(String descraption) {
		this.descraption = descraption;
	}

	public String getIscompl() {
		return iscompl;
	}

	public void setIscompl(String iscompl) {
		this.iscompl = iscompl;
	}
	

}
