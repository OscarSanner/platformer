package com.platformer.model;

public class BlockFactory {
    public static Block standard(int side) {
        return new Block(side, null);
    }
}
