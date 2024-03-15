@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AwsIpamProps {
  public fun defaultSubnetIpv4NetmaskLength(): Number? =
      unwrap(this).getDefaultSubnetIpv4NetmaskLength()

  public fun ipv4IpamPoolId(): String

  public fun ipv4NetmaskLength(): Number

  @CdkDslMarker
  public interface Builder {
    public fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AwsIpamProps.Builder =
        software.amazon.awscdk.services.ec2.AwsIpamProps.builder()

    override fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number) {
      cdkBuilder.defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength)
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AwsIpamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AwsIpamProps,
  ) : CdkObject(cdkObject), AwsIpamProps {
    override fun defaultSubnetIpv4NetmaskLength(): Number? =
        unwrap(this).getDefaultSubnetIpv4NetmaskLength()

    override fun ipv4IpamPoolId(): String = unwrap(this).getIpv4IpamPoolId()

    override fun ipv4NetmaskLength(): Number = unwrap(this).getIpv4NetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIpamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AwsIpamProps): AwsIpamProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIpamProps): software.amazon.awscdk.services.ec2.AwsIpamProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AwsIpamProps
  }
}
