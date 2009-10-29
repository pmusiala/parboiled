/*
 * Copyright (C) 2009 Mathias Doenitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.parboiled.ast;

import org.parboiled.utils.MutableTreeNodeImpl;

public class MutableAstNodeImpl<T, N extends MutableAstNode<T, N>>
        extends MutableTreeNodeImpl<N>
        implements MutableAstNode<T, N> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

}