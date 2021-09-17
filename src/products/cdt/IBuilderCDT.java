package products.cdt;

import builderPattern.IBuilderBanco;

public interface IBuilderCDT extends IBuilderBanco{
	public void putBaseMonto(double BaseMonto);
	public void putBaseTiempo(double BaseTiempo);
	public void putNivelRiesgo(double nivelR);//0.0009
	
	
		
}
