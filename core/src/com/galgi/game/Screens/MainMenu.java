package com.galgi.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.galgi.game.MainClass;

public class MainMenu implements Screen {
    //инцилизацаия главного класса и основной камеры
    final MainClass mainClass;
    OrthographicCamera mainCamera;
    public MainMenu(final MainClass mainClass) { //конструктор для сохранения экземпляра гл. класса
        this.mainClass = mainClass;
        //камера ортограф. 16:9
        mainCamera = new OrthographicCamera();
        mainCamera.setToOrtho(false, mainClass.WIDTH, mainClass.HEIGTH);
    }
    //stage and ui
    private Stage stage;
    //инцилизация остального г
    Texture bgT = new Texture(Gdx.files.internal("Backgrounds/mainMenuBG.png"));
    Sprite bg = new Sprite(bgT);

    @Override
    public void show() {
        bg.setBounds(0,0,mainClass.WIDTH, mainClass.HEIGTH);
        //stage
        stage = new Stage(new FitViewport(mainClass.WIDTH, mainClass.HEIGTH, mainCamera));
        Gdx.input.setInputProcessor(stage);

    }

    @Override
    public void render(float delta) {
        //чистка экрана
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        mainCamera.update(); // обновление камеры
        mainClass.batch.setProjectionMatrix(mainCamera.combined); // ???
        //обработка графики
        mainClass.batch.begin();
        bg.draw(mainClass.batch);
        mainClass.font.draw(mainClass.batch, "Ru don't work", mainClass.WIDTH/2, mainClass.HEIGTH/16);
        mainClass.batch.end();
        //обработка
        //stage
        stage.act(delta);
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, false);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
