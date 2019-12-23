package com.platformer.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Note: All object has same size and width. Has to be scaleable with world size
 */


public class Model {

    private final int x;
    private final int y;
    private int sharpness;
    private Block[][] world;
    private int objectX;
    private int objectY;
    private int blockSide;
    private List<IDrawable> drawables;

    /**
     * Constructor.
     * Note: Scale will
     * @param objectX The amount of objects (square objects) that will be able to fit in the X direction.
     * @param objectY The amount of objects (square objects) that will be able to fit in the Y direction.
     */
    public Model(int objectX, int objectY, int sharpness, int blockSide) {
        this.sharpness = sharpness;
        this.objectX = objectX;
        this.objectY = objectY;
        x = objectX * sharpness;
        y = objectY * sharpness;
        this.blockSide = blockSide;
        worldGenerator();
        initDrawableList();
    }

    private void initDrawableList() {
        drawables = new ArrayList<>();
        fillListFromArray(world);
    }

    private void fillListFromArray(Block[][] world) {
        for(int r = 0; r < objectX; r++){
            for (int c = 0; c < objectY; c++){
                drawables.add(world[r][c]);
            }
        }

    }

    void worldGenerator(){
        world = new Block[objectX][objectY];
        filWorld(world);
        makePath(world);
    }

    private void filWorld(Block[][] world) {
        int xCoord = blockSide/2;
        int yCoord = blockSide/2;
        for(int r = 0; r < objectX; r++){
            if (r!=0) {
                yCoord += blockSide;
                xCoord = blockSide/2;
            }
            for (int c = 0; c < objectY; c++){
                world[r][c] = BlockFactory.standard(blockSide);
                world[r][c].setX(xCoord);
                world[r][c].setY(yCoord);
                xCoord += blockSide;
            }
        }
    }

    /**
     * Specification for method to be written: The method will fill the matrix with blocks. The method will then
     * get a random spot in the matrix in which to start the walkable path. The method will then travers in a random
     * path and remove blocks to make a path. It will do so for a certain amount of time. The seed for the random
     * generator will be saved if one desires, to recreate the same path. Idea for how it will work:
     * 1. Get random index of array.
     * 2. Get random direction for array to continue in. Options are: Increment rows by 1. Decrement rows by one.
     * increment cols by one, decrement cols by one.
     * 3. If deleting the next block will lead back to beginning, redo random.
     * 4. After a set path has been created: be done.
     * @param world The whole world.
     *
     * For now makes a set path
     */
    private void makePath(IDrawable[][] world) {
        if(world.length < 5 || world[0].length < 5){
            return;
        }
        for(int i = 1; i < world.length - 1; i++){
            world[i][1] = null;
        }
        for(int i = 1; i < world[1].length - 1; i++){
            world[1][i] = null;
        }
    }

    public int getWidth() {
        return y;
    }

    public int getHeight() {
        return x;
    }

    public List<IDrawable> getDrawables(){
        return drawables;
    }
}
