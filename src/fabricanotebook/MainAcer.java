/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricanotebook;

/**
 *
 * @author marcos
 */
public class MainAcer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AcerFactory acer1 = new AspireFactory();
        AspireFactory acer2 = (AspireFactory)acer1;
        acer2.criarMemoriaRam();
        acer2.criarModelo();
        acer2.criarProcessador();
    }
    
}
