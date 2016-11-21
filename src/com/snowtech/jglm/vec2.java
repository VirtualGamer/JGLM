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

import com.snowtech.jglm.types.type_vec;
import com.snowtech.jglm.types.type_vec2;

/**
 * <summary>
 * <project>JGLM</project>
 * <package>com.snowtech.jglm</package>
 * <class>vec2</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public abstract class vec2 implements type_vec2
{
    // Hidden constructor
    protected vec2()
    {
        throw new RuntimeException("the vec2 class is not supposed to be instantiated!");
    }
    
    @Override
    public abstract vec2 set(type_vec other);
    
    @Override
    public abstract vec2 add(type_vec other);
    
    @Override
    public abstract vec2 subtract(type_vec other);
    
    @Override
    public abstract vec2 multiply(type_vec other);
    
    @Override
    public abstract vec2 divide(type_vec other);
    
    @Override
    public vec2 set(double x, double y)
    {
        return this.set((float) x, (float) y);
    }
    
    @Override
    public vec2 add(double x, double y)
    {
        return this.add((float) x, (float) y);
    }
    
    @Override
    public vec2 subtract(double x, double y)
    {
        return this.subtract((float) x, (float) y);
    }
    
    @Override
    public vec2 multiply(double x, double y)
    {
        return this.multiply((float) x, (float) y);
    }
    
    @Override
    public vec2 divide(double x, double y)
    {
        return this.divide((float) x, (float) y);
    }
    
    @Override
    public vec2 set(float x, float y)
    {
        return this.set((double) x, (double) y);
    }
    
    @Override
    public vec2 add(float x, float y)
    {
        return this.add((double) x, (double) y);
    }
    
    @Override
    public vec2 subtract(float x, float y)
    {
        return this.subtract((double) x, (double) y);
    }
    
    @Override
    public vec2 multiply(float x, float y)
    {
        return this.multiply((double) x, (double) y);
    }
    
    @Override
    public vec2 divide(float x, float y)
    {
        return this.divide((double) x, (double) y);
    }
    
    @Override
    public final vec2 set(double value)
    {
        return this.set(value, value);
    }
    
    @Override
    public final vec2 add(double value)
    {
        return this.add(value, value);
    }
    
    @Override
    public final vec2 subtract(double value)
    {
        return this.subtract(value, value);
    }
    
    @Override
    public final vec2 multiply(double value)
    {
        return this.multiply(value, value);
    }
    
    @Override
    public final vec2 divide(double value)
    {
        return this.divide(value, value);
    }
    
    @Override
    public final vec2 set(float value)
    {
        return this.set(value, value);
    }
    
    @Override
    public final vec2 add(float value)
    {
        return this.add(value, value);
    }
    
    @Override
    public final vec2 subtract(float value)
    {
        return this.subtract(value, value);
    }
    
    @Override
    public final vec2 multiply(float value)
    {
        return this.multiply(value, value);
    }
    
    @Override
    public final vec2 divide(float value)
    {
        return this.divide(value, value);
    }
    
    @Override
    public abstract vec2 copy();
    
    @Override
    public final vec2 normalize()
    {
        return this.divide(this.length());
    }
    
    @Override
    public final vec2 normalized()
    {
        return this.copy().normalize();
    }
    
    @Override
    public final double lengthSquared()
    {
        return (this.getX() * this.getX()) + (this.getY() * this.getY());
    }
    
    @Override
    public final double length()
    {
        return Math.sqrt(this.lengthSquared());
    }
    
    @Override
    public abstract double getX();
    
    @Override
    public abstract double getY();
    
    @Override
    public final String toString()
    {
        return "vec2(" + this.getX() + ", " + this.getY() + ")";
    }
    
    @Override
    public final boolean equals(type_vec other)
    {
        return (this.getX() == other.getX()) && (this.getY() == other.getY());
    }
    
    @Override
    public final boolean equals(Object other)
    {
        if (other instanceof type_vec)
        {
            return this.equals((type_vec) other);
        }
        return super.equals(other);
    }
}
