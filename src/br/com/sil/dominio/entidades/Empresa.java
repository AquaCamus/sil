package br.com.sil.dominio.entidades;

import java.io.Serializable;
import java.util.List;

public abstract class Empresa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscMunicipal;
	private String inscEstadual;
	private String dddTelefone;
	private String telefone;
	private String dddCelular;
	private String celular;
	private String dddTelefone2;
	private String telefone2;
	private String nomeContato;
	private String email;
	private String site;
	private List<Produto> listaDeProdutos; 
	private String obervacoes;
	private Endereco endereco;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscMunicipal() {
		return inscMunicipal;
	}
	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public String getDddTelefone() {
		return dddTelefone;
	}
	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDddCelular() {
		return dddCelular;
	}
	public void setDddCelular(String dddCelular) {
		this.dddCelular = dddCelular;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDddTelefone2() {
		return dddTelefone2;
	}
	public void setDddTelefone2(String dddTelefone2) {
		this.dddTelefone2 = dddTelefone2;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	public String getObervacoes() {
		return obervacoes;
	}
	public void setObervacoes(String obervacoes) {
		this.obervacoes = obervacoes;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia
				+ ", cnpj=" + cnpj + ", inscMunicipal=" + inscMunicipal + ", inscEstadual=" + inscEstadual
				+ ", dddTelefone=" + dddTelefone + ", telefone=" + telefone + ", dddCelular=" + dddCelular
				+ ", celular=" + celular + ", dddTelefone2=" + dddTelefone2 + ", telefone2=" + telefone2
				+ ", nomeContato=" + nomeContato + ", email=" + email + ", site=" + site + ", listaDeProdutos="
				+ listaDeProdutos + ", obervacoes=" + obervacoes + ", endereco=" + endereco + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	
}
