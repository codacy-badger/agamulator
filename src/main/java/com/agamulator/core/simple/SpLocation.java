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
package com.agamulator.core.simple;

import com.agamulator.core.Location;
import org.cactoos.Text;

/**
 * Simple implementation of Location which stores its data in instance
 * fields.
 *
 * @since 1.0
 */
public final class SpLocation extends Location.Envelope {

    /**
     * Location name.
     */
    private final Text location;

    /**
     * Constructor.
     *
     * @param name Location name
     */
    public SpLocation(final Text name) {
        super();
        this.location = name;
    }

    /**
     * Returns the provider name.
     *
     * @return Location name stored in memory.
     */
    public Text name() {
        return this.location;
    }
}
