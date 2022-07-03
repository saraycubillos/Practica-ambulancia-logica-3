import java.util.List;

public class Pueblo {
    private Edificio edificios[][];

    public Pueblo(){
        this.edificios= new Edificio[5][5];

        for(int i=0; i < edificios.length; i++){
            for(int j=0; j < edificios.length; j++){
                Edificio edi= new Edificio(i + "-" + j);
                edificios[i][j]= edi;
           }
        }
    }

    public Edificio[][] getPueblo(){
        return edificios;
    }

}
