/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.Serializable;

/**
 *
 * @author Jhonathan Sn
 */
public class Paciente implements Serializable {
    /*
    Las clases estan compuesos de caracteristicas  y comportamientos: 
    las caracteristicas se van a representar como variables 
    los comportamientos se van a representar como métodos.
    
    
    Primer. PRINCIPIO DE POO (programacion orientada a objetos:Abstaccion:
    es obtener las caracteristicas y comportamientos de un objeto  que se desee representar
    como una clase que sean de interes para mi solucion.
    
    
    2do principio de poo: Encapsulamiento
    el ocultamiendo del estado, es decir, de los datos miembro de un objeto (ccaraceristica de manera que solo se pueda cambiar mediante las operaciones definidas ara ese objeto
    
    
    modifiacdores de acceso: indican el nibel de acceso que se tine sobre un cmoponente que son public y private
    */
  private int edad;
  private char sexo;
  private String ciudad;
/* 
  
  listado de metodos 
  geters : retornar el valor que se tiene almaenado unun artubyato
  set: asiganr un objet a un aributo ( una variable) 
  
  modifiacador_acceso*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
  
  
}
