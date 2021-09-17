package launcher;

import products.cdt.empresarios.CDTBuilderEmpresarios;
import products.cdt.empresarios.CDTEmpresarios;
import products.cdt.laboral.CDTBuilderLaboral;
import products.cdt.laboral.CDTLaboral;
import products.cdt.mayores18.CDTBuilderMayores18;
import products.cdt.mayores18.CDTmayores18;
import products.cdt.pensionados.CDTBuilderPensionados;
import products.cdt.pensionados.CDTPensionados;
import products.tarjetas.tarjetaCredito.TarjetaCredito;
import products.tarjetas.tarjetaCredito.TarjetaCreditoBuilder;

public class Director {
	String nombre, fechaN, codigo, fechaV;
	
	public CDTLaboral cdtLaboral() {
            CDTBuilderLaboral CDTBL = new CDTBuilderLaboral();
            CDTBL.reset();
		
            CDTBL.putDatosPersonalesTitular("Shelsy Maria", "6", "100298");
            return CDTBL.getProduct();     
	}
	
	 public CDTLaboral cloneCDTL(CDTLaboral cdt){
	    	CDTBuilderLaboral CloneCDTL = new CDTBuilderLaboral();
	    	CloneCDTL.reset();
	    	CloneCDTL.baseMonto = cdt.baseMonto;
	    	CloneCDTL.baseTiempo = cdt.baseTiempo;
	    	CloneCDTL.intereses = cdt.intereses;
	    	CloneCDTL.nivelDeRiesgo = cdt.nivelDeRiesgo;
	    	return CloneCDTL.getProduct();
	    }
        
    public CDTEmpresarios cdtEmpresario(){
    	CDTBuilderEmpresarios CDTBE = new CDTBuilderEmpresarios();
        CDTBE.reset();
        CDTBE.putDatosPersonalesTitular("Daniel", "7", "100298");
        return CDTBE.getProduct();     
    }
    
    public CDTEmpresarios cloneCDTE(CDTEmpresarios cdt){
    	CDTBuilderEmpresarios CloneCDTBE = new CDTBuilderEmpresarios();
    	CloneCDTBE.reset();
    	CloneCDTBE.putDatosPersonalesTitular(cdt.getDatosPersonales().get("nombre"), cdt.getDatosPersonales().get("id"), cdt.getDatosPersonales().get("fechaN"));
    	CloneCDTBE.baseMonto = cdt.baseMonto;
    	CloneCDTBE.baseTiempo = cdt.baseTiempo;
    	CloneCDTBE.intereses = cdt.intereses;
    	CloneCDTBE.nivelDeRiesgo = cdt.nivelDeRiesgo;
    	return CloneCDTBE.getProduct();
    }
        
    public CDTmayores18 cdtMayores18(){
    	CDTBuilderMayores18 CDTBM = new CDTBuilderMayores18();
        CDTBM.reset();
        CDTBM.putDatosPersonalesTitular("Juank", "7", "12345");
        return CDTBM.getProduct();     
    }
        
    public CDTmayores18 cloneCDTE(CDTmayores18 cdt){
    	CDTBuilderMayores18 CloneCDTM = new CDTBuilderMayores18();
    	CloneCDTM.reset();
    	CloneCDTM.baseMonto = cdt.baseMonto;
    	CloneCDTM.baseTiempo = cdt.baseTiempo;
    	CloneCDTM.intereses = cdt.intereses;
    	CloneCDTM.nivelDeRiesgo = cdt.nivelDeRiesgo;
    	return CloneCDTM.getProduct();
    }
        
    public CDTPensionados cdtPensionados(){
    	CDTBuilderPensionados CDTBP = new CDTBuilderPensionados();
        CDTBP.reset();
        CDTBP.putDatosPersonalesTitular("Michael", "2", "12345");
        return CDTBP.getProduct();     
    }
        
    public CDTPensionados cloneCDTE(CDTPensionados cdt){
    	CDTBuilderPensionados CloneCDTP = new CDTBuilderPensionados();
    	CloneCDTP.reset();
    	CloneCDTP.baseMonto = cdt.baseMonto;
    	CloneCDTP.baseTiempo = cdt.baseTiempo;
    	CloneCDTP.intereses = cdt.intereses;
    	CloneCDTP.nivelDeRiesgo = cdt.nivelDeRiesgo;
    	return CloneCDTP.getProduct();
    }
    
    public TarjetaCredito tarjetaCred(String nombre, String fechaN, String codigo, String fechaV){
    	TarjetaCreditoBuilder TC = new TarjetaCreditoBuilder();
        TC.reset();
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.codigo = codigo;
        this.fechaV = fechaV;
        TC.crearTarjeta(this.nombre, this.fechaN, this.codigo, this.fechaV);
        return TC.getProduct();
    }
        
    public TarjetaCredito cloneTarjetaCred(TarjetaCredito cdt){
    	TarjetaCreditoBuilder CloneTC= new TarjetaCreditoBuilder();
    	CloneTC.reset();
    	return CloneTC.getProduct();
    }
    
        
   
    
    
    
}
   
