package com.tutorialspoint.ex05_annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	/* 1-й способ @Autowired on Properties (более короткий, не требует Setter)*/
	
	@Autowired//Если так, то можно убрать setSpellChecker
	private SpellChecker spellChecker;

	/* 2-й способ @Autowired on Setter Methods */
	
//	private SpellChecker spellChecker;
//	
//	@Autowired
//	public void setSpellChecker(SpellChecker spellChecker) {
//		this.spellChecker = spellChecker;
//	}
/*************************/
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
