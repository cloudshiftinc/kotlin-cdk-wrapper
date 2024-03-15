@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnNetworkInterfacePermissionProps {
  public fun awsAccountId(): String

  public fun networkInterfaceId(): String

  public fun permission(): String

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun permission(permission: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps,
  ) : CdkObject(cdkObject), CfnNetworkInterfacePermissionProps {
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    override fun permission(): String = unwrap(this).getPermission()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfacePermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps):
        CfnNetworkInterfacePermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfacePermissionProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
  }
}
