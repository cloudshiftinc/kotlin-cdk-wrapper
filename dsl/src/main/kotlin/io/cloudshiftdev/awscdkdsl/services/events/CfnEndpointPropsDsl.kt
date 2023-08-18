@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEndpointProps

/**
 * Properties for defining a `CfnEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
 * .eventBuses(List.of(EndpointEventBusProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build()))
 * .routingConfig(RoutingConfigProperty.builder()
 * .failoverConfig(FailoverConfigProperty.builder()
 * .primary(PrimaryProperty.builder()
 * .healthCheck("healthCheck")
 * .build())
 * .secondary(SecondaryProperty.builder()
 * .route("route")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .replicationConfig(ReplicationConfigProperty.builder()
 * .state("state")
 * .build())
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html)
 */
@CdkDslMarker
public class CfnEndpointPropsDsl {
    private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

    private val _eventBuses: MutableList<Any> = mutableListOf()

    /** @param description A description for the endpoint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventBuses The event buses being used by the endpoint. *Exactly* : `2` */
    public fun eventBuses(vararg eventBuses: Any) {
        _eventBuses.addAll(listOf(*eventBuses))
    }

    /** @param eventBuses The event buses being used by the endpoint. *Exactly* : `2` */
    public fun eventBuses(eventBuses: Collection<Any>) {
        _eventBuses.addAll(eventBuses)
    }

    /** @param eventBuses The event buses being used by the endpoint. *Exactly* : `2` */
    public fun eventBuses(eventBuses: IResolvable) {
        cdkBuilder.eventBuses(eventBuses)
    }

    /** @param name The name of the endpoint. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     *   The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have
     *   a `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    public fun replicationConfig(replicationConfig: IResolvable) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    /**
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     *   The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have
     *   a `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     */
    public fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    /** @param roleArn The ARN of the role used by event replication for the endpoint. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param routingConfig The routing configuration of the endpoint. */
    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    /** @param routingConfig The routing configuration of the endpoint. */
    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun build(): CfnEndpointProps {
        if (_eventBuses.isNotEmpty()) cdkBuilder.eventBuses(_eventBuses)
        return cdkBuilder.build()
    }
}
