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

import com.agamulator.core.Game;
import com.agamulator.core.Location;
import com.agamulator.core.Platform;
import com.agamulator.core.Release;

/**
 * Simple release of a {@link Game}.
 *
 * @since 1.0
 */
public final class SpRelease extends Release.Envelope {

    /**
     * The {@link Game} of the release.
     */
    private final Game origin;

    /**
     * The release {@link Platform}.
     */
    private final Platform plat;

    /**
     * The release {@link Location}.
     */
    private final Location loc;

    /**
     * Constructor.
     *
     * @param origin Game wrapped
     * @param platform Release platform
     * @param location Release location
     */
    public SpRelease(final Game origin, final Platform platform,
        final Location location) {
        super();
        this.loc = location;
        this.origin = origin;
        this.plat = platform;
    }

    @Override
    public Game game() {
        return this.origin;
    }

    @Override
    public Platform platform() {
        return this.plat;
    }

    @Override
    public Location location() {
        return this.loc;
    }

}
