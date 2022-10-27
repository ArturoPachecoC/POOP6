/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Usuario
 */
class Fecha {
     private int dia; 
    private int mes; 
    private int año; 
    
    public Fecha(int dia, int mes, int año) {
        this.dia=dia;
        this.mes=mes; 
        this.año=año; 
    }
    public Fecha(){   
    } 
    public int getDia(){
        return dia; 
    } 
    public void setDia(int dia){
        if(dia>0 && dia<31) {
            this.dia=dia;
        } else{
            System.out.println("día no válido"); 
            this.dia=0;
        }
    }  
    public int getMes(){
        return mes; 
    } 
    public void setMes(int mes){
        if (mes>0 && mes<12) {
            this.mes=mes;
        } else{
            System.out.println("mes no válido"); 
            this.mes=0;
        }
    } 
    public int getAño(){
        return año; 
    } 
    public void setAño(int año){
        this.año=año;
    }  
    @Override  
    public String toString(){
        return "Fecha{" + "dia=" + dia +", mes=" + mes +",a\u00f10"+ año+"}";
    }
}
