package br.com.taskmanager.models;

public class Tarefa {

	private int id;
	private String titulo;
	private String descricao;
	private boolean concluida;
	
	//Constructor
	public Tarefa(int id, String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = false;
	}
	
	//Métodos Getters (captura os dados)
	public int getId() { return id; }
	public String getTitulo () { return titulo; }
	public String getDescricao () { return descricao; }
	public boolean isConcluida() { return concluida; }
	
	//Métodos Setters (seleceiona os dados para armazenar)
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	//Método para concluir a tarefa (define um valor true como padrão)
	public void concluir() { this.concluida = true; }
	
	//Exibir detalhes da tarefa
	public void exibirTarefa() {
		System.out.println("ID: " + id + " | " + titulo + " - " + descricao + " [" + (concluida ? "Concluida" : "Pendente") + "]");
	}
	
}
