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
 * <class>jglm</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public final class jglm
{
    /**
     * Constructs a new jglm class.
     *
     * @since 1.0
     */
    private jglm()
    {
        throw new RuntimeException("the jglm class is not supposed to be instantiated!");
    }
    
    /**
     * Constructs a new vec2
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @return a new vec2
     * @since 1.0
     */
    public static vec2 vec2(double x, double y)
    {
        return new vec2d(x, y);
    }
    
    /**
     * Constructs a new vec2
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @return a new vec2
     * @since 1.0
     */
    public static vec2 vec2(float x, float y)
    {
        return new vec2f(x, y);
    }
    
    /**
     * Constructs a new vec3
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @return a new vec3
     * @since 1.0
     */
    public static vec3 vec3(double x, double y, double z)
    {
        return new vec3d(x, y, z);
    }
    
    /**
     * Constructs a new vec3
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @return a new vec3
     * @since 1.0
     */
    public static vec3 vec3(float x, float y, float z)
    {
        return new vec3f(x, y, z);
    }
    
    /**
     * Constructs a new vec4
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param w the w coordinate
     * @return a new vec4
     * @since 1.0
     */
    public static vec4 vec4(double x, double y, double z, double w)
    {
        return new vec4d(x, y, z, w);
    }
    
    /**
     * Constructs a new vec4
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param w the w coordinate
     * @return a new vec4
     * @since 1.0
     */
    public static vec4 vec4(float x, float y, float z, float w)
    {
        return new vec4f(x, y, z, w);
    }
    
    /**
     * Constructs a new mat2x2
     *
     * @param diagonal the diagonal value.
     * @return a new mat2x2
     * @since 1.0
     */
    public static mat2x2 mat2x2(double diagonal)
    {
        return new mat2x2d(diagonal);
    }
    
    /**
     * Constructs a new mat2x2
     *
     * @param diagonal the diagonal value.
     * @return a new mat2x2
     * @since 1.0
     */
    public static mat2x2 mat2x2(float diagonal)
    {
        return new mat2x2f(diagonal);
    }
    
    /**
     * Constructs a new mat3x3
     *
     * @param diagonal the diagonal value.
     * @return a new mat3x3
     * @since 1.0
     */
    public static mat3x3 mat3x3(double diagonal)
    {
        return new mat3x3d(diagonal);
    }
    
    /**
     * Constructs a new mat3x3
     *
     * @param diagonal the diagonal value.
     * @return a new mat3x3
     * @since 1.0
     */
    public static mat3x3 mat3x3(float diagonal)
    {
        return new mat3x3f(diagonal);
    }
}
