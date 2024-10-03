@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for adding a new route to a subnet.
 *
 * Example:
 *
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "VPC")
 * .subnetConfiguration(List.of(SubnetConfiguration.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .name("Public")
 * .build(), SubnetConfiguration.builder()
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .name("Isolated")
 * .build()))
 * .build();
 * ((Subnet)vpc.isolatedSubnets[0]).addRoute("StaticRoute", AddRouteOptions.builder()
 * .routerId(vpc.getInternetGatewayId())
 * .routerType(RouterType.GATEWAY)
 * .destinationCidrBlock("8.8.8.8/32")
 * .build());
 * ```
 */
public interface AddRouteOptions {
  /**
   * IPv4 range this route applies to.
   *
   * Default: '0.0.0.0/0'
   */
  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  /**
   * IPv6 range this route applies to.
   *
   * Default: - Uses IPv6
   */
  public fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  /**
   * Whether this route will enable internet connectivity.
   *
   * If true, this route will be added before any AWS resources that depend
   * on internet connectivity in the VPC will be created.
   *
   * Default: false
   */
  public fun enablesInternetConnectivity(): Boolean? = unwrap(this).getEnablesInternetConnectivity()

  /**
   * The ID of the router.
   *
   * Can be an instance ID, gateway ID, etc, depending on the router type.
   */
  public fun routerId(): String

  /**
   * What type of router to route this traffic to.
   */
  public fun routerType(): RouterType

  /**
   * A builder for [AddRouteOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationCidrBlock IPv4 range this route applies to.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param destinationIpv6CidrBlock IPv6 range this route applies to.
     */
    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String)

    /**
     * @param enablesInternetConnectivity Whether this route will enable internet connectivity.
     * If true, this route will be added before any AWS resources that depend
     * on internet connectivity in the VPC will be created.
     */
    public fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean)

    /**
     * @param routerId The ID of the router. 
     * Can be an instance ID, gateway ID, etc, depending on the router type.
     */
    public fun routerId(routerId: String)

    /**
     * @param routerType What type of router to route this traffic to. 
     */
    public fun routerType(routerType: RouterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AddRouteOptions.Builder =
        software.amazon.awscdk.services.ec2.AddRouteOptions.builder()

    /**
     * @param destinationCidrBlock IPv4 range this route applies to.
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param destinationIpv6CidrBlock IPv6 range this route applies to.
     */
    override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    /**
     * @param enablesInternetConnectivity Whether this route will enable internet connectivity.
     * If true, this route will be added before any AWS resources that depend
     * on internet connectivity in the VPC will be created.
     */
    override fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean) {
      cdkBuilder.enablesInternetConnectivity(enablesInternetConnectivity)
    }

    /**
     * @param routerId The ID of the router. 
     * Can be an instance ID, gateway ID, etc, depending on the router type.
     */
    override fun routerId(routerId: String) {
      cdkBuilder.routerId(routerId)
    }

    /**
     * @param routerType What type of router to route this traffic to. 
     */
    override fun routerType(routerType: RouterType) {
      cdkBuilder.routerType(routerType.let(RouterType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AddRouteOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AddRouteOptions,
  ) : CdkObject(cdkObject),
      AddRouteOptions {
    /**
     * IPv4 range this route applies to.
     *
     * Default: '0.0.0.0/0'
     */
    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    /**
     * IPv6 range this route applies to.
     *
     * Default: - Uses IPv6
     */
    override fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

    /**
     * Whether this route will enable internet connectivity.
     *
     * If true, this route will be added before any AWS resources that depend
     * on internet connectivity in the VPC will be created.
     *
     * Default: false
     */
    override fun enablesInternetConnectivity(): Boolean? =
        unwrap(this).getEnablesInternetConnectivity()

    /**
     * The ID of the router.
     *
     * Can be an instance ID, gateway ID, etc, depending on the router type.
     */
    override fun routerId(): String = unwrap(this).getRouterId()

    /**
     * What type of router to route this traffic to.
     */
    override fun routerType(): RouterType = unwrap(this).getRouterType().let(RouterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AddRouteOptions):
        AddRouteOptions = CdkObjectWrappers.wrap(cdkObject) as? AddRouteOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddRouteOptions):
        software.amazon.awscdk.services.ec2.AddRouteOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AddRouteOptions
  }
}
