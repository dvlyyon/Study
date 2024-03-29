/*
 * This work is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * This work is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a link to the GNU General Public License along with this program; if not, write
 * to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 * 
 * Copyright Model Based Management Technologies, LLC. (c) 2009 - 2011. All rights reserved.
 *
 * This source code is provided "as is" and without warranties as to performance or merchantability.
 * The author and/or distributors of this source code may have made statements about this source code.
 * Any such statements do not constitute warranties and shall not be relied on by the user in deciding
 * whether to use this source code.
 *
 * This source code is provided without any express or implied warranties whatsoever. Because of the
 * diversity of conditions and hardware under which this source code may be used, no warranty of fitness
 * for a particular purpose is offered. The user is advised to test the source code thoroughly before
 * relying on it. The user must assume the entire risk of using the source code.
 */
package org.dvlyyon.net.netconf.transport;

import org.jdom.Element;
import org.jdom.Namespace;


/**
 * The HelloResponseProcessorIf interface defines the API that is invoked by the NETCONF transport client whenever it receives a
 * "hello" message from the device. This happens first, when a connection is established to the device.
 * <p>
 * Classes that implement this interface typically process the "hello" message to establish the device's capabilities.
 * 
 * @author  Subramaniam Aiylam
 * @since   1.6
 */
public interface HelloResponseProcessorIf
{

   /** The XML namespace for device capabilities */
   static Namespace CAPABILITIES_NAMESPACE = Namespace.getNamespace("urn:ietf:params:xml:ns:netconf:base:1.0");


   /**
    * Called when the device sends a hello message (as a response to connection establishment).
    *
    * @param helloMessage        Element representing the device's hello message.
    * @throws RuntimeException   if an error occurred while processing the <hello> message.
    */
   void processHelloResponse(final Element helloMessage) throws RuntimeException;

}