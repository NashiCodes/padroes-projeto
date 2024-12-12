package padroesestruturais.bridge.atividade1.cargos;

public class Recrutador extends Cargo {
    private int numeroContratacoes = 0;
    private int numeroDemissoes = 0;

    public Recrutador() {
        super("Recrutador");
    }

    public String RealizarContratacao() {
        this.numeroContratacoes++;
        return this.servicosPrestados.get("Contratacao").executar();
    }

    public String CancelarContratacao() {
        if (this.numeroContratacoes == 0) {
            return "Não há contratações para cancelar";
        }
        this.numeroContratacoes--;
        return this.servicosPrestados.get("Contratacao").cancelar();
    }

    public String RealizarDemissao() {
        this.numeroDemissoes++;
        return this.servicosPrestados.get("Demissao").executar();
    }

    public String CancelarDemissao() {
        if (this.numeroDemissoes == 0) {
            return "Não há demissões para cancelar";
        }
        this.numeroDemissoes--;
        return this.servicosPrestados.get("Demissao").cancelar();
    }

    public float calcularSalario() {
        float comissaoContratacoes = this.numeroContratacoes * this.servicosPrestados.get("Contratacao").percentualAcrescimo();
        float comissaoDemissoes = this.numeroDemissoes * this.servicosPrestados.get("Demissao").percentualAcrescimo();
        float comissaoTotal = comissaoContratacoes - comissaoDemissoes;
        if (comissaoTotal < 0) {
            comissaoTotal = 0;
        }
        return this.salarioBase * (1 + comissaoTotal);
    }
}
