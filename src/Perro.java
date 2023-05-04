public class Perro extends Animal {

        //Atributos
    private String raza;
    private int posicionEnLaLista;

    public Perro() {}

        //Constructores
    public Perro(String tipoDeAnimal, String nombre, int edad, String dueño, Sexo sexo, float peso, String raza, int posicionEnLaLista) {
        super(tipoDeAnimal, nombre, edad, dueño, sexo, peso);
        this.raza = raza;
        this.posicionEnLaLista = posicionEnLaLista;
    }

        //Métodos
    public String saludar() {
        return "Hola, soy un perro y me llamo " + getNombre() + ".";
    }

        //getters & setters
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getPosicionEnLaLista() {
        return posicionEnLaLista;
    }
    public void setPosicionEnLaLista(int posicionEnLaLista) {
        this.posicionEnLaLista = posicionEnLaLista;
    }
}
