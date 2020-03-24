package Questao5;

public interface Fila {
    public void enqueue(Integer value);
    public Integer dequeue();

    public boolean cheio();
    public boolean vazio();

    public void print();
}
