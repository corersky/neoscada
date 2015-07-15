/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.world.osgi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Injector Postgres</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.EventInjectorPostgres#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getEventInjectorPostgres()
 * @model
 * @generated
 */
public interface EventInjectorPostgres extends EventInjector
{
    /**
     * Returns the value of the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limit</em>' attribute.
     * @see #setLimit(Integer)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getEventInjectorPostgres_Limit()
     * @model
     * @generated
     */
    Integer getLimit ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.EventInjectorPostgres#getLimit <em>Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit</em>' attribute.
     * @see #getLimit()
     * @generated
     */
    void setLimit ( Integer value );

} // EventInjectorPostgres
