package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface AclCidrConfig {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public interface Builder {
    public fun cidrBlock(cidrBlock: String) {
    }

    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclCidrConfig.Builder =
        software.amazon.awscdk.services.ec2.AclCidrConfig.builder()

    public override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    public override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclCidrConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig,
  ) : AclCidrConfig {
    public override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    public override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()
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
