/*
 * $Header:  $
 * $Revision:  $
 * $Date:  $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
 
 
package org.apache.commons.logging;

import junit.framework.*;


/**
  *
  * @author Sean C. Sullivan
  * @version $Revision:  $
  * 
  */
public abstract class AbstractLogTest extends TestCase {

    public AbstractLogTest(String testName) {
        super(testName);
    }

    
    public abstract Log getLogObject();

	public void testLoggingWithNullParameters()
	{
		Log log = this.getLogObject();
		
		assertNotNull(log);
		
		log.debug(null);
		
		log.debug(null, null);
		
		log.debug("debug statement");
		
		log.debug("debug statement w/ null exception", new RuntimeException());
		
		log.error(null);
		
		log.error(null, null);
		
		log.error("error statement");
		
		log.error("error statement w/ null exception", new RuntimeException());
		
		log.fatal(null);
		
		log.fatal(null, null);
		
		log.fatal("fatal statement");
		
		log.fatal("fatal statement w/ null exception", new RuntimeException());
		
		log.info(null);
		
		log.info(null, null);
		
		log.info("info statement");
		
		log.info("info statement w/ null exception", new RuntimeException());
		
		log.trace(null);
		
		log.trace(null, null);
		
		log.trace("trace statement");
		
		log.trace("trace statement w/ null exception", new RuntimeException());

		log.warn(null);
		
		log.warn(null, null);
		
		log.warn("warn statement");
		
		log.warn("warn statement w/ null exception", new RuntimeException());
		
	}    
}