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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelCardMetricGroupPropertyDsl {
    private val cdkBuilder: CfnModelCard.MetricGroupProperty.Builder =
        CfnModelCard.MetricGroupProperty.builder()

    private val _metricData: MutableList<Any> = mutableListOf()

    public fun metricData(vararg metricData: Any) {
        _metricData.addAll(listOf(*metricData))
    }

    public fun metricData(metricData: Collection<Any>) {
        _metricData.addAll(metricData)
    }

    public fun metricData(metricData: IResolvable) {
        cdkBuilder.metricData(metricData)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnModelCard.MetricGroupProperty {
        if (_metricData.isNotEmpty()) cdkBuilder.metricData(_metricData)
        return cdkBuilder.build()
    }
}
