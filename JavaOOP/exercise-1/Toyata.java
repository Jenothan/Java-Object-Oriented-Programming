class Toyata {
	public static void main(String arg[]) {
		Car SpCar;
		SpCar = new Car();
		SpCar.brand = "Toyota";
		SpCar.model = "Aqua";
		SpCar.transmitiontype = "Automatic";
		SpCar.seat = 5;
		SpCar.milage = 45;
		SpCar.tankcapacity = 50;
		
		System.out.println(SpCar.brand);
		System.out.println(SpCar.model);
		System.out.println(SpCar.transmitiontype);
		System.out.println(SpCar.seat);
		System.out.println(SpCar.milage);
		System.out.println(SpCar.tankcapacity);
		
		SpCar.Drive();
		SpCar.Capacity();
		SpCar.Passengers();
	}
}