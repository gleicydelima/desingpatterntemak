
package temakeria.State;

public class Sushi {

    private Estado estadoAtual;
    
    public void trocarEstado(Estado novoEstado){
        this.estadoAtual = novoEstado;
    }
    
    public void frito(){
        estadoAtual.frito();
    }
    public void cru(){
        estadoAtual.cru();
    }
    
}
