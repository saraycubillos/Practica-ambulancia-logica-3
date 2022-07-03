public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Genero;
    private String posicionPueblo;
    private int numeroApartamento;
    private int nivelVida;
    private Boolean estadoInfeccion;

    public Persona(String Nombre, String Apellido,int Edad, String Genero, String posicionPueblo,
                  int numeroApartamento, int nivelVida, Boolean estadoInfeccion){
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Edad= Edad;
        this.Genero= Genero;
        this.posicionPueblo= posicionPueblo;
        this.numeroApartamento=  numeroApartamento;
        this.nivelVida= nivelVida;
        this.estadoInfeccion= estadoInfeccion;
    }

    public String getName(){
        return Nombre;
    }

    public String getLastName(){
        return Apellido;
    }

    public int getAge(){
        return Edad;
    }

    public String getGender(){
        return Genero;
    }

    public String getPos() {
        return posicionPueblo;
    }

    public int getNumApart(){
        return numeroApartamento;
    }

    public int getNivelVida(){
        return nivelVida;
    }

    public Boolean getEstInfec(){
        return estadoInfeccion;
    }
}