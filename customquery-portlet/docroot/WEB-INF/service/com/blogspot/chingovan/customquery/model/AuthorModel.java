/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.customquery.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Author service. Represents a row in the &quot;ExampleBlog_Author&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.blogspot.chingovan.customquery.model.impl.AuthorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.blogspot.chingovan.customquery.model.impl.AuthorImpl}.
 * </p>
 *
 * @author chinv
 * @see Author
 * @see com.blogspot.chingovan.customquery.model.impl.AuthorImpl
 * @see com.blogspot.chingovan.customquery.model.impl.AuthorModelImpl
 * @generated
 */
public interface AuthorModel extends BaseModel<Author> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a author model instance should use the {@link Author} interface instead.
	 */

	/**
	 * Returns the primary key of this author.
	 *
	 * @return the primary key of this author
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this author.
	 *
	 * @param primaryKey the primary key of this author
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the author ID of this author.
	 *
	 * @return the author ID of this author
	 */
	public long getAuthorId();

	/**
	 * Sets the author ID of this author.
	 *
	 * @param authorId the author ID of this author
	 */
	public void setAuthorId(long authorId);

	/**
	 * Returns the name of this author.
	 *
	 * @return the name of this author
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this author.
	 *
	 * @param name the name of this author
	 */
	public void setName(String name);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Author author);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Author> toCacheModel();

	@Override
	public Author toEscapedModel();

	@Override
	public Author toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}