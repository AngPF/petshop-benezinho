package model;

public class Documento {

    private int id;
    private String numero;

    public Documento() {
    }

    public Documento(int id, String numero) {
        this.setId(id);
        this.setNumero(numero);
    }


    public int getId(int id) {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero(String numero) {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                '}';
    }
}
