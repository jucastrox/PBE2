package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Tipo")
public class Tipo {
// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipo", nullable = false)
	private Long idTipo;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	public Tipo() {
		
	}
	
	public Tipo(Long idTipo, String nome) {
		this.idTipo = idTipo;
		this.nome = nome;
	}
	
	//getters e setters
	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
