/*   Copyright (C) 2013-2014 Computer Sciences Corporation
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
 * limitations under the License. */

package ezbake.discovery.servicediscovery;

import com.google.common.annotations.Beta;
/**
 * An exception thrown during service discovery.
 *
 * Typically wraps a communication error in the underlying implementation.
 */
@Beta
public class DiscoveryException extends Exception {
    public DiscoveryException(Throwable t) {
        super(t);
    }
}
