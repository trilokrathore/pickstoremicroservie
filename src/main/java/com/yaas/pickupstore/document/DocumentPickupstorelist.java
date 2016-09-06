package com.yaas.pickupstore.document;

import com.yaas.pickupstore.api.generated.Pickupstore;

public class DocumentPickupstorelist {

	private Pickupstore pickupstore;

	private DocumentMetaData metadata;

	public DocumentMetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(final DocumentMetaData metadata) {
		this.metadata = metadata;
	}

	public Pickupstore getPickupstore() {
		return pickupstore;
	}

	public void setPickupstore(Pickupstore pickupstore) {
		this.pickupstore = pickupstore;
	}

	
}
