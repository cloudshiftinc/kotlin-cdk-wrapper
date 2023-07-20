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
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEndpointConnectionNotificationPropsDsl {
    private val cdkBuilder: CfnVPCEndpointConnectionNotificationProps.Builder =
        CfnVPCEndpointConnectionNotificationProps.builder()

    private val _connectionEvents: MutableList<String> = mutableListOf()

    public fun connectionEvents(vararg connectionEvents: String) {
        _connectionEvents.addAll(listOf(*connectionEvents))
    }

    public fun connectionEvents(connectionEvents: Collection<String>) {
        _connectionEvents.addAll(connectionEvents)
    }

    public fun connectionNotificationArn(connectionNotificationArn: String) {
        cdkBuilder.connectionNotificationArn(connectionNotificationArn)
    }

    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): CfnVPCEndpointConnectionNotificationProps {
        if (_connectionEvents.isNotEmpty()) cdkBuilder.connectionEvents(_connectionEvents)
        return cdkBuilder.build()
    }
}
