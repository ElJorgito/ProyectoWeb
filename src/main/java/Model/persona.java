package Model;
public class persona {
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor
    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
