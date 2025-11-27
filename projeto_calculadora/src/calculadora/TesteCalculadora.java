package calculadora;

/**
 * <p><strong>Classe de Execucao da Calculadora</strong></p>
 *
 * <p>Esta classe e responsavel por realizar testes praticos da classe
 * {@link Calculadora}, executando operacoes matematicas basicas e exibindo
 * os resultados no console.</p>
 *
 * <p>Alem de demonstrar o funcionamento dos metodos da calculadora, esta classe
 * tambem valida o comportamento do tratamento de erros, verificando:</p>
 * <ul>
 *     <li>O lançamento de exceçao ao tentar dividir por zero</li>
 *     <li>A rejeicao de operadores invalidos</li>
 * </ul>
 *
 * <p>Esta classe e destinada apenas para fins de teste e ilustracao, nao
 * sendo utilizada diretamente como parte da logica da aplicacao.</p>
 *
 * @version 1.0
 * @author Lucas Yoshida
 */
public class TesteCalculadora {

    /**
     * <p>Metodo principal responsavel por iniciar a execucao dos testes da classe
     * {@link Calculadora}. Cada operação e invocada por meio do metodo
     * {@code calcular()}, e seus resultados sao apresentados na saida padrao.</p>
     *
     * <p>Tambem sao realizados testes envolvendo operacoes invalidas, com o objetivo
     * de demonstrar o funcionamento das excecoes lancadas pela classe
     * {@link Calculadora}.</p>
     *
     * @param args argumentos de linha de comando (nao utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // excecao
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // excecao
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
