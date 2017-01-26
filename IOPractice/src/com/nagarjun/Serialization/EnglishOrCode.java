package com.nagarjun.Serialization;
public class EnglishOrCode {

	private static Tokenizer tokenizer = null;
	
	public static void initializeTokenizer(){
		tokenizer = new Tokenizer();
		String keyString = "abstract assert boolean break byte case catch "
				+ "char class const continue default do double else enum"
				+ " extends false final finally float for goto if implements "
				+ "import instanceof int interface long native new null "
				+ "package private protected public return short static "
				+ "strictfp super switch synchronized this throw throws true "
				+ "transient try void volatile while todo";
		
		String[] keys = keyString.split(" ");
		String keyStr = String.join("|",keys);
		
		tokenizer.add(keyStr,1);
		tokenizer.add("\\(|\\)|\\{|\\}|\\[|\\]|;|,|\\.|=|>|<|!|~|"
				+ "\\?|:|==|<=|>=|!=|&&|\\|\\||\\+\\+|--|"
				+ "\\+|-|\\*|/|&|\\||\\^|%|\'|\"|\n|\r|\\$|\\#",
				2);
		tokenizer.add("[0-9]+", 3); //number
		tokenizer.add("[a-zA-Z][a-zA-Z0-9_]*", 4);//identifier
		tokenizer.add("@", 4);
	}
	
	public static void main(String[] args) throws Exception{
		initializeTokenizer();
		String s = "do something in english";
		if(isEnglish(s)){
			System.out.println("English");
		}else{
			System.out.println("Java code");
		}
		
		s = "for(int i=0;i<b.size();i++)";
		if(isEnglish(s)){
			System.out.println("English");
		}else{
			System.out.println("Java code");
		}
	}
	
	private static boolean isEnglish(String replaced){
		tokenizer.tokenize(replaced);
		String patternString=tokenizer.getTokenString();
		if(patternString.matches(".*444.*")||(patternString.matches("4+"))){
			return true;
		}else{
			return false;
		}
	}
}
