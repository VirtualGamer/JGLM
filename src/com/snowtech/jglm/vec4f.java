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
final class vec4f extends vec4
{
    public float x, y, z, w;
    
    /**
     * Construct a new vec2d
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param w the w coordinate
     * @since 1.0
     */
    protected vec4f(float x, float y, float z, float w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    @Override
    public final vec4f set(type_vec other)
    {
        this.x = (float) other.getX();
        this.y = (float) other.getY();
        
        if (other instanceof type_vec4)
        {
            this.z = (float) ((type_vec4) other).getZ();
            this.w = (float) ((type_vec4) other).getW();
        }
        else if (other instanceof type_vec3)
        {
            this.z = (float) ((type_vec3) other).getZ();
        }
        
        return this;
    }
    
    @Override
    public final vec4f add(type_vec other)
    {
        this.x += other.getX();
        this.y += other.getY();
        
        if (other instanceof type_vec4)
        {
            this.z += (float) ((type_vec4) other).getZ();
            this.w += (float) ((type_vec4) other).getW();
        }
        else if (other instanceof type_vec3)
        {
            this.z += (float) ((type_vec3) other).getZ();
        }
        
        return this;
    }
    
    @Override
    public final vec4f subtract(type_vec other)
    {
        this.x -= other.getX();
        this.y -= other.getY();
    
        if (other instanceof type_vec4)
        {
            this.z -= (float) ((type_vec4) other).getZ();
            this.w -= (float) ((type_vec4) other).getW();
        }
        else if (other instanceof type_vec3)
        {
            this.z -= (float) ((type_vec3) other).getZ();
        }
        
        return this;
    }
    
    @Override
    public final vec4f multiply(type_vec other)
    {
        this.x *= other.getX();
        this.y *= other.getY();
    
        if (other instanceof type_vec4)
        {
            this.z *= (float) ((type_vec4) other).getZ();
            this.w *= (float) ((type_vec4) other).getW();
        }
        else if (other instanceof type_vec3)
        {
            this.z *= (float) ((type_vec3) other).getZ();
        }
        
        return this;
    }
    
    @Override
    public final vec4f divide(type_vec other)
    {
        this.x /= other.getX();
        this.y /= other.getY();
    
        if (other instanceof type_vec4)
        {
            this.z /= (float) ((type_vec4) other).getZ();
            this.w /= (float) ((type_vec4) other).getW();
        }
        else if (other instanceof type_vec3)
        {
            this.z /= (float) ((type_vec3) other).getZ();
        }
        
        return this;
    }
    
    @Override
    public final vec4f set(float x, float y, float z, float w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        
        return this;
    }
    
    @Override
    public final vec4f add(float x, float y, float z, float w)
    {
        this.x += x;
        this.y += y;
        this.z += z;
        this.w += w;
        
        return this;
    }
    
    @Override
    public final vec4f subtract(float x, float y, float z, float w)
    {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        this.w -= w;
        
        return this;
    }
    
    @Override
    public final vec4f multiply(float x, float y, float z, float w)
    {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        this.w *= w;
        
        return this;
    }
    
    @Override
    public final vec4f divide(float x, float y, float z, float w)
    {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        this.w /= w;
        
        return this;
    }
    
    @Override
    public final vec4f copy()
    {
        return new vec4f(this.x, this.y, this.z, this.w);
    }
    
    @Override
    public double getX()
    {
        return this.x;
    }
    
    @Override
    public double getY()
    {
        return this.y;
    }
    
    @Override
    public double getZ()
    {
        return this.z;
    }
    
    @Override
    public double getW()
    {
        return this.w;
    }
}
