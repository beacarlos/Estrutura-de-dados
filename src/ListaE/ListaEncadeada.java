package ListaE;

public class ListaEncadeada<T> implements TAD<T> {
	private No<T> cabeca;
	private int tamanho;

	public ListaEncadeada() {
		cabeca = null;
		tamanho = 0;
	}


	public void insereInicio(T valor) {
		No<T> novoNo = new No<T>(valor, null);

		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			novoNo.setProximo(cabeca);
			cabeca = novoNo;
		}
		tamanho++;

	}

	@Override
	public void inserePosicao(T valor, int posicao) {

		if (posicao == 0) {
			insereInicio(valor);
			return;
		} else if (posicao == tamanho) {
			insereFinal(valor);
			return;
		} else if (posicao < 0 || posicao > tamanho) {
			System.out.println("Posição inválida " + posicao + " para inserção.");
			return;
		}

		No<T> novoNo = new No<T>(valor, null);

		No<T> noAnteriorInsercao = cabeca;
		for (int i = 0; i < posicao - 1; i++) {
			noAnteriorInsercao = noAnteriorInsercao.getProximo();
		}

		No<T> noPosteriorInsercao = noAnteriorInsercao.getProximo();
		noAnteriorInsercao.setProximo(novoNo);
		novoNo.setProximo(noPosteriorInsercao);

		tamanho++;
	}

	public void insereFinal(T valor) {

		No<T> novoNo = new No<T>(valor, null);

		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			getCauda().setProximo(novoNo);
		}
		tamanho++;
	}

	public T removePosicao(int posicao) {

		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("Nó não removido. Posição inválida para remoção");
			return null;
		}

		No<T> noAnteriorRemocao = cabeca;

		for(int i = 0; i < posicao - 1; i++) {
			noAnteriorRemocao = noAnteriorRemocao.getProximo();
		}

		No<T> noRemovido = noAnteriorRemocao.getProximo();

		//Remove do inicio
		if (posicao == 0) {
			noRemovido = cabeca;
			cabeca = noRemovido.getProximo();
		} else {
			noAnteriorRemocao.setProximo(noRemovido.getProximo());
			noRemovido.setProximo(null);
		}
		tamanho--;

		return noRemovido.getValor();
	}
	
	public void insereOrdenado(T valor) {
		
        if (this.listaVazia()) {
            this.insereInicio(valor);
            return;
        }

        No<T> valor_t = new No<T>(valor, null);
        No<T> atual = this.cabeca;
        No<T> anterior = this.cabeca;

        while (atual.getProximo() != null) {
           Integer numero = (Integer) valor_t.getValor();
           Integer numeroAtual = (Integer) atual.getValor();
           if (numeroAtual > numero) {
        	 valor_t.setProximo(atual);
             anterior.setProximo(valor_t);
             this.tamanho++;
             return;
           }
           anterior = atual;
           atual = atual.getProximo();
        }
	}

	@Override
	public boolean listaVazia() {
		if (cabeca == null) {
			return true;
		}
		return false;
	}

	public void imprimeLista() {
		//Realiza validações
		if(listaVazia()) {
			System.out.println("Lista Vazia.");
			return;
		}

		No<T> auxiliar = cabeca;

		while(auxiliar != null && tamanho > 1) {
			System.out.print(" " + auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();

	}

	public No<T> getCauda(){

		No<T> aux = cabeca;

		if (aux == null) {
			return null;
		}
		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux;

	}
}
