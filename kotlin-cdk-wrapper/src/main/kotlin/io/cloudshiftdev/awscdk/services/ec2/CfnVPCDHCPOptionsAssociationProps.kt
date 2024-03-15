@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnVPCDHCPOptionsAssociationProps {
  public fun dhcpOptionsId(): String

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun dhcpOptionsId(dhcpOptionsId: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps.builder()

    override fun dhcpOptionsId(dhcpOptionsId: String) {
      cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps,
  ) : CdkObject(cdkObject), CfnVPCDHCPOptionsAssociationProps {
    override fun dhcpOptionsId(): String = unwrap(this).getDhcpOptionsId()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCDHCPOptionsAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps):
        CfnVPCDHCPOptionsAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCDHCPOptionsAssociationProps):
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
  }
}
