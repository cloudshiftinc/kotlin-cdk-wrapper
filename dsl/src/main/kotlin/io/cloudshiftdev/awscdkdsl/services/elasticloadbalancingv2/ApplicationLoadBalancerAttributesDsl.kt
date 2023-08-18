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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes

/**
 * Properties to reference an existing load balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc;
 * ApplicationLoadBalancerAttributes applicationLoadBalancerAttributes =
 * ApplicationLoadBalancerAttributes.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .securityGroupId("securityGroupId")
 * // the properties below are optional
 * .loadBalancerCanonicalHostedZoneId("loadBalancerCanonicalHostedZoneId")
 * .loadBalancerDnsName("loadBalancerDnsName")
 * .securityGroupAllowsAllOutbound(false)
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerAttributesDsl {
    private val cdkBuilder: ApplicationLoadBalancerAttributes.Builder =
        ApplicationLoadBalancerAttributes.builder()

    /** @param loadBalancerArn ARN of the load balancer. */
    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load balancer.
     */
    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
        cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    /** @param loadBalancerDnsName The DNS name of this load balancer. */
    public fun loadBalancerDnsName(loadBalancerDnsName: String) {
        cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    /**
     * @param securityGroupAllowsAllOutbound Whether the security group allows all outbound traffic
     *   or not. Unless set to `false`, no egress rules will be added to the security group.
     */
    public fun securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound: Boolean) {
        cdkBuilder.securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound)
    }

    /** @param securityGroupId ID of the load balancer's security group. */
    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    /** @param vpc The VPC this load balancer has been created in, if available. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationLoadBalancerAttributes = cdkBuilder.build()
}
