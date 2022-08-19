/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regpoo;

/**
 *
 * @author elias
 */
import java.util.Scanner;
public class EjectPoo {
    public static void main(String[] args) {
RegPoo ciudadano[] = new RegPoo[1];
RegPoo lista[] = new RegPoo[1];

Scanner input = new Scanner(System.in);
Scanner digit = new Scanner(System.in);


 for(int ask=0; ask<ciudadano.length; ask++){
System.out.print("Contador de registros No: ");
   System.out.println(ask+1);
 System.out.println("\nIngrese su Nombre");
 String nombre = input.nextLine();
 System.out.println("Ingrese su Apellido");
 String apellido = input.nextLine();
 System.out.println("Ingrese su DPI");
 int dpi = digit.nextInt();
 System.out.println("Ingrese su NIT");
 int nit = digit.nextInt();
 System.out.println("Desea introducir un nuevo registro escriba <si> o <no>");
 String op = input.nextLine();
ciudadano[ask] = new RegPoo(nombre,apellido,dpi,nit);
if(op.equals("si") || op.equals("Si")){
lista=new RegPoo[ciudadano.length];
for(int col=0; col<ciudadano.length; col++){
  lista[col]=ciudadano[col];}
  ciudadano=new RegPoo[ciudadano.length+1];
  for(int soport=0; soport<ciudadano.length-1; soport++){
  ciudadano[soport]=lista[soport];}
}
  else if(ask<=10){break;}
else{break; 
 }
} 
  


System.out.println("****  Registro de ciudadanos ****");
for(int pgr=0; pgr<ciudadano.length; pgr++){
    System.out.println(
            "\nNombre: "+ciudadano[pgr].nombres+
      "\nApellido: "+ciudadano[pgr].apellidos+
      "\nDPI: "+ciudadano[pgr].DPI+
      "\nNIT: "+ciudadano[pgr].NIT+"\n");

}
    }
}
