package ListaEncadeadaString;

public interface TADEncadeada<T> {
	public void insereInicio(T valor);
	public void inserePosicao(T valor, int posicao);
	public void insereFinal(T valor);
	
	public T removePosicao(int posico);
	
	public boolean listaVazia();
	public void imprimeLista();
}
