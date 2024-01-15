import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private String nombre;
    private List <Municipio> municipios =  new ArrayList<>();
    private Gobernador gobernadores;
    private int censo = 0 ;
    private double areaTotal= 0;
    
    public Departamento(String nombre,Gobernador gobernadores) {
        this.nombre = nombre;
        this.gobernadores = gobernadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipio municipios) {
        this.municipios.add(municipios);
    }

    public Gobernador getGobernadores() {
        return gobernadores;
    }

    public void setGobernadores(Gobernador gobernadores) {
        this.gobernadores = gobernadores;
    }
    

    public int getCenso() {
        return censo;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void calcularCenso(){
        
        for (Municipio municipio : this.municipios) {
            this.censo+=municipio.getPoblacioTotal();
        }
    }
    public void calcularArea(){
        for (Municipio municipio : this.municipios) {
            this.areaTotal+=municipio.getArea();
        }
    }

}