public class Gobernador {
    
    private String nombre;
    private String telefono;
    private String correo;
    private String PartidoPolitico;

    public Gobernador(String nombre, String telefono, String correo, String partidoPolitico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.PartidoPolitico = partidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPartidoPolitico() {
        return PartidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        PartidoPolitico = partidoPolitico;
    }

    
}
