package hn.uth.junit_test_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

    

    @BeforeClass
    public static void inicio() {
        System.out.println("Ejecutar Prueba Unitaria");
        
    }
       
    @Test
    public void areacirculo_RadioPositivo() {
        assertEquals(78.54, App1.areaCirculo(5.0), 0.01);
    }
    
    @Test
    public void areaCirculo_RadioDecimal() {
        assertNotEquals("El radio del área del círculo no debe ser 0", 0.0, App1.areaCirculo(2.5), 0.01);
    }
    
    @Test
    public void areaCirculo_RadioNegativo() {
        assertNotNull("El radio del área del círculo no debe ser negativo", App1.areaCirculo(-3.0));
    }
    
    @Test
    public void areaCuadrado_LadoPositivo() {
        assertEquals(25.0, App1.areaCuadrado(5.0), 0.01);
    }
    
    @Test
    public void areaCuadrado_LadoNegativo() {
    	assertNotNull("El Lado del cuadrado no debe ser negativo", App1.areaCuadrado(-3.0));
    }
    
    @Test
    public void areaCuadrado_LadoDecimal() {
        assertNotEquals("El Lado del cuadrado no debe ser 0", 0.0, App1.areaCuadrado(2.5), 0.01);
    }
    
    @Test
    public void areaRectangulo_Positivo() {
        assertEquals(25.0, App1.areaRectangulo(5.0, 5.0), 0.01);
    }
    
    @Test
    public void areaRectangulo_Negativo() {
    	assertNotNull("La Base o la altura de Rectangulo no debe ser negativo", App1.areaRectangulo(-3.0,3.0));
    }
    
    @Test
    public void areaRectangulo_Decimal() {
        assertNotEquals("La Base o la altura de Rectangulo no debe ser 0", 0.0, App1.areaRectangulo(2.5, 1.0), 0.01);
    }
    
    
    @Test
    public void areaTriangulo_Positivo() {
        assertEquals(5.0, App1.areaTriangulo(5.0, 2.0), 0.01);
    }
    
    @Test
    public void areaTriangulo_Negativo() {
    	assertNotNull("La Base o la altura del Triangulo no debe ser negativo", App1.areaTriangulo(-3.0, 4.0));
    }
    
    @Test
    public void areaTriangulo_Decimal() {
        assertNotEquals("La Base o la altura del Triangulo no debe ser 0", 0.0, App1.areaTriangulo(2.5,4.0), 0.01);
    }
    
    @AfterClass
    public static void finalizacion() {
        System.out.println("Prueba Unitaria Finalizada");
    }
}

