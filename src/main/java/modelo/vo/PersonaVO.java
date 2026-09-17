package modelo.vo;

public class PersonaVO {
    private int cod;
    private String nombre;
    private String categoria;
    private String email;

    public PersonaVO() {
    }

    public PersonaVO(int cod, String nombre, String categoria, String email) {
        this.cod = cod;
        this.nombre = nombre;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonaVO{cod=" + cod + ", nombre=" + nombre
                + ", categoria=" + categoria + ", email=" + email + '}';
    }
}
