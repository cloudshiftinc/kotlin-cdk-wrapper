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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * Column in configured table that can be used in aggregate function in query.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AggregateColumnProperty aggregateColumnProperty = AggregateColumnProperty.builder()
 * .columnNames(List.of("columnNames"))
 * .function("function")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-aggregatecolumn.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAggregateColumnPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.AggregateColumnProperty.Builder =
        CfnConfiguredTable.AggregateColumnProperty.builder()

    private val _columnNames: MutableList<String> = mutableListOf()

    /** @param columnNames Column names in configured table of aggregate columns. */
    public fun columnNames(vararg columnNames: String) {
        _columnNames.addAll(listOf(*columnNames))
    }

    /** @param columnNames Column names in configured table of aggregate columns. */
    public fun columnNames(columnNames: Collection<String>) {
        _columnNames.addAll(columnNames)
    }

    /** @param function Aggregation function that can be applied to aggregate column in query. */
    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun build(): CfnConfiguredTable.AggregateColumnProperty {
        if (_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
        return cdkBuilder.build()
    }
}
