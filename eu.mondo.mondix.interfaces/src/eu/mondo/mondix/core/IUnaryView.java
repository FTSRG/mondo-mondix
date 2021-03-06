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
 * Special case of {@link IMondixView} where the number of selected columns is known to be 1.
 * 
 * 
 * @author Bergmann Gabor
 *
 */
public interface IUnaryView extends IMondixView {
	
	/**
	 * Core functionality: returns all values of the single selected column of this (filtered) mondix view.
	 */
	public Iterable<? extends Object> getValues();

}
