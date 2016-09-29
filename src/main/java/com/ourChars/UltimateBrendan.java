package com.ourChars;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.interfaces.Ninja;
import com.interfaces.Royal;
import com.interfaces.Warrior;
import com.interfaces.Wizard;
import com.parents.Brendan;

public class UltimateBrendan extends Brendan implements Jedi, Ninja, Royal, Warrior, Wizard {

	public UltimateBrendan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UltimateBrendan(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 140);

	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 335);

	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}
	
	public UltimateBrendan makeUltimateBrendan(){
		
		UltimateBrendan ourUltimateBrendan = new UltimateBrendan();
		
		ourUltimateBrendan.changeHealth();
		ourUltimateBrendan.changeMagic();
		ourUltimateBrendan.setName(null);
		ourUltimateBrendan.setWeapon(null);
		
		return ourUltimateBrendan;

	}


}
