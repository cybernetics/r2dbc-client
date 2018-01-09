/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nebhale.r2dbc;

/**
 * Represents a row returned from a database query.
 */
public interface Row {

    /**
     * Returns the value of a column as an {@link Integer}.
     *
     * @param column the index of the column to return
     * @return the value of a column as an {@link Integer}
     */
    Integer getInteger(int column);

    /**
     * Returns the value of a column as a {@link String}.
     *
     * @param column the index of the column to return
     * @return the value of a column as a {@link String}
     */
    String getString(int column);

}