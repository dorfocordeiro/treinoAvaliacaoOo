package animais;

public class Passaro extends Animal{

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu");
    }

    @Override
    public void mover() {
        System.out.println("Está voando e tentando escapar do gavião!");
    }
}
