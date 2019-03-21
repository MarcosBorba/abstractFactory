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
public abstract class AcerFactory {
    public abstract Modelo criarModelo();
    
    public abstract Processador criarProcessador();

    public abstract MemoriaRam criarMemoriaRam();
}
