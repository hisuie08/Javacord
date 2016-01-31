/*
 * Copyright (C) 2016 Bastian Oppermann
 * 
 * This file is part of Javacord.
 * 
 * Javacord is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser general Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Javacord is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */
package de.btobastian.javacord.listener;

/**
 * This listener informs you whether your connection failed or succeeded.
 *
 * You must use it if you want to connection non-blocking.
 */
public interface ReadyListener extends Listener {

    /**
     * Called when the connection is ready.
     *
     * Discord sends a packet telling us the connection is ready for use.
     * This method is called when the packed was received.
     */
    public void onReady();

    /**
     * Called when the connection failed.
     *
     * This could have several reasons, e.g. a wrong password.
     *
     * @param exception The error which caused the connection to fail.
     */
    public void onFail(Exception exception);

}
