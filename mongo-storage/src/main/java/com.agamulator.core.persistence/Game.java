package com.agamulator.core.persistence;

import org.cactoos.Text;
import org.cactoos.text.TextOf;

public class Game implements com.agamulator.core.Game {
    @Override
    public Text title() {
        return new TextOf("Game stored on mongo database");
    }
}
