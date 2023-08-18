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
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a load balancer listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisLoadBalancerListenerProperty analysisLoadBalancerListenerProperty =
 * AnalysisLoadBalancerListenerProperty.builder()
 * .instancePort(123)
 * .loadBalancerPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisLoadBalancerListenerPropertyDsl {
    private val cdkBuilder:
        CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.builder()

    /** @param instancePort [Classic Load Balancers] The back-end port for the listener. */
    public fun instancePort(instancePort: Number) {
        cdkBuilder.instancePort(instancePort)
    }

    /** @param loadBalancerPort The port on which the load balancer is listening. */
    public fun loadBalancerPort(loadBalancerPort: Number) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty =
        cdkBuilder.build()
}
