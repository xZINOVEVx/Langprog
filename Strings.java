class Strings {
	public static void main(String[] args) {
		String str = new String("Строка номер один");
		String str2 = new String(str);
		String str3 = "Строка номер три";
		
		System.out.println(str + " " + str2 + " " + str3);

		//Методы, работующие со строками

		//1. Проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.equals(str2);
		System.out.println("Строки str и str2 эквиваленты: " + eq);
		eq = str.equals(str3);
		System.out.println("Строки str и str2 эквиваленты: " + eq);

		//.2 Метод определения длины строки int length()
		int length = str.length();
		System.out.println("Длина строки str: " + length);

		//3. Извлечение символа по индексу char charAt(index)
		char ch;
		ch = str.charAt(3);
		System.out.println("В строке str символ по индексом 3: " + ch);
		for(int i=0; i < str.length(); i++)
			System.out.print(str.charAt(i));
		System.out.println();
	}
}
