/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.extensions;

import java.util.Collections;
import java.util.List;

import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.export.GenericElementHandlerBundle;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: HtmlElementExtensionsRegistryFactory.java 6270 2013-06-17 11:37:52Z teodord $
 */
public class HtmlElementExtensionsRegistryFactory implements ExtensionsRegistryFactory
{
	private static final ExtensionsRegistry defaultExtensionsRegistry = 
		new ExtensionsRegistry()
		{
			@SuppressWarnings("unchecked")
			public <T> List<T> getExtensions(Class<T> extensionType) 
			{
				if (GenericElementHandlerBundle.class.equals(extensionType))
				{
					return Collections.singletonList((T)HtmlElementHandlerBundle.getInstance());
				}
				return null;
			}
		};
	
	public ExtensionsRegistry createRegistry(String registryId, JRPropertiesMap properties) 
	{
		return defaultExtensionsRegistry;
	}
}