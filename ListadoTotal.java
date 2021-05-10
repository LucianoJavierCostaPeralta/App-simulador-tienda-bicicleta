import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.IOException;


public class ListadoTotal {

    public void listarTodo() {
        //Condiciones de inicialización
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream entrada = null;

        try {

            fis = new FileInputStream("Bicic.dat");
            entrada = new ObjectInputStream(fis);
            Bicicleta p;
            System.out.println("Listado Total de Bicicleta ");
            while ((p = (Bicicleta) entrada.readObject()) != null) {
                System.out.println("Clase bicicleta : " + p.getClaseBici());
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