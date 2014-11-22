/*
 * Copyright (C) 2008 Google Inc.
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

package com.tandong.sa.json;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * A {@link FieldNamingStrategy2} that ensures the JSON field names consist of
 * only lower case letters.
 * 
 * <p>
 * The following is an example:
 * </p>
 * 
 * <pre>
 * class IntWrapper {
 * 	public int integerField = 0;
 * }
 * 
 * LowerCaseNamingPolicy policy = new LowerCaseNamingPolicy();
 * String translatedFieldName = policy.translateName(IntWrapper.class
 * 		.getField(&quot;integerField&quot;));
 * 
 * assert (&quot;integerfield&quot;.equals(translatedFieldName));
 * </pre>
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class LowerCaseNamingPolicy extends RecursiveFieldNamingPolicy {

	@Override
	protected String translateName(String target, Type fieldType,
			Collection<Annotation> annotations) {
		return target.toLowerCase();
	}
}
