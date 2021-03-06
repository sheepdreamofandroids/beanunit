/*
 * Copyright 2011 Ivo Woltring
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

package immutable;

/**
 * @author Ivo Woltring
 */
public class Employee extends Person {
    private final String id;

    public Employee(final String name, final String id) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Employee");
        sb.append("{id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
