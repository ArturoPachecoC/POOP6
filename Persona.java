/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Usuario
 */
class Persona {
    private String nombre; 
    private String apellido; 
    private Fecha fNacimiento;
    public Persona(){
    }
    public Persona (String nombre, String apellido, Fecha fNacimiento){
    this.nombre=nombre ;
    this.apellido=apellido; 
    this.fNacimiento=fNacimiento;
}  
    public String getNombre(){
        return nombre; 
    } 
    public void setNombre(String nombre){
        this.nombre=nombre; 
    } 
    public String getApellido(){
        return apellido; 
    } 
    public void setApellido(String apellido){
        this.apellido=apellido; 
    } 
    public Fecha getfNacimiento(){
        return fNacimiento; 
    } 
    public void setfNacimiento(Fecha fNacimiento){
        this.fNacimiento=fNacimiento; 
    } 
}
