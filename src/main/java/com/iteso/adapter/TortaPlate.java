package com.iteso.adapter;

import java.util.ArrayList;

public class TortaPlate {
	private ArrayList tortas;

	public TortaPlate() {
		tortas = new ArrayList();
	}

	public void addTorta(Torta torta) {
		tortas.add(torta);
	}

	public void servePlate() {
		for (int i = 0; i < tortas.size(); i++) {
			Torta torta = (Torta) tortas.get(i);
			torta.cutByHalf();
			torta.fill();
			torta.cover();
			torta.printDescription();
		}
	}

	public String getContent() {
		if (tortas.size()==0) return "The plate is empty";
		String result = "";
		for (int i = 0; i < tortas.size(); i++)
			result += ((Torta) tortas.get(i)).printDescription() + ", ";
		return result.substring(0, result.length() - 2);
	}
}
