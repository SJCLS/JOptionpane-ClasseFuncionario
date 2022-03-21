package poo.pkg03;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int cracha, opc = 0;
        String nome;
        char tipoVinculo = 0;
        float valorHora = 0, qtDeHora = 0, salario = 0, valorDesconto = 0;
        Object[] arrayTipoConta = {"Horista", "Mensalista"};
        Funcionario funcionario = null;

        while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Criar funcionario "
                    + "\n2-Mostrar folha de pagamento \n3-Alterar remuneração \n4-Sair"));
            switch (opc) {
                case 1:
                    cracha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu Crachá: "));
                    nome = JOptionPane.showInputDialog(null, "Informe seu Nome: ");
                    tipoVinculo = JOptionPane.showInputDialog(null, "Informe o tipo de vínculo: ", "Selecione",
                            JOptionPane.INFORMATION_MESSAGE, null, arrayTipoConta, arrayTipoConta[0]).toString().charAt(0);

                    if (tipoVinculo == 'H') {
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da hora: "));
                        qtDeHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quantidade de horas: "));
                    } else {
                        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o salario: "));
                    }

                    valorDesconto = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do desconto: "));
                    funcionario = new Funcionario();
                    funcionario.setCracha(cracha);
                    funcionario.setNome(nome);
                    funcionario.setQtDeHora(qtDeHora);
                    funcionario.setSalario(salario);
                    funcionario.setTipoVinculo(tipoVinculo);
                    funcionario.setValorDesconto(valorDesconto);
                    funcionario.setValorHora(valorHora);
                    break;
                case 2:
                    if (funcionario != null) {
                        JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionario cadastrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    if (funcionario == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionario cadastrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (tipoVinculo == 'H') {
                            funcionario.setValorHora(valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da hora: ")));
                            funcionario.setQtDeHora(qtDeHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quantidade de horas: ")));
                        } else {
                            funcionario.setSalario(salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o salario: ")));
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Até breve! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Atenção", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

}
