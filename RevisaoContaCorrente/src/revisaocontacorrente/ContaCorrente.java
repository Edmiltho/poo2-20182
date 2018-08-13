/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaocontacorrente;

/**
 *
 * @author Cacherow
 */
public abstract class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }
        
    public double CalculaTributos(double saldo){
        return 0.1*saldo;
    }
    
}
