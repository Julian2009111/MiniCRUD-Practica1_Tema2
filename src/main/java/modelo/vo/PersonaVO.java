package modelo.vo;

public class PersonaVO {
    private int cod;
    private String nombre;
    private double sueldo;
    private String email;

    public PersonaVO() {

    }

    public PersonaVO(int cod, String nombre, double sueldo, String email) {
        this.cod = cod;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getEmail() {
        return email;
    }

    public void setEmail(double email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonaVO{" + "cod=" + cod + ", nombre=" + nombre + ", sueldo=" + sueldo  ", email=" + email  + '}';
    }

}
