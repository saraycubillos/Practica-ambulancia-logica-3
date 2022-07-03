import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private List<Apto> apartamento= new ArrayList<Apto>();;

    public Edificio(String posicion){
        Apto apto1= new Apto(posicion, 1);
        Apto apto2= new Apto(posicion, 2);
        Apto apto3= new Apto(posicion, 3);

        this.apartamento.add(apto1);
        this.apartamento.add(apto2);
        this.apartamento.add(apto3);
    }

    public List<Apto> getApartamentos(){
        return apartamento;
    }
}
