package Questao5;

public class FilaMain {

	public static void main(String[] args) {
		Fila fila = new FilaClass();
        fila.print();
        
        fila.enqueue(5);
        fila.enqueue(3);
        fila.dequeue();
        fila.enqueue(2);
        fila.enqueue(8);
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(9);
        fila.enqueue(1);
        fila.dequeue();
        fila.enqueue(7);
        fila.enqueue(6);
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(4);
        fila.dequeue();
        fila.dequeue();
        
        fila.print();

	}

}
