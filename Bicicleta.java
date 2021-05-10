import java.io.Serializable;

public class Bicicleta implements Serializable {
    //Atributos
    private String marca  ;
    private int  rodado ;
    private String frenos ;
    private String talle ;
    private String claseBici ;

    //Metodos

    //Metodo Constructor por defecto
    public Bicicleta() {
    }

    //Metodo Constructor con Atributos
    public Bicicleta(String marca, int rodado, String frenos, String talle , String claseBici) {
        this.marca = marca;
        this.rodado = rodado;
        this.frenos = frenos;
        this.talle = talle;
        this.claseBici = claseBici;
    }

    //Metodos Geter & Seters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getClaseBici() {
        return claseBici;
    }

    public void setClaseBici(String claseBici) {
        this.claseBici = claseBici;
    }
}