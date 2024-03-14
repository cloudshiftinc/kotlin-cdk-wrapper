package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VpcIpamOptions {
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public interface Builder {
    public fun cidrBlock(cidrBlock: String) {
    }

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
    }

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.VpcIpamOptions.builder()

    public override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    public override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    public override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcIpamOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpcIpamOptions,
  ) : VpcIpamOptions {
    public override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    public override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    public override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcIpamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcIpamOptions): VpcIpamOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcIpamOptions): software.amazon.awscdk.services.ec2.VpcIpamOptions
        = (wrapped as Wrapper).cdkObject
  }
}
