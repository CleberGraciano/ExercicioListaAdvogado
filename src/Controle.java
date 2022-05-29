import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {

    private List<Advogado> advogados = new ArrayList<>();

    public void cadastrarAdvogado(Advogado advogado){
        advogados.add(advogado);
    }

    public void listarAdvogados(){
        for (Advogado advogado: advogados) {
            System.out.println(advogado.getDados());
        }
    }

    public Advogado buscaAdvogadoPorMatricula(int matricula){
        Advogado Advogadoretorno = new Advogado();

        for (Advogado advogado: advogados) {
            if (advogado.getMatricula()==matricula){
                Advogadoretorno.setMatricula(advogado.getMatricula());
                Advogadoretorno.setNome(advogado.getNome());
                Advogadoretorno.setArea(advogado.getArea());
            }

        }
        return Advogadoretorno;
    }

    public void menu(){
        Scanner teclado = new Scanner(System.in);
        Defensoria defensoria = new Defensoria(2);

        int opcao =99999;
        while (opcao!=0) {

            System.out.println("===== Digite a opção desejada ===== \n");
            System.out.println("1 - Cadastro de Advogados\n");
            System.out.println("2 - Listagem de Advogados\n");
            System.out.println("3 - Cadastro de Processos\n");
            System.out.println("4 - Encerramento de Processo\n");
            System.out.println("5 - Listagem de processos\n");
            System.out.println("0 - Sair do Sistema\n");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite a Matricula: ");
                    int matricula = teclado.nextInt();
                    System.out.println("Digite o nome do advogado: ");
                    String nome=teclado.next();
                    System.out.println("Digite a area do advogado: ");
                    String area=teclado.next();
                    Advogado advogado = new Advogado(matricula, nome, area);
                    cadastrarAdvogado(advogado);
                    break;
                case 2:
                    listarAdvogados();
                    break;
                case 3:
                    System.out.println("Digite o codigo: ");
                    int codigo = teclado.nextInt();
                    System.out.println("Digite a data de abertura: ");
                    String dataAbertura=teclado.next();
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente=teclado.next();
                    System.out.println("Digite o codigo do advogado: ");
                    int matriculaAdvogado = teclado.nextInt();
                    Processo processo = new Processo(codigo, dataAbertura, nomeCliente, buscaAdvogadoPorMatricula(matriculaAdvogado));
                    defensoria.inserir(processo);
                    break;
                case 4:
                    System.out.println("Digite o codigo do processo: ");
                    int codigoProcesso = teclado.nextInt();
                    System.out.println("Digite a data de encerramento: ");
                    String dataEncerramento=teclado.next();
                    defensoria.encerrar(codigoProcesso, dataEncerramento);
                case 5:
                    defensoria.listar();
                    break;

            }
        }


    }
}
