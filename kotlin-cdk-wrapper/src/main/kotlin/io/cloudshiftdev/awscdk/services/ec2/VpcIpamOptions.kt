@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VpcIpamOptions {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  @CdkDslMarker
  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.VpcIpamOptions.builder()

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcIpamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpcIpamOptions,
  ) : CdkObject(cdkObject), VpcIpamOptions {
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

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
