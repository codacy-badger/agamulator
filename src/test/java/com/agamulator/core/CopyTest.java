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

import com.agamulator.core.fake.FkCopy;
import com.agamulator.core.fake.FkRelease;
import com.agamulator.core.simple.SpGame;
import com.agamulator.core.simple.SpGamer;
import org.cactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;

/**
 * Test cases for {@link Copy} and {@link Copy.Envelope}.
 *
 * @since 1.0
 */
public final class CopyTest {

    /**
     * Fake object.
     */
    private final Copy copy = new FkCopy();

    /**
     * Test for {@link Copy.Envelope#equals(Object)} method. Must assert
     * that the {@link Copy#owner()} and {@link Copy#release()} values are
     * equal in both objects.
     */
    @Test
    public void returnEquality() {
        MatcherAssert.assertThat(
            "Copy envelope does not perform equals correctly",
            this.copy,
            new IsEqual<>(new FkCopy())
        );
    }

    /**
     * Test for {@link Copy.Envelope#equals(Object)} method. Must assert
     * that the result is true when comapring the sabe {@link Copy} reference.
     */
    @Test
    public void returnEqualityWhenSameReference() {
        MatcherAssert.assertThat(
            "Copy envelope does not perform equals correctly on same reference",
            this.copy,
            new IsEqual<>(this.copy)
        );
    }

    /**
     * Test for {@link Copy.Envelope#hashCode()} method. Must assert
     * that the {@link Copy} hashes are equal in both objects.
     */
    @Test
    public void returnHashcode() {
        MatcherAssert.assertThat(
            "Copy envelope does not perform hashcode correctly",
            new FkCopy().hashCode(),
            new IsEqual<>(new FkCopy().hashCode())
        );
    }

    /**
     * Test for {@link Copy.Envelope#equals(Object)} method failure when
     * using objects of two different classes.
     */
    @Test
    public void returnInequalityWhenDifferentClasses() {
        MatcherAssert.assertThat(
            "Copy envelope does not inequality check correctly",
            new FkCopy().equals("Not a copy"),
            new IsEqual<>(false)
        );
    }

    /**
     * Test for {@link Copy.Envelope#equals(Object)} method failure when
     * using objects with different {@link Copy#owner()} values.
     */
    @Test
    public void returnInequalityWhenDifferentOwner() {
        MatcherAssert.assertThat(
            "Copy envelope does not check inequality correctly on owner",
            new FkCopy(),
            new IsNot<>(
                new IsEqual<>(new FkCopy(new SpGamer(new TextOf("Gamer"))))
            )
        );
    }

    /**
     * Test for {@link Copy.Envelope#equals(Object)} method failure when
     * using objects with different {@link Copy#release()} values.
     */
    @Test
    public void returnInequalityWhenDifferentRelease() {
        MatcherAssert.assertThat(
            "Copy envelope does not check inequality correctly on release",
            new FkCopy(),
            new IsNot<>(
                new IsEqual<>(
                    new FkCopy(new FkRelease(new SpGame(new TextOf("Game"))))
                )
            )
        );
    }
}
