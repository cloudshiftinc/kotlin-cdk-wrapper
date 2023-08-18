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
 * Specifies a policy for application-controlled session stickiness for your Classic Load Balancer.
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
 * AppCookieStickinessPolicyProperty appCookieStickinessPolicyProperty =
 * AppCookieStickinessPolicyProperty.builder()
 * .cookieName("cookieName")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html)
 */
@CdkDslMarker
public class CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder =
        CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder()

    /** @param cookieName The name of the application cookie used for stickiness. */
    public fun cookieName(cookieName: String) {
        cdkBuilder.cookieName(cookieName)
    }

    /**
     * @param policyName The mnemonic name for the policy being created. The name must be unique
     *   within a set of policies for this load balancer.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnLoadBalancer.AppCookieStickinessPolicyProperty = cdkBuilder.build()
}
