package Questao1;

public class StackClass implements Stack {

	private Integer[] stack;
	private int position;

	// Contrutor da classe.
	public StackClass(int size) {
		// Define o tamanho da pilha.
		stack = new Integer[size];

		position = -1;
	}

	@Override
	public Integer insertTop(Integer value) {
		if (fullStack()) {
			System.out.println("Pilha excedida, não podemos adicionar o elemento " + value + "!");	
			return null; 
		}
		
		// Deslocar todos os valores para a direita.
		for (int i = position; i >= 0; i--) {
			stack[i + 1] = stack[i];
		}
		
		// Adicionando o valor no inicio.
		stack[0] = value;
		position ++;
		return null; 
		
	}

	@Override
	public Integer removeTop() {
		if (emptyStack()) {
			System.out.println("A pilha está vazia!");
			return null;
		}
		
		int remove_value = stack[0];
		
		//Deslocar todos os valores para a esquerda.
		for (int i = 0; i < position; i++) {
			stack[i] = stack[i + 1];
		}
		
		stack[position--] = null;
		
		System.out.println("O valor removido foi " +remove_value+ ".\n" );
		return null;
	}
	
	// Metodo que verifica se a pilha está cheia.
	@Override
	public boolean fullStack() {
		return (position == (stack.length - 1)) ? true : false;
	}

	// Metodo que verifica se a pilha está vazia.
	@Override
	public boolean emptyStack() {
		return (position == -1) ? true : false;
	}

	@Override
	public void printStack() {
		if(emptyStack()) {
			System.out.println("Atenção sua pilha está vazia! \n");
			return;
		}
		
		// Impressão da Pilha
		System.out.print("Aqui está a pilha criada: ");
		for (int i = 0; i < position + 1; i++) {
			System.out.print(stack[i] + "\t");
		}
		System.out.println("\n");
	}

}
