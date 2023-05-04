public class Animal {

    //Atributos
    private String tipoDeAnimal;
    private String nombre;
    private int edad;
    private String dueño;
    private Sexo sexo;
    private float peso;

    //Constructores
    public Animal() {
    }
    public Animal(String tipoDeAnimal, String nombre, int edad, String dueño, Sexo sexo, float peso) {
        this.tipoDeAnimal = tipoDeAnimal;
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
        this.sexo = sexo;
        this.peso = peso;
    }

    //Métodos

    //getters & setters
    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}




