package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig,
  ) : AclCidrConfig {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AclCidrConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig): AclCidrConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclCidrConfig): software.amazon.awscdk.services.ec2.AclCidrConfig =
        (wrapped as Wrapper).cdkObject
  }
}
