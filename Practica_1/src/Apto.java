import java.util.*;

public class Apto {
    private List<Persona> familia= new ArrayList<Persona>();

    //Generador numeros random
    public int random(int min, int max){
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return value;
    }

    public Apto(String posicion, int num_apto){

        //Nombres y apellidos para generar personas aleatoriamente
        String names[] = {"Santiago", "Valentina", "Sebastian", "Daniela", "Mariana", "Natalia", "Alejandro", "Nicolas", "Samuel", "Carlos"};
        String lastNames[] = {"Gomez", "Rodriguez", "Gonzalez", "Martinez", "Garcia", "Ramirez", "Montoya", "Ulloa", "Lopez", "Echeverry"};
        String generos[]= {"Hombre", "Mujer"};
        Boolean infeccion[]= {true, false};
        //nombre, apellido, edad, genero, posicion pueblo, num apto, vida, estado

        //Edad
        int edad= random(0, 99);

        //Tipo de genero
        String sexo= generos[random(0, 2)];

        //nivel de vida
        Random random = new Random();
        int vida= random(0, 100);

        //Estado
        Boolean estado= infeccion[random(0, 2)];

        //Cantidad miembros
        int miembros= random(0, 6);
        //Creacion de una nueva familia
        for(int i=0; i < miembros; i++){
            Persona miembro= new Persona(names[random(0, 9)], lastNames[random(0, 9)], edad, sexo, posicion, num_apto, vida, estado);
            this.familia.add(miembro);
        }
    }

    public List<Persona> getMiembros(){
        return familia;
    }
}
