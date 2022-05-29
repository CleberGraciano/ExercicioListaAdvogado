import java.time.LocalDate;

public class Processo {

    private int codigo;
    private String dataAbertura;
    private String dataEncerramento;
    private String nomeDoCliente;
    private Advogado advogado;

    public Processo(int codigo, String dataAbertura, String nomeDoCliente, Advogado advogado) {
        this.codigo = codigo;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = null;
        this.nomeDoCliente = nomeDoCliente;
        this.advogado = advogado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public String getDados(){

        return "\nCódigo: "+codigo+
        "\n Data Abertura: "+dataAbertura+
        "\n Data Encerramento: "+dataEncerramento+
        "\n Nome Cliente: "+nomeDoCliente+
        "\n ======  Dados advogados ====== \n"+advogado.getDados();

    }

}
