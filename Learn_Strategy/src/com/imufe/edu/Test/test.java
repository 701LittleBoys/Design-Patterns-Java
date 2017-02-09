package com.imufe.edu.Test;

import com.imufe.edu.createduckgame.GreenHeadDuck;
import com.imufe.edu.createduckgame.RadHeadDuck;
import com.imufe.edu.newcreateduck.concrete_realization_duck.NewGreenHeadDuck;
import com.imufe.edu.newcreateduck.concrete_realization_duck.NewRedDuck;
import com.imufe.edu.newcreateduckgame.duck.Duck;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GreenHeadDuck mGreeenHeadDuck = new GreenHeadDuck();
		RadHeadDuck mRedHeadDuck = new RadHeadDuck();
		
		mGreeenHeadDuck.display();
		mGreeenHeadDuck.Quack();
		mGreeenHeadDuck.swim();
		mGreeenHeadDuck.Fly();*/
		
		Duck greenheadduck = new NewGreenHeadDuck();
		Duck redheadduck = new NewRedDuck();
		
		//绿头鸭的具体特征
		greenheadduck.display();
		greenheadduck.Fly();
		greenheadduck.Quack();
		
		//红头鸭的具体特征
		redheadduck.display();
		redheadduck.Fly();
		redheadduck.Quack();
	}

}
