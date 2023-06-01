package com.seojava.generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinting = new GenericPrinter<Powder>();
		
		powderPrinting.setMaterial(new Powder());
		powderPrinting.printing();
		
		GenericPrinter<Plastic> plasticPrinting = new GenericPrinter<Plastic>();
		
		plasticPrinting.setMaterial(new Plastic());
		plasticPrinting.printing();
		
		
	}
}
