@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardTopBottomFilterPropertyDsl {
    private val cdkBuilder: CfnDashboard.TopBottomFilterProperty.Builder =
        CfnDashboard.TopBottomFilterProperty.builder()

    private val _aggregationSortConfigurations: MutableList<Any> = mutableListOf()

    public fun aggregationSortConfigurations(vararg aggregationSortConfigurations: Any) {
        _aggregationSortConfigurations.addAll(listOf(*aggregationSortConfigurations))
    }

    public fun aggregationSortConfigurations(aggregationSortConfigurations: Collection<Any>) {
        _aggregationSortConfigurations.addAll(aggregationSortConfigurations)
    }

    public fun aggregationSortConfigurations(aggregationSortConfigurations: IResolvable) {
        cdkBuilder.aggregationSortConfigurations(aggregationSortConfigurations)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnDashboard.TopBottomFilterProperty {
        if (_aggregationSortConfigurations.isNotEmpty()) {
            cdkBuilder.aggregationSortConfigurations(_aggregationSortConfigurations)
        }
        return cdkBuilder.build()
    }
}
