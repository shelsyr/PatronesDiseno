package products.creditoRotativo.empresarios;

import java.util.HashMap;

import products.credito.pensionados.CreditoPensionados;
import products.creditoRotativo.IBuilderCreditoRotativo;

public class CreditoRotativoBuilderEmpresarios implements IBuilderCreditoRotativo{
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
	private CreditoRotativoEmpresarios creditoRotativo;
	public String nombre;
	public String id;
	public String fechaNacimiento;
	public boolean pasar = false;
	
	public void reset() {
		creditoRotativo = new CreditoRotativoEmpresarios();
	}
	
	@Override
	public void putCupo(int cupo) {
		creditoRotativo.setCupo(cupo);
		
	}

	@Override
	public void putCuotas(int cuotas) {
		creditoRotativo.setCuotas(cuotas);
		
	}

	@Override
	public void putDatosCuenta(String numeroCuenta, String direccion) {
		if(pasar) {
			datosPersonales.put("nombre", nombre);
			datosPersonales.put("id", id);
			datosPersonales.put("fechaN", fechaNacimiento);
			datosPersonales.put("numeroCuenta", numeroCuenta);
			datosPersonales.put("direccion", direccion);
			creditoRotativo.setDatosCuenta(datosPersonales);
		}else {
			System.out.println("Necesita primero registrar datos personales antes de los datos de la cuenta");
		}
		
		
	}

	@Override
	public void crearCuenta() {
		System.out.println("Se ha creado la cuenta con exito");
		
	}

	@Override
	public void putCuotaDeManejo(double cuotaManejo) {
		creditoRotativo.setCuotaDeManejo(cuotaManejo);
		
	}

	@Override
	public void realizarTransferencia() {
		System.out.println("Se ha realizado la transferencia con exito");
		
	}

	@Override
	public void putDatosPersonalesTitular(String nombre, String id, String fechaNacimiento) {
		this.nombre = nombre;
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
		this.pasar = true;
		
	}
	
	@Override
	public void retirar() {
		
		System.out.println("Se ha retirado el dinero!");
		
	}

	@Override
	public void consultar() {
		System.out.println("Se ha hecho la consulta con exito");
		
	}

	@Override
	public void putIntereses(double intereses) {
		creditoRotativo.setIntereses(intereses);
	}
	
	public CreditoRotativoEmpresarios getProduct() {
		return this.creditoRotativo;
	}

	@Override
	public void formaRetiro(int formaR) {
		creditoRotativo.setFormaRetiro(formaR);
		
	}
	
		
}
