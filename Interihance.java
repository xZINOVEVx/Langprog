abstract class TwoDShape {
	private double width;
	private double height;
	final int CONST1 = 1;
	final int CONST2 = 2;
	final int CONST3 = 3;
	String name;
	int i = 100;
	TwoDShape(double w, double h) {
		if(w > 21.0)
			 width = 21.0;
		else
			 width = w;
		if(h > 29.7)
			height = 29.7;
		else
			height = h;
		name = "Двумерная фигура";
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if(w > 21.0)
			width = 21.0;
		else
			width = w;
	}
	void setHeight(double h) {
		if(h > 29.7)
			height = 29.7;
		else
			height = h;
	}
	void showDim() {
		System.out.println("Размеры фигуры: " + width + " x " + height);
	}
	/*
	String showName() {
		return name;
	}*/
	/*
	double area() {
		System.out.println("Метод должен быть определен:");
		return 0.0;
	}
	*/
	//Метод который обязательно должен переопределятся внутри подкласса
	abstract double area();
	abstract void getMsg();
}
class ColorTriangle extends Triangle {
	String color;
	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h); //Вызов конструктора Triangle();
		color = c;
		name = "Цветной треугольник";
	}
	void showColor() {
		System.out.println("Цвет: " + color);
	}
	/*void getMsg() {
		System.out.println("Сообщение от цветного треугольника");
	}*/
	
	public String toString() {
		return "Цветной треугольник";
	}
}

class Triangle extends TwoDShape {
	String style;
	int i=10;
	Triangle(String s, double w, double h) {
		super(w, h);//вызов конструктора суперкласса
		style = s;
		name = "Треугольник";
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	//Демонстрация доступа к одноименной переменной суперкласса
	}
	int showSuperI() {
		return super.i;
	}

	/*
	String showName() {
		return super.name;
	}*/
	final void getMsg() {
		System.out.println("Сообщение от треугольника");
	}
}
class Rectangle extends TwoDShape {
	String outLine;
	Rectangle(String o, double w, double h) {
		super(w, h);//вызов конструктора суперкласса
		outLine = o;
		name = "Прямоугольник";
	}
	double area() {
		return getWidth() * getHeight();
	}
	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}
	final void getMsg() {
		System.out.println("Сообщение от прямоугольника");
	}
}
//Запрет наследование класса X
final class X {
	int x = 10;
}
/*
class Y {
	int y = 20;
}
*/
class Interihance {
	public static void main(String [] args) {
	TwoDShape fig1; // = new TwoDShape(20.0,30.0); нельзя создать обьект абстрактного класса
	Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
	ColorTriangle t2 = new ColorTriangle("Синий", "Контурный", 3.5, 8.0);
	Rectangle r1 = new Rectangle("Сплошная линия", 5.0, 5.0);
	Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
	System.out.println("Информация об обьектах");
	//System.out.println("fig1: " + fig1.name );
	//fig1.showDim();
	System.out.println("t1: " + t1.name);
	t1.showStyle();
	System.out.println("Площадь: " + t1.area());
	//t1.showName();
	System.out.println();

	System.out.println("r1: " + r1.name);
	System.out.println("Квадрат: " + r1.isSquare());
	System.out.println("Площадь: " + r1.area());
	System.out.println(t1.i);
	System.out.println(t1.showSuperI());
	
	//Совместимость переменных родственных классов
	//Переменные суперкласса могут ссылаться на обьект любого класса
	System.out.println();
	//System.out.println("Ширина двухмерной фигуры fig1: " + fig1.getWidth());
	//При указании на обьект суперкласса выполняется метод суперкласса
	//fig1.area();
	
	fig1 = t1;
	System.out.println("Ширина треугольника, на который ссылается fig1: " + fig1.getWidth());
	//При указании на обьект подкласса"Треугольник" выполняется вычисление площади для треугольника
	System.out.println("Площадь треугольника: " + fig1.area());
	//System.out.println("Имя фигуры: " + fig1.name);
	fig1.getMsg();

	fig1 = r1;
	System.out.println("Ширина прямоугольника, на который сылается fig1: " + fig1.getWidth());
	//При указании на обьект подкласса "Прямоугольник" выполнятся вычисление площади для прямоугольника
	System.out.println("Площадь прямоугольника: " + fig1.area());
	System.out.println("Имя фигуры: " + fig1.name);
	fig1.getMsg();

	fig1 = t2;
	t2.showColor();
	System.out.println("Площадь цветного треугольника: " + fig1.area());
	System.out.println("Имя фигуры: " + fig1.name);
	fig1.getMsg();
	System.out.println((fig1.CONST1 + fig1.CONST2 + fig1.CONST3));
	//Изменить переменную final нельзя
	//fig1.CONST1 = 333;
	
	//Доступ к членам подкласса для ссылочных переменных суперкласса закрыт:
	//System.out.println(fig1.style);

	//Проверка доступных переменных
	/*
	System.out.println(fig1.width);
	System.out.println(t1.width);//Подкласс имеет доступ к переменным и методам суперкласса
	System.out.println(fig1.style);//Суперкласс не имеет доступ к переменным, описанных в подклассе
	*/

	//Использование класса Object
	Object obj1;
	
	System.out.println(t2.getClass());
	System.out.println(t1.getClass());
	System.out.println("Обьекты t1 и t2 эквиваленты: " + t1.equals(t2));
	System.out.println("Хэш-код для t1 и t2: " + t1.hashCode() + " " + t2.hashCode());
	System.out.println("Описание для t1 и t2: " + t1.toString() + " " + t2.toString());
	t1 = t2;
	System.out.println("Обьекты t1 и t2 эквиваленты: " + t1.equals(t2));
	
		

	}
}

