package com.android.game.fight_zombies;

import android.util.Log;

import com.android.game.fight_zombies.tools.Textures;
import com.android.game.fight_zombies.ui.BeginScene;
import com.stickycoding.rokon.DrawPriority;
import com.stickycoding.rokon.RokonActivity;

public class ShowActivity extends RokonActivity	{

    private BeginScene beginScene;

    @Override
    public void onCreate() {
        debugMode();
        forceFullscreen();
        forceLandscape();
        setWindowGameSize();
        setDrawPriority(DrawPriority.PRIORITY_VBO);
        setGraphicsPath("drawables/");  //图片存放路径
        createEngine();
        Log.e("@@@@", "call me create");
    }

    @Override
    public void onLoadComplete() {
        Log.e("@@@@", "call me");
        Textures textures = Textures.getInstance();
        textures.load("begin_background.jpg");
        beginScene = new BeginScene();
        setScene(beginScene);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    public void setWindowGameSize() {
        float height = (float) getWindowManager().getDefaultDisplay().getHeight();
        float width = (float) getWindowManager().getDefaultDisplay().getWidth();
        Log.e("@@@2", " height = " + height + " width = " + width);
        float width2 = setGameSize(width, height);
        Log.e("@@@@", "" + width2);
    }
}
