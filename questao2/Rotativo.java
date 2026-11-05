package questao2;

public class Rotativo implements PerfilCobranca {
    public static final double VALOR_HORA = 8.0;

    @Override
    public double calcular(int minutos) {
        int horas = (minutos + 59) / 60;
        return horas * VALOR_HORA;
    }
}
