/*******************************************************************************
 * Copyright (c) 2004-2014 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package eu.mondo.mondix.core;

/**
 * Special case of {@link IQueryInstance} where the number of free (unseeded) parameters is known to be 0.
 * 
 * 
 * @author Bergmann Gabor
 *
 */
public interface INullaryQueryInstance<Tuple> extends IQueryInstance<Tuple> {
	
	/**
	 * Core functionality: returns true iff the seed is an instance of the query.
	 */
	public boolean isTrue();

}
