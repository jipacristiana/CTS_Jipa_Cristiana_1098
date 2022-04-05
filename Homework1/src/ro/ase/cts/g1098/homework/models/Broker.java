package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.interfaces.IBroker;

public class Broker implements IBroker {

	private static final float BROKER_FEE = 0.0125f;
	
	@Override
	public float getBrokerFee() {
		return BROKER_FEE;
	}

}
