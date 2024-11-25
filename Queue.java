class Queue {
	private char[] q;
	private int putloc, getloc; //указатели на индекс для помещение и извлечение символов
	Queue(int size) {
		q = new char[size];//выделяем память под нужную очередь нужного размера
		putloc=getloc=0;
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
			System.out.println( " - очередь переполнена");
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
		for(i = 0;i < 5; i++) {
			ch = smallQ.get();
			if(ch !=(char)0)
				System.out.print(ch);
		}
		System.out.println();
		
		//Попытка доступа к закрытым переменным класса Queue
		//bigQ.q[3] = 343;
		//bigQ.putloc = 3;
		
		

	}
}
