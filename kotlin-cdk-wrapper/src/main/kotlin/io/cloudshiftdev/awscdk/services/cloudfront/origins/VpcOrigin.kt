@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.IVpcOrigin
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBase
import io.cloudshiftdev.awscdk.services.ec2.IInstance
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a distribution's VPC origin.
 *
 * Example:
 *
 * ```
 * // Creates a distribution from a Network Load Balancer
 * Vpc vpc;
 * // Create a network load balancer in a VPC. 'internetFacing' can be 'false'.
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .internetFacing(false)
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build())
 * .securityGroups(List.of(SecurityGroup.Builder.create(this, "NLB-SG").vpc(vpc).build()))
 * .build();
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder().origin(VpcOrigin.withNetworkLoadBalancer(nlb)).build())
 * .build();
 * ```
 */
public abstract class VpcOrigin(
  cdkObject: software.amazon.awscdk.services.cloudfront.origins.VpcOrigin,
) : OriginBase(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.origins.VpcOrigin,
  ) : VpcOrigin(cdkObject)

  public companion object {
    public fun withApplicationLoadBalancer(alb: IApplicationLoadBalancer): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withApplicationLoadBalancer(alb.let(IApplicationLoadBalancer.Companion::unwrap)).let(VpcOrigin::wrap)

    public fun withApplicationLoadBalancer(alb: IApplicationLoadBalancer,
        props: VpcOriginWithEndpointProps): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withApplicationLoadBalancer(alb.let(IApplicationLoadBalancer.Companion::unwrap),
        props.let(VpcOriginWithEndpointProps.Companion::unwrap)).let(VpcOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324045fe7f0f975e6cd604e3b0544a267c95d59dc6201cbcfef9d301880807f3")
    public fun withApplicationLoadBalancer(alb: IApplicationLoadBalancer,
        props: VpcOriginWithEndpointProps.Builder.() -> Unit): VpcOrigin =
        withApplicationLoadBalancer(alb, VpcOriginWithEndpointProps(props))

    public fun withEc2Instance(instance: IInstance): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withEc2Instance(instance.let(IInstance.Companion::unwrap)).let(VpcOrigin::wrap)

    public fun withEc2Instance(instance: IInstance, props: VpcOriginWithEndpointProps): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withEc2Instance(instance.let(IInstance.Companion::unwrap),
        props.let(VpcOriginWithEndpointProps.Companion::unwrap)).let(VpcOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("524135a645bfab583ccd757eed311daa7244aacef55436d27111197d6da57c2b")
    public fun withEc2Instance(instance: IInstance,
        props: VpcOriginWithEndpointProps.Builder.() -> Unit): VpcOrigin = withEc2Instance(instance,
        VpcOriginWithEndpointProps(props))

    public fun withNetworkLoadBalancer(nlb: INetworkLoadBalancer): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withNetworkLoadBalancer(nlb.let(INetworkLoadBalancer.Companion::unwrap)).let(VpcOrigin::wrap)

    public fun withNetworkLoadBalancer(nlb: INetworkLoadBalancer,
        props: VpcOriginWithEndpointProps): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withNetworkLoadBalancer(nlb.let(INetworkLoadBalancer.Companion::unwrap),
        props.let(VpcOriginWithEndpointProps.Companion::unwrap)).let(VpcOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9815038f02f8cb921f7423cfa39853c46afdcda2fdb1a36a2726bdc23c9331")
    public fun withNetworkLoadBalancer(nlb: INetworkLoadBalancer,
        props: VpcOriginWithEndpointProps.Builder.() -> Unit): VpcOrigin =
        withNetworkLoadBalancer(nlb, VpcOriginWithEndpointProps(props))

    public fun withVpcOrigin(origin: IVpcOrigin): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withVpcOrigin(origin.let(IVpcOrigin.Companion::unwrap)).let(VpcOrigin::wrap)

    public fun withVpcOrigin(origin: IVpcOrigin, props: VpcOriginProps): VpcOrigin =
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin.withVpcOrigin(origin.let(IVpcOrigin.Companion::unwrap),
        props.let(VpcOriginProps.Companion::unwrap)).let(VpcOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b363aba957caee53de1fc03abb9e6e5d0ea2185cf8097dd5fd90063df3950709")
    public fun withVpcOrigin(origin: IVpcOrigin, props: VpcOriginProps.Builder.() -> Unit):
        VpcOrigin = withVpcOrigin(origin, VpcOriginProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.VpcOrigin):
        VpcOrigin = CdkObjectWrappers.wrap(cdkObject) as? VpcOrigin ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcOrigin):
        software.amazon.awscdk.services.cloudfront.origins.VpcOrigin = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.VpcOrigin
  }
}
