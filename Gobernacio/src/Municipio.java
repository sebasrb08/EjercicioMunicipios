public class Municipio {

    private String nombre;
    private int poblacioTotal;
    private double area;
    
    public Municipio(String nombre, int poblacioTotal, double area) {
        this.nombre = nombre;
        this.poblacioTotal = poblacioTotal;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacioTotal() {
        return poblacioTotal;
    }

    public void setPoblacioTotal(int poblacioTotal) {
        this.poblacioTotal = poblacioTotal;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    

    

}