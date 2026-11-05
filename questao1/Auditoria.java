package questao1;

public class Auditoria implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[Auditoria] " + nomeProduto + " alterado para " + novaQuantidade + " unidades");
    }
}
