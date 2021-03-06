/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.security.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.scada.configuration.security.CA;
import org.eclipse.scada.configuration.security.Configuration;
import org.eclipse.scada.configuration.security.GenericScript;
import org.eclipse.scada.configuration.security.JavaScript;
import org.eclipse.scada.configuration.security.LogonRule;
import org.eclipse.scada.configuration.security.Rule;
import org.eclipse.scada.configuration.security.Rules;
import org.eclipse.scada.configuration.security.Script;
import org.eclipse.scada.configuration.security.ScriptRule;
import org.eclipse.scada.configuration.security.SecurityPackage;
import org.eclipse.scada.configuration.security.SignatureRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.scada.configuration.security.SecurityPackage
 * @generated
 */
public class SecuritySwitch<T> extends Switch<T>
{
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SecurityPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecuritySwitch ()
    {
        if ( modelPackage == null )
        {
            modelPackage = SecurityPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor ( EPackage ePackage )
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch ( int classifierID, EObject theEObject )
    {
        switch ( classifierID )
        {
            case SecurityPackage.RULE:
            {
                Rule rule = (Rule)theEObject;
                T result = caseRule ( rule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SCRIPT_RULE:
            {
                ScriptRule scriptRule = (ScriptRule)theEObject;
                T result = caseScriptRule ( scriptRule );
                if ( result == null )
                    result = caseRule ( scriptRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.LOGON_RULE:
            {
                LogonRule logonRule = (LogonRule)theEObject;
                T result = caseLogonRule ( logonRule );
                if ( result == null )
                    result = caseRule ( logonRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SIGNATURE_RULE:
            {
                SignatureRule signatureRule = (SignatureRule)theEObject;
                T result = caseSignatureRule ( signatureRule );
                if ( result == null )
                    result = caseRule ( signatureRule );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.SCRIPT:
            {
                Script script = (Script)theEObject;
                T result = caseScript ( script );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.JAVA_SCRIPT:
            {
                JavaScript javaScript = (JavaScript)theEObject;
                T result = caseJavaScript ( javaScript );
                if ( result == null )
                    result = caseScript ( javaScript );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.GENERIC_SCRIPT:
            {
                GenericScript genericScript = (GenericScript)theEObject;
                T result = caseGenericScript ( genericScript );
                if ( result == null )
                    result = caseScript ( genericScript );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.CONFIGURATION:
            {
                Configuration configuration = (Configuration)theEObject;
                T result = caseConfiguration ( configuration );
                if ( result == null )
                    result = caseRules ( configuration );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.RULES:
            {
                Rules rules = (Rules)theEObject;
                T result = caseRules ( rules );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            case SecurityPackage.CA:
            {
                CA ca = (CA)theEObject;
                T result = caseCA ( ca );
                if ( result == null )
                    result = defaultCase ( theEObject );
                return result;
            }
            default:
                return defaultCase ( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRule ( Rule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptRule ( ScriptRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logon Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logon Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogonRule ( LogonRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signature Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signature Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignatureRule ( SignatureRule object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScript ( Script object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaScript ( JavaScript object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericScript ( GenericScript object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfiguration ( Configuration object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRules ( Rules object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CA</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCA ( CA object )
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase ( EObject object )
    {
        return null;
    }

} //SecuritySwitch
