package eu.mondo.mondix.implementation.hashmap;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eu.mondo.mondix.core.IMondixInstance;
import eu.mondo.mondix.core.IMondixView;

/**
 * 
 * Default Mondix relation implementation representing a relation as a Set of Rows.
 *
 * @param <Row> type of a Row in a relation.
 */
public class DefaultMondixRelation<Row extends AbstractRow> extends AbstractRelation {
	
	/**
	 * Rows representing a relation as a Set of Rows.
	 */
	protected Set<Row> rows;
	
	/**
	 * 
	 * @param mondixInstance parent instance
	 * @param name name of the relation
	 * @param columns ordered list of attributes in the relation
	 * @param data the actual relation as a Set of Rows
	 */
	public DefaultMondixRelation(IMondixInstance mondixInstance, String name, List<String> columns, Set<Row> data) {
		super(mondixInstance, name, columns);
		rows = new HashSet<Row>(data);
	}

	@Override
	public IMondixView openView() {
		if (getArity() == 1)
			return new MondixUnaryView<Row>(this, rows);
		else if (getArity() == 0)
			return new MondixNullaryView<Row>(this, rows);
		return new MondixView<Row>(this, rows);
	}

	@Override
	public IMondixView openView(List<String> selectedColumnNames, Map<String, Object> filter) {
		if (selectedColumnNames.size() == 1)
			return new MondixUnaryView<Row>(this, rows, selectedColumnNames, filter);
		else if (selectedColumnNames.size() == 0)
			return new MondixNullaryView<Row>(this, rows, selectedColumnNames, filter);
		return new MondixView<Row>(this, rows, selectedColumnNames, filter);
	}

}
