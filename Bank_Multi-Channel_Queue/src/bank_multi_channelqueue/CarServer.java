/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_multi_channelqueue;

import java.util.ArrayList;

class CarServer {
	String wasteType;
	int busyTill, idleTime;
	ArrayList<Integer> higherLimits, serviceValues;
	
	public void addServiceTableRow(int probability, int value) {
		if(higherLimits.size() == 0)
			higherLimits.add(probability);
		else {
			int lastLimit = higherLimits.get(higherLimits.size() - 1);
			higherLimits.add(lastLimit + probability);
		}
		serviceValues.add(value);
	}
	
	public String getType() {
		return wasteType;
	}
	
	public CarServer(String wasteType) {
		this.wasteType = wasteType;
		higherLimits = new ArrayList<Integer>();
		serviceValues = new ArrayList<Integer>();
	}
}
