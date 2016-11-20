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
package com.snowtech.jglm.types;

/**
 * <summary>
 * <project>JGLM</project>
 * <package>com.snowtech.jglm.detail</package>
 * <class>type_vec2</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public interface type_vec4 extends type_vec
{
    @Override
    type_vec4 set(type_vec other);
    
    @Override
    type_vec4 add(type_vec other);
    
    @Override
    type_vec4 subtract(type_vec other);
    
    @Override
    type_vec4 multiply(type_vec other);
    
    @Override
    type_vec4 divide(type_vec other);
    
    /**
     * Sets the current vectors coordinates to the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 set(double x, double y, double z, double w);
    
    /**
     * Adds the specified coordinates to the current vector.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 add(double x, double y, double z, double w);
    
    /**
     * Subtracts the specified coordinates from the current vector.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 subtract(double x, double y, double z, double w);
    
    /**
     * Multiplies the current vectors coordinates with the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 multiply(double x, double y, double z, double w);
    
    /**
     * Divides the current vectors coordinates by the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 divide(double x, double y, double z, double w);
    
    /**
     * Sets the current vectors coordinates to the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 set(float x, float y, float z, float w);
    
    /**
     * Adds the specified coordinates to the current vector.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 add(float x, float y, float z, float w);
    
    /**
     * Subtracts the specified coordinates from the current vector.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 subtract(float x, float y, float z, float w);
    
    /**
     * Multiplies the current vectors coordinates with the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 multiply(float x, float y, float z, float w);
    
    /**
     * Divides the current vectors coordinates by the specified coordinates.
     *
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @param w the w coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec4 divide(float x, float y, float z, float w);
    
    @Override
    type_vec4 set(double value);
    
    @Override
    type_vec4 add(double value);
    
    @Override
    type_vec4 subtract(double value);
    
    @Override
    type_vec4 multiply(double value);
    
    @Override
    type_vec4 divide(double value);
    
    @Override
    type_vec4 set(float value);
    
    @Override
    type_vec4 add(float value);
    
    @Override
    type_vec4 subtract(float value);
    
    @Override
    type_vec4 multiply(float value);
    
    @Override
    type_vec4 divide(float value);
    
    @Override
    type_vec4 copy();
    
    @Override
    type_vec4 normalize();
    
    @Override
    type_vec4 normalized();
    
    @Override
    double lengthSquared();
    
    @Override
    double length();
    
    @Override
    double getX();
    
    @Override
    double getY();
    
    /**
     * @return the vectors z coordinate.
     * @since 1.0
     */
    double getZ();
    
    /**
     * @return the vectors w coordinate.
     * @since 1.0
     */
    double getW();
    
    @Override
    String toString();
    
    @Override
    boolean equals(type_vec other);
    
    @Override
    boolean equals(Object other);
}
