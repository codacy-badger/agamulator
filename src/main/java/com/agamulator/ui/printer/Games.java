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
package com.agamulator.ui.printer;

import com.agamulator.core.Game;
import org.cactoos.Text;

/**
 * Printer for {@link com.agamulator.ui.Games}.
 * @since 1.0
 */
public final class Games implements com.agamulator.ui.Games {

    /**
     * Decorated {@link com.agamulator.core.Games}.
     */
    private final com.agamulator.core.Games origin;

    /**
     * Constructor.
     * @param origin Decorated games repository
     */
    public Games(final com.agamulator.core.Games origin) {
        this.origin = origin;
    }

    @Override
    public Game add(final Text name) {
        return this.origin.add(name);
    }

    @Override
    public Iterable<Game> iterate() {
        return this.origin.iterate();
    }

    @Override
    public <T> T print(final Out<T> out) {
        return out.print(this.iterate());
    }
}