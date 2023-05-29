package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsModulo23 {
    
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        //Carga dos dados
        pessoas.add(new Pessoa("Ramiro","M"));
        pessoas.add(new Pessoa("Vilma","F"));
        pessoas.add(new Pessoa("Arlet","F"));
        pessoas.add(new Pessoa("Oscar","M"));
        pessoas.add(new Pessoa("Moisés","M"));
        
        GrupoPessoas gp = new GrupoPessoas(pessoas, null, null);
        gp.setGrupoHomens( pessoas.stream()
        				  .filter(pessoa -> pessoa.getSexo().startsWith("M"))
        				  .collect(Collectors.toList())
        		);
        gp.setGrupoMulheres( pessoas.stream()
				  .filter(pessoa -> pessoa.getSexo().startsWith("F"))
				  .collect(Collectors.toList())
		);
        
        System.out.println(gp.toString());

        //Impressão dos dados
        System.out.println("Pessoas do sexo Masculino :");
		System.out.println("---------------------------");
        gp.getGrupoHomens().forEach(pessoa -> System.out.println(pessoa));
        System.out.println("");
        System.out.println("Pessoas do sexo Feminino :");
		System.out.println("---------------------------");
        gp.getGrupoMulheres().forEach(pessoa -> System.out.println(pessoa));

    }

}
