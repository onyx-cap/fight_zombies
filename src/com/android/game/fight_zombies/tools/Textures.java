package com.android.game.fight_zombies.tools;

import com.stickycoding.rokon.Texture;
import com.stickycoding.rokon.TextureAtlas;

/*
 * @autor Cap
 * 这是一个地图集类
 * 这里使用单例模式
 */
public class Textures {

    private static Textures sIntance = null;
    private static TextureAtlas atlas = null;
    private static Texture background; /*texture 是Rockon 的图片类*/

    public static Textures getInstance() {
        if (sIntance == null) {
            sIntance = new Textures();
        }
        return sIntance;
    }

    public void load(String filename) {
        if (atlas == null) {
            atlas = new TextureAtlas();
        }
        background = new Texture(filename);
        atlas.insert(background);
        atlas.complete();
    }

    public Texture getBackground() {
        return background;
    }
}
