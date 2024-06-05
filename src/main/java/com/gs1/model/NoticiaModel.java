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
@Table(name = "Tg_Noticia")
public class NoticiaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Noticia;
	
	@Column
	private String Nm_Titulo;
	
	@Column
	private String Nm_Subtitulo;
	
	@Column
	private LocalDate Dt_Noticia;
	
	@Column
	private String Ds_Imagem;
	
	@Column
	private String Ds_Liink;
	

}
