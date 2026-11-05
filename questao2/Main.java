package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150;

        Ticket t1 = new Ticket("ABC1234", minutos, new Rotativo());
        Ticket t2 = new Ticket("DEF5678", minutos, new Mensalista());
        Ticket t3 = new Ticket("GHI9012", minutos, new Conveniado());

        System.out.println("Tempo: " + minutos + " minutos");
        System.out.println("Rotativo: R$ " + t1.calcularValor());
        System.out.println("Mensalista: R$ " + t2.calcularValor());
        System.out.println("Conveniado: R$ " + t3.calcularValor());

        System.out.println();
        System.out.println("Troca de perfil no ticket " + t1.getPlaca());
        System.out.println("Rotativo: R$ " + t1.calcularValor());
        t1.setPerfil(new Conveniado());
        System.out.println("Conveniado: R$ " + t1.calcularValor());
        t1.setPerfil(new Mensalista());
        System.out.println("Mensalista: R$ " + t1.calcularValor());
    }
}
