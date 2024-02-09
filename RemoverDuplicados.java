import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoverDuplicados {

    public static void main(String[] args) {
        // Exemplo de utilização
        List<EmissaoVO> listaDeObjetos = // Sua lista de objetos
        List<EmissaoVO> listaSemDuplicadas = removerDuplicadas(listaDeObjetos);
       
        // Agora 'listaSemDuplicatas' contém os objetos da lista original sem duplicatas
    }

    public static List<EmissaoVO> removerDuplicadas(List<EmissaoVO> lista) {
        Set<EmissaoVO> setSemDuplicadas = new HashSet<>(lista);
        return new ArrayList<>(setSemDuplicadas);
    }
}
