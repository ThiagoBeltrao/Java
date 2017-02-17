package br.unipe.java.unidade1;
import java.util.Scanner;

public class Cachorro {
	public static void main(String[]args){
		String nome;
		Scanner entrada= new Scanner(System.in);
		Cachorro cachorro  =  new Cachorro();
		System.out.println("Digite o nome do cachorro: ");
		nome = entrada.next();

	}
	public void late(){
		System.out.println(cachorro.getnome());
		System.out.println(nome + "Latido au au");
		
	}
}
