/**
 * Copyright (c) 2016 Mark Rienstra
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.snowtech.jglm;

/**
 * <summary>
 * <project>JGLM</project>
 * <package>com.snowtech.jglm</package>
 * <class>mat2x2d</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
final class mat3x3f extends mat3x3
{
    public float elements[];
    
    public mat3x3f()
    {
        this.elements = new float[ARRAY_SIZE];
    }
    
    public mat3x3f(float diagonal)
    {
        this.elements = new float[ARRAY_SIZE];
        
        this.elements[0 + 0 * SIZE] = diagonal;
        this.elements[1 + 1 * SIZE] = diagonal;
        this.elements[2 + 2 * SIZE] = diagonal;
    }
    
    @Override
    public final mat3x3f setElement(int row, int column, float value)
    {
        this.elements[row + column * SIZE] = value;
        
        return this;
    }
    
    @Override
    public final float[] getElements(float[] dest)
    {
        if (dest == null)
        {
            dest = new float[ARRAY_SIZE];
        }
        if (dest.length < ARRAY_SIZE)
        {
            throw new IllegalArgumentException("The specified destination is too small!\n" +
                                               "(specified length: " + dest.length + ", required length: " + ARRAY_SIZE + ")");
        }
        System.arraycopy(this.elements, 0, dest, 0, ARRAY_SIZE);
        return dest;
    }
}
