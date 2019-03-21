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
public class AspireFactory extends AcerFactory{

    @Override
    public Modelo criarModelo() {
        return new Aspire5();
    }

    @Override
    public Processador criarProcessador() {
        return new IntelPro();
    }

    @Override
    public MemoriaRam criarMemoriaRam() {
        return new RamPro();
    }
    
}
