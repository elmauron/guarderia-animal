public class Hamster extends Animal {
        //Atributos
    private int posicionEnLaLista;

        //Constructores
    public Hamster(String tipoDeAnimal, String nombre, int edad, String dueño, Sexo sexo, float peso, int posicionEnLaLista) {
        super(tipoDeAnimal, nombre, edad, dueño, sexo, peso);
        this.posicionEnLaLista = posicionEnLaLista;
    }

        //Metodos
    public String saludar() {
        return "Hola, soy un hamster chiquito y me llamo " + getNombre() + ".";
    }

        //getters & setters
    public int getPosicionEnLaLista() {
        return posicionEnLaLista;
    }
    public void setPosicionEnLaLista(int posicionEnLaLista) {
        this.posicionEnLaLista = posicionEnLaLista;
    }
}
