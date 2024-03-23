@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Options passed by the VPC when NAT needs to be configured.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * PrivateSubnet privateSubnet;
 * PublicSubnet publicSubnet;
 * Vpc vpc;
 * ConfigureNatOptions configureNatOptions = ConfigureNatOptions.builder()
 * .natSubnets(List.of(publicSubnet))
 * .privateSubnets(List.of(privateSubnet))
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface ConfigureNatOptions {
  /**
   * The public subnets where the NAT providers need to be placed.
   */
  public fun natSubnets(): List<PublicSubnet>

  /**
   * The private subnets that need to route through the NAT providers.
   *
   * There may be more private subnets than public subnets with NAT providers.
   */
  public fun privateSubnets(): List<PrivateSubnet>

  /**
   * The VPC we're configuring NAT for.
   */
  public fun vpc(): Vpc

  /**
   * A builder for [ConfigureNatOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param natSubnets The public subnets where the NAT providers need to be placed. 
     */
    public fun natSubnets(natSubnets: List<PublicSubnet>)

    /**
     * @param natSubnets The public subnets where the NAT providers need to be placed. 
     */
    public fun natSubnets(vararg natSubnets: PublicSubnet)

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. 
     * There may be more private subnets than public subnets with NAT providers.
     */
    public fun privateSubnets(privateSubnets: List<PrivateSubnet>)

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. 
     * There may be more private subnets than public subnets with NAT providers.
     */
    public fun privateSubnets(vararg privateSubnets: PrivateSubnet)

    /**
     * @param vpc The VPC we're configuring NAT for. 
     */
    public fun vpc(vpc: Vpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConfigureNatOptions.Builder =
        software.amazon.awscdk.services.ec2.ConfigureNatOptions.builder()

    /**
     * @param natSubnets The public subnets where the NAT providers need to be placed. 
     */
    override fun natSubnets(natSubnets: List<PublicSubnet>) {
      cdkBuilder.natSubnets(natSubnets.map(PublicSubnet::unwrap))
    }

    /**
     * @param natSubnets The public subnets where the NAT providers need to be placed. 
     */
    override fun natSubnets(vararg natSubnets: PublicSubnet): Unit = natSubnets(natSubnets.toList())

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. 
     * There may be more private subnets than public subnets with NAT providers.
     */
    override fun privateSubnets(privateSubnets: List<PrivateSubnet>) {
      cdkBuilder.privateSubnets(privateSubnets.map(PrivateSubnet::unwrap))
    }

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. 
     * There may be more private subnets than public subnets with NAT providers.
     */
    override fun privateSubnets(vararg privateSubnets: PrivateSubnet): Unit =
        privateSubnets(privateSubnets.toList())

    /**
     * @param vpc The VPC we're configuring NAT for. 
     */
    override fun vpc(vpc: Vpc) {
      cdkBuilder.vpc(vpc.let(Vpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConfigureNatOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ConfigureNatOptions,
  ) : CdkObject(cdkObject), ConfigureNatOptions {
    /**
     * The public subnets where the NAT providers need to be placed.
     */
    override fun natSubnets(): List<PublicSubnet> =
        unwrap(this).getNatSubnets().map(PublicSubnet::wrap)

    /**
     * The private subnets that need to route through the NAT providers.
     *
     * There may be more private subnets than public subnets with NAT providers.
     */
    override fun privateSubnets(): List<PrivateSubnet> =
        unwrap(this).getPrivateSubnets().map(PrivateSubnet::wrap)

    /**
     * The VPC we're configuring NAT for.
     */
    override fun vpc(): Vpc = unwrap(this).getVpc().let(Vpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigureNatOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConfigureNatOptions):
        ConfigureNatOptions = CdkObjectWrappers.wrap(cdkObject) as? ConfigureNatOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigureNatOptions):
        software.amazon.awscdk.services.ec2.ConfigureNatOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ConfigureNatOptions
  }
}
