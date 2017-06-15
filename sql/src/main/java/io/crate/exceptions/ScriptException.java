/*
 * Licensed to Crate under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Crate licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * However, if you have executed another commercial license agreement
 * with Crate these terms will supersede the license and you may use the
 * software solely pursuant to the terms of the relevant commercial
 * agreement.
 */

package io.crate.exceptions;

import org.elasticsearch.common.inject.internal.Nullable;

import java.util.Locale;

public class ScriptException extends RuntimeException {

    /**
     * Create a new ScriptException
     * @param message A short message what happened, e.g. "evaluation error"
     * @param cause The cause of the exception. A null value is permitted.
     * @param language Scripting engine language, such as "JavaScript"
     */
    public ScriptException(String message, @Nullable  Throwable cause, String language) {
        super(String.format(Locale.ENGLISH, "%s ScriptException: %s", language, message), cause);
    }

    public ScriptException(String message, String language) {
        this(message, null, language);
    }
}