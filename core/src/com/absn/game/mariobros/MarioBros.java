package com.absn.game.mariobros;

import com.absn.game.mariobros.Screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MarioBros extends Game{

	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 208;

	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
	super.render();
	}
}
