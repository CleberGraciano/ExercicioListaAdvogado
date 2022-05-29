import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Defensoria {

    //private List<Processo> processos = new ArrayList<>();
    private Processo[] lista;
    private int indice;

    public Defensoria(int tamanho){
        lista = new Processo[tamanho];
    }

    public void inserir(Processo processo){
        if (indice < lista.length){
            lista[indice]=processo;
            indice++;
        }else {
            System.out.println("A lista não suporta mais processo, favor aumentar o tamanho da lista!!");
        }
    }

    public void encerrar(int codigo, String dataEncerramento){
        for (int indice=0; indice<lista.length;indice++){
            if (lista[indice].getCodigo()==codigo) {
                if (lista[indice].getDataEncerramento()==null){
                    lista[indice].setDataEncerramento(dataEncerramento);
                }
            }else {
                System.out.println("Processo nao encontrado para o codigo: "+codigo);
            }
        }

    }

    public String listar(){
        String retornoProcessos="";

        for (int indice=0; indice<lista.length; indice++){
            retornoProcessos += lista[indice].getDados();
        }

        return retornoProcessos;
    }


//Exemplo com List
//    public void inserir(Processo processo){
//        processos.add(processo);
//    }

//    public void encerrar(int codigo, LocalDate dataEncerramento){
//        for (Processo processo: processos ) {
//            if (processo.getCodigo()==codigo){
//                if (processo.getDataEncerramento()==null){
//                    processo.setDataEncerramento(dataEncerramento);
//                }
//            }
//        }
//    }

//    public void listar(){
//       processos.forEach(processo -> System.out.println(processo.getDados()));
//    }


}
