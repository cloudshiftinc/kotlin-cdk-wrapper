@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEIPAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun allocationId(): String? = unwrap(this).getAllocationId()

  public open fun allocationId(`value`: String) {
    unwrap(this).setAllocationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  @Deprecated(message = "deprecated in CDK")
  public open fun eip(): String? = unwrap(this).getEip()

  @Deprecated(message = "deprecated in CDK")
  public open fun eip(`value`: String) {
    unwrap(this).setEip(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun allocationId(allocationId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun eip(eip: String)

    public fun instanceId(instanceId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun privateIpAddress(privateIpAddress: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPAssociation.Builder.create(scope, id)

    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun eip(eip: String) {
      cdkBuilder.eip(eip)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPAssociation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnEIPAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEIPAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEIPAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociation):
        CfnEIPAssociation = CfnEIPAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnEIPAssociation):
        software.amazon.awscdk.services.ec2.CfnEIPAssociation = wrapped.cdkObject
  }
}
