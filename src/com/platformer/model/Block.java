package com.platformer.model;

import java.awt.image.BufferedImage;

public class Block implements IDrawable {

    private int x;
    private int y;
    private final int side;
    private BufferedImage icon;

    public Block(int side) {
        this.side = side;
        icon = new BufferedImage(side, side, BufferedImage.TYPE_INT_RGB);
        filIcon();
    }

    private void filIcon() {
        int x;
        int y;
        for(int i = 0; i < side*side; i++) {
            x = i % side;
            y = i / side;
            if(y <= 3 || x <= 3) {
                icon.setRGB(x, y, 0xffffff);
            }else{
                icon.setRGB(x, y, 0x696969);
            }
        }
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
