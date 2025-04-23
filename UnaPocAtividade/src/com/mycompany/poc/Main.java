package com.mycompany.poc;

import cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Otthon", 10);
		
		System.out.println(cliente.getNome());

	}

}
