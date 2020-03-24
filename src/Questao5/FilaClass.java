package Questao5;

public class FilaClass implements Fila {

	public Integer[] fila = new Integer[5];
	public int posicao;

	public FilaClass() {
		posicao = -1;
	}

	@Override
	public void enqueue(Integer value) {
		if (cheio()) {
			System.out.println("Desculpa sua fila está cheia");
			return;
		}

		fila[++posicao] = value;
	}

	@Override
	public Integer dequeue() {
		if (vazio()) {
			System.out.println("Empty Queue.");
			return null;
		}
		int value = fila[0];
		for (int i = 1; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}
		fila[posicao--] = null;

		return value;
	}

	@Override
	public boolean cheio() {
		// TODO Auto-generated method stub
		return posicao == (fila.length - 1);
	}

	@Override
	public boolean vazio() {
		return posicao == -1;
	}

	@Override
	public void print() {
		if (vazio()) {
			System.out.println("Fila vazia.");
		}

		for (int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		System.out.println();
	}

}
