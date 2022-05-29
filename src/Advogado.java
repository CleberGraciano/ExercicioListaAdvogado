public class Advogado {

    private String nome;
    private int matricula;
    private String area;

    public Advogado(){

    }

    public Advogado(int matricula, String nome, String area){
        this.matricula=matricula;
        this.nome=nome;
        this.area=area;
    }
    public Advogado(int matricula){
        this.matricula=matricula;

    }

    public Advogado(int matricula, String nome){
        this.matricula=matricula;
        this.nome=nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDados(){
        return "Matricula: "+matricula+" Nome: "+nome+" Area: "+area;
    }


}
