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

package eu.mondo.mondix.live;


/**
 * A callback interface for an {@link ILiveViewDirect} to deliver information about query result changes.
 * Similar to {@link IChangeCallback}, but allows a direct access to the indexer's internal tuple representation.
 * 
 * @author Bergmann Gabor
 */
public interface IChangeCallbackDirect<Row> {
	/**
	 * Called upon each elementary change to the live view's results.
	 * @param inserted true if tuple was inserted, false if it was removed
	 * 
	 * <p> WARNING: model MUST NOT be accessed within the callback. 
	 * <p> WARNING: consistency of query results not guaranteed at callback time. 
	 */
	public void changed(ILiveViewDirect<Row> view, boolean inserted, Row changedTuple);

}
