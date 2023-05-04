public class Mojarrita extends Animal{

        //Atributos
    private TipoDeAgua tipoDeAgua;
    private int posicionEnLaLista;

        //Constructores
    public Mojarrita(String tipoDeAnimal, String nombre, int edad, String dueño, Sexo sexo, float peso, TipoDeAgua tipoDeAgua, int posicionEnLaLista) {
        super(tipoDeAnimal, nombre, edad, dueño, sexo, peso);
        this.tipoDeAgua = tipoDeAgua;
        this.posicionEnLaLista = posicionEnLaLista;
    }

        //Métodos
    public String saludar() {
        return "Hola, soy una mojarrita y me llamo " + getNombre() + ".";
    }

        //getters & setters

    public TipoDeAgua getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(TipoDeAgua tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    public int getPosicionEnLaLista() {
        return posicionEnLaLista;
    }

    public void setPosicionEnLaLista(int posicionEnLaLista) {
        this.posicionEnLaLista = posicionEnLaLista;
    }
}
