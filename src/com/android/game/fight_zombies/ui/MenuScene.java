package com.android.game.fight_zombies.ui;

import com.android.game.fight_zombies.tools.Textures;
import com.stickycoding.rokon.RokonActivity;
import com.stickycoding.rokon.background.FixedBackground;

public class MenuScene extends GameScene{

    private FixedBackground background;

    public MenuScene(RokonActivity activity) {
        super(activity);

        background = new FixedBackground(Textures.menu_background);
        setBackground(background);
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onGameLoop() {
    }

    @Override
    public void onReady() {
    }

}
