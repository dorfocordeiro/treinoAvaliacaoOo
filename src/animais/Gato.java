package animais;

public class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow Meow");
    }

    @Override
    public void mover() {
        System.out.println("Está andando calmamente pela casa!");
    }
}
