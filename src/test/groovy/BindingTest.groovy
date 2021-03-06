/*
 * Copyright 2003-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovy

class BindingTest extends GroovyTestCase {

    void testProperties() {
        def b = new Binding()
        b.setVariable("foo", 123)
        
        assert b.foo == 123
        
        b.bar = 456
        
        assert b.getVariable("bar") == 456
        assert b["bar"] == 456
        
        b["a.b.c"] = 'abc'
        
        assert b.getVariable("a.b.c") == 'abc'
        assert b["a.b.c"] == 'abc'
    }
}
