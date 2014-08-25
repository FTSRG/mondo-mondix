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
 * A Mondix indexer that publishes a number of base relations ({@link IMondixRelation}).
 * 
 * <p> A catalog relation is also published for reflectively querying the set of published relations.
 * 
 * @author Bergmann Gabor
 */
public interface IMondixInstance {
	
	/**
	 * Retrieves the mondix base relation of the specified name.
	 * @param relationName the name of the relation to return
	 * @return the single relation whose name is the given string, or null if none exists
	 */
	public IMondixRelation getBaseRelationByName(String relationName);
	
	/**
	 * Returns the catalog relation that lists all relations published by this mondix instance.
	 * 
	 * <p> The catalog relation is guaranteed to: <ul>
	 * <li> contain a column called "name" that indicates the names of each published relation (including the catalog itself)
	 * <li> have the empty string as name 
	 * </ul>
	 * 
	 * <p> Equivalent to calling {@link #getBaseRelationByName(String)} with an empty string parameter
	 * 
	 */
	public IMondixRelation getCatalogRelation();
	
	/**
	 * Returns a query into the catalog relation that lists the names of all relations published by this mondix instance.
	 * <p> Equivalent to calling {@link #getCatalogRelation()} and opening a query instance that selects the column "name" only.
	 * 
	 */
	public IUnaryQueryInstance getPublishedRelationNames();	

}