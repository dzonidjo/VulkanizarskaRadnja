package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa za Vulkanizersku radnju
 * @author Nikola Djokic
 * @version 1.0
 */


public class VulkanizerskaRadnja {

	/** 
	 * Lista guma  koje sadrzi jedna Vulkanizerska radnja
	 */
	private LinkedList<AutoGuma> gume =
					new LinkedList<AutoGuma>();
	
	/**
	 * Metoda koja unosi novu gumu na prvom mestu u listi gume		
	 * @param nova guma (objekat tipa AutoGuma)
	 * @throws java.lang.NullPointerException ukoliko je ulazni parametar (tj. guma) null
	 * @throws java.lang.RuntimeException ukoliko uneta guma vec postoji u listi
	 */ 
				
	public void dodajGumu(AutoGuma a) {
			if (a == null)
					throw new NullPointerException("Guma ne sme biti null");
						
			if (gume.contains(a))
					throw new RuntimeException("Guma vec postoji");
						
			gume.addFirst(a);
	}
		
	/**
	 * Metoda trazi da li postoje u listi  gume sa trazenom markom 
	 * @param naziv marke modela gume kao String
	 * @return null u slucaju da je uneti parametar null
	 * @return novu listu sa gumama te marke modela ukoliko je sve u redu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
			if (markaModel == null)
					return null;
			
			LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
						
			for(int i=0;i<gume.size();i++)
					if (gume.get(i).getMarkaModel().equals(markaModel))
						  novaLista.add(gume.get(i));
						
			return novaLista;
				}
	
	public LinkedList<AutoGuma> vratiListuGuma(){
				return gume;
		}
				
}
