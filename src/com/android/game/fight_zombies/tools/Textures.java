package com.android.game.fight_zombies.tools;

import com.stickycoding.rokon.Texture;
import com.stickycoding.rokon.TextureAtlas;

/*
 * @autor Cap
 * 这是一个地图集类
 */
public class Textures {

    public static TextureAtlas atlas = null;
    public static Texture show_background; /*texture 是Rockon 的图片类*/
    public static Texture menu_background;
    public static Texture begin_background;
    public static Texture bob;

    public static void load() {
        if (atlas == null) {
            atlas = new TextureAtlas();
            show_background = new Texture("show_background.png");
            atlas.insert(show_background);
            menu_background = new Texture("menu_background.png");
            atlas.insert(menu_background);
            begin_background = new Texture("begin_background.png");
            atlas.insert(begin_background);
            bob = new Texture("bob.png");
            atlas.insert(bob);
            atlas.complete();
        }
    }

}
