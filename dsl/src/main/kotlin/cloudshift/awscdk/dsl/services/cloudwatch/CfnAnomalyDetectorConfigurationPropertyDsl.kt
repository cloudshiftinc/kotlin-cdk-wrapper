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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalyDetectorConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.ConfigurationProperty.Builder =
        CfnAnomalyDetector.ConfigurationProperty.builder()

    private val _excludedTimeRanges: MutableList<Any> = mutableListOf()

    public fun excludedTimeRanges(vararg excludedTimeRanges: Any) {
        _excludedTimeRanges.addAll(listOf(*excludedTimeRanges))
    }

    public fun excludedTimeRanges(excludedTimeRanges: Collection<Any>) {
        _excludedTimeRanges.addAll(excludedTimeRanges)
    }

    public fun excludedTimeRanges(excludedTimeRanges: IResolvable) {
        cdkBuilder.excludedTimeRanges(excludedTimeRanges)
    }

    public fun metricTimeZone(metricTimeZone: String) {
        cdkBuilder.metricTimeZone(metricTimeZone)
    }

    public fun build(): CfnAnomalyDetector.ConfigurationProperty {
        if (_excludedTimeRanges.isNotEmpty()) cdkBuilder.excludedTimeRanges(_excludedTimeRanges)
        return cdkBuilder.build()
    }
}
