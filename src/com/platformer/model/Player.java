package com.platformer.model;

import java.awt.image.BufferedImage;

public class Player implements IDrawable {
    int health;
    int x;
    int y;
    int side;
    Direction direction;

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getSide() {
        return 0;
    }

    @Override
    public BufferedImage getIcon() {
        return null;
    }
}
