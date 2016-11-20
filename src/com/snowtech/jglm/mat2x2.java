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
    @Override
    public mat2x2 setElement(int column, int row, double value)
    {
        return this.setElement(column, row, (float) value);
    }
    
    @Override
    public mat2x2 setElement(int column, int row, float value)
    {
        return this.setElement(column, row, (double) value);
    }
    
    @Override
    public final mat2x2 multiply(type_mat other)
    {
        for (int column = 0; column < 2; column++)
        {
            for (int row = 0; row < 2; row++)
            {
                double temp = 0.0;
                for (int e = 0; e < 2; e++)
                {
                    temp += this.getElement(column, e, (Double) null) * other.getElement(e, row, (Double) null);
                }
                this.setElement(column, row, temp);
            }
        }
        
        return this;
    }
    
    @Override
    public final double getElement(int column, int row, Double pointer)
    {
        return pointer = this.getElements((double[]) null)[column + row * 2];
    }
    
    @Override
    public final float getElement(int column, int row, Float pointer)
    {
        return pointer = this.getElements((float[]) null)[column + row * 2];
    }
    
    @Override
    public abstract double[] getElements(double[] dest);
    
    @Override
    public abstract float[] getElements(float[] dest);
    
    @Override
    public abstract type_vec2[] getElements();
    
    @Override
    public final String toString()
    {
        String array = "[";
        for (int column = 0; column < 2; column++)
        {
            for (int row = 0; row < 2; row++)
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
        for (int column = 0; column < 2; column++)
        {
            for (int row = 0; row < 2; row++)
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
