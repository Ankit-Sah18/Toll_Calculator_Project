package model;

public enum VehicleType {
	
	 TRUCK("Heavy Vehicle"), BUS("Heavy Vehicle"), CAR("Light Vehicle"), VAN("Ligth Vehicle"), RICKSHAW("Light Vehicle"),
	 SCOOTER("Two Wheeler"), MOTORBIKE("Two Wheeler");

	private final String  type;

	VehicleType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}


}
