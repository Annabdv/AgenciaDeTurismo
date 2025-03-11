import java.util.ArrayList;
import java.util.List;

public class VendasDaAgenciaDeTurismo {

    private List<VendaDeTurismoIF> vendas;

    public VendasDaAgenciaDeTurismo() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(VendaDeTurismoIF venda) {
        if (venda != null) {
            vendas.add(venda);
        } else {
            System.out.println("Inválido.");
        }
    }

    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
        } else {
            for (VendaDeTurismoIF venda : vendas) {
                System.out.println(venda.getDescricao() + " - Preço: R$" + venda.getPreco());
            }
        }
    } }


