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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a load balancer target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisLoadBalancerTargetProperty analysisLoadBalancerTargetProperty =
 * AnalysisLoadBalancerTargetProperty.builder()
 * .address("address")
 * .availabilityZone("availabilityZone")
 * .instance(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder()

    /** @param address The IP address. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param availabilityZone The Availability Zone. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param instance Information about the instance. */
    public fun instance(instance: IResolvable) {
        cdkBuilder.instance(instance)
    }

    /** @param instance Information about the instance. */
    public fun instance(instance: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.instance(instance)
    }

    /** @param port The port on which the target is listening. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty =
        cdkBuilder.build()
}
