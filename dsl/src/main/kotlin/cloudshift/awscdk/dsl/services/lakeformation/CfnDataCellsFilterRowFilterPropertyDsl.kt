@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * A PartiQL predicate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object allRowsWildcard;
 * RowFilterProperty rowFilterProperty = RowFilterProperty.builder()
 * .allRowsWildcard(allRowsWildcard)
 * .filterExpression("filterExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html)
 */
@CdkDslMarker
public class CfnDataCellsFilterRowFilterPropertyDsl {
    private val cdkBuilder: CfnDataCellsFilter.RowFilterProperty.Builder =
        CfnDataCellsFilter.RowFilterProperty.builder()

    /**
     * @param allRowsWildcard A wildcard for all rows.
     */
    public fun allRowsWildcard(allRowsWildcard: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(allRowsWildcard)
        cdkBuilder.allRowsWildcard(builder.map)
    }

    /**
     * @param allRowsWildcard A wildcard for all rows.
     */
    public fun allRowsWildcard(allRowsWildcard: Any) {
        cdkBuilder.allRowsWildcard(allRowsWildcard)
    }

    /**
     * @param filterExpression A filter expression.
     */
    public fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
    }

    public fun build(): CfnDataCellsFilter.RowFilterProperty = cdkBuilder.build()
}
