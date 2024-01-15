import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List <Departamento> departamento = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int menu;
        do{
            menu = Menu();
            switch (menu) {
                case 1:
                    departamento.add(AgregarDepartamento());              
                    break;
                case 2:
                    AgregarMunicipio();
                    break;
                case 3:
                    MostrarMunicipios();
                    break;
                case 4:
                    BuscarMunicipio();
                    break;
                    
                case 5:
                    EliminarMunicipio();
                    break;
                case 6:
                    CalcularCenso();
                    break;
                case 7:
                    CalcularArea();
                    break;
                default:
                    break;
            }
        }while( menu != 8);
        
    }

    public static int Menu (){

        System.out.println("Menu:");
        System.out.println("1.Agregar Departamento");
        System.out.println("2.Agregar Municipio");
        System.out.println("3.Mostrar Municipios");
        System.out.println("4.Buscar Municipio");
        System.out.println("5.Eliminar Municipio");
        System.out.println("6.Calcular censo Departamento");
        System.out.println("7.Calcular area total departamento");
        System.out.println("Digita tu opcion: ");
        int menu = leer.nextInt();
        return menu;
    }
    public static Departamento AgregarDepartamento(){

        System.out.println("------------------Departamento------------------");
        System.out.print("Nombre Departamento: ");
        leer.nextLine();
        String nombreDepartamento = leer.nextLine();
        
        System.out.println("--------------------Gobernador-------------------:");
        System.out.print("Nombre Gobernador: ");
        String nombreGobernador = leer.nextLine();

        System.out.print("Telefono: ");
        String telefono = leer.nextLine();

        System.out.print("Correo: ");
        String correo = leer.next();


        System.out.print("Partido Politico: ");
        String partidoPolitico = leer.nextLine();
        
        Gobernador gobernador =  new Gobernador(nombreGobernador, telefono, correo, partidoPolitico);
        Departamento departamento = new Departamento(nombreDepartamento, gobernador);

        return departamento;
        
    }
    public static void AgregarMunicipio(){

        System.out.println("--------------------Departamentos-----------------------: ");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println( i+1+": "+departamento.get(i).getNombre());
        }
        System.out.println("Que opcion desea  escoger?: ");
        int opcion  = leer.nextInt();

        System.out.println("---------------Municipio------------------:");
        leer.nextLine();
        System.out.print("Nombre Municipio: ");
        String nombreMunicipio = leer.nextLine();
        
        System.out.print("Poblacion Total del municipio: ");
        int poblacionTotal= leer.nextInt();

        System.out.print("Area del municipio: ");
        double area= leer.nextDouble();

        Municipio municipio = new Municipio(nombreMunicipio, poblacionTotal, area);
        departamento.get(opcion-1).setMunicipios(municipio);
    }

    public static void MostrarMunicipios(){

        for (int i = 0; i < departamento.size(); i++) {
            System.out.println("----------------------------Departamento---------------------");
            System.out.println(i+1+": "+departamento.get(i).getNombre());
            System.out.println("----------------------------Gobernador---------------------: ");
            System.out.println(departamento.get(i).getGobernadores().getNombre());
            System.out.println("----------------------------Municipio---------------------");
            for (int j = 0; j < departamento.get(i).getMunicipios().size(); j++) {
                System.out.println(j+1+": "+departamento.get(i).getMunicipios().get(j).getNombre());
            }
        }

    }
    public static void BuscarMunicipio(){
        System.out.println("--------------------Departamentos-----------------------: ");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println( i+1+": "+departamento.get(i).getNombre());
        }

        System.out.println("Que opcion desea  escoger?: ");
        int opcion  = leer.nextInt();

        leer.nextLine();
        System.out.print("Digite el nombre municipio : ");
        String nombre = leer.nextLine();

        for (int i = 0; i < departamento.get(opcion-1).getMunicipios().size(); i++) {
            Municipio muni = departamento.get(opcion-1).getMunicipios().get(i);
            if(nombre.toUpperCase().equals(muni.getNombre().toUpperCase())){
                System.out.println("Nombre: "+muni.getNombre());
                System.out.println("Poblacion Total:"+muni.getPoblacioTotal());
                System.out.println("Area:"+muni.getArea());
            }
        }
    }
    public static void EliminarMunicipio (){
          System.out.println("--------------------Departamentos-----------------------: ");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println( i+1+": "+departamento.get(i).getNombre());
        }

        System.out.println("Que opcion desea  escoger?: ");
        int opcion  = leer.nextInt();

        System.out.println("---------------Municipios---------------");
         for (int i = 0; i < departamento.get(opcion-1).getMunicipios().size(); i++) {
            Municipio muni = departamento.get(opcion-1).getMunicipios().get(i);
            System.out.println(i+"."+muni.getNombre());
        }
        System.out.println("Cual desea eliminar?");
        int posicionElim=leer.nextInt();
        departamento.get(opcion-1).getMunicipios().remove(posicionElim);

    }
    public static void CalcularCenso(){
        System.out.println("-----------Departamento---------");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println("--------------------------------");
            System.out.println(i+"."+"Departamento");
            departamento.get(i).calcularCenso();
            System.out.println("Censo:"+departamento.get(i).getCenso());
        }
    }
    public static void CalcularArea(){

        System.out.println("-----------Departamento---------");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println("--------------------------------");
            System.out.println(i+"."+"Departamento");
            departamento.get(i).calcularArea();
            System.out.println("Censo:"+departamento.get(i).getAreaTotal());
        }
    } 


}
