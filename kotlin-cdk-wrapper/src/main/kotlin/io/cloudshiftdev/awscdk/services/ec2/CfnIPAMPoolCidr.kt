@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMPoolCidr internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIpamPoolCidrId(): String = unwrap(this).getAttrIpamPoolCidrId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun cidr(): String? = unwrap(this).getCidr()

  public open fun cidr(`value`: String) {
    unwrap(this).setCidr(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

  public open fun ipamPoolId(`value`: String) {
    unwrap(this).setIpamPoolId(`value`)
  }

  public open fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  public open fun netmaskLength(`value`: Number) {
    unwrap(this).setNetmaskLength(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun cidr(cidr: String)

    public fun ipamPoolId(ipamPoolId: String)

    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr.Builder.create(scope, id)

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMPoolCidr {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMPoolCidr(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr):
        CfnIPAMPoolCidr = CfnIPAMPoolCidr(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolCidr):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr = wrapped.cdkObject
  }
}
