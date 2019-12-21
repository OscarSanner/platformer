package com.platformer.model;

/**
 * Note: getDirection should be called via direction observer to reduce polling.
 */
public interface IDrawable {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    int getIcon();
    int getDirection();
}
