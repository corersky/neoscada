/*******************************************************************************
 * Copyright (c) 2011, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.ae.ui.views.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.scada.ae.ui.views.Activator;

public class PreferenceInitializer extends AbstractPreferenceInitializer
{
    @Override
    public void initializeDefaultPreferences ()
    {
        final IPreferenceStore store = Activator.getDefault ().getPreferenceStore ();
        store.setDefault ( PreferenceConstants.BELL_ACTIVATED_KEY, true );
        store.setDefault ( PreferenceConstants.NUMBER_OF_EVENTS_KEY, 0 );
        store.setDefault ( PreferenceConstants.CUT_LIST_ALL_SECONDS_KEY, 10 * 60 );
    }
}
