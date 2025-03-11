public class PasseioDeLancha implements VendaDeTurismoIF {
    private int numeroDePessoas;
    private int qtdeHoras;
    private double precoPorPessoa;

    public PasseioDeLancha(int numeroDePessoas, int quantHoras, double precoPorPessoa) throws Exception {
        testaEntrada(numeroDePessoas, quantHoras, precoPorPessoa);
        this.numeroDePessoas = numeroDePessoas;
        this.qtdeHoras = qtdeHoras;
        this.precoPorPessoa = precoPorPessoa;
    }

    private void testaEntrada(int numeroDePessoas, int qtdeHoras, double precoPorPessoa) throws Exception {
        if (numeroDePessoas < 1) {
            throw new Exception("Inválido. Pelo menos uma pessoa deve participar do passeio.");
        }
        if (qtdeHoras < 1) {
            throw new Exception("O passeio deve durar no mínimo 1 hora.");
        }
        if (qtdeHoras > 10) {
            throw new Exception("O passeio deve durar no máximo 10 horas.");
        }
        if (precoPorPessoa <= 0) {
            throw new Exception("O preço por pessoa deve ser maior que zero.");
        }
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public int getQuantHoras() {
        return qtdeHoras;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    @Override
    public double getPreco() {
        return numeroDePessoas * qtdeHoras * precoPorPessoa;
    }

    @Override
    public String getDescricao() {
        return "O passeio de lancha para " + numeroDePessoas + " pessoas, com duração de " + qtdeHoras + " horas.";
    }
}
