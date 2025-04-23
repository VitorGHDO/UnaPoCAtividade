package com.mycompany.poc;

import cliente.Cliente;
import contaCliente.ContaCliente;
import faturaCliente.FaturaCliente;

public class Main {

	public static void main(String[] args) {
		 
        Cliente cliente1 = new Cliente(1, "Otthon", 10);  
        Cliente cliente2 = new Cliente(2, "Vitor", 20);  

        ContaCliente conta1 = new ContaCliente(1001, cliente1, 200.0);
        ContaCliente conta2 = new ContaCliente(1002, cliente2);  
        ContaCliente conta3 = new ContaCliente(1003); 

        conta3.setCliente(cliente2);
        conta3.setSaldo(150.0);

        conta1.addDeposito(100.0);
        conta1.subSaldo(50.0);
        conta2.addDeposito(300.0);
        conta2.subSaldo(500.0); 
        conta3.subSaldo(100.0); 

        System.out.println("\n--- CONTAS ---");
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

        FaturaCliente fatura1 = new FaturaCliente(2001, cliente1, 500.0);
        FaturaCliente fatura2 = new FaturaCliente(2002);
        fatura2.setCliente(cliente2);
        fatura2.setValor(250.0);

        System.out.println("\n--- FATURAS ---");
        System.out.println(fatura1);
        System.out.printf("Fatura 1 com desconto: R$%.2f%n", fatura1.getValorComDesconto());

        System.out.println(fatura2);
        System.out.printf("Fatura 2 com desconto: R$%.2f%n", fatura2.getValorComDesconto());

        System.out.println("\n--- CLIENTES ---");
        System.out.println("Cliente: " + cliente1.getNome() + ", ID: " + cliente1.getId() + ", Desconto: " + cliente1.getDesconto() + "%");
        System.out.println("Cliente: " + cliente2); 

        cliente1.setDesconto(15);
        System.out.println("Novo desconto do cliente " + cliente1.getNome() + ": " + cliente1.getDesconto() + "%");

	}

}
