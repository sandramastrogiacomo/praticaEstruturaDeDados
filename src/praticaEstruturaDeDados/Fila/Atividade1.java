package praticaEstruturaDeDados.Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {

			System.out.println("\nMenu");
			System.out.println("*****************************");
			System.out.println("1 - Adicionar cliente na fila.");
			System.out.println("2 - Listar todos os clientes.");
			System.out.println("3 - Retirar cliente da fila.");
			System.out.println("0 - Sair.");
			System.out.println("*****************************");

			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = leia.nextLine();
				filaClientes.add(nome);
				System.out.println("Cliente adicionado à fila: " + nome);
				break;
			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia! Não há clientes para retirar.");
				} else {
					String removido = filaClientes.poll();
					System.out.println(removido + " foi chamado(a) e retirado(a) da fila.");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

	}
}