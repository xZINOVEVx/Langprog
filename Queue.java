class Queue {
	private char[] q;
	private int putloc, getloc; //указатели на индекс для помещение и извлечение символов
	//Создается пустая очередб заданного размера
	Queue(int size) {
		q = new char[size];//выделяем память под нужную очередь нужного размера
		putloc=getloc=0;
	}
	//Создается очередь на основе другого обьекта очереди
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		//Копирование элементов массива
		for(int i=getloc; i<putloc;i++)
			q[i] = ob.q[i];
	}
	//Создание очереди на основе массива
	Queue(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		for(int i = 0; i<a.length; i++)
			put(a[i]);
	}
	//Метод для помещения символа в очередь
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}
	//метод для извлечение символа из очереди
	char get() {
		if(getloc==putloc) {
			System.out.println( " - очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}	
}
class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.print("Сохраняем алфавит в очередь bigQ");
		for(i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("Содержание очереди bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");
		System.out.println("Сохраняем символы очереди smallQ");
		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println("Извлекаем символы из очереди smallQ");
		for(i = 0;i < 6; i++) {
			ch = smallQ.get();
			if(ch !=(char)0)
				System.out.print(ch);
		}
		System.out.println();
		
		//Попытка доступа к закрытым переменным класса Queue
		//bigQ.q[3] = 343;
		//bigQ.putloc = 3;

		Queue q1 = new Queue(10);
		char[] chars = {'A','B','C'};
		//Создание очереди на базе массива
		Queue q2 = new Queue(chars);
		for(i = 0; i<10; i++)
			q1.put((char) ('D'+i));
		//Создание очереди на базе другой очереди
		Queue q3 = new Queue(q1);

		System.out.print("Очередь q1: ");
		for(i=0; i<10; i++) {
			ch =q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");

		System.out.print("Очередь q2: ");
		for(i=0; i<3; i++) {
			ch =q2.get();
			System.out.print(ch);
		}
		System.out.println("\n");

		System.out.print("Очередь q3: ");
		for(i=0; i<10; i++) {
			ch =q3.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		

	}
}
