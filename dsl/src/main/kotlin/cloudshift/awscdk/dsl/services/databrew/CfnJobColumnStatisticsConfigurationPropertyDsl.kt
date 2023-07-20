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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobColumnStatisticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnJob.ColumnStatisticsConfigurationProperty.Builder =
        CfnJob.ColumnStatisticsConfigurationProperty.builder()

    private val _selectors: MutableList<Any> = mutableListOf()

    public fun selectors(vararg selectors: Any) {
        _selectors.addAll(listOf(*selectors))
    }

    public fun selectors(selectors: Collection<Any>) {
        _selectors.addAll(selectors)
    }

    public fun selectors(selectors: IResolvable) {
        cdkBuilder.selectors(selectors)
    }

    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    public fun statistics(statistics: CfnJob.StatisticsConfigurationProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnJob.ColumnStatisticsConfigurationProperty {
        if (_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
        return cdkBuilder.build()
    }
}
