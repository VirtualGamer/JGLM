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
 * <class>type_mat</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public interface type_mat
{
    /**
     * Loads the identity matrix's elements into the current matrix's elements.
     *
     * @return the current matrix after manipulation
     * @since 1.0
     */
    type_mat loadIdentity();
    
    /**
     * Sets the current matrix's element at the specified position to the specified element value.
     *
     * @param row the row position.
     * @param column the column position.
     * @param value the element's new value.
     * @return the current matrix after manipulation
     * @since 1.0
     */
    type_mat setElement(int row, int column, double value);
    
    /**
     * Sets the current matrix's element at the specified position to the specified element value.
     *
     * @param row the row position.
     * @param column the column position.
     * @param value the element's new value.
     * @return the current matrix after manipulation
     * @since 1.0
     */
    type_mat setElement(int row, int column, float value);
    
    /**
     * Multiplies the current matrix's elements with the specified matrix's elements.
     *
     * @param other the other matrix to copy the elements from.
     * @return the current matrix after manipulation
     * @since 1.0
     */
    type_mat multiply(type_mat other);
    
    /**
     * Creates a copy of the matrix's element at the specified position and stores it into the specified pointer.
     *
     * @param column the column position.
     * @param row the row position.
     * @param pointer the destination pointer.
     * @return a copy of the matrix's element at the specified position.
     * @since 1.0
     */
    double getElement(int row, int column, Double pointer);
    
    /**
     * Creates a copy of the matrix's element at the specified position and stores it into the specified pointer.
     *
     * @param column the column position.
     * @param row the row position.
     * @param pointer the destination pointer.
     * @return a copy of the matrix's element at the specified position.
     * @since 1.0
     */
    float getElement(int row, int column, Float pointer);
    
    /**
     * Creates a copy of the matrix's elements and stores them into the specified array.
     *
     * @param dest the destination array.
     * @return a copy of the matrix's elements.
     * @since 1.0
     */
    double[] getElements(double[] dest);
    
    /**
     * Creates a copy of the matrix's elements and stores them into the specified array.
     *
     * @param dest the destination array.
     * @return a copy of the matrix's elements.
     * @since 1.0
     */
    float[] getElements(float[] dest);
    
    /**
     * Creates a copy of the matrix's elements and stores them into a type_vec array.
     *
     * @return a copy of the matrix's elements as type_vec array.
     * @since 1.0
     */
    type_vec[] getElements();
    
    /**
     * @return a compact string representation of the matrix.
     * @since 1.0
     */
    @Override
    String toString();
    
    /**
     * Checks whether the specified matrix has corresponding elements with the current matrix.
     *
     * @param other the other matrix.
     * @return true if elements match, false if not.
     * @since 1.0
     */
    boolean equals(type_mat other);
    
    /**
     * Checks whether the specified object corresponds with the current matrix.
     *
     * @param other the other object.
     * @return true if objects match, false if not.
     * @since 1.0
     */
    @Override
    boolean equals(Object other);
}
