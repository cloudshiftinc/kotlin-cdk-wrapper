package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInterfacePermission internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun permission(): String = unwrap(this).getPermission()

  public open fun permission(`value`: String) {
    unwrap(this).setPermission(`value`)
  }

  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun permission(permission: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder.create(scope, id)

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInterfacePermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInterfacePermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission):
        CfnNetworkInterfacePermission = CfnNetworkInterfacePermission(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfacePermission):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission = wrapped.cdkObject
  }
}
