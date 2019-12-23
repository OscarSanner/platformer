package com.platformer.model;

import java.awt.image.BufferedImage;

/**
 * Note: getDirection should be called via direction observer to reduce polling.
 */
public interface IDrawable {
    int getX();
    int getY();
    int getSide();
    BufferedImage getIcon();
}
