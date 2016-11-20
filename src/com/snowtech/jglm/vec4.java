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
import com.snowtech.jglm.types.type_vec4;

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
public abstract class vec4 implements type_vec4
{
    // Hidden constructor
    protected vec4()
    {
        throw new RuntimeException("the vec4 class is not supposed to be instantiated!");
    }
    
    @Override
    public abstract vec4 set(type_vec other);
    
    @Override
    public abstract vec4 add(type_vec other);
    
    @Override
    public abstract vec4 subtract(type_vec other);
    
    @Override
    public abstract vec4 multiply(type_vec other);
    
    @Override
    public abstract vec4 divide(type_vec other);
    
    @Override
    public vec4 set(double x, double y, double z, double w)
    {
        return this.set((float) x, (float) y, (float) z, (float) w);
    }
    
    @Override
    public vec4 add(double x, double y, double z, double w)
    {
        return this.add((float) x, (float) y, (float) z, (float) w);
    }
    
    @Override
    public vec4 subtract(double x, double y, double z, double w)
    {
        return this.subtract((float) x, (float) y, (float) z, (float) w);
    }
    
    @Override
    public vec4 multiply(double x, double y, double z, double w)
    {
        return this.multiply((float) x, (float) y, (float) z, (float) w);
    }
    
    @Override
    public vec4 divide(double x, double y, double z, double w)
    {
        return this.divide((float) x, (float) y, (float) z, (float) w);
    }
    
    @Override
    public vec4 set(float x, float y, float z, float w)
    {
        return this.set((double) x, (double) y, (double) z, (double) w);
    }
    
    @Override
    public vec4 add(float x, float y, float z, float w)
    {
        return this.add((double) x, (double) y, (double) z, (double) w);
    }
    
    @Override
    public vec4 subtract(float x, float y, float z, float w)
    {
        return this.subtract((double) x, (double) y, (double) z, (double) w);
    }
    
    @Override
    public vec4 multiply(float x, float y, float z, float w)
    {
        return this.multiply((double) x, (double) y, (double) z, (double) w);
    }
    
    @Override
    public vec4 divide(float x, float y, float z, float w)
    {
        return this.divide((double) x, (double) y, (double) z, (double) w);
    }
    
    @Override
    public final vec4 set(double value)
    {
        return this.set(value, value, value, value);
    }
    
    @Override
    public final vec4 add(double value)
    {
        return this.add(value, value, value, value);
    }
    
    @Override
    public final vec4 subtract(double value)
    {
        return this.subtract(value, value, value, value);
    }
    
    @Override
    public final vec4 multiply(double value)
    {
        return this.multiply(value, value, value, value);
    }
    
    @Override
    public final vec4 divide(double value)
    {
        return this.divide(value, value, value, value);
    }
    
    @Override
    public final vec4 set(float value)
    {
        return this.set(value, value, value, value);
    }
    
    @Override
    public final vec4 add(float value)
    {
        return this.add(value, value, value, value);
    }
    
    @Override
    public final vec4 subtract(float value)
    {
        return this.subtract(value, value, value, value);
    }
    
    @Override
    public final vec4 multiply(float value)
    {
        return this.multiply(value, value, value, value);
    }
    
    @Override
    public final vec4 divide(float value)
    {
        return this.divide(value, value, value, value);
    }
    
    @Override
    public abstract vec4 copy();
    
    @Override
    public final vec4 normalize()
    {
        return this.divide(this.length());
    }
    
    @Override
    public final vec4 normalized()
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
    public abstract double getW();
    
    @Override
    public final String toString()
    {
        return "vec3(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ", " + this.getW() + ")";
    }
    
    @Override
    public final boolean equals(type_vec other)
    {
        if (other instanceof type_vec4)
        {
            type_vec4 v = (type_vec4) other;
            return (this.getX() == v.getX()) && (this.getY() == v.getY()) && (this.getZ() == v.getZ() && (this.getW() == v.getW()));
        }
        else if (other instanceof type_vec3)
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
