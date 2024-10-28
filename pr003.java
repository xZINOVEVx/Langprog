class Cars {
	int pass;//Количество пассажиров
	int volume;//Емкость бака
	double fuel;//Расход топлива в литрах на 100 километров
	Cars(int p, int v, double f) {
		pass = p;
		volume = v;
		fuel = f;
	}
	void range() {
		System.out.println("Расстояние на полном баке: " +  volume/fuel*100);
	}
	double range2() {
		return volume/fuel*100;
	}

        double range3(int x) {
		return x/fuel*100;
	}

}
class pr003  {
	public static void main(String[] args) {
		Cars Honda = new Cars(2,55,20.0);
		//Honda.pass = 2;
		//Honda.volume = 55;
		//Honda.fuel = 20.0;
		Cars BMW = new Cars(5,40,15.5);
		BMW.pass = 5;
		BMW.volume = 40;
		BMW.fuel = 15.5;

		System.out.println("Параметры Хонды:");
		System.out.print("Количество пассажиров: " + Honda.pass + " Объем бака: " + Honda.volume);
		System.out.println(" Расход топлива: " + Honda.fuel);

		//double range;
		//range = Honda.volume/Honda.fuel*100;
		System.out.println("Хонда проедет " );
		Honda.range();
		System.out.println("Для Хонды: " + Honda.range2());
		//range = BMW.volume/BMW.fuel*100;
		System.out.println("БМВ проедет " );
		BMW.range();
		System.out.println("Для БМВ с 15 литрами в баке: " + BMW.range3(15));



	
	}
}
