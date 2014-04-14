package com.AndyHollist.first_game;

enum Color
{
	red,blue
}

public class Ball {

	double x_pos;
	double y_pos;
	
	Color col;
	
	boolean alive;
	
	public Ball()
	{
		x_pos = 0;
		y_pos = 0;
		col = Color.blue;
		alive = true;
	}
	
	public Ball( double x, double y, Color c, boolean a)
	{
		x_pos = x;
		y_pos = y;
		col = c;
		alive = a;
	}
}


