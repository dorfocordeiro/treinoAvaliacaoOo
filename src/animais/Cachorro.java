package animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade){
        super(nome, idade);

    }

    @Override
    public void emitirSom() {
        System.out.println("Roof Roof");
    }

    @Override
    public void mover() {
        System.out.println("Está correndo atras da bolinha!");
    }

}
