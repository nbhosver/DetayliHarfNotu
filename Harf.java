public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Harf notunuzu öğrenmek için vize notunuzu giriniz : ");
	
	float vize = scanner.nextFloat();
	
	System.out.println("Şimdi final notunuzu giriniz : ");
	
	float fınal = scanner.nextFloat();
	
	float harfnotu = (vize * 40 / 100 ) + (fınal * 60 / 100);
	
	if ( harfnotu  >= 95) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " AA ");
	}
	else if (harfnotu >= 85) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " BA ");
		
	}
	else if (harfnotu >= 75) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " BB ");
		
	}
	else if (harfnotu >= 65) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " CB ");
		
	}
	else if (harfnotu >= 60) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " CC ");
		
	}
	else if (harfnotu >= 55) {
		
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " DC koşullu ");
		
	}
	else if (harfnotu >= 50) {
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " DD koşullu ");
		
	}
	
	else if (harfnotu <= 49.9){
		System.out.println("ortalamanız : " + harfnotu);
		System.out.println("Harf notunuz : " + " FF Ders tekları ! ");
		
	}
	}
	
