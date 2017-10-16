
package temakeria.Observer;

import temakeria.Observer.Notificar;
import java.util.ArrayList;
import java.util.List;


public class Pagamento {
    private String pagamento;
    private List<Notificar> observadores = new ArrayList<>();
        
        public void setPagamento (String pagamento){
            this.pagamento= pagamento;
            for(Notificar observador: observadores){
            observador.notificar();
            }
           }
        
        public void addObservador (Notificar observador){
        this.observadores.add(observador);
        }     
}
