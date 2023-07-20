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
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogResourceType
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FlowLogDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FlowLog.Builder = FlowLog.Builder.create(scope, id)

    private val _logFormat: MutableList<LogFormat> = mutableListOf()

    public fun destination(destination: FlowLogDestination) {
        cdkBuilder.destination(destination)
    }

    public fun flowLogName(flowLogName: String) {
        cdkBuilder.flowLogName(flowLogName)
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

    public fun resourceType(resourceType: FlowLogResourceType) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun trafficType(trafficType: FlowLogTrafficType) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): FlowLog {
        if (_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
        return cdkBuilder.build()
    }
}
