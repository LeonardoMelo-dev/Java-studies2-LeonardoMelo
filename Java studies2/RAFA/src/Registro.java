public class Registro
{
    private String placa;
    private String cidade;
    private String estado;

    public Registro(String placa, String cidade, String estado)
    {
        this.cidade = cidade;
        this.estado = estado;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Registro" +
                "placa='" + placa + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'';
    }
}
