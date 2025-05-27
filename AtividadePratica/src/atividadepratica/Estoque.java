


package atividadepratica;

 //gerencia produtos (adicionar, remover, listar e verificar disponibilidade
public class Estoque {
    private Produto[] array_produtos;
    private int quantidadeProdutos;

    //Metodo Construtor
    public Estoque(int capacidadeMaxima) {
        array_produtos = new Produto[capacidadeMaxima];
        quantidadeProdutos = 0;
    }

    public void adicionarProduto(Produto p) {
        if ( quantidadeProdutos < array_produtos.length ) {
            array_produtos[quantidadeProdutos] = p;
            quantidadeProdutos++;
            System.out.println("Produto adicionado com sucesso.");
        } else {
            System.out.println("Estoque cheio. Não é possível adicionar mais produtos.");
        }
    }

    public void removerProduto(int id) {
        for ( int i = 0; i < quantidadeProdutos; i++ ) {
            if ( array_produtos[i].retornaId() == id ) {
              
                for ( int j = i; j < quantidadeProdutos - 1; j++ ) {
                    array_produtos[j] = array_produtos[j + 1];
                }
                array_produtos[quantidadeProdutos - 1] = null;
                quantidadeProdutos--;
                System.out.println("Produto removido.");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    public void listarProdutos() {
        if ( quantidadeProdutos == 0 ) {
            System.out.println("Estoque vazio.");
        } else {
            for ( int i = 0; i < quantidadeProdutos; i++ ) {
                System.out.println(array_produtos[i]);
            }
        }
    }

    public void verificarDisponibilidade(int id) {
        boolean id_encontrado = false;
        for ( int i = 0; i < quantidadeProdutos; i++ ) {
            if ( array_produtos[i].retornaId() == id ) {
                id_encontrado = true;
                if ( array_produtos[i].temEstoque() ) {
                    System.out.printf("Produto %d está disponível com %d unidades.\n", 
                    id, array_produtos[i].retornaQuantidade());
                } else {
                System.out.printf("Produto %d existe, mas está SEM estoque.\n", id);
                  }   
            }
          
        }
        if ( id_encontrado == false )
              System.out.printf("Produto %d NÃO foi encontrado no estoque.\n", id);
    }
    
    public void adicionarUnidades(int id, int quantidade) {
    for ( int i = 0; i < quantidadeProdutos; i++ ) {
        if ( array_produtos[i].retornaId() == id ) {
            array_produtos[i].adicionarQuantidade(quantidade);
            return;
        }
    }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }
    
    public void retirarUnidades(int id, int quantidade) {
    for ( int i = 0; i < quantidadeProdutos; i++ ) {
        if ( array_produtos[i].retornaId() == id ) {
            if ( array_produtos[i].retornaQuantidade() >= quantidade ) {
                array_produtos[i].retirarQuantidade(quantidade);
            } else {
                System.out.printf("Não há unidades suficientes do produto %d para retirada.\n", id);
            }
            return;
        }
    }
    System.out.println("Produto com ID " + id + " não encontrado.");
}

}
