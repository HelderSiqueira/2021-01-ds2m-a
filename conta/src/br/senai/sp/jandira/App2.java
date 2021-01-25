package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		//CRIAÇÃO DO CLIENTE
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alveres Cabral");
		pedro.setCpf("0000000-00");
		pedro.setTelefone("4002-8922");
		pedro.setCep("11111-111");
		
		//CRIAÇÃO DA CONTA DO PEDRO
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.setNumero("222-22");
		contaPedro.depositar(100);
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(pedro.getNome());
		
	}

}
