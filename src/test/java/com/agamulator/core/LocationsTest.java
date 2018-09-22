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
package com.agamulator.core;

import org.cactoos.collection.CollectionOf;
import org.cactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsCollectionContaining;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

/**
 * Tests for {@link Locations}.
 *
 * @since 1.0
 */
public final class LocationsTest {

    /**
     * Location repository can add Location.
     */
    @Test
    public void addLocation() {
        final String name = "Location one";
        final Locations locations = new Locations.Simple();
        final Location location = locations.add(new TextOf(name));
        MatcherAssert.assertThat(
            "Location not added",
            new CollectionOf<>(
                locations.iterate()
            ),
            new IsCollectionContaining<>(
                new IsEqual<>(location)
            )
        );
    }

    /**
     * Locations can find location.
     */
    @Test
    public void findLocation() {
        final String name = "Location two";
        final Locations locations = new Locations.Simple();
        final Location location = locations.add(new TextOf(name));
        MatcherAssert.assertThat(
            "Location not found",
            locations.find(new TextOf(name)),
            new IsEqual<>(location)
        );
    }
}
