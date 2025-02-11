package praticaEstruturaDeDados.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

public static void main(String[] args) {
	Stack<String> pilhaLivros = new Stack<>();
	Scanner leia = new Scanner(System.in);
	int opcao;
	
	do {

		System.out.println("\nMenu");
		System.out.println("*****************************");
		System.out.println("1 - Adicionar um livro na pilha.");
		System.out.println("2 - Listar todos os livros. ");
		System.out.println("3 - Retirar livro da pilha.");
		System.out.println("0 - Sair.");
		System.out.println("*****************************");

		System.out.print("Escolha uma opção: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		 switch (opcao) {
         case 1:
             System.out.print("Digite o nome do livro: ");
             String livro = leia.nextLine();
             pilhaLivros.push(livro);
             System.out.println("Livro \"" + livro + "\" adicionado à pilha. ");
             break;
         case 2:
             if (pilhaLivros.isEmpty()) {
                 System.out.println("A pilha está vazia! ");
             } else {
                 System.out.println("Livros na pilha: ");
                 for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                     System.out.println((i + 1) + ". " + pilhaLivros.get(i));
                 }
             }
             break;
         case 3:
             if (pilhaLivros.isEmpty()) {
                 System.out.println("A pilha está vazia. Não há livros para retirar.");
             } else {
                 System.out.println("Livro retirado: " + pilhaLivros.pop());
             }
             break;
         case 0:
             System.out.println("Programa finalizado.");
             break;
         default:
             System.out.println("Opção inválida. Tente novamente.");
     }
 } while (opcao != 0);
 
}
}




	
	
	


