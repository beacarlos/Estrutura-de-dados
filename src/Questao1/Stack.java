package Questao1;

public interface Stack {
	// Função que possibilita a inserção no topo da pilha
	public Integer insertTop(Integer value);
	
	// Função que possibilita a remoção no topo da pilha
	public Integer removeTop();
	
	// Funções validativas
	public boolean fullStack();
	public boolean emptyStack();
	
	// Função auxiliar de impressão
	public void printStack();
}
