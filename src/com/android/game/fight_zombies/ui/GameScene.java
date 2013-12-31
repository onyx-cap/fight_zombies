package com.android.game.fight_zombies.ui;

import com.stickycoding.rokon.RokonActivity;
import com.stickycoding.rokon.Scene;

public class GameScene extends Scene{

    private RokonActivity mActivity;

    public GameScene(RokonActivity activity) {
        super();
        mActivity = activity;
    }

    public GameScene(RokonActivity activity, int a, int b) {
        super(a, b);
        mActivity = activity;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onGameLoop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onReady() {
        // TODO Auto-generated method stub
        
    }

    public RokonActivity getActivity() {
        return mActivity;
    }

}
