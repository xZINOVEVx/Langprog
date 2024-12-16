//Пример обобщенного класса
class Gen <T> {
	//обьявление ссылки на обьект обощенного типа
	T ob;
	
	//Конструктор
	Gen(T o) {
		ob = o;
	}
	//Методы для проверки информации об обьектах
	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип Т: " + ob.getClass().getName()); 
	}
}
class GenDemo {
	public static void main(String[] args) {
		//Обьявили переменную класса Gen
		Gen <Integer> iOb;
		iOb = new Gen <Integer> (100);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение v: " + v);
		System.out.println();

		//Обьявили переменную класса Gen
		Gen <Double> dOb;
		//Создаем обьект
		dOb = new Gen <Double> (100.00);
		//ошибочное использование:
		//iOb = new Gen <Integer> (100.0);

		dOb.showType();
		double x = dOb.getOb();
		System.out.println("Значение x: " + x);
		System.out.println();

		Gen <String> sOb;
		sOb = new Gen<>("Строка");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Значение s: " + s);
		System.out.println();
		
		//Неверное присваивание  несовместимых обьектов
		//dOb = iOb;


	}
}
