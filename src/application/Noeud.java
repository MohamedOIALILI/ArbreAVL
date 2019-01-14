package application;

import javafx.scene.paint.Color;

public class Noeud {
	Color couleur;
	Comparable<Comparable<?>> info;
	Noeud gauche;
	Noeud droit, parent;

	Noeud(Comparable<Comparable<?>> o) {
		couleur = Color.BLACK;
		info = o;
		gauche = droit = parent = null;
	}

	Noeud(Comparable<Comparable<?>> o, Color c, Noeud g, Noeud d, Noeud p) {
		couleur = c;
		info = o;
		gauche = g;
		droit = d;
		parent = p;
	}

	boolean recherche(Comparable<?> o) {
		if (info.equals(o))
			return true;
		if (info.compareTo(o) == -1)
			return droit.recherche(o);
		if (info.compareTo(o) == 1)
			return gauche.recherche(o);
		return false;
	}

}
