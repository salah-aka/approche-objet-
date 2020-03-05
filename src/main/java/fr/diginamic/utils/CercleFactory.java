package fr.diginamic.utils;

public class CercleFactory {
	
	public double r;
	
	public double Surface(double r) {
		double surface = Math.PI * r * r;
		return surface;
	}

	@Override
	public String toString() {
        return "le Surface de la cercle est [Surface = " + Surface(r) + "]: avec un rayon de " + r;
    }

	}


