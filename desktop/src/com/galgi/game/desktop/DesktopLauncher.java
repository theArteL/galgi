package com.galgi.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.galgi.game.MainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Galgi";
		config.useGL30 = false;
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new MainClass(), config);
	}
}
