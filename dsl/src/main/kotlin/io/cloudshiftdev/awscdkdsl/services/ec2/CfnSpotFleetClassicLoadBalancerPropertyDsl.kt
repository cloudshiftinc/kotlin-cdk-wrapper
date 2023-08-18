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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Specifies a Classic Load Balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClassicLoadBalancerProperty classicLoadBalancerProperty = ClassicLoadBalancerProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html)
 */
@CdkDslMarker
public class CfnSpotFleetClassicLoadBalancerPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.ClassicLoadBalancerProperty.Builder =
        CfnSpotFleet.ClassicLoadBalancerProperty.builder()

    /** @param name The name of the load balancer. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSpotFleet.ClassicLoadBalancerProperty = cdkBuilder.build()
}
