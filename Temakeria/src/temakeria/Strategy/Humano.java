
package temakeria.Strategy;

public class Humano {
    
        private ModoDeComer modoDeComer;
    
    public void comer(){
        modoDeComer.alimentar();
        
        }
    
    public void setModoDeComer(ModoDeComer modoNovo){
        this.modoDeComer = modoNovo;
    }
}
