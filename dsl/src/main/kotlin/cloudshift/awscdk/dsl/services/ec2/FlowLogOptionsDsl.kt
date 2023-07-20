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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogOptions
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FlowLogOptionsDsl {
    private val cdkBuilder: FlowLogOptions.Builder = FlowLogOptions.builder()

    private val _logFormat: MutableList<LogFormat> = mutableListOf()

    public fun destination(destination: FlowLogDestination) {
        cdkBuilder.destination(destination)
    }

    public fun logFormat(vararg logFormat: LogFormat) {
        _logFormat.addAll(listOf(*logFormat))
    }

    public fun logFormat(logFormat: Collection<LogFormat>) {
        _logFormat.addAll(logFormat)
    }

    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    public fun trafficType(trafficType: FlowLogTrafficType) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): FlowLogOptions {
        if (_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
        return cdkBuilder.build()
    }
}
