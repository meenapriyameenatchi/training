package com.training.model;



public class Permutation {
	
		
		private static String swaping(String str, int x, int y) {
			
			char[] j = str.toCharArray();
			
			char ch;
			ch = j[x];
			j[x] = j[y];
			j[y]=ch;
			
			return String.valueOf(j) ;
		}

		
		private static void permuting(String str, int start, int end) {
			
			if(start==end-1) {
				System.out.println(str);	
			}
			else {
				for(int x =start; x<end; x++) {
					str = swaping(str,start,x);
					permuting(str, start+1, end);
					str=swaping(str,start,x);
				}
			}
		}

		public static void main(String[] args) {
			
			String str1 = "cat";
			int len = str1.length();
			
			System.out.println("Permutations ");
			permuting(str1 , 0, len);
		}

		

	}
