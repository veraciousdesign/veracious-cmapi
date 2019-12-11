package de.artality.cmapi.responses;

import java.util.List;

import de.artality.cmapi.entities.ExpansionEntity;
import de.artality.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /games/:idGame/expansions endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Expansions
 */
public class ExpansionsResponse extends AbstractResponseImpl<List<ExpansionEntity>> {

	public List<ExpansionEntity> getExpansion() {
		return getData();
	}

	public void setExpansion(List<ExpansionEntity> expansion) {
		setData(expansion);
	}

}
