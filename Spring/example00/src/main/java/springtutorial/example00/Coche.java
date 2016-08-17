package springtutorial.example00;

/**
 * Coche
 *
 */
public class Coche 
{
	private int id;
	
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	 public void init(){
	      System.out.println("Creando coche");
    }
	 
	 public void destroy(){
	      System.out.println("Coche destruido");
	 }
	 
}
