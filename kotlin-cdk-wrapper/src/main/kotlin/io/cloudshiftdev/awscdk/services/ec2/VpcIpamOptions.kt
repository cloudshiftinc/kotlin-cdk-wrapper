@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CIDR Allocated Vpc.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * VpcIpamOptions vpcIpamOptions = VpcIpamOptions.builder()
 * .cidrBlock("cidrBlock")
 * .ipv4IpamPoolId("ipv4IpamPoolId")
 * .ipv4NetmaskLength(123)
 * .build();
 * ```
 */
public interface VpcIpamOptions {
  /**
   * CIDR Block for Vpc.
   *
   * Default: - Only required when Ipam has concrete allocation available for static Vpc
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * ipv4 IPAM Pool Id.
   *
   * Default: - Only required when using AWS Ipam
   */
  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * CIDR Mask for Vpc.
   *
   * Default: - Only required when using AWS Ipam
   */
  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * A builder for [VpcIpamOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrBlock CIDR Block for Vpc.
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param ipv4IpamPoolId ipv4 IPAM Pool Id.
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * @param ipv4NetmaskLength CIDR Mask for Vpc.
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.VpcIpamOptions.builder()

    /**
     * @param cidrBlock CIDR Block for Vpc.
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param ipv4IpamPoolId ipv4 IPAM Pool Id.
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * @param ipv4NetmaskLength CIDR Mask for Vpc.
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcIpamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpcIpamOptions,
  ) : CdkObject(cdkObject), VpcIpamOptions {
    /**
     * CIDR Block for Vpc.
     *
     * Default: - Only required when Ipam has concrete allocation available for static Vpc
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * ipv4 IPAM Pool Id.
     *
     * Default: - Only required when using AWS Ipam
     */
    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    /**
     * CIDR Mask for Vpc.
     *
     * Default: - Only required when using AWS Ipam
     */
    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcIpamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcIpamOptions): VpcIpamOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcIpamOptions): software.amazon.awscdk.services.ec2.VpcIpamOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcIpamOptions
  }
}
