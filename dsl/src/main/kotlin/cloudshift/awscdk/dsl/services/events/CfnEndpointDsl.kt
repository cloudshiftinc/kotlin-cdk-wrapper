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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint
import software.constructs.Construct

/**
 * A global endpoint used to improve your application's availability by making it regional-fault
 * tolerant.
 *
 * For more information about global endpoints, see
 * [Making applications Regional-fault tolerant with global endpoints and event replication](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-global-endpoints.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
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
public class CfnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

    private val _eventBuses: MutableList<Any> = mutableListOf()

    /**
     * A description for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-description)
     *
     * @param description A description for the endpoint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     *
     * @param eventBuses The event buses being used by the endpoint.
     */
    public fun eventBuses(vararg eventBuses: Any) {
        _eventBuses.addAll(listOf(*eventBuses))
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     *
     * @param eventBuses The event buses being used by the endpoint.
     */
    public fun eventBuses(eventBuses: Collection<Any>) {
        _eventBuses.addAll(eventBuses)
    }

    /**
     * The event buses being used by the endpoint.
     *
     * *Exactly* : `2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-eventbuses)
     *
     * @param eventBuses The event buses being used by the endpoint.
     */
    public fun eventBuses(eventBuses: IResolvable) {
        cdkBuilder.eventBuses(eventBuses)
    }

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-name)
     *
     * @param name The name of the endpoint.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     *
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     */
    public fun replicationConfig(replicationConfig: IResolvable) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    /**
     * Whether event replication was enabled or disabled for this endpoint.
     *
     * The default state is `ENABLED` which means you must supply a `RoleArn` . If you don't have a
     * `RoleArn` or you don't want event replication enabled, set the state to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-replicationconfig)
     *
     * @param replicationConfig Whether event replication was enabled or disabled for this endpoint.
     */
    public fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty) {
        cdkBuilder.replicationConfig(replicationConfig)
    }

    /**
     * The ARN of the role used by event replication for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-rolearn)
     *
     * @param roleArn The ARN of the role used by event replication for the endpoint.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     *
     * @param routingConfig The routing configuration of the endpoint.
     */
    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    /**
     * The routing configuration of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html#cfn-events-endpoint-routingconfig)
     *
     * @param routingConfig The routing configuration of the endpoint.
     */
    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun build(): CfnEndpoint {
        if (_eventBuses.isNotEmpty()) cdkBuilder.eventBuses(_eventBuses)
        return cdkBuilder.build()
    }
}
