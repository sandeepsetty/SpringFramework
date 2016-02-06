package com.sandeep.spring;

public class TextEditor {
   private SpellChecker spellChecker;
   //a setter method to inject the dependency
   public void setSpellChecker(SpellChecker spellChecker) {
	   System.out.println("Inside the spellchecker.");
		this.spellChecker = spellChecker;
	}
   // a getter method to return spellchecker
    public SpellChecker getSpellChecker() {
	return spellChecker;
     }
    
    public void spellcheck() {
    	spellChecker.checkSpelling();
    }  
}
