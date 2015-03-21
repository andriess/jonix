/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tectonica.jonix.codelist.ProductIdentifierTypes;

@SuppressWarnings("serial")
public class ProductIdentifier implements Serializable
{
	public final ProductIdentifierTypes productIDType;
	public final String idTypeName;
	public final String idValue;

	public ProductIdentifier(ProductIdentifierTypes productIDType, String idTypeName, String idValue)
	{
		this.productIDType = productIDType;
		this.idTypeName = idTypeName;
		this.idValue = idValue;
	}

	@Override
	public String toString()
	{
		return String.format("ProductIdentifier [%s/%s]: %s", (productIDType == null) ? null : productIDType.name(), idTypeName, idValue);
	}

	public static List<ProductIdentifier> listFrom(com.tectonica.jonix.onix2.Product product)
	{
		if (product.productIdentifiers != null)
		{
			List<ProductIdentifier> result = new ArrayList<>();
			for (com.tectonica.jonix.onix2.ProductIdentifier i : product.productIdentifiers)
				result.add(new ProductIdentifier(i.getProductIDTypeValue(), i.getIDTypeNameValue(), i.getIDValueValue()));
			return result;
		}
		return Collections.emptyList();
	}
}