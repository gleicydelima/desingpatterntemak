package temakeria.State;

public class EstadoProduto implements Estado{

   
    @Override
    public void frito() {
        System.out.println("Servir sushi hot");
    }

    @Override
    public void cru() {
        System.out.println("Servir o sushi cru");
    }
}
