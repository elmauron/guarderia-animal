public class Gato extends Animal {

        //Atributos
        private int posicionEnLaLista;

        //Constructores
        public Gato() {
        }

        public Gato(String raza, String color, String tipoDeAnimal, String nombre, int edad, String dueño, Sexo sexo, float peso) {
            super(tipoDeAnimal, nombre, edad, dueño, sexo, peso);
        }

        //Métodos

    public String saludar() {
        return "Hola, soy un gato y me llamo " + getNombre() + ".";
    }

        //getters & setters
    public int getPosicionEnLaLista() {
        return posicionEnLaLista;
    }
    public void setPosicionEnLaLista(int posicionEnLaLista) {
        this.posicionEnLaLista = posicionEnLaLista;
    }
}
