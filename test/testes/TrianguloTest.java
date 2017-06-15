/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tat
 */
public class TrianguloTest {

    public TrianguloTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of triangulo method, of class Triangulo.
     */
    @Test
    public void testTriangulo() {
        Triangulo teste = new Triangulo();

        assertEquals(teste.triangulo(3, 2, 4), "escaleno");
        assertEquals(teste.triangulo(3, 3, 3), "equilatero");
        assertEquals(teste.triangulo(3, 2, 3), "isoceles");
        assertEquals(teste.triangulo(1, 2, 3), "não triangulo");
        assertEquals(teste.triangulo(1, 0, 1), "não triangulo");

        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Triangulo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Triangulo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
