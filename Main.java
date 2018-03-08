
import java.util.Scanner;

public class Main {

	
	static int arrays[][];
	
	static int nCaixas = 0;
	static int nPilhas = 0;
	
	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		
		
		
		//topo = -1;
		
		while(true) {

			//entrada número de caixas 
			nCaixas = scan.nextInt();
			
			//entrada número de pilhas
			nPilhas = scan.nextInt();
		
			
			//qtdCaixa e ID
			int qtdCaixa;
			int ID;
			
			//verificação se finalizou
			if(nCaixas == 0 && nPilhas == 0) {
				break;
				//System.out.println("Deveria ter acabado");
			}
			
			
			
			//elemento1 = new int[nCaixas];
			//elemento2 = new int[nCaixas];
			
			
			arrays = new int[nPilhas][nCaixas];
			
			
			for(int i = 0; i<nPilhas; i++) {
				
				/*
				 * 
				 * if(i > nPilhas) {
				 
					//System.out.println("ola");
					break;
				}
				*/
				
				//número de caixas que vão entrar 
				qtdCaixa = scan.nextInt();
				
				for(int k = 0; k < qtdCaixa; k++) {
					
					
					//Entrada do id da primeira caixa
					ID = scan.nextInt();
					arrays[i][k] = ID;
					
					
					//entrada do id da segunda caixa
					if(qtdCaixa > 1) {
						ID = scan.nextInt();
						arrays[i][k+1]= ID;
					
					
					}
					break;
					
				}
				 
				
			}
			
			//System.out.println(Arrays.deepToString(arrays).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			
			
			
			//AJEITAR ESSA MERDA
			
				
			System.out.println(whereIsOne(arrays));
		
		}
			
	}
	
	public static int whereIsOne(int[][] array) {
		

		//1º Caixa 2º Pilha
		//[Pilha][Caixa]
		
		int counter = 0;
		int entrada = 0;
		int ID = 0;
		
		for(int a = 0; a<nPilhas; a++) {
			for(int b = nCaixas-1; b>=0; b--) {
				
				ID = arrays[a][b];
				if(ID != 1 && ID != 0) {
					//System.out.println("Bleh");
					counter++;
				}
				else if(ID ==0) {
					//System.out.println("Blah");
				}
				else if(ID == 1) {
					if(counter ==1) {
						counter = 0;
					}
					break;
				}
				
			}
			if(ID==1) {
				break;
			}
			//System.out.println("Mah ôe");
		}
		
		return counter;
	}

}
