package animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó", 6);
        Gato gato = new Gato("Sofia", 3);
        Passaro passaro = new Passaro("Pidgey", 3);


        System.out.println("O cachorro " + "se chama " + cachorro.getNome() + " e tem " + cachorro.getIdade() + " anos.");
        System.out.println("E esta emitindo o som: ");
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println("\n");

        System.out.println("O gato " + "se chama " + gato.getNome() + " e tem " + gato.getIdade() + " anos.");
        System.out.println("E esta emitindo o som: ");
        gato.emitirSom();
        gato.mover();

        System.out.println("\n");

        System.out.println("O pássaro " + "se chama " + passaro.getNome() + " e tem " + passaro.getIdade() + " anos.");
        System.out.println("E esta emitindo o som: ");
        passaro.emitirSom();
        passaro.mover();
    }
}
