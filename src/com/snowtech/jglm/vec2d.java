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
final class vec2d extends vec2
{
    public double x, y;
    
    /**
     * Construct a new vec2d
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @since 1.0
     */
    protected vec2d(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public final vec2d set(type_vec other)
    {
        this.x = other.getX();
        this.y = other.getY();
        
        return this;
    }
    
    @Override
    public final vec2d add(type_vec other)
    {
        this.x += other.getX();
        this.y += other.getY();
        
        return this;
    }
    
    @Override
    public final vec2d subtract(type_vec other)
    {
        this.x -= other.getX();
        this.y -= other.getY();
        
        return this;
    }
    
    @Override
    public final vec2d multiply(type_vec other)
    {
        this.x *= other.getX();
        this.y *= other.getY();
        
        return this;
    }
    
    @Override
    public final vec2d divide(type_vec other)
    {
        this.x /= other.getX();
        this.y /= other.getY();
        
        return this;
    }
    
    @Override
    public final vec2d set(double x, double y)
    {
        this.x = x;
        this.y = y;
        
        return this;
    }
    
    @Override
    public final vec2d add(double x, double y)
    {
        this.x += x;
        this.y += y;
        
        return this;
    }
    
    @Override
    public final vec2d subtract(double x, double y)
    {
        this.x -= x;
        this.y -= y;
        
        return this;
    }
    
    @Override
    public final vec2d multiply(double x, double y)
    {
        this.x *= x;
        this.y *= y;
        
        return this;
    }
    
    @Override
    public final vec2d divide(double x, double y)
    {
        this.x /= x;
        this.y /= y;
        
        return this;
    }
    
    @Override
    public final vec2d copy()
    {
        return new vec2d(this.x, this.y);
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
