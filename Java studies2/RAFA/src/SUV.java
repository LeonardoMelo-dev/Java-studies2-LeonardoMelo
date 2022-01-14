public class SUV extends Automovel
{
    private int numPassageiros;
    private int tamanho;
    private Registro registro;

    public SUV(int numPassageiros, int tamanho, Registro registro)
    {
        this.numPassageiros = numPassageiros;
        this.tamanho = tamanho;
        this.registro = registro;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int getCombustivel() {
        return super.getCombustivel();
    }

    @Override
    public void setCombustivel(int combustivel) {
        super.setCombustivel(combustivel);
    }

    @Override
    public int getVelocMax() {
        return 0;
    }

    @Override
    public String toString() {
        return "SUV" +
                "numPassageiros=" + numPassageiros +
                ", tamanho=" + tamanho +
                ", registro=" + registro;
    }
}
