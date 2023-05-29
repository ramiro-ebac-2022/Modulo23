package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StreamsMod23Test {
	
	@Test
	void testeFeminino() {
		//arrangement
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Ramiro","M"));
        pessoas.add(new Pessoa("Vilma","F"));
        pessoas.add(new Pessoa("Arlet","F"));
        pessoas.add(new Pessoa("Oscar","M"));
        pessoas.add(new Pessoa("Moisés","M"));
        GrupoPessoas gp = new GrupoPessoas(pessoas, null, null);
        
		//action
        gp.setGrupoMulheres( pessoas.stream()
        				  .filter(pessoa -> pessoa.getSexo().startsWith("F"))
        				  .collect(Collectors.toList())
        		);

		//assertion
        gp.getGrupoMulheres().forEach(pessoa -> 
        					Assertions.assertEquals("F", pessoa.getSexo()) 
        					);
	}

}
