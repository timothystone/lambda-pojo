/*
 * The MIT License
 *
 * Copyright © 2016-2021 Timothy Stone.
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */
package com.anothercaffeinatedday;

import java.util.List;

/**
 * @author Timothy Stone
 */
public class ResponseClass {

  List<NPC> data;

  /**
   * Makes a new response with a list of NPCs.
   *
   * @param NPCs the list of NPCs for the response
   */
  public ResponseClass(List<NPC> NPCs) {
    this.data = NPCs;
  }

  /**
   * Default Constructor.
   */
  public ResponseClass() {
  }

  /**
   * Get the NPCs generated.
   *
   * @return List NPCs generated
   */
  public List<NPC> getNPCs() {
    return this.data;
  }

  /**
   * Sets the {@link java.util.List} of generated NPCs.
   *
   * @param NPCs the NPCs generated from the request
   */
  public void setNPCs(List<NPC> NPCs) {
    this.data = NPCs;
  }

}
