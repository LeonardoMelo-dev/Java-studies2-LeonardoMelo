

public class Classes
{
    public String raca;
    public double vida;
    public double destreza;
    public int level;

    Classes()
    {

    }

    Classes(String raca, double vida, double destreza, int level)
    {
        this.raca = raca;
        this.vida = vida;
        this.destreza = destreza;
        this.level = level;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDestreza() {
        return destreza;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }


}
