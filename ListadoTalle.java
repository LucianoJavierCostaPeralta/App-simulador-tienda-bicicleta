import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.IOException;


public class ListadoTalle {

    public void listadoTalle(){
        //Condiciones de inicialización
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream entrada = null;
        Scanner scan = new Scanner (System.in);

        System.out.print("Ingrese talle  a buscar en Archivo de Bicicleta : ");
        String edad = scan.nextLine();
        try {

            fis = new FileInputStream("Bicic.dat");
            entrada = new ObjectInputStream(fis);
            Bicicleta p;
            System.out.println("Personas con bicicletas talle  : "+edad);
            while ((p = (Bicicleta) entrada.readObject()) != null){
                if (p.getTalle()== edad )
                    System.out.println("Clase de bicicleta "+p.getClaseBici());
                System.out.println("Marca : "+p.getMarca());
                System.out.println("Rodado / Diametro : "+p.getRodado());
                System.out.println("Frenos : "+p.getFrenos());
                System.out.println("Talle : "+p.getTalle());
            }

            //Control y Encapsulado de Errores
        }  catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }  catch (ClassNotFoundException e) {
            //System.out.println(e.getMessage());
        }  catch (IOException e) {
            //System.out.println(e.getMessage());
        }  finally {
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
