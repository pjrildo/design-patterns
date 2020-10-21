package dev.pjrildo.iterator;

public class MostraMenu {
	
	public static void main(String[] args) {
		
		MenuItem[] menuItens = new MenuItem[4];
		
		for(int i = 0; i < menuItens.length; i++) {
			menuItens[i] = new MenuItem("Menu " + (i+1));
		}
		
		/* ------------------ ITERA��O COMUM ------------------
		
		for(int i = 0; i < menuItens.length; i++) {
			
		}*/
		
		//------------------ ITERA��O COM ITERATOR ------------------
		
		Iterator menuIterator = new MenuIterator(menuItens);
		
		while(menuIterator.hasNext()) {
			MenuItem menuItem = (MenuItem) menuIterator.next();
			System.out.println(menuItem.nome);
		}
	}
}
