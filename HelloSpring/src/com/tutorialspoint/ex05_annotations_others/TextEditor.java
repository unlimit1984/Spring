package com.tutorialspoint.ex05_annotations_others;

import javax.annotation.Resource;

public class TextEditor {
	private SpellChecker spellChecker;

	@Resource(name = "spellChecker") //типа @Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
