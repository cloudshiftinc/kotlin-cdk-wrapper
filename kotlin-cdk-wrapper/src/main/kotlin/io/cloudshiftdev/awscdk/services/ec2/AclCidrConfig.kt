@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AclCidrConfig {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  @CdkDslMarker
  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclCidrConfig.Builder =
        software.amazon.awscdk.services.ec2.AclCidrConfig.builder()

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclCidrConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig,
  ) : CdkObject(cdkObject), AclCidrConfig {
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclCidrConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclCidrConfig): AclCidrConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclCidrConfig): software.amazon.awscdk.services.ec2.AclCidrConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclCidrConfig
  }
}
