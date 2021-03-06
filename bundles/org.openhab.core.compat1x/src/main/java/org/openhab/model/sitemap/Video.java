/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
/**
 */
package org.openhab.model.sitemap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhab.model.sitemap.Video#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.model.sitemap.SitemapPackage#getVideo()
 * @model
 * @author Kai Kreuzer - Initial contribution
 */
public interface Video extends NonLinkableWidget {
    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see org.openhab.model.sitemap.SitemapPackage#getVideo_Url()
     * @model
     */
    String getUrl();

    /**
     * Sets the value of the '{@link org.openhab.model.sitemap.Video#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     */
    void setUrl(String value);

} // Video
