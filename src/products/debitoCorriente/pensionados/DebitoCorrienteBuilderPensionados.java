package products.debitoCorriente.pensionados;

import java.util.HashMap;

import products.debitoCorriente.IBuilderDebitoCorriente;
import products.debitoCorriente.empresarios.DebitoCorrienteEmpresarios;

public class DebitoCorrienteBuilderPensionados implements IBuilderDebitoCorriente{
	private HashMap<String, String> datosPersonales = new HashMap<String, String>();
	private DebitoCorrientePensionados debitoCorriente;
	public String nombre;
	public String id;
	public String fechaNacimiento;
	public boolean pasar = false;
	

	public void reset() {
		debitoCorriente = new DebitoCorrientePensionados();
	}
	
	@Override
	public void depositar() {
		System.out.println("Se ha depositado con exito");
		
	}

	@Override
	public void putImpuestos(double impuestos) {
		debitoCorriente.setImpuestos(impuestos);
		
	}

	@Override
	public void putDatosCuenta(String numeroCuenta, String direccion) {
		if(pasar) {
			datosPersonales.put("nombre", nombre);
			datosPersonales.put("id", id);
			datosPersonales.put("fechaN", fechaNacimiento);
			datosPersonales.put("numeroCuenta", numeroCuenta);
			datosPersonales.put("direccion", direccion);
			debitoCorriente.setDatosCuenta(datosPersonales);
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
		debitoCorriente.setCuotaDeManejo(cuotaManejo);
		
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
		debitoCorriente.setIntereses(intereses);
	}
	
	public DebitoCorrientePensionados getProduct() {
		return this.debitoCorriente;
	}
	
	
}
