/*
 * MIT License
 *
 * Copyright (c) 2018 Paulo Lobo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.agamulator.ui.logger;

import com.agamulator.core.Game;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Prints {@link com.agamulator.core.Games} as a log output to console.
 * @since 1.0
 */
public final class Games implements com.agamulator.ui.Games.Out<String> {

    /**
     * Logger instance.
     */
    private static final Logger LOGGER = Logger.getLogger("Game logger");

    /**
     * Handler instance.
     */
    private final ConsoleHandler handler;

    /**
     * Constructor.
     */
    public Games() {
        LOGGER.setLevel(Level.FINEST);
        this.handler = new ConsoleHandler();
        this.handler.setLevel(Level.FINER);
        LOGGER.addHandler(this.handler);
    }

    @Override
    public String print(final Iterable<Game> list) {
        LOGGER.fine("Games Available");
        list.iterator().forEachRemaining(
            item -> new com.agamulator.ui.printer.Game(item).print(
                new com.agamulator.ui.logger.Game()
            )
        );
        return null;
    }
}