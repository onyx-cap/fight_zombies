package com.android.game.fight_zombies.ui;

import com.android.game.fight_zombies.tools.Textures;
import com.stickycoding.rokon.GameObject;
import com.stickycoding.rokon.Scene;
import com.stickycoding.rokon.background.FixedBackground;

public class BeginScene extends Scene{

    private FixedBackground background; 

    public BeginScene () {
        super();

        Textures textures = Textures.getInstance();
        background = new FixedBackground(textures.getBackground());
        setBackground(background);

        GameObject bg = new GameObject(0, 0, 320, 480);
        bg.setTexture(textures.getBackground());
        add(bg);
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
