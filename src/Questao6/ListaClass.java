package Questao6;

public class ListaClass implements Lista<Object>{

	private Object[] lista = new Object[5];
	private int posicao;

	public ListaClass() { 
		posicao = -1; 
	}

	public void set(int index, Object o) {
		if (index > posicao + 1 || index < 0) {
			System.out.println("A posicao execedeu.");
			return;
		}

		lista[index] = o;
	}

	public void addPrimeiro(Object o) {
		if (cheio()) System.out.println("Desculpa mas a lista está cheia.");

		if (vazio()) {
			lista[0] = o;
			posicao++;
		}

		for (int i = posicao; i >= 0; i--) {
			lista[i + 1] = lista[i];
		}

		posicao++;
		lista[0] = o;
	}

	public void addUltimo(Object o) {
		if (cheio()) {
			System.out.println("Desculpa mais a lista está cheia.");
			return;
		}

		lista[++posicao] = o;
	}

	public void addAntes(int index, Object o) {
		if (cheio()) {
			System.out.println("Desculpa mais a lista está cheia.");
			return;
		}

		if (vazio()) {
			lista[0] = o;
			posicao++;
			return;
		}

		if (index >= 0 && index > posicao + 1) {
			System.out.println("Excedeu o limite.");
			return;
		}

		for (int i = posicao; i >= index - 1; i--) {
			lista[i + 1] = lista[i];
		}
		lista[index - 1] = o;
		posicao++;
	}

	public void addDepois(int index, Object o) {
		if (cheio()) {
			System.out.println("Full List");
			return;
		}

		if (vazio()) {
			lista[0] = o;
			posicao++;
			return;
		}

		if (index > posicao || index < 0) {
			System.out.println("Index out of bounds.");
			return;
		}

		for (int i = posicao; i > index; i--) {
			lista[i + 1] = lista[i];
		}

		lista[index + 1] = o;
		posicao++;
	}

	public Object get(int index) {
		if (vazio()) {
			System.out.println("Lista vazia");
			return null;
		}

		if (index > posicao || index < 0) {
			System.out.println("Posicao excedeu o limite.");
			return null;
		}

		return lista[index];
	}

	public Object getPrimeiro() {
		if (vazio()) {
			System.out.println("Lista vazia");
			return null;
		}

		return lista[0];
	}

	public Object getUltimo() {
		if (vazio()) {
			System.out.println("Lista vazia");
			return null;
		}

		return lista[posicao];
	}

	public Object getAntes(int index) {
		if (vazio()) {
			System.out.println("Lista vazia");
			return null;
		}

		if (index > posicao + 1 || index < 0) {
			System.out.println("Posicao excedeu o limite.");
			return null;
		}

		return lista[index - 1];
	}

	public Object getDepois(int index) {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}

		if (index > posicao - 1 || index < 0) {
			System.out.println("Posicao excedeu o limite.");
			return null;
		}

		return lista[index + 1];
	}

	public void remover(Object o) {
		if (vazio()) {
			System.out.println("Lista Vazia.");
			return;
		}

		for (int i = 0; i <= posicao; i++) {
			if (lista[i] == o) {
				for (int j = i; j < posicao; j++) {
					lista[j] = lista[j + 1];
				}
				break;
			}
		}

		lista[posicao--] = null;
	}

	public void remover(int index) {
		if (vazio()) {
			System.out.println("Lista vazia");
		}

		if (index > posicao || index < 0) {
			System.out.println("Posicao excedeu o limite.");
			return;
		}

		for (int i = index; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}

		lista[posicao--] = null;
	}

	public void removerUltimo() {
		if (vazio()) {
			System.out.println("Lista Vazia.");
			return;
		}

		lista[posicao--] = null;
	}

	public void removerPrimeiro() {
		if (vazio()) {
			System.out.println("Lista vazia.");
			return;
		}

		for (int i = 0; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}

		lista[posicao--] = null;
	}

	public void print() {
		if (vazio()) {
			System.out.println("Lista Vazia.");
			return;
		}

		for (int i = 0; i <= posicao; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();
	}

	public boolean cheio() {
		return posicao == lista.length - 1;
	}

	public boolean vazio() {
		return posicao == -1;
	}

	public void limpar() {
		for (int i = 0; i <= posicao; i++) {
			lista[i] = null;
		}
		posicao = -1;
	}
}
