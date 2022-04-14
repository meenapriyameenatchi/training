package com.training.services;

public class Application {

	public static void main(String[] args) {
		StringService service =new StringService();
		String city="chennai";
		System.out.println(String.format("%s", city));
		System.out.println(String.format("%3$.4f %2$.3f %1$.2f",100.456,200.4567,300.56789));
		
		
		int key=14;
		switch(key)
		{
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
			
		case 3:
				service.usingTrim("  ramesh  ");
				break;
				case 4:
					
					service.lengthOfString("  ramesh  ");
					break;
				case 5:
					service.usingSubString("Meenapriya");
							break;
				case 6:
					service.usingCharAtAndIndexOf("priya@007");
					break;
				case 7:
					service.usingReplace("ram@abc.com", "welcome to Chennai");
					break;
				case 8:
					service.usingConcat("Hello", "chennai");
					break;
				case 9:
					service.usingCompareTo("Ram", "abs");
					break;
					case 10:
					service.suingStringFormat("ram", 45.498);
					break;
				case 11:
					service.susingStringFormat(17);
					break;
				case 12:
					service.susingStringFormat(16, 16);
					break;
				case 13:
					service.susingStringFormat("ram", "ram");
					break;
				case 14:
					service.susingStringFormat(-421L);
                   break;
			default :
				break;
		}

	}

}
