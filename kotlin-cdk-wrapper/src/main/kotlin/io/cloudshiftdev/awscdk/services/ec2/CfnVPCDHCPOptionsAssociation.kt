@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCDHCPOptionsAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun dhcpOptionsId(): String = unwrap(this).getDhcpOptionsId()

  public open fun dhcpOptionsId(`value`: String) {
    unwrap(this).setDhcpOptionsId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun dhcpOptionsId(dhcpOptionsId: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.Builder.create(scope, id)

    override fun dhcpOptionsId(dhcpOptionsId: String) {
      cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCDHCPOptionsAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCDHCPOptionsAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation):
        CfnVPCDHCPOptionsAssociation = CfnVPCDHCPOptionsAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnVPCDHCPOptionsAssociation):
        software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation = wrapped.cdkObject
  }
}
