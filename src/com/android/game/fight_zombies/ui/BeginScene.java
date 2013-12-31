package com.android.game.fight_zombies.ui;

import android.util.Log;
import android.view.MotionEvent;

import com.android.game.fight_zombies.tools.Textures;
import com.stickycoding.rokon.RokonActivity;
import com.stickycoding.rokon.background.FixedBackground;

public class BeginScene extends GameScene{

    private FixedBackground background;

    public BeginScene (RokonActivity activity) {
        super(activity);

        background = new FixedBackground(Textures.begin_background);
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

    @Override
    protected void handleTouch(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            if (getActivity() != null) {
                Log.e("@@@@", "BeginScene");
                ShowScence scene = new ShowScence(this.getActivity());
                getActivity().setScene(scene);
            }
        }
        super.handleTouch(event);
    }

}
