class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}

	double reciprocal() {
		return 1 / num.doubleValue();
	}

	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual (NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
/*
 * Можно ограничить классы родственными связями
 * class Pair<T, V extands T> {
 * ...
 * }
 */
class NumFuncDemo {
	public static void main(String[] args) {
		NumericFns Ob;
		NumericFns<Integer> iOb;
		iOb = new NumericFns<>(5);
		Ob = iOb;

		System.out.println("Обратная величина Ob: " + Ob.reciprocal());

		System.out.println("Дробная часть Ob: " + Ob.fraction());

		NumericFns<Double> dOb = new NumericFns<>(5.2);

		Ob = dOb;

		System.out.println("Обратная величина iOb: " + dOb.reciprocal());

		System.out.println("Дробная часть iOb: " + dOb.fraction());
		
		//Нарушение ограничений на обобщенный тип
		//NumericFns<String> sOb = new NumericFns<> ("Строка");
		
		NumericFns<Integer> intOb = new NumericFns<>(7);
		NumericFns<Double> dblOb = new NumericFns<>(-7.0);

		if(intOb.absEqual(dblOb))
			System.out.println("Модуль чисел intOb и dblOb равны ");
		else
			System.out.println("Модуль чисел intOb и dblOb не равны");
		if(intOb.absEqual(dOb))
			System.out.println("Модуль чисел intOb и dOb равны");
		else
			System.out.println("Модуль чисел intOb и dOb не равны");
	}
}
