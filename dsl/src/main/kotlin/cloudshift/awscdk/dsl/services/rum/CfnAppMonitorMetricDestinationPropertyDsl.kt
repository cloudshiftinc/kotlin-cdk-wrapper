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

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAppMonitorMetricDestinationPropertyDsl {
    private val cdkBuilder: CfnAppMonitor.MetricDestinationProperty.Builder =
        CfnAppMonitor.MetricDestinationProperty.builder()

    private val _metricDefinitions: MutableList<Any> = mutableListOf()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public fun metricDefinitions(vararg metricDefinitions: Any) {
        _metricDefinitions.addAll(listOf(*metricDefinitions))
    }

    public fun metricDefinitions(metricDefinitions: Collection<Any>) {
        _metricDefinitions.addAll(metricDefinitions)
    }

    public fun metricDefinitions(metricDefinitions: IResolvable) {
        cdkBuilder.metricDefinitions(metricDefinitions)
    }

    public fun build(): CfnAppMonitor.MetricDestinationProperty {
        if (_metricDefinitions.isNotEmpty()) cdkBuilder.metricDefinitions(_metricDefinitions)
        return cdkBuilder.build()
    }
}
