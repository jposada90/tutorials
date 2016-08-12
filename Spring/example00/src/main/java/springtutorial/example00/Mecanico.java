package springtutorial.example00;

/**
 * Mecanico
 *
 */
public class Mecanico 
{
	private Herramienta herramienta;
	
	
	public Herramienta getHerramienta(){
		return herramienta;
	}
	
	public void setHerramienta(Herramienta herramienta){
		this.herramienta = herramienta;		
	}
	
    public void reparar(Coche coche, int id)
    {
    	System.out.print( "Reparando coche" );
    	System.out.println( id );
    	herramienta.reparar(coche);
    	
    }
}
