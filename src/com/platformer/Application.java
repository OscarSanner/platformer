package com.platformer;

import com.platformer.model.Model;
import com.platformer.view.ViewFrame;

public class Application {
    public static void main(String[] args) {
        Model model = new Model(10, 10, 4, 20);
        ViewFrame frame = new ViewFrame("Awesome game", model);
    }
}
