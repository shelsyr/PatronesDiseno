package builderPattern;

public interface IBuilderBanco {

	public void putDatosPersonalesTitular(String nombre, String id, String fechaNacimiento);//Nombre, Identificacion, Fecha
	public void retirar();
	public void consultar();
	public void putIntereses(double intereses); //Abonos e Intereses malos :(

}
