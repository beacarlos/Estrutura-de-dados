package Questao6;

public interface Lista<E> {

    public abstract void set(int index, E e);

    public abstract void addPrimeiro(E e);
    public abstract void addUltimo(E e);
    public abstract void addAntes(int index, E e);
    public abstract void addDepois(int index, E e);

    public abstract E get(int index);
    public abstract E getPrimeiro();
    public abstract E getUltimo();
    public abstract E getAntes(int index);
    public abstract E getDepois(int index);

    public abstract void remover(E e);
    public abstract void remover(int index);
    public abstract void removerPrimeiro();
    public abstract void removerUltimo();

    public abstract void print();

    public  abstract boolean cheio();
    public abstract boolean vazio();

    public abstract void limpar();

}
