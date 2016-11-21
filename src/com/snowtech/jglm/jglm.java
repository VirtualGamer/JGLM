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
import com.snowtech.jglm.types.type_vec3;
import com.snowtech.jglm.types.type_vec4;

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
     * The major version.
     */
    public static final int JGLM_VERSION_MAJOR = 1;
    /**
     * The minor version.
     */
    public static final int JGLM_VERSION_MINOR = 1;
    /**
     * The version revision.
     */
    public static final int JGLM_VERSION_REVISION = 1;
    
    private static final int JGLM_VERSION_BUILD = 0;
    private static final String m_VersionString;
    
    static
    {
        String version = JGLM_VERSION_MAJOR + "." + JGLM_VERSION_MINOR + "." + JGLM_VERSION_REVISION + " ";
        switch (JGLM_VERSION_BUILD)
        {
            case 0:
                version += "pre-alpha";
                break;
            case 1:
                version += "alpha";
                break;
            case 2:
                version += "beta";
                break;
            case 3:
                version += "release";
                break;
            default:
        }
        m_VersionString = version;
    }
    
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
     * Retrieves the libraries version.
     *
     * @param major the major version pointer array.
     * @param minor the minor version pointer array.
     * @param revision the revision version pointer array.
     * @since 1.0
     */
    public static void jglmGetVersion(int major[], int minor[], int revision[])
    {
        if (major == null || major.length < 1)
        {
            throw new ArrayIndexOutOfBoundsException("the specified major array is too small, minimum size: 1");
        }
        major[0] = JGLM_VERSION_MAJOR;
        if (minor == null || minor.length < 1)
        {
            throw new ArrayIndexOutOfBoundsException("the specified minor array is too small, minimum size: 1");
        }
        minor[0] = JGLM_VERSION_MINOR;
        if (revision == null || revision.length < 1)
        {
            throw new ArrayIndexOutOfBoundsException("the specified revision array is too small, minimum size: 1");
        }
        revision[0] = JGLM_VERSION_REVISION;
    }
    
    /**
     * @return a compact string representation of the version.
     * @since 1.0
     */
    public static String jglmGetVersionString()
    {
        return m_VersionString;
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
    
    /**
     * Constructs a new mat4x4
     *
     * @param diagonal the diagonal value.
     * @return a new mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4(double diagonal)
    {
        return new mat4x4d(diagonal);
    }
    
    /**
     * Constructs a new mat4x4
     *
     * @param diagonal the diagonal value.
     * @return a new mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4(float diagonal)
    {
        return new mat4x4f(diagonal);
    }
    
    /**
     * Constructs a new orthographic mat4x4
     *
     * @param left the left position of the screen.
     * @param right the right position of the screen.
     * @param bottom the bottom position of the screen.
     * @param top the top the position of the screen.
     * @param near the near plane.
     * @param far the far plane.
     * @return a new orthographic mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4_orthographic(double left, double right, double bottom, double top, double near, double far)
    {
        mat4x4 result = new mat4x4d(1.0);
        double width = right - left;
        double height = top - bottom;
        double depth = far - near;
        
        result.setElement(0, 0, 2.0 / width);
        result.setElement(1, 1, 2.0 / height);
        result.setElement(2, 2,-2.0 / depth);
        
        result.setElement(0, 3, (-right - left) / width);
        result.setElement(1, 3, (-top - bottom) / height);
        result.setElement(2, 3, (-far - near) / depth);
        
        return result;
    }
    
    /**
     * Constructs a new orthographic mat4x4
     *
     * @param left the left position of the screen.
     * @param right the right position of the screen.
     * @param bottom the bottom position of the screen.
     * @param top the top the position of the screen.
     * @param near the near plane.
     * @param far the far plane.
     * @return a new orthographic mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4_orthographic(float left, float right, float bottom, float top, float near, float far)
    {
        mat4x4 result = new mat4x4f(1.0f);
        float width = right - left;
        float height = top - bottom;
        float depth = far - near;
        
        result.setElement(0, 0, 2.0f / width);
        result.setElement(1, 1, 2.0f / height);
        result.setElement(2, 2,-2.0f / depth);
        
        result.setElement(0, 3, (-right - left) / width);
        result.setElement(1, 3, (-top - bottom) / height);
        result.setElement(2, 3, (-far - near) / depth);
        
        return result;
    }
    
    /**
     * Constructs a new perspective mat4x4
     *
     * @param fov the field of view.
     * @param aspectRatio the screen's aspect ratio.
     * @param near the near plane.
     * @param far the far plane.
     * @return a new perspective mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4_perspective(double fov, double aspectRatio, double near, double far)
    {
        mat4x4 result = new mat4x4d(1.0);
        double tanHalfFov = 1.0f / Math.tan(Math.toRadians(0.5 * fov));
        double range = near - far;
    
        result.setElement(0, 0, tanHalfFov / aspectRatio);
        result.setElement(1, 1, tanHalfFov);
        result.setElement(2, 2, (-near - far) / range);
        result.setElement(3, 2, -1.0f);
        result.setElement(2, 3, (2.0f * near * far) / range);
        
        return result;
    }
    
    /**
     * Constructs a new perspective mat4x4
     *
     * @param fov the field of view.
     * @param aspectRatio the screen's aspect ratio.
     * @param near the near plane.
     * @param far the far plane.
     * @return a new perspective mat4x4
     * @since 1.0
     */
    public static mat4x4 mat4x4_perspective(float fov, float aspectRatio, float near, float far)
    {
        mat4x4 result = new mat4x4d(1.0);
        float tanHalfFov = 1.0f / (float) Math.tan(Math.toRadians(0.5f * fov));
        float range = near - far;
    
        result.setElement(0, 0, tanHalfFov / aspectRatio);
        result.setElement(1, 1, tanHalfFov);
        result.setElement(2, 2, (-near - far) / range);
        result.setElement(3, 2, -1.0f);
        result.setElement(2, 3, (2.0f * near * far) / range);
        
        return result;
    }
    
    /**
     * Constructs a new translation mat4x4
     *
     * @param position the vector position.
     * @return a new translation mat4x4
     */
    public static mat4x4 mat4x4_translate(type_vec position)
    {
        mat4x4 result = null;
        if (position instanceof type_vec2)
        {
            type_vec2 pos = (type_vec2) position;
            if (pos instanceof vec2d)
            {
                vec2d p = (vec2d) pos;
                result = new mat4x4d(1.0);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, 0.0f);
            }
            else if (pos instanceof vec2f)
            {
                vec2f p = (vec2f) pos;
                result = new mat4x4f(1.0f);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, 0.0f);
            }
        }
        else if (position instanceof type_vec3)
        {
            type_vec3 pos = (type_vec3) position;
            if (pos instanceof vec3d)
            {
                vec3d p = (vec3d) pos;
                result = new mat4x4d(1.0);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, p.getZ());
            }
            else if (pos instanceof vec3f)
            {
                vec3f p = (vec3f) pos;
                result = new mat4x4f(1.0f);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, p.getZ());
            }
        }
        else if (position instanceof type_vec4)
        {
            type_vec4 pos = (type_vec4) position;
            if (pos instanceof vec4d)
            {
                vec4d p = (vec4d) pos;
                result = new mat4x4d(1.0);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, p.getZ());
            }
            else if (pos instanceof vec4f)
            {
                vec4f p = (vec4f) pos;
                result = new mat4x4f(1.0f);
                result.setElement(0, 3, p.getX());
                result.setElement(1, 3, p.getY());
                result.setElement(2, 3, p.getZ());
            }
        }
        else
        {
            throw new IllegalArgumentException("unknown vector");
        }
        return result;
    }
    
    /**
     * Constructs a new rotation mat4x4
     *
     * @param rotation the vector rotation.
     * @return a new rotation mat4x4
     */
    public static mat4x4 mat4x4_rotate(type_vec rotation)
    {
        mat4x4 result = null;
        if (rotation instanceof type_vec2)
        {
            type_vec2 rot = (type_vec2) rotation;
            if (rot instanceof vec2d)
            {
                vec2d r = (vec2d) rot;
                result = new mat4x4d(1.0);
            }
            else if (rot instanceof vec2f)
            {
                vec2f r = (vec2f) rot;
                result = new mat4x4f(1.0f);
            }
        }
        else if (rotation instanceof type_vec3)
        {
            type_vec3 rot = (type_vec3) rotation;
            if (rot instanceof vec3d)
            {
                vec3d r = (vec3d) rot;
                result = new mat4x4d(1.0);
            }
            else if (rot instanceof vec3f)
            {
                vec3f r = (vec3f) rot;
                result = new mat4x4f(1.0f);
            }
        }
        else if (rotation instanceof type_vec4)
        {
            type_vec4 rot = (type_vec4) rotation;
            if (rot instanceof vec4d)
            {
                vec4d r = (vec4d) rot;
                result = new mat4x4d(1.0);
            }
            else if (rot instanceof vec4f)
            {
                vec4f r = (vec4f) rot;
                result = new mat4x4f(1.0f);
            }
        }
        else
        {
            throw new IllegalArgumentException("unknown vector");
        }
        return result;
    }
    
    /**
     * Constructs a new rotation mat4x4
     *
     * @param axis the vector axis.
     * @return a new rotation mat4x4
     */
    public static mat4x4 mat4x4_rotate(float angle, type_vec axis)
    {
        mat4x4 result = null;
        if (axis instanceof type_vec2)
        {
            type_vec2 ax = (type_vec2) axis;
            if (ax instanceof vec2d)
            {
                vec2d a = (vec2d) ax;
                result = new mat4x4d(1.0);
    
                double rad = Math.toRadians(angle);
                double sin = Math.sin(rad);
                double cos = Math.cos(rad);
                double omc = 1.0 - cos;
            }
            else if (ax instanceof vec2f)
            {
                vec2f a = (vec2f) ax;
                result = new mat4x4f(1.0f);
    
                float rad = (float) Math.toRadians(angle);
                float sin = (float) Math.sin(rad);
                float cos = (float) Math.cos(rad);
                float omc = 1.0f - cos;
            }
        }
        else if (axis instanceof type_vec3)
        {
            type_vec3 ax = (type_vec3) axis;
            if (ax instanceof vec3d)
            {
                vec3d a = (vec3d) ax;
                result = new mat4x4d(1.0);
    
                double rad = Math.toRadians(angle);
                double sin = Math.sin(rad);
                double cos = Math.cos(rad);
                double omc = 1.0 - cos;
            }
            else if (ax instanceof vec3f)
            {
                vec3f a = (vec3f) ax;
                result = new mat4x4f(1.0f);
    
                float rad = (float) Math.toRadians(angle);
                float sin = (float) Math.sin(rad);
                float cos = (float) Math.cos(rad);
                float omc = 1.0f - cos;
            }
        }
        else if (axis instanceof type_vec4)
        {
            type_vec4 ax = (type_vec4) axis;
            if (ax instanceof vec4d)
            {
                vec4d a = (vec4d) ax;
                result = new mat4x4d(1.0);
    
                double rad = Math.toRadians(angle);
                double sin = Math.sin(rad);
                double cos = Math.cos(rad);
                double omc = 1.0 - cos;
            }
            else if (ax instanceof vec4f)
            {
                vec4f a = (vec4f) ax;
                result = new mat4x4f(1.0f);
    
                float rad = (float) Math.toRadians(angle);
                float sin = (float) Math.sin(rad);
                float cos = (float) Math.cos(rad);
                float omc = 1.0f - cos;
            }
        }
        else
        {
            throw new IllegalArgumentException("unknown vector");
        }
        return result;
    }
    
    /**
     * Constructs a new scale mat4x4
     *
     * @param scale the vector position.
     * @return a new scale mat4x4
     */
    public static mat4x4 mat4x4_scale(type_vec scale)
    {
        mat4x4 result = null;
        if (scale instanceof type_vec2)
        {
            type_vec2 scal = (type_vec2) scale;
            if (scal instanceof vec2d)
            {
                vec2d s = (vec2d) scal;
                result = new mat4x4d(1.0);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, 1.0f);
            }
            else if (scal instanceof vec2f)
            {
                vec2f s = (vec2f) scal;
                result = new mat4x4f(1.0f);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, 1.0f);
            }
        }
        else if (scale instanceof type_vec3)
        {
            type_vec3 scal = (type_vec3) scale;
            if (scal instanceof vec3d)
            {
                vec3d s = (vec3d) scal;
                result = new mat4x4d(1.0);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, s.getZ());
            }
            else if (scal instanceof vec3f)
            {
                vec3f s = (vec3f) scal;
                result = new mat4x4f(1.0f);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, s.getZ());
            }
        }
        else if (scale instanceof type_vec4)
        {
            type_vec4 scal = (type_vec4) scale;
            if (scal instanceof vec4d)
            {
                vec4d s = (vec4d) scal;
                result = new mat4x4d(1.0);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, s.getZ());
            }
            else if (scal instanceof vec4f)
            {
                vec4f s = (vec4f) scal;
                result = new mat4x4f(1.0f);
                result.setElement(0, 0, s.getX());
                result.setElement(1, 1, s.getY());
                result.setElement(2, 2, s.getZ());
            }
        }
        else
        {
            throw new IllegalArgumentException("unknown vector");
        }
        return result;
    }
}
