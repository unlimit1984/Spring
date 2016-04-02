package com.tutorialspoint.ex02_DI;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	//Constructor-based Dependency Injection
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		System.out.println("Inside TextEditor constructor." );
	}

	//Setter-based Dependency Injection
	// a setter method to inject the dependency.
//	public void setSpellChecker(SpellChecker spellChecker) {
//		System.out.println("Inside setSpellChecker." );
//		this.spellChecker = spellChecker;
//	}

	// a getter method to return spellChecker
	//вроде нужен, но и без него работает
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
