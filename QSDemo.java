import java.util.Random;
class Quicksort { 
	//Вызов фактического метода быстрой сортировки
	static void qsort(char[] items) {
		qs(items, 0, items.length-1);
	}

	//Рекурсивная версия быстрой сортировки
	private static void qs(char[] items, int left, int rigth) {
		int i, j;
		char x, y;
		i = left;
	       	j = rigth;
		x = items[(left+rigth)/2];

		do {
			while ((items[i] < x) && (i < rigth))
				i++;
			while((x < items[j]) && (j > left)) j--;
			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if(left < j) qs(items, left, j);
		if (i < rigth) qs(items, i, rigth);
	}
}
class QSDemo {
	public static void main(String[] args) {
		char[] a = {'d','a','f','e','z','k','w','f','c','m','w'};
		int i;
		System.out.print("Исходный массив: ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
		//Сортировка
		Quicksort.qsort(a);
		System.out.print("Отсортированный массив: ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();

		char [] b = new char[100000];
		Random rand = new Random();
		for(i=0; i<100000; i++) {
			b[i] =(char) (rand.nextInt(75) + 48);
		}
		Quicksort.qsort(b);
		System.out.print("Отсортированный массив: ");
		for(i=0; i<200; i++)
			System.out.print(b[i]);
		System.out.println();
		for(i=(b.length - 1); i>(b.length-100); i--)
			System.out.print(b[i]);
		System.out.println();
	}
}

