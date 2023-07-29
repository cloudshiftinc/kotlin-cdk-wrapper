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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint

/**
 * The routing configuration of the endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
 * .failoverConfig(FailoverConfigProperty.builder()
 * .primary(PrimaryProperty.builder()
 * .healthCheck("healthCheck")
 * .build())
 * .secondary(SecondaryProperty.builder()
 * .route("route")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-routingconfig.html)
 */
@CdkDslMarker
public class CfnEndpointRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.RoutingConfigProperty.Builder =
        CfnEndpoint.RoutingConfigProperty.builder()

    /**
     * @param failoverConfig The failover configuration for an endpoint. This includes what triggers
     *   failover and what happens when it's triggered.
     */
    public fun failoverConfig(failoverConfig: IResolvable) {
        cdkBuilder.failoverConfig(failoverConfig)
    }

    /**
     * @param failoverConfig The failover configuration for an endpoint. This includes what triggers
     *   failover and what happens when it's triggered.
     */
    public fun failoverConfig(failoverConfig: CfnEndpoint.FailoverConfigProperty) {
        cdkBuilder.failoverConfig(failoverConfig)
    }

    public fun build(): CfnEndpoint.RoutingConfigProperty = cdkBuilder.build()
}
