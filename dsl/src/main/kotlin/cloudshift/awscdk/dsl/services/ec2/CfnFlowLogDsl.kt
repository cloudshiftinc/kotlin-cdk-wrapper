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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlowLogDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowLog.Builder = CfnFlowLog.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun deliverLogsPermissionArn(deliverLogsPermissionArn: String) {
        cdkBuilder.deliverLogsPermissionArn(deliverLogsPermissionArn)
    }

    public fun destinationOptions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.destinationOptions(builder.map)
    }

    public fun destinationOptions(destinationOptions: Any) {
        cdkBuilder.destinationOptions(destinationOptions)
    }

    public fun logDestination(logDestination: String) {
        cdkBuilder.logDestination(logDestination)
    }

    public fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
    }

    public fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun maxAggregationInterval(maxAggregationInterval: Number) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun trafficType(trafficType: String) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): CfnFlowLog {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
