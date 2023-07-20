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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEndpointProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointPropsDsl {
    private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

    private val _eventBuses: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventBuses(vararg eventBuses: Any) {
        _eventBuses.addAll(listOf(*eventBuses))
    }

    public fun eventBuses(eventBuses: Collection<Any>) {
        _eventBuses.addAll(eventBuses)
    }

    public fun eventBuses(eventBuses: IResolvable) {
        cdkBuilder.eventBuses(eventBuses)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun replicationConfig(replicationConfig: IResolvable) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    public fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun build(): CfnEndpointProps {
        if (_eventBuses.isNotEmpty()) cdkBuilder.eventBuses(_eventBuses)
        return cdkBuilder.build()
    }
}
