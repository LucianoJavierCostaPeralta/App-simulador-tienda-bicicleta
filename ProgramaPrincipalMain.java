import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramaPrincipalMain {

    public static void main(String[] args) {

        //Inicializaciín variables
        Scanner sc= new Scanner (System.in);
        int opcion;
        boolean salir = false;
        try {
            while (!salir)
            {
                System.out.println("Programa de Archivo de Bicicleta");
                System.out.println("--------------------------------");
                System.out.println();
                System.out.println("Elija una opción");
                System.out.println("1...........Cargar nuevos Datos");
                System.out.println("2..............Filtrar por Rodado");
                System.out.println("3..............Filtrar por Marca ");
                System.out.println("4..............Filtrar por talle  ");
                System.out.println("5.................Listado Total");
                System.out.println("6............Salir del Programa");
                System.out.println();
                System.out.print("Ingrese su opción : ");
                opcion = sc.nextInt();

                //Negocio de opciones
                switch (opcion)
                {



                    case 1 : {
                        System.out.println("Carga de Datos en Archivo de Personas");
                        System.out.println();
                        CargarDatos carga = new CargarDatos();
                        carga.cargarDatos();
                        break;
                    }

                    case 2 : {
                        System.out.println("Filtrar por Rodado o diametro");
                        System.out.println();
                        ListadoRodado l = new ListadoRodado();
                        l.listarRodado();
                        break;
                    }
                    case 3 : {
                        System.out.println("Filtrar por Marca ");
                        System.out.println();
                        ListadoMarca l = new ListadoMarca();
                        l.listarMarca();
                        break;
                    }
                    case 4 : {
                        System.out.println("Filtrar por Talle ");
                        System.out.println();
                        ListadoTalle l = new ListadoTalle();
                        l.listadoTalle();
                        break;
                    }

                    case 5 : {
                        System.out.println("Listado Total de Bicicletas");
                        System.out.println();
                        ListadoTotal listaTotal = new ListadoTotal();
                        listaTotal.listarTodo();
                        break;

                    }
                    case 6: {
                        System.out.println("Saliendo del programa ...");
                        System.out.println();
                        sc.close();
                        salir = true;
                        break;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número");
            opcion = sc.nextInt();
        }
    }
}