
package temakeria.Composite;


    public class Simples implements ProdutoSushi{
    private float preco; 
    private String descricao;
    
    public Simples(String descricao, float preco){
        this.preco = preco;
        this.descricao = descricao;
    }  
        
    @Override
    public float getPreco(){
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
    
}
