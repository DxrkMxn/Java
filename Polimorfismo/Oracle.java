package talleres;

public abstract class Oracle extends BDatos{

	public abstract double getData();
	
	@Override
	public void conectar() {
		System.out.println("conectar en la subclase oracle");
	}

	@Override
	public void consultar() {
		System.out.println("consultar en la subclase oracle");
		
	}

	@Override
	public void insetar() {
		System.out.println("insertar en la subclase oracle");
		
	}

	@Override
	public void eliminar() {
		System.out.println("eliminar en la subclase oracle");
		
	}

}
