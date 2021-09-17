package products.cdt;

public abstract class PerfilesCDT implements IBuilderCDT{
    
    public double baseMonto;
	public double baseTiempo;
	public double intereses;
	public double nivelDeRiesgo;
    
    public PerfilesCDT(){
        
    }
    
    protected PerfilesCDT(PerfilesCDT s){
        this.baseMonto = s.baseMonto;
        this.baseTiempo = s.baseTiempo;
        this.intereses = s.intereses;
        this.nivelDeRiesgo = s.nivelDeRiesgo;
    }
    
    
    
    public double getBaseMonto() {
		return baseMonto;
	}

	public void setBaseMonto(double baseMonto) {
		this.baseMonto = baseMonto;
	}

	public double getBaseTiempo() {
		return baseTiempo;
	}

	public void setBaseTiempo(double baseTiempo) {
		this.baseTiempo = baseTiempo;
	}

	public double getIntereses() {
		return intereses;
	}

	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	public double getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(double nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public abstract PerfilesCDT clone();
    
}
    
    
