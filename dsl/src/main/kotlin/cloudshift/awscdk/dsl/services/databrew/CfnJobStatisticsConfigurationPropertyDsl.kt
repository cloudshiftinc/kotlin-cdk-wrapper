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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobStatisticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnJob.StatisticsConfigurationProperty.Builder =
        CfnJob.StatisticsConfigurationProperty.builder()

    private val _includedStatistics: MutableList<String> = mutableListOf()

    private val _overrides: MutableList<Any> = mutableListOf()

    public fun includedStatistics(vararg includedStatistics: String) {
        _includedStatistics.addAll(listOf(*includedStatistics))
    }

    public fun includedStatistics(includedStatistics: Collection<String>) {
        _includedStatistics.addAll(includedStatistics)
    }

    public fun overrides(vararg overrides: Any) {
        _overrides.addAll(listOf(*overrides))
    }

    public fun overrides(overrides: Collection<Any>) {
        _overrides.addAll(overrides)
    }

    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    public fun build(): CfnJob.StatisticsConfigurationProperty {
        if (_includedStatistics.isNotEmpty()) cdkBuilder.includedStatistics(_includedStatistics)
        if (_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
        return cdkBuilder.build()
    }
}
