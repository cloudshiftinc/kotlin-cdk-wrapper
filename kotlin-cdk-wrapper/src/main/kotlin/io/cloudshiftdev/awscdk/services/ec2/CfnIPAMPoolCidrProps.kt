@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnIPAMPoolCidrProps {
  public fun cidr(): String? = unwrap(this).getCidr()

  public fun ipamPoolId(): String

  public fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  @CdkDslMarker
  public interface Builder {
    public fun cidr(cidr: String)

    public fun ipamPoolId(ipamPoolId: String)

    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps.builder()

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps,
  ) : CdkObject(cdkObject), CfnIPAMPoolCidrProps {
    override fun cidr(): String? = unwrap(this).getCidr()

    override fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

    override fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMPoolCidrProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps):
        CfnIPAMPoolCidrProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolCidrProps):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
  }
}
