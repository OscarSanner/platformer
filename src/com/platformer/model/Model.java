package com.platformer.model;

/**
 * Note: All object has same size and width. Has to be scaleable with world size
 */


public class Model {

    private final int x;
    private final int y;
    private int sharpness;
    private IDrawable[][] world;
    private int objectX;
    private int objectY;

    /**
     * Constructor.
     * Note: Scale will
     * @param objectX The amount of objects (square objects) that will be able to fit in the X direction.
     * @param objectY The amount of objects (square objects) that will be able to fit in the Y direction.
     */
    public Model(int objectX, int objectY, int sharpness) {
        this.sharpness = sharpness;
        this.objectX = objectX;
        this.objectY = objectY;
        x = objectX * sharpness;
        y = objectY * sharpness;
    }

    void worldGenerator(){
        world = new IDrawable[objectX][objectY];
        fillPath(world);
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
     */
    private void fillPath(IDrawable[][] world) {
    }
}
