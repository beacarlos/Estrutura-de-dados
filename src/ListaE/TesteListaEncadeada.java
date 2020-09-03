package ListaE;

public class TesteListaEncadeada {
	
	public static void main(String[] args) {
		
		TAD<Integer> listaEncadeada = new ListaEncadeada<Integer>();
		
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio(80);
		
		listaEncadeada.insereFinal(50);
		
		listaEncadeada.insereOrdenado(25);
		
		listaEncadeada.imprimeLista();
		
	}
	
}
