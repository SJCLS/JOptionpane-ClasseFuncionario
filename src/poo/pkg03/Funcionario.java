package poo.pkg03;

public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtDeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtDeHora() {
        return qtDeHora;
    }

    public void setQtDeHora(float qtDeHora) {
        this.qtDeHora = qtDeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularValorSalario() {
        if (tipoVinculo == 'H') {
            return ((valorHora * qtDeHora) - valorDesconto);
        } else {
            return salario - valorDesconto;
        }

    }

    public String imprimir() {
         if (tipoVinculo == 'H') {
            this.salario = valorHora * qtDeHora;
        } 
        return "Crachá: " + cracha
                + "\nNome: " + nome
                + "\nTipo Vínculo: " + tipoVinculo
                + "\nSalário: " + salario
                + "\nDesconto: " + valorDesconto 
                + "\nVAlor a receber: " + calcularValorSalario();

        }
}
