public abstract class CartaoDeMetro implements VendaDeTurismoIF {
    private int QtdeViagens;
    private static final double VALOR_DE_UMA_VIAGEM = 7.0;

    public CartaoDeMetro(int QtdeViagens) throws Exception {
        testaEntrada(QtdeViagens);
        this.QtdeViagens = QtdeViagens;
    }

    private void testaEntrada(int QtdeViagens) throws Exception {
        if (QtdeViagens <= 0) {
            throw new Exception("Quantidade de viagens deve ser maior que zero");
        }
    }

    public int getQtdeViagens() {
        return QtdeViagens;
    }

    public double setQtdeViagens(int QtdeViagens) throws Exception {
        testaEntrada(QtdeViagens);
        this.QtdeViagens = QtdeViagens;

    @Override
    public double getPreco() {
        double precoTotal = QtdeViagens * VALOR_DE_UMA_VIAGEM;
        if (QtdeViagens >= 20) {
            precoTotal *= 0.8;
        }
        return precoTotal;
    }
    }

    @Override
    public String getDescricao() {
        return "Cartão com " + QtdeViagens + " viagens.";
    }}


