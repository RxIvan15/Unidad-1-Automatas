/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rfls_
 */
public interface InterfaceCerraduras {
    public abstract String positiva(int k, char[] a);
    public abstract String kleene(int k, char[] a);
    public abstract String potencia(int valor, char[] a);
}
