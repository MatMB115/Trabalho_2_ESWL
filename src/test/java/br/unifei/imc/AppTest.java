package br.unifei.imc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    // variáveis globais da classe de teste
    WebMonitor monitor;
    String result;

    // Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init() {
        // cria o objeto da classe (unidade) a ser testada
        monitor = new WebMonitor();
    }

    /*
     * Implementação do caso de teste <
     * "Breno","tr4b4lh0Tr4b4lh050@"," breno@breno.br",true >
     */
    @Test
    public void casoTeste1() {
        result = monitor.addUser("Breno", "tr4b4lh0Tr4b4lh05@", " breno@breno.br", "true");
        assertEquals("Cadastro Válido", result);
    }

    /*
     * Implementação do caso de teste <
     * "Matheus","tr4b4lh0Tr4b4lh050@"," breno@breno.br",12
     */
    @Test
    public void casoTeste2() {
        result = monitor.addUser("Matheus", "tr4b4lh0Tr4b4lh050@", "breno@breno.br", "12");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Breno","tr4b4lh0Tr4b4lh050@","
     * breno.br",12 >
     */
    @Test
    public void casoTeste3() {
        result = monitor.addUser("Breno", "tr4b4lh0Tr4b4lh050@", " breno.br", "12");
        assertEquals("Cadastro Inválido", result);
    }

    /* Implementação do caso de teste < "Breno", "tr4b4lh", "lucas.br", 12> */
    @Test
    public void casoTeste4() {
        result = monitor.addUser("Breno", "tr4b4lh", "lucas.br", "12");
        assertEquals("Cadastro Inválido", result);
    }

    /* Implementação do caso de teste < "Bren", "tr4b4lh", "lucas.br", 12> */
    @Test
    public void casoTeste5() {
        result = monitor.addUser("Bren", "tr4b4lh", "lucas.br", "12");
        assertEquals("Cadastro Inválido", result);
    }

    /* Implementação do caso de teste < "Bren", "tr4b4lh", "lucas.br", false > */
    @Test
    public void casoTeste6() {
        result = monitor.addUser("Bren", "tr4b4lh", "lucas.br", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Luc", "tr4b4lh", "matheus@gmail.com", false
     * >
     */
    @Test
    public void casoTeste7() {
        result = monitor.addUser("Luc", "tr4b4lh", "matheus@gmail.com", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Luc", "tr4b4lh0Tr4b4lh050@",
     * "matheus@gmail.com", false >
     */
    @Test
    public void casoTeste8() {
        result = monitor.addUser("Luc", "tr4b4lh0Tr4b4lh050@", "matheus@gmail.com", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Luc", "tr4b4lh0Tr4b4lh050@",
     * "matheus@gmail.com", 12 >
     */
    @Test
    public void casoTeste9() {
        result = monitor.addUser("Luc", "tr4b4lh0Tr4b4lh050@", "matheus@gmail.com",
                "12");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Luc", "tr4b4lh0Tr4b4lh050@", "lucas.br", 12
     * >
     */
    @Test
    public void casoTeste10() {
        result = monitor.addUser("Luc", "tr4b4lh0Tr4b4lh050@", "lucas.br", "12");
        assertEquals("Cadastro Inválido", result);
    }

    // /* Implementação do caso de teste < "Luc", "tr4b4lh"," matheus@gmail.com" ,
    // 12 > */
    @Test
    public void casoTeste11() {
        result = monitor.addUser("Luc", "tr4b4lh", " matheus@gmail.com", "12");
        assertEquals("Cadastro Inválido", result);
    }

    /* Implementação do caso de teste < "Breno", "tr4b4lh", "lucas.br" , true > */
    @Test
    public void casoTeste12() {
        result = monitor.addUser("Breno", "tr4b4lh", "lucas.br", "true");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Luc", "tr4b4lh", "matheus@gmail.com", false
     * >
     */
    @Test
    public void casoTeste13() {
        result = monitor.addUser("Luc", "tr4b4lh", "matheus@gmail.com", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Breno", "tr4b4lh0Tr4b4lh050@", "breno.com",
     * false >
     */
    @Test
    public void casoTeste14() {
        result = monitor.addUser("Breno", "tr4b4lh0Tr4b4lh050@", "breno.com", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Bren", "tr4b4lh0Tr4b4lh050@", "lucas.br",
     * false >
     */
    @Test
    public void casoTeste15() {
        result = monitor.addUser("Bren", "tr4b4lh0Tr4b4lh050@", "lucas.br", "false");
        assertEquals("Cadastro Inválido", result);
    }

    /*
     * Implementação do caso de teste < "Breno", "tr4b4lh", "matheus@gmail.com", 12
     * >
     */
    @Test
    public void casoTeste16() {
        result = monitor.addUser("Breno", "tr4b4lh", "matheus@gmail.com", "12");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste17() {
        result = monitor.addUser("Breno", "tr4b4lh0Tr4b4lh050@", "breno.br", "true");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste18() {
        result = monitor.addUser("Ana", "tr4b4lh0Tr4b4lh050@", "breno.br", "true");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste19() {
        result = monitor.addUser("Ana", "tr4b4lh0Tr4b4lh050@", "ana@breno.br", "true");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste20() {
        result = monitor.addUser("123456", "tr4b4lh0Tr4b4lh050@", "ana@breno.br", "true");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste21() {
        result = monitor.addUser("Matheus", "tr4b4lh0Tr4b4lh050@", "ana", "true");
        assertEquals("Cadastro Inválido", result);
    }

    @Test
    public void casoTeste22() {
        result = monitor.addUser("Matheus", "tr4b4lh0Tr4b4lh050@", "ana@breno.br", "amigo");
        assertEquals("Cadastro Inválido", result);
    }

}
