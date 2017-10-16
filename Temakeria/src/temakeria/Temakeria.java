
package temakeria;

import temakeria.Composite.Combo;
import temakeria.Composite.ProdutoSushi;
import temakeria.Composite.Simples;
import temakeria.Observer.Email;
import temakeria.Observer.Mensagem;
import temakeria.Observer.Pagamento;
import temakeria.State.EstadoProduto;
import temakeria.State.Sushi;
import temakeria.Strategy.GarfoEFaca;
import temakeria.Strategy.Hashi;
import temakeria.Strategy.Humano;

public class Temakeria {

    public static void main(String[] args) {
        Sushi sushi = new Sushi();
        sushi.trocarEstado(new EstadoProduto());
        sushi.cru();
             Humano humano = new Humano();
             humano.setModoDeComer(new GarfoEFaca());
             humano.comer();
             
        ProdutoSushi Uramaki = new Simples ("Uramaki",2);
        ProdutoSushi SushiSalmao = new Simples ("SushiSalmao",8);        
        ProdutoSushi Temaki = new Simples ("Temaki",12);       
        ProdutoSushi ComboSegunda = new Combo (Temaki,SushiSalmao);        
        ProdutoSushi ComboSexta = new Combo(Temaki, Uramaki);
      
        System.out.println(ComboSexta.getDescricao());       
        System.err.println("Total: " +ComboSexta.getPreco());
     
        
        Pagamento propaganda = new Pagamento();
        propaganda.addObservador(new Email());
        propaganda.addObservador(new Mensagem());
        propaganda.setPagamento("Promocao!");
           
    }
    
}
