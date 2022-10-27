/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Usuario
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1= new Persona ();
        System.out.println(per1);
        per1.setNombre("Sofia");
        System.out.println(per1.getNombre);
        per1. setApellido("Hernandez");
        per1.setfNacimiento(Fecha(21,10,22));
        Persona per2=new Persona ("Arturo", "Pacheco" , new Fecha(29, 07, 2003) ) ;
        System.out.println(per2);
        Fecha fecha=new Fecha ();
        fecha.setDia(33);
        fecha.setMes(22);
        fecha. setAño (99) ;
            }
    
        }
