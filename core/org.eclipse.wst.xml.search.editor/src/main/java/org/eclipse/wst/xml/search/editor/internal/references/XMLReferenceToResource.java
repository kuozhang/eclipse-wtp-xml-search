/**
 *  Copyright (c) 2013-2014 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.wst.xml.search.editor.internal.references;

import org.eclipse.core.resources.IResource;
import org.eclipse.wst.xml.search.editor.contentassist.IContentAssistAdditionalProposalInfoProvider;
import org.eclipse.wst.xml.search.editor.references.IReference;
import org.eclipse.wst.xml.search.editor.references.IXMLReferenceToResource;
import org.eclipse.wst.xml.search.editor.searchers.IXMLSearcher;

public class XMLReferenceToResource extends AbstractXMLReferenceTo implements
		IXMLReferenceToResource {

	private final IContentAssistAdditionalProposalInfoProvider<IResource> additionalProposalInfoProvider;

	public XMLReferenceToResource(
			IReference ownerReference,
			String id,
			IXMLSearcher searcher,
			String querySpecificationId,
			String tokenId,
			IContentAssistAdditionalProposalInfoProvider<IResource> additionalProposalInfoProvider) {
		super(ownerReference, id, searcher, querySpecificationId, tokenId);
		this.additionalProposalInfoProvider = additionalProposalInfoProvider;
	}

	public ToType getType() {
		return ToType.RESOURCE;
	}

	public IContentAssistAdditionalProposalInfoProvider<IResource> getAdditionalProposalInfoProvider() {
		return additionalProposalInfoProvider;
	}
}
