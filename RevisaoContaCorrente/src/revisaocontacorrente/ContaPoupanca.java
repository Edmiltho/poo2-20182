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
public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca(double juros, double saldo) {
        super(saldo);
        this.juros = juros;
    }

    
    
    
}
