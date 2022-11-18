//------------------ Herencia de empleado en esta clase --------------------
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado {

	//----------------------- Atributos ------------------------
	private String skill;
	private String listaLenguajes;
	
	//------------------------- Constantes ---------------------
	private double AUMENTO_VARIABLE = 5;
	
	//-------------------------- Getters and Setters -------------------------
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(String listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	
	//-------------------------- Constructor por defecto ---------------------------
	public DesarrolladorBackend() {
		
	}
	
	//------------------------- Constructor usando los atributos ---------------------
	public DesarrolladorBackend(String skill, String listaLenguajes) {
		
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
	}
	
	//Metodo de la interface 
	abstract double devolversalario ();
	
	//Clacular salario
	salario = (salario_minimo + AUMENTO_VARIABLE)*((DESCUENTO_EPS + DESCUENTO_FP)/100);
	
	
	
		
	

}
