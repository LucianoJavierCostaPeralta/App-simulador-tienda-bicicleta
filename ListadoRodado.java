//Conjunto de Líbrerías a utilizar
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.IOException;


public class ListadoRodado {

    public void listarRodado() {
        //Condiciones de inicialización
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream entrada = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese diametro o rodado  a buscar en Archivo de Bicicleta : ");
        int edad = scan.nextInt();
        try {
            //Búsqueda y Listado Personas mayores a 30 años
            fis = new FileInputStream("Bicic.dat");
            entrada = new ObjectInputStream(fis);
            Bicicleta p;
            System.out.println("Personas con rodado nro : " + edad);
            while ((p = (Bicicleta) entrada.readObject()) != null) {
                if (p.getRodado() == edad)
                    System.out.println("Clase de bicicleta " + p.getClaseBici());
                System.out.println("Marca : " + p.getMarca());
                System.out.println("Rodado / Diametro : " + p.getRodado());
                System.out.println("Frenos : " + p.getFrenos());
                System.out.println("Talle : " + p.getTalle());
            }

            //Control y Encapsulado de Errores
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException e) {
            //System.out.println(e.getMessage());
        } catch (IOException e) {
            //System.out.println(e.getMessage());
        } finally {
            //Cierre de Recursos
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }

                //Control y Encapsulado de Errores
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}