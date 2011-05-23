/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.parsers.creole.ast.link;

import com.liferay.portal.parsers.creole.ast.ASTNode;
import com.liferay.portal.parsers.creole.ast.CollectionNode;
import com.liferay.portal.parsers.creole.visitor.ASTVisitor;

/**
 * @author Miguel Pastor
 */
public class LinkNode extends ASTNode {

	public LinkNode() {
	}

	public LinkNode(int token) {
		super(token);
	}

	public LinkNode(int token, String link) {
		this(token);

		_link = link;
	}

	public LinkNode(String link) {
		_link = link;
	}

	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public CollectionNode getAltCollectionNode() {
		return _altCollectionNode;
	}

	public String getLink() {
		return _link;
	}

	public boolean hasAltCollectionNode() {
		if (_altCollectionNode != null) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setAltCollectionNode(CollectionNode altCollectionNode) {
		_altCollectionNode = altCollectionNode;
	}

	public void setLink(String link) {
		_link = link;
	}

	private CollectionNode _altCollectionNode;
	private String _link;

}