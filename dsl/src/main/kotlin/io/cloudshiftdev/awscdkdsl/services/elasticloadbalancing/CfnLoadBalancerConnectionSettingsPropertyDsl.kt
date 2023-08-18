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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancing

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies the idle timeout value for your Classic Load Balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * ConnectionSettingsProperty connectionSettingsProperty = ConnectionSettingsProperty.builder()
 * .idleTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectionsettings.html)
 */
@CdkDslMarker
public class CfnLoadBalancerConnectionSettingsPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.ConnectionSettingsProperty.Builder =
        CfnLoadBalancer.ConnectionSettingsProperty.builder()

    /**
     * @param idleTimeout The time, in seconds, that the connection is allowed to be idle (no data
     *   has been sent over the connection) before it is closed by the load balancer.
     */
    public fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun build(): CfnLoadBalancer.ConnectionSettingsProperty = cdkBuilder.build()
}
