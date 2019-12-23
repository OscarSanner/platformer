package com.platformer.model;

import java.awt.image.BufferedImage;

public class Block implements IDrawable {

    private int x;
    private int y;
    private final int side;
    private BufferedImage icon;

    public Block(int side, BufferedImage icon) {
        this.side = side;
        this.icon = icon;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getSide() {
        return side;
    }

    @Override
    public BufferedImage getIcon() {
        return icon;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
