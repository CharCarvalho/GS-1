package com.gs1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TG_Usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Usuario;
	
	@Column
	private String Nm_Usuario;
	
	@Column
	private int Nr_Cpf;
	
	@Column 
	private String Nm_RG;
	
	@Column
	private LocalDate Dt_Nascimento;
	
	@Column
	private String Nm_Email;
	
	@Column
	private String Nm_Senha;
	
	@Column
	private LocalDate Dt_Cadastro;
	
	
	
	
	
	
	

}
