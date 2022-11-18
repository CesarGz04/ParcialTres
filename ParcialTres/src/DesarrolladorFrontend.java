//Herencia de empleado en esta clase
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado {
	
	//----------------------------- Atributos --------------------------------
	private int aniosExperienciaBootstrap;
	private boolean experienciaCloud;
	
	//--------------------- Constantes ------------------------
	private double AUMENTO_VARIABLE = 3;
		
	//---------------------- Getters and Setters --------------------------------
	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}
	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}
	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}
	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	
	//-------------------- Constructor por defecto -----------------------------
	public DesarrolladorFrontend(String nombre, String apellidos, String direccion, int dni, int salario, char sexo) {
		super(nombre, apellidos, direccion, dni, salario, sexo);
	}
	
	//--------------------- Constructor usando los atributos --------------------------
	public DesarrolladorFrontend(String nombre, String apellidos, String direccion, int dni, int salario, char sexo,
			int aniosExperienciaBootstrap, boolean experienciaCloud) {
		super(nombre, apellidos, direccion, dni, salario, sexo);
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}
	
	//Metodo de la interface 
	abstract double devolverSalario ();
	
	//Clacular salario
	salario = (salario_minimo + AUMENTO_VARIABLE)*((DESCUENTO_EPS + DESCUENTO_FP)/100);
	
	
	
}
