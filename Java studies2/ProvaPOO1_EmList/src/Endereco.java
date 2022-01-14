public class Endereco
{
    public String CEP;
    public int numero;

    public Endereco (String CEP, int numero)
    {
        this.CEP = CEP;
        this.numero = numero;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCEP() {
        return CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco()
    {
        return "Cep: "+getCEP()+"   Numero: "+getNumero();
    }
}
