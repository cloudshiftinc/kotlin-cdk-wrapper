@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Acl Configuration for CIDR.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AclCidrConfig aclCidrConfig = AclCidrConfig.builder()
 * .cidrBlock("cidrBlock")
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .build();
 * ```
 */
public interface AclCidrConfig {
  /**
   * Ipv4 CIDR.
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * Ipv6 CIDR.
   */
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * A builder for [AclCidrConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrBlock Ipv4 CIDR.
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param ipv6CidrBlock Ipv6 CIDR.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclCidrConfig.Builder =
        software.amazon.awscdk.services.ec2.AclCidrConfig.builder()

    /**
     * @param cidrBlock Ipv4 CIDR.
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param ipv6CidrBlock Ipv6 CIDR.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclCidrConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig,
  ) : CdkObject(cdkObject), AclCidrConfig {
    /**
     * Ipv4 CIDR.
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * Ipv6 CIDR.
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclCidrConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig): AclCidrConfig =
        CdkObjectWrappers.wrap(cdkObject) as? AclCidrConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclCidrConfig): software.amazon.awscdk.services.ec2.AclCidrConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclCidrConfig
  }
}
