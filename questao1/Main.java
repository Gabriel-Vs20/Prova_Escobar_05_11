package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("--- Estoque para 7 ---");
        notebook.setQuantidade(7);

        System.out.println("--- Estoque para 7 de novo (sem mudanca) ---");
        notebook.setQuantidade(7);

        System.out.println("--- Estoque para 3 ---");
        notebook.setQuantidade(3);

        System.out.println("--- Estoque para 0 ---");
        notebook.setQuantidade(0);

        System.out.println("--- Estoque para 12 ---");
        notebook.setQuantidade(12);

        System.out.println("--- Removendo Auditoria ---");
        notebook.removerArea(auditoria);

        System.out.println("--- Estoque para 2 ---");
        notebook.setQuantidade(2);
    }
}
