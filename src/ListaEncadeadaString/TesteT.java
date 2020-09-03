package ListaEncadeadaString;

public class TesteT {
	public static void main(String[] args) {
        ListaEncadeadaString<String> lista = new ListaEncadeadaString<String>();

        lista.insereInicio("casa");

        lista.insereFinal("bola");

        lista.inserePosicao("xicara", 1);
        
        lista.removeCaractere("x");
	}
}
