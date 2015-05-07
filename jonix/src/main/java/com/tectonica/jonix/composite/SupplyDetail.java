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

import com.tectonica.jonix.codelist.AvailabilityStatuss;
import com.tectonica.jonix.codelist.SupplierRoles;

@SuppressWarnings("serial")
public class SupplyDetail implements Serializable
{
	public final SupplierRoles supplierRole;
	public final String supplierName;
	public final AvailabilityStatuss availability;
	public final List<Price> prices;

	public SupplyDetail(SupplierRoles supplierRole, String supplierName, AvailabilityStatuss availability,
			List<Price> prices)
	{
		this.supplierRole = supplierRole;
		this.supplierName = supplierName;
		this.availability = availability;
		this.prices = prices;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (Price price : prices)
			sb.append("\n    > ").append(price.toString());
		String supplierRoleStr = (supplierRole == null) ? null : supplierRole.name();
		String availabilityStr = (availability == null) ? null : availability.name();
		return String.format("SupplyDetail [%s]: %s (%s) %s", supplierRoleStr, supplierName, availabilityStr,
				sb.toString());
	}

	public static List<SupplyDetail> listFrom(com.tectonica.jonix.onix2.Product product)
	{
		if (product.supplyDetails != null)
		{
			List<SupplyDetail> result = new ArrayList<>();
			for (com.tectonica.jonix.onix2.SupplyDetail i : product.supplyDetails)
				result.add(new SupplyDetail(i.getSupplierRoleValue(), i.getSupplierNameValue(), i
						.getAvailabilityCodeValue(), Price.listFrom(i)));
			return result;
		}
		return Collections.emptyList();
	}
}