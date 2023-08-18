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
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies a policy for duration-based session stickiness for your Classic Load Balancer.
 *
 * To associate a policy with a listener, use the
 * [PolicyNames](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
 * property for the listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * LBCookieStickinessPolicyProperty lBCookieStickinessPolicyProperty =
 * LBCookieStickinessPolicyProperty.builder()
 * .cookieExpirationPeriod("cookieExpirationPeriod")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html)
 */
@CdkDslMarker
public class CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder =
        CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder()

    /**
     * @param cookieExpirationPeriod The time period, in seconds, after which the cookie should be
     *   considered stale. If this parameter is not specified, the stickiness session lasts for the
     *   duration of the browser session.
     */
    public fun cookieExpirationPeriod(cookieExpirationPeriod: String) {
        cdkBuilder.cookieExpirationPeriod(cookieExpirationPeriod)
    }

    /**
     * @param policyName The name of the policy. This name must be unique within the set of policies
     *   for this load balancer.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnLoadBalancer.LBCookieStickinessPolicyProperty = cdkBuilder.build()
}
