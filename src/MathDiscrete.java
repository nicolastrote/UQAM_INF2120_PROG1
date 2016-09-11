
public class MathDiscrete {
	
	// Fonction PGCD : Plus Grand Commun Diviseur
	public static int pgcd(int a, int b){
		while (b!=0){
			int temp = a%b; //calcule du reste
			a=b;
			b=temp;
		}
		return a;
	}
	
	// Fonction PPCM : Plus Petit Commun Mutiple
    public static int ppcm(int a, int b){
                              // a= type natif 
    	int pg=pgcd(a,b);
    	return (a/pg)*b;    
    }
    
    // Les valeurs a et b sont passées par valeur donc type natif, 
    // elles ne changent pas
    
}
