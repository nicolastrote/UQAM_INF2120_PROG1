public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(MathDiscrete.pgcd(10,15));
      System.out.println(MathDiscrete.ppcm(10,15));
	
	
	// PRINCIPE de référence
	Fraction F1 = new Fraction(3,4);
	Fraction F2 = F1;
    F1.setnum(1);
	if (F2.getnum()==3) {
		System.out.println("Le numérateur égal 3");
	}
	else System.out.println("Le numérateur n''est pas égal á 3");

	
    // Explications de F2 toujours différent de 3
	// L'opération F1.setnum(1) se répercute aussi sur F2 car le pointeur
	// de F2 pointe sur la meme valeur que le pointeur de F1.
	// Il n'y a qu'une seule fraction et F1 et F2 pointent sur la meme
	// valeur de fraction.
	F2 = new Fraction(1,2);
	// F2 pointe sur une nouvelle valeur qui est 1/2
	F1 = F2;
	// F1 pointe aussi sur 1/2
	// l'ancienne valeur 3/4 est donc perdue, le garbage collector ira
	// re-écrire dessus quand il aura besoin d'espace mémoire.
	Fraction F3 = F2.add(Fraction.UN);
	// 1/2 + 1 = 3/2
	F3 = F3.add(F3);
	// 3/2 + 3/2 = 3/1
	// Un object pointe sur des références. Si l'instance ne pointe sur aucune
	// valeur alors il faut utiliser la déclaration "new". 
	// NEW = crée une nouvelle instance.

	// Tableau de 5 valeurs à zero
	// pas de new car pas de valeur, donc le new est implicite
	int Tableau[] = new int [5];
	}
}
