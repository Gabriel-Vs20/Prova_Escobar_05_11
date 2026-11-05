package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());

        Bebida pedido2 = new Calda(new Chantilly(new Cha()));

        Bebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso())));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
    }

    private static void imprimir(Bebida bebida) {
        System.out.println(bebida.getDescricao() + " - R$ " + bebida.getPreco());
    }
}
