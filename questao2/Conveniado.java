package questao2;

public class Conveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATIS = 30;
    public static final double VALOR_HORA = 8.0;
    public static final double DESCONTO = 0.20;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATIS);
        int horas = (minutosCobrados + 59) / 60;
        return horas * VALOR_HORA * (1 - DESCONTO);
    }
}
