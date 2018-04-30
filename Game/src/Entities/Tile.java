package Entities;

import Engine.Entity;

import java.awt.*;

public class Tile extends Entity
{
    public void start()
    {
        renderType = RenderType.Rectangle;
        renderTint = Color.GRAY;

        width = 64;
        height = 64;
    }
}