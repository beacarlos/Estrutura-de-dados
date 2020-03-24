package Questao1;

public class TestStack {
	public static void main(String[] args) {
		// Criando objeto da classe Stack
		Stack stack = new StackClass(25);
		
		stack.printStack();
		
		stack.insertTop(5);
		stack.printStack();
		
		stack.insertTop(3);
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
	
		stack.insertTop(2);
		stack.printStack();
		
		stack.insertTop(8);
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.insertTop(9);
		stack.printStack();
		
		stack.insertTop(1);
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.insertTop(7);
		stack.printStack();
		
		stack.insertTop(6);
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.insertTop(4);
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.removeTop();
		stack.printStack();
		
		stack.printStack();
	}
}
