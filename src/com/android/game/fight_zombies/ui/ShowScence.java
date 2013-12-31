package com.android.game.fight_zombies.ui;

import java.util.ArrayList;

import android.util.Log;
import android.view.MotionEvent;

import com.android.game.fight_zombies.modifiers.ColorModifier;
import com.android.game.fight_zombies.tools.Textures;
import com.stickycoding.rokon.RokonActivity;
import com.stickycoding.rokon.Sprite;
import com.stickycoding.rokon.background.FixedBackground;

public class ShowScence extends GameScene{

    private FixedBackground background;
    private Sprite autor, autor2;
    private int blood = 100;
    private ArrayList<Sprite> list = new ArrayList<Sprite>();

    public ShowScence (RokonActivity activity) {
        super(activity, 1, 2);

        background = new FixedBackground(Textures.show_background);
        setBackground(background);

        autor = new Sprite(100, 200, Textures.bob.getWidth(), Textures.bob.getHeight());
        autor.setTexture(Textures.bob);
        add(0, autor);
        autor2 = new Sprite(200, 200, Textures.bob.getWidth(), Textures.bob.getHeight());
        autor2.setTexture(Textures.bob);
        add(0, autor2);
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onGameLoop() {
        if (autor.x >= getActivity().getGameWidth())  
        {  
            autor.x = 0;  
        }
        if (autor.x + autor.getWidth() >= getActivity().getGameWidth()) {
            autor.addModifier(new ColorModifier());
        }
        if (blood != 0 && autor.intersects(autor2)) {
            autor2.addModifier(new ColorModifier());
            blood --;
        } else {
            autor.x += 1;
        }
        if (blood == 0) {
            autor2.clearModifiers();
            autor2.remove();
        }
    }

    @Override
    public void onReady() {
    }

    @Override
    protected void handleTouch(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            if (getActivity() != null) {
                //Log.e("@@@@", "MenuScene");
                //MenuScene scene = new MenuScene(this.getActivity());
                //getActivity().setScene(scene);
            }
        }
        super.handleTouch(event);
    }

    public void onTouchMove(float x, float y, MotionEvent event, int pointerCount, int pointerId) {  
        // This is called when you move your finger over the screen. (ie pretty much every frame if your holding your finger down)  
        // Here we'll just make Bob follow your finger.  
        autor2.x = x - (Textures.bob.getWidth() / 2);  
        autor2.y = y - (Textures.bob.getHeight() / 2);  
    }
}
