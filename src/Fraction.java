
public class Fraction {
	
	private int NUM;
	private int DEN;
	{
		NUM = 0;
		DEN = 1; 
	}
	
	// alternative
	// private int num = 0;
	// privqte int den = 0;	
	
	// nb: l'ordre n'a pas d'importance, on aurait pu initialiser 
	// avant de déclarer
	// "final" : on écrit une valeur, on a plus le droit de la changer.
	// Elle n'a qu'un seul assignement
	
	public static final Fraction UN;
	public static final Fraction ZERO;
	
	static {
		UN = new Fraction(1,1);
		ZERO = new Fraction(0,1);
	}
	
	// Constructeur de la classe FRACTION
	public Fraction(int num, int den){
		this.NUM = num;
		this.DEN = den;
		Reduit();
	}
	
	private void Reduit(){
		int pg = MathDiscrete.pgcd(NUM, DEN);
		NUM /= pg;   // num=num/pg
		DEN /= pg;
		
		//x*= (y+2)   x=x*(y+2)  "(y+2)" se fait avant
	}
	
    public Fraction add(Fraction F2){
    	int pp = MathDiscrete.ppcm(DEN, F2.DEN);
    	int MF1 = pp/F2.DEN;
    	int MF2 = pp/DEN;
    	int N=MF1*NUM + MF2*F2.NUM;
    	return new Fraction(N,pp);
    	// retourne une nouvelle fraction
    	// permet d'additionner deux fractions
   	    // A/B + D/E = (AE + DB)/BE
    	// La fonction retqrde le calcule B*E pour eviter
    	// le stqck overflow : dépassement de la valeur maximale
    }
    
    public void setnum(int num){
    	this.NUM = num;
    }
    
    public int getnum(){
    	return this.NUM;
    }
    
  
}

