@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * Constraint on query output removing output rows that do not meet a minimum number of distinct
 * values of a specified column.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AggregationConstraintProperty aggregationConstraintProperty =
 * AggregationConstraintProperty.builder()
 * .columnName("columnName")
 * .minimum(123)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregationconstraint.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAggregationConstraintPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.AggregationConstraintProperty.Builder =
        CfnConfiguredTable.AggregationConstraintProperty.builder()

    /**
     * @param columnName Column in aggregation constraint for which there must be a minimum number
     *   of distinct values in an output row for it to be in the query output.
     */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /**
     * @param minimum The minimum number of distinct values that an output row must be an
     *   aggregation of. Minimum threshold of distinct values for a specified column that must exist
     *   in an output row for it to be in the query output.
     */
    public fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
    }

    /**
     * @param type The type of aggregation the constraint allows. The only valid value is currently
     *   `COUNT_DISTINCT`.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnConfiguredTable.AggregationConstraintProperty = cdkBuilder.build()
}
