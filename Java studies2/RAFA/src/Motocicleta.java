public class Motocicleta implements Transporte
{
    private String marca;
    private int cilindradas;
    private Registro registro;

    public Motocicleta(String marca, int cilindradas, Registro registro)
    {
        this.marca = marca;
        this.cilindradas = cilindradas;
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int getNumRodas() {
        return 0;
    }



    @Override
    public int getPotencia() {
        return 0;
    }

    @Override
    public int getPotenciaMax() {
        return 0;
    }

    @Override
    public String toString() {
        return "Motocicleta" +
                "marca='" + marca + '\'' +
                ", cilindradas=" + cilindradas +
                ", registro=" + registro;
    }
}
