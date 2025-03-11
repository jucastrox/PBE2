package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Fornecedor")
public class Fornecedor {
// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFornecedor", nullable = false)
	private Long idFornecedor;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "telefone", nullable = false,  unique = false)
	private String telefone;
	
	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(name = "end_comp", nullable = false, length = 100)
	private String end_comp;
	
	@Column(name = "nome_cont", nullable = false, length = 100)
	private String nome_cont;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(Long idFornecedor, String nome, String telefone, String email, String end_comp, String nome_cont) {
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.end_comp = end_comp;
		this.nome_cont = nome_cont;
	}
	
	//getters e setters
	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnd_comp() {
		return end_comp;
	}

	public void setEnd_comp(String end_comp) {
		this.end_comp = end_comp;
	}

	public String getNome_cont() {
		return nome_cont;
	}

	public void setNome_cont(String nome_cont) {
		this.nome_cont = nome_cont;
	}
	
	

}
