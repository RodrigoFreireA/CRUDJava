package br.com.taskmanager;
import br.com.taskmanager.models.Tarefa;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
	private ArrayList<Tarefa> listaTarefas;
	private Scanner scanner;
	
	//Constructor
	public GerenciadorTarefas() {
		this.listaTarefas = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}
	
	//Método para adicionar uma nova tarefa
	public void adicionarTarefa() {
		System.out.println("Digite o título da tarefa: ");
		String titulo = scanner.nextLine();
		
		System.out.println("Digite a descricao da tarefa: ");
		String descricao = scanner.nextLine();
		
		int id = listaTarefas.size() + 1;
		Tarefa novaTarefa = new Tarefa(id, titulo, descricao);
		listaTarefas.add(novaTarefa);
		
		System.out.println("✅ Tarefa adicionada com sucesso!\n");
		System.out.println("Total de tarefas na lista: " + listaTarefas.size());  // <-- Debug
		pausar();
	}
	
	//Método para listar todas as tarefas
	public void listaTarefas() {
		if (listaTarefas.isEmpty()) {
			System.out.println("📭 Nenhuma tarefa encontrada. ");
			pausar();  // Aguarda Enter antes de voltar ao menu
            return;
		}
		System.out.println("\n📌 Lista de Tarefas:");
		for (Tarefa tarefa : listaTarefas) {
			System.out.println("DEBUG: Exibindo tarefa com ID: " + tarefa.getId()); // <-- Debug
			tarefa.exibirTarefa();
		}
		System.out.println();
		pausar();
	}
	
	//Método para concluir uma tarefa
	public void concluirTarefa() {
	    if (listaTarefas.isEmpty()) {  // Verifica se há tarefas
	        System.out.println("❌ Sem tarefas para concluir.\n");
	        pausar();
	        return;
	    }

	    System.out.print("Digite o ID da tarefa que deseja concluir: ");
	    int id = scanner.nextInt();
	    scanner.nextLine(); // Consumir quebra de linha

	    for (Tarefa tarefa : listaTarefas) {
	        if (tarefa.getId() == id) {
	            tarefa.concluir();
	            System.out.println("✅ Tarefa concluída com sucesso!\n");
	            pausar();  // Aguarda Enter antes de voltar ao menu
	            return;
	        }
	    }

	    System.out.println("❌ Tarefa não encontrada.\n");
	    pausar();
	}

	
	//Método para remover uma tarefa
	public void removerTarefa() {
		if (listaTarefas.isEmpty()) {  // Verifica se há tarefas
	        System.out.println("❌ Sem tarefas para remover.\n");
	        pausar();
	        return;
	    }
		System.out.print("Digite o ID da terefa que deseja remover: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		listaTarefas.removeIf(tarefa -> tarefa.getId() == id);
		System.out.println("🗑️ Tarefa removida com sucesso!\\n");
		pausar();
	}
	
	//Método principal do menu
	public void exibirMenu() {
		while (true) {
			System.out.println("\n📋 MENU:");
            System.out.println("1️⃣ - Adicionar Tarefa");
            System.out.println("2️⃣ - Listar Tarefas");
            System.out.println("3️⃣ - Concluir Tarefa");
            System.out.println("4️⃣ - Remover Tarefa");
            System.out.println("0️⃣ - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); //consumir quebra de linha
            
            switch (opcao) {
            case 1:
            	adicionarTarefa();
            	break;
            case 2:
            	listaTarefas();
            	break;
            case 3:
            	concluirTarefa();
            	break;
            case 4:
            	removerTarefa();
            	break;
            case 0:
            	System.out.println("🚀 Encerrando o programa...");
            	scanner.close();
            	return;
            default:
            	System.out.println("❌ Opção inválida! Tente novamente.");
            }
		}
	}
	//Método para pausar a ação após escolha do usuario
	private void pausar() {
			System.out.println("\n🔵 Pressione Enter para voltar ao menu...");
			 scanner.nextLine(); // Aguarda o usuário pressionar Enter
     }
			
}
