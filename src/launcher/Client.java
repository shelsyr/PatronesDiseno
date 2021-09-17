package launcher;

import java.util.Random;
import java.util.Scanner;

import products.cdt.empresarios.CDTEmpresarios;
import products.tarjetas.tarjetaCredito.TarjetaCredito;

public class Client {
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		Director d = new Director();
		CDTEmpresarios cdtE = d.cdtEmpresario();
        CDTEmpresarios clonCDTE = d.cloneCDTE(cdtE);
		System.out.println("los datos Personales del Usuario del CDT son: ");
		//ENCRIPTADO System.out.println(cdtL.toString());
		cdtE.imprimirDatosPersonales();
		System.out.println("los datos del CDT del Usuario es: ");
		cdtE.imprimirDatosCDT();
		System.out.println("los datos personales del Usuario del ClonCDT son: ");
		clonCDTE.imprimirDatosPersonales();
		System.out.println("los datos del ClonCDT del Usuario es: ");
		clonCDTE.imprimirDatosCDT();
		
		
		System.out.println("\n\nCREACION DE TARJETA DE CREDITO\n");
		
		System.out.println("Digite el Nombre del propietario de la tarjeta");
		String nombre = leer.nextLine();
		System.out.println("Digite la fecha de nacimiento del propietario de la tarjeta");
		String fechaN = leer.nextLine();
		System.out.println("Digite el codigo del propietario de la tarjeta");
		String codigo = leer.nextLine();
		System.out.println("Digite la fecha de vencimiento del propietario de la tarjeta");
		String fechaV = leer.nextLine();
		TarjetaCredito TC = d.tarjetaCred(nombre, fechaN, codigo, fechaV);
		
		System.out.println("los datos de la Tarjeta de Credito del Usuario son: ");
		System.out.println(TC.getDatosTarjeta());
		
		
	}
}
