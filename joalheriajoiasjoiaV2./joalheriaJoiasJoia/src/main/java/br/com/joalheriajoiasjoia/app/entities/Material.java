package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Material")
public class Material {
// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMaterial", nullable = false)
	private Long idMaterial;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "tipo", nullable = false, length = 100)
	private String tipo;
	
	public Material () {
		
	}
	public Material(Long idMaterial, String nome, String tipo) {
		this.idMaterial = idMaterial;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	//getters e setters
	public Long getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(Long idMaterial) {
		this.idMaterial = idMaterial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
