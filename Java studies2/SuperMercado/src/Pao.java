public class Pao implements Item
{
    private String nomeIten;
    private double preco;
    private String departamento;

    public String getNomeIten()
    {
        return nomeIten;
    }
    public double getPreco()
    {
        return 0;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    @Override
    public String getDepartamento()
    {
        return departamento;
    }
}
