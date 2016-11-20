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
final class vec2f extends vec2
{
    public float x, y;
    
    /**
     * Construct a new vec2f
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @since 1.0
     */
    protected vec2f(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public final vec2f set(type_vec other)
    {
        this.x = (float) other.getX();
        this.y = (float) other.getY();
        
        return this;
    }
    
    @Override
    public final vec2f add(type_vec other)
    {
        this.x += (float) other.getX();
        this.y += (float) other.getY();
        
        return this;
    }
    
    @Override
    public final vec2f subtract(type_vec other)
    {
        this.x -= (float) other.getX();
        this.y -= (float) other.getY();
        
        return this;
    }
    
    @Override
    public final vec2f multiply(type_vec other)
    {
        this.x *= (float) other.getX();
        this.y *= (float) other.getY();
        
        return this;
    }
    
    @Override
    public final vec2f divide(type_vec other)
    {
        this.x /= (float) other.getX();
        this.y /= (float) other.getY();
        
        return this;
    }
    
    @Override
    public final vec2f set(float x, float y)
    {
        this.x = x;
        this.y = y;
        
        return this;
    }
    
    @Override
    public final vec2f add(float x, float y)
    {
        this.x += x;
        this.y += y;
        
        return this;
    }
    
    @Override
    public final vec2f subtract(float x, float y)
    {
        this.x -= x;
        this.y -= y;
        
        return this;
    }
    
    @Override
    public final vec2f multiply(float x, float y)
    {
        this.x *= x;
        this.y *= y;
        
        return this;
    }
    
    @Override
    public final vec2f divide(float x, float y)
    {
        this.x /= x;
        this.y /= y;
        
        return this;
    }
    
    @Override
    public final vec2f copy()
    {
        return new vec2f(this.x, this.y);
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
}
