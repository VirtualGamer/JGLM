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
import com.snowtech.jglm.types.type_vec3;

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
public abstract class vec3 implements type_vec3
{
    // Hidden constructor
    protected vec3()
    {
    }
    
    @Override
    public abstract vec3 set(type_vec other);
    
    @Override
    public abstract vec3 add(type_vec other);
    
    @Override
    public abstract vec3 subtract(type_vec other);
    
    @Override
    public abstract vec3 multiply(type_vec other);
    
    @Override
    public abstract vec3 divide(type_vec other);
    
    @Override
    public vec3 set(double x, double y, double z)
    {
        return this.set((float) x, (float) y, (float) z);
    }
    
    @Override
    public vec3 add(double x, double y, double z)
    {
        return this.add((float) x, (float) y, (float) z);
    }
    
    @Override
    public vec3 subtract(double x, double y, double z)
    {
        return this.subtract((float) x, (float) y, (float) z);
    }
    
    @Override
    public vec3 multiply(double x, double y, double z)
    {
        return this.multiply((float) x, (float) y, (float) z);
    }
    
    @Override
    public vec3 divide(double x, double y, double z)
    {
        return this.divide((float) x, (float) y, (float) z);
    }
    
    @Override
    public vec3 set(float x, float y, float z)
    {
        return this.set((double) x, (double) y, (double) z);
    }
    
    @Override
    public vec3 add(float x, float y, float z)
    {
        return this.add((double) x, (double) y, (double) z);
    }
    
    @Override
    public vec3 subtract(float x, float y, float z)
    {
        return this.subtract((double) x, (double) y, (double) z);
    }
    
    @Override
    public vec3 multiply(float x, float y, float z)
    {
        return this.multiply((double) x, (double) y, (double) z);
    }
    
    @Override
    public vec3 divide(float x, float y, float z)
    {
        return this.divide((double) x, (double) y, (double) z);
    }
    
    @Override
    public final vec3 set(double value)
    {
        return this.set(value, value, value);
    }
    
    @Override
    public final vec3 add(double value)
    {
        return this.add(value, value, value);
    }
    
    @Override
    public final vec3 subtract(double value)
    {
        return this.subtract(value, value, value);
    }
    
    @Override
    public final vec3 multiply(double value)
    {
        return this.multiply(value, value, value);
    }
    
    @Override
    public final vec3 divide(double value)
    {
        return this.divide(value, value, value);
    }
    
    @Override
    public final vec3 set(float value)
    {
        return this.set(value, value, value);
    }
    
    @Override
    public final vec3 add(float value)
    {
        return this.add(value, value, value);
    }
    
    @Override
    public final vec3 subtract(float value)
    {
        return this.subtract(value, value, value);
    }
    
    @Override
    public final vec3 multiply(float value)
    {
        return this.multiply(value, value, value);
    }
    
    @Override
    public final vec3 divide(float value)
    {
        return this.divide(value, value, value);
    }
    
    @Override
    public abstract vec3 copy();
    
    @Override
    public final vec3 normalize()
    {
        return this.divide(this.length());
    }
    
    @Override
    public final vec3 normalized()
    {
        return this.copy().normalize();
    }
    
    @Override
    public final double lengthSquared()
    {
        return (this.getX() * this.getX()) + (this.getY() * this.getY() + (this.getZ() * this.getZ()));
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
    public abstract double getZ();
    
    @Override
    public final String toString()
    {
        return "vec3(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
    
    @Override
    public final boolean equals(type_vec other)
    {
        if (other instanceof type_vec3)
        {
            type_vec3 v = (type_vec3) other;
            return (this.getX() == v.getX()) && (this.getY() == v.getY()) && (this.getZ() == v.getZ());
        }
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
