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
 * <package>com.snowtech.jglm.types</package>
 * <class>type_vec</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public interface type_vec
{
    /**
     * Sets the current vectors coordinates to the specified vectors coordinates.
     *
     * @param other the other vector to copy the coordinates from.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec set(type_vec other);
    
    /**
     * Adds the specified vectors coordinates to the current vector.
     *
     * @param other the other vector to copy the coordinates from.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec add(type_vec other);
    
    /**
     * Subtracts the specified vectors coordinates from the current vector.
     *
     * @param other the other vector to copy the coordinates from.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec subtract(type_vec other);
    
    /**
     * Multiplies the current vectors coordinates with the specified vectors coordinates.
     *
     * @param other the other vector to copy the coordinates from.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec multiply(type_vec other);
    
    /**
     * Divides the current vectors coordinates by the specified vectors coordinates.
     *
     * @param other the other vector to copy the coordinates from.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec divide(type_vec other);
    
    /**
     * Sets the current vectors coordinates to the specified coordinates.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec set(double value);
    
    /**
     * Adds the specified coordinate to the current vector.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec add(double value);
    
    /**
     * Subtracts the specified coordinate from the current vector.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec subtract(double value);
    
    /**
     * Multiplies the current vectors coordinates with the specified coordinate.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec multiply(double value);
    
    /**
     * Divides the current vectors coordinates by the specified coordinate.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec divide(double value);
    
    /**
     * Sets the current vectors coordinates to the specified coordinates.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec set(float value);
    
    /**
     * Adds the specified coordinate to the current vector.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec add(float value);
    
    /**
     * Subtracts the specified coordinate from the current vector.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec subtract(float value);
    
    /**
     * Multiplies the current vectors coordinates with the specified coordinate.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec multiply(float value);
    
    /**
     * Divides the current vectors coordinates by the specified coordinate.
     *
     * @param value the xyz coordinate.
     * @return the current vector after manipulation
     * @since 1.0
     */
    type_vec divide(float value);
    
    /**
     * Copies the current vectors coordinates.
     *
     * @return a new vector with the current vectors coordinates.
     * @since 1.0
     */
    type_vec copy();
    
    /**
     * Normalizes the current vectors coordinates.
     *
     * @return the current vector with normalized coordinates.
     * @since 1.0
     */
    type_vec normalize();
    
    /**
     * Retrieves a normalized vector of the current vectors coordinates.
     *
     * @return a normalized vector of the current vectors coordinates.
     * @since 1.0
     */
    type_vec normalized();
    
    /**
     * Note: this function retrieves the squared length of the vector.
     *
     * @return the vectors length squared.
     * @since 1.0
     */
    double lengthSquared();
    
    /**
     * @return the vectors length.
     * @since 1.0
     */
    double length();
    
    /**
     * @return the vectors x coordinate.
     * @since 1.0
     */
    double getX();
    
    /**
     * @return the vectors y coordinate.
     * @since 1.0
     */
    double getY();
    
    /**
     * @return a compact string representation of the vector.
     * @since 1.0
     */
    @Override
    String toString();
    
    /**
     * Checks whether the specified vector has corresponding coordinates with the current vector.
     *
     * @param other the other vector.
     * @return true if coordinates match, false if not.
     * @since 1.0
     */
    boolean equals(type_vec other);
    
    
    /**
     * Checks whether the specified object corresponds with the current vector.
     *
     * @param other the other object.
     * @return true if objects match, false if not.
     * @since 1.0
     */
    @Override
    boolean equals(Object other);
}
