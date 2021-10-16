/*
 * (C) Copyright 2017 GADA Technology (http://www.outcome-hub.com/) and others.
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
 *
 * Contributors:
 *     Adam Crow
 *     Byron Aguirre
 */


package life.genny.qwanda.attribute;

import java.io.Serializable;
import java.time.LocalDateTime;

import life.genny.qwanda.datatype.DataType;

/**
 * AttributeDateTime class handles LocalDateTime based attributes.
 * This information adds:
 * <ul>
 * <li>The AnswerTypeDateTime is the Type for the Attribute class
 * </ul>
 * <p>
 * AttributeDateTime represent the major way of specifying the DateTime data type about a target
 * from sources.
 * <p>
 * 
 * 
 * @author      Adam Crow
 * @author      Byron Aguirre
 * @version     %I%, %G%
 * @since       1.0
 */


public class AttributeDateTime extends Attribute implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	  * Constructor.
	  * 
	  * @param none
	  */
	@SuppressWarnings("unused")
	public AttributeDateTime()
	{
		super();
		// dummy for hibernate
	}
	
	/**
	  * Constructor.
	  * 
	  * @param aCode The unique code for this Question
	  * @param aName The human readable summary name
	  */
	public AttributeDateTime(String aCode, String aName)
	{
		super(aCode, aName, new DataType(LocalDateTime.class));
		
	}
	
	
	
}
