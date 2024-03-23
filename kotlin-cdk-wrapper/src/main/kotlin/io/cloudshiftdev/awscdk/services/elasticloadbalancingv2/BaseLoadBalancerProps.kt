@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Shared properties of both Application and Network Load Balancers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * BaseLoadBalancerProps baseLoadBalancerProps = BaseLoadBalancerProps.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .deletionProtection(false)
 * .internetFacing(false)
 * .loadBalancerName("loadBalancerName")
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
public interface BaseLoadBalancerProps {
  /**
   * Indicates whether deletion protection is enabled.
   *
   * Default: false
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * Whether the load balancer has an internet-routable address.
   *
   * Default: false
   */
  public fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

  /**
   * Name of the load balancer.
   *
   * Default: - Automatically generated name.
   */
  public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  /**
   * The VPC network to place the load balancer in.
   */
  public fun vpc(): IVpc

  /**
   * Which subnets place the load balancer in.
   *
   * Default: - the Vpc default strategy.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [BaseLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9895219d7240dc584ec12ba84ff2bf2f47db557460ddf24a06907e081a2a7860")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps.builder()

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9895219d7240dc584ec12ba84ff2bf2f47db557460ddf24a06907e081a2a7860")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps,
  ) : CdkObject(cdkObject), BaseLoadBalancerProps {
    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     */
    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     */
    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * The VPC network to place the load balancer in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps):
        BaseLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as? BaseLoadBalancerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps
  }
}
