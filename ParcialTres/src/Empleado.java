
public class Empleado {
	
	//---------------------- Atributos ------------------------------	
	private String nombre;
	private String apellidos;
	private String direccion;
	private int dni;
	private double salario;
	private char sexo;
	
	//----------------------- Constantes ----------------------------
	protected double SALARIO_MINIMO = 980.000;
	protected double DESCUENTO_EPS = 4;
	protected double DESCUENTO_FP = 4;
	
		
	//-------------------------- Constructor con todos los atributos ---------------
	public Empleado(String nombre, String apellidos, String direccion, int dni, int salario, char sexo) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.salario = salario;
		this.sexo = sexo;		
	}

	//--------------------------- Constructor punto B -----------------------------
	public Empleado(String nombre, String apellidos, String direccion, int dni, int salario) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.salario = salario;
	}

	//--------------------------- Constructor punto C ----------------------
	public Empleado(String direccion, int dni, char sexo) {
		
		this.direccion = direccion;
		this.dni = dni;
		this.sexo = sexo;
	}

	//--------------------- Constructor punto D -------------------------
	public Empleado(String nombre, String apellidos, int dni, int salario, char sexo) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}

	//--------------------------- Constructor vacio ----------------------------
	public Empleado() {
		
	}

	//--------------------------- Getters and setters -----------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	

	

	
	
	
	
	

}
