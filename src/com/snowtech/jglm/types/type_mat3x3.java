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
public interface type_mat3x3 extends type_mat
{
    @Override
    type_mat3x3 loadIdentity();
    
    @Override
    type_mat3x3 setElement(int row, int column, double value);
    
    @Override
    type_mat3x3 setElement(int row, int column, float value);
    
    @Override
    type_mat3x3 multiply(type_mat other);
    
    @Override
    double getElement(int row, int column, Double pointer);
    
    @Override
    float getElement(int row, int column, Float pointer);
    
    @Override
    double[] getElements(double[] dest);
    
    @Override
    float[] getElements(float[] dest);
    
    @Override
    type_vec3[] getElements();
    
    @Override
    String toString();
    
    @Override
    boolean equals(type_mat other);
    
    @Override
    boolean equals(Object other);
}
