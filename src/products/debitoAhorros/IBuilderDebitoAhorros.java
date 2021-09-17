package products.debitoAhorros;

import builderPattern.IBuilderProductoDebito;

public interface IBuilderDebitoAhorros extends IBuilderProductoDebito{
	public void putLimite(int limite);
}
