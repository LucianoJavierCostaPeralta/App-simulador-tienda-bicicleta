import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class CargarDatos {

    public  void cargarDatos () {
        //Condiciones de inicialización
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        String tecla = "";

        try {

            fos = new FileOutputStream("Bicic.dat");
            salida = new ObjectOutputStream(fos);
            //Scanner para leer Strings
            Scanner entry = new Scanner(System.in);
            //Scanner para leer int
            Scanner entry2 = new Scanner(System.in);

            System.out.println("Ingrese datos de Bicicleta ");
            System.out.println("---------------------------");

            //Bucle hasta salir con N/n
            while (!(tecla.equalsIgnoreCase("n"))){

                Bicicleta b = new Bicicleta();

                System.out.println("Ingrese las caracteristicas de bicicletas :" +
                        "\nClase bicicleta : Infantil - Urbana - MTB - Road (velocidad) " +
                        "\nMarca : Ejemplo 'Marca1'" +
                        "\nRodado : 29 , 26 , etc" +
                        "\nFrenos : 'Hidraulico' O 'Mecanico'" +
                        "\nTalle : 'S' , 'M','l','xl' ");



                System.out.print("Ingrese  la clase de bicicleta :");
                b.setClaseBici(entry.nextLine());

                System.out.print("Ingrese  la marca  de bicicleta :");
                b.setMarca(entry.nextLine());
                System.out.print("Ingrese el rodado de la bicicleta : ");
                b.setRodado(entry2.nextInt());
                System.out.print("Ingrese  el tipo  de freno :");
                b.setFrenos(entry.nextLine());

                System.out.print("Ingrese  el talle del rodado :");
                b.setTalle(entry.nextLine());

                salida.writeObject(b);
                System.out.println("Continúa? / N o n para salir");
                tecla = entry.nextLine();
                if (tecla.equalsIgnoreCase("n")) break;



            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







}