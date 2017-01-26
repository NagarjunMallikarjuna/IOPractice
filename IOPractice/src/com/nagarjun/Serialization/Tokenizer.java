package com.nagarjun.Serialization;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	private class TonkenInfo{
		public final Pattern regex;
		public final int token;
		
		public TonkenInfo(Pattern regex, int token){
			super();
			this.regex = regex;
			this.token = token;
		}
	}
	
	public class Token{
		public final int token;
		public final String sequence;
		
		public Token(int token, String sequence){
			super();
			this.token=token;
			this.sequence=sequence;
		}
	}
	
	private LinkedList<TonkenInfo> tokenInfos;
	private LinkedList<Token> tokens;
	
	public Tokenizer(){
		tokenInfos = new LinkedList<TonkenInfo>();
		tokens = new LinkedList<Token>();
	}
	
	public void add(String regex, int token){
		tokenInfos.add(new TonkenInfo(Pattern.compile("^("+regex+")"), token));
	}
	
	public void tokenize(String str){
		String  s = str.trim();
		tokens.clear();
		while(!s.equals("")){
			boolean match = false;
			for(TonkenInfo info: tokenInfos){
				Matcher m = info.regex.matcher(s);
				if(m.find()){
					match = true;
					String tok = m.group().trim();
					s = m.replaceFirst("").trim();
					tokens.add(new Token(info.token, tok));
				}
			}
			if(!match){
				tokens.clear();
				System.out.println("Unexpected character in input");
				return;
			}
		}
	}
	
	public LinkedList<Token> getTokens(){
		return tokens;
	}
	
	public String getTokenString(){
		StringBuilder sb = new StringBuilder();
		for(Tokenizer.Token tok:tokens){
			sb.append(tok.token);
		}
		return sb.toString();
	}
}
