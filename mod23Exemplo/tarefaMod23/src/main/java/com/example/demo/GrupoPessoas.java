package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoas {

	private List<Pessoa> grupoTotal;
	private List<Pessoa> grupoHomens;
	private List<Pessoa> grupoMulheres;
	
	public GrupoPessoas(List<Pessoa> t, List<Pessoa> h, List<Pessoa> m) {
		this.grupoTotal = t;
		this.grupoHomens = h;
		this.grupoMulheres = m;
	}
	
	public List<Pessoa> Carga(ArrayList<Pessoa> p) {
		 //Carga dos dados
        p.add(new Pessoa("Ramiro","M"));
        p.add(new Pessoa("Vilma","F"));
        p.add(new Pessoa("Arlet","F"));
        p.add(new Pessoa("Oscar","M"));
        p.add(new Pessoa("Moisés","M"));
        return p;
	}

	public List<Pessoa> getGrupoTotal() {
		return grupoTotal;
	}

	public void setGrupoTotal(List<Pessoa> grupoTotal) {
		this.grupoTotal = grupoTotal;
	}

	public List<Pessoa> getGrupoHomens() {
		return grupoHomens;
	}

	public void setGrupoHomens(List<Pessoa> grupoHomens) {
		this.grupoHomens = grupoHomens;
	}

	public List<Pessoa> getGrupoMulheres() {
		return grupoMulheres;
	}

	public void setGrupoMulheres(List<Pessoa> grupoMulheres) {
		this.grupoMulheres = grupoMulheres;
	}

	@Override
	public String toString() {
		return "GrupoPessoas [grupoTotal=" + grupoTotal + "]";
	}
	
	
}
