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

import com.snowtech.jglm.types.type_mat;
import com.snowtech.jglm.types.type_mat2x2;
import com.snowtech.jglm.types.type_vec2;

/**
 * <summary>
 * <project>JGLM</project>
 * <package>com.snowtech.jglm</package>
 * <class>mat2x2</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public abstract class mat2x2 implements type_mat2x2
{
    protected static final int
            SIZE = 2,
            ARRAY_SIZE = 4;
    
    // Hidden constructor
    protected mat2x2()
    {
    }
    
    @Override
    public final mat2x2 loadIdentity()
    {
        this.setElement(0, 0, 1.0);
        this.setElement(1, 0, 0.0);
        
        this.setElement(0, 0, 0.0);
        this.setElement(1, 1, 1.0);
        
        return this;
    }
    
    @Override
    public mat2x2 setElement(int row, int column, double value)
    {
        return this.setElement(row, column, (float) value);
    }
    
    @Override
    public mat2x2 setElement(int row, int column, float value)
    {
        return this.setElement(row, column, (double) value);
    }
    
    @Override
    public final mat2x2 multiply(type_mat other)
    {
        for (int column = 0; column < SIZE; column++)
        {
            for (int row = 0; row < SIZE; row++)
            {
                double temp = 0.0;
                for (int e = 0; e < SIZE; e++)
                {
                    temp += this.getElement(row, e, (Double) null) * other.getElement(e, column, (Double) null);
                }
                this.setElement(row, column, temp);
            }
        }
        
        return this;
    }
    
    @Override
    public final double getElement(int row, int column, Double pointer)
    {
        return pointer = this.getElements((double[]) null)[row + column * SIZE];
    }
    
    @Override
    public final float getElement(int row, int column, Float pointer)
    {
        return pointer = this.getElements((float[]) null)[row + column * SIZE];
    }
    
    @Override
    public double[] getElements(double dest[])
    {
        if (dest == null)
        {
            dest = new double[ARRAY_SIZE];
        }
        if (dest.length < ARRAY_SIZE)
        {
            throw new IllegalArgumentException("The specified destination is too small!\n" +
                                                       "(specified length: " + dest.length + ", required length: " + ARRAY_SIZE + ")");
        }
        float elements[] = new float[ARRAY_SIZE];
        this.getElements(elements);
    
        for (int column = 0; column < SIZE; column++)
        {
            for (int row = 0; row < SIZE; row++)
            {
                dest[row + column* SIZE] = (double) elements[row + column * SIZE];
            }
        }
    
        return dest;
    }
    
    @Override
    public float[] getElements(float dest[])
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
        double elements[] = new double[ARRAY_SIZE];
        this.getElements(elements);
        
        for (int column = 0; column < SIZE; column++)
        {
            for (int row = 0; row < SIZE; row++)
            {
                dest[row + column * SIZE] = (float) elements[row + column * SIZE];
            }
        }
        
        return dest;
    }
    
    @Override
    public final type_vec2[] getElements()
    {
        vec2[] result = new vec2[SIZE];
        result[0] = jglm.vec2(this.getElement(0, 0, (Double) null), this.getElement(1, 0, (Double) null));
        result[1] = jglm.vec2(this.getElement(0, 1, (Double) null), this.getElement(1, 1, (Double) null));
        return result;
    }
    
    @Override
    public final String toString()
    {
        String array = "[";
        for (int column = 0; column < SIZE; column++)
        {
            for (int row = 0; row < SIZE; row++)
            {
                array += "" + this.getElement(column, row, (Double) null) + ", ";
            }
        }
        array = array.substring(0, array.length() - 2) + "]";
        return "mat2x2" + array;
    }
    
    @Override
    public final boolean equals(type_mat other)
    {
        for (int column = 0; column < SIZE; column++)
        {
            for (int row = 0; row < SIZE; row++)
            {
                if (this.getElement(column, row, (Double) null) != other.getElement(column, row, (Double) null))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(Object other)
    {
        if (other instanceof type_mat)
        {
            return this.equals((type_mat) other);
        }
        return super.equals(other);
    }
}
