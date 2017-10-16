
package temakeria.Composite;

    public class Combo implements ProdutoSushi{
    
    private ProdutoSushi produto1;
    private ProdutoSushi produto2;

    public Combo(ProdutoSushi produto1, ProdutoSushi produto2) {
        this.produto1 = produto1;
        this.produto2 = produto2;
    }
       
    public float getPreco(){        
      
        return produto1.getPreco() + produto2.getPreco();
    }

    @Override
    public String getDescricao() {
        return produto1.getDescricao()+" e "+produto2.getDescricao();
    }
    
}

