/*******************************************************************************
 * Copyright (c) 2004, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.core.commands;

import org.eclipse.core.commands.common.CommandException;

/**
 * Signals that an exception occurred while serializing a
 * {@link ParameterizedCommand} to a string or deserializing a String to a
 * {@link ParameterizedCommand}.
 * <p>
 * This class is not intended to be extended by clients.
 * </p>
 *
 * @since 3.2
 */
public final class SerializationException extends CommandException {

	/**
	 * Generated serial version UID for this class.
	 */
	private static final long serialVersionUID = 2691599674561684949L;

	/**
	 * Creates a new instance of this class with the specified detail message.
	 *
	 * @param message
	 *            the detail message; may be <code>null</code>.
	 */
	public SerializationException(final String message) {
		super(message);
	}

	/**
	 * Creates a new instance of this class with the specified detail message
	 * and cause.
	 *
	 * @param message
	 *            the detail message; may be <code>null</code>.
	 * @param cause
	 *            the cause; may be <code>null</code>.
	 */
	public SerializationException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
