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
 * <class>type_mat4x4</class>
 * <since>1.0</since>
 * </summary>
 *
 * @author Mark Rienstra
 * @since 1.0
 */
public interface type_mat2x2 extends type_mat
{
    @Override
    type_mat2x2 setElement(int column, int row, double value);
    
    @Override
    type_mat2x2 setElement(int column, int row, float value);
    
    @Override
    type_mat2x2 multiply(type_mat other);
    
    @Override
    double getElement(int column, int row, Double pointer);
    
    @Override
    float getElement(int column, int row, Float pointer);
    
    @Override
    double[] getElements(double[] dest);
    
    @Override
    float[] getElements(float[] dest);
    
    /**
     * Creates a copy of the matrix's elements and stores them into a type_vec2.
     *
     * @return a copy of the matrix's elements as type_vec2.
     */
    type_vec2[] getElements();
    
    @Override
    String toString();
    
    @Override
    boolean equals(type_vec other);
    
    @Override
    boolean equals(Object other);
}
