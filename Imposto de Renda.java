public class Imposto {

    // Classe Pessoa
    public static class Pessoa {
        private String nome;
        private double salario;

        public Pessoa(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }
    }

    // Classe FaixaImpostoDeRenda
    public class FaixaImpostoDeRenda {
        public static int obterFaixa(double salario) {
            if (salario <= 1903.98) {
                return 0; // Isento
            } else if (salario <= 2826.65) {
                return 1; // 7.5%
            } else if (salario <= 3751.05) {
                return 2; // 15%
            } else if (salario <= 4664.68) {
                return 3; // 22.5%
            } else {
                return 4; // 27.5%
            }
        }
    }

    // Classe ImpostoDeRenda
    public static class ImpostoDeRenda {
        private Pessoa pessoa;
        private int faixa;

        public ImpostoDeRenda(Pessoa pessoa) {
            this.pessoa = pessoa;
            this.faixa = FaixaImpostoDeRenda.obterFaixa(pessoa.getSalario());
        }

        public double calcular() {
            double salario = pessoa.getSalario();
            double imposto = 0.0;

            switch (faixa) {
                case 1:
                    imposto = salario * 0.075;
                    break;
                case 2:
                    imposto = salario * 0.15;
                    break;
                case 3:
                    imposto = salario * 0.225;
                    break;
                case 4:
                    imposto = salario * 0.275;
                    break;
            }

            return imposto;
        }

        public void imprimir() {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Salário: " + pessoa.getSalario());
            System.out.println("Faixa de IR: " + faixa);
            System.out.println("Imposto a pagar: " + calcular());
        }
    }

    // Classe principal
    public class Principal {
        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa("Aliny", 3200.00);
            Pessoa pessoa2 = new Pessoa("Aparecida", 1700.00);
            Pessoa pessoa3 = new Pessoa("Sérgio", 5100.00);

            ImpostoDeRenda ir1 = new ImpostoDeRenda(pessoa1);
            ImpostoDeRenda ir2 = new ImpostoDeRenda(pessoa2);
            ImpostoDeRenda ir3 = new ImpostoDeRenda(pessoa3);

            ir1.imprimir();
            System.out.println();
            ir2.imprimir();
            System.out.println();
            ir3.imprimir();
        }
    }

}