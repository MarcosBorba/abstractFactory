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
public class RangeFactory extends AcerFactory{

    @Override
    public Modelo criarModelo() {
        return new Range5();
    }

    @Override
    public Processador criarProcessador() {
        return new IntelMax();
    }

    @Override
    public MemoriaRam criarMemoriaRam() {
        return new RamMax();
    }
    
}
