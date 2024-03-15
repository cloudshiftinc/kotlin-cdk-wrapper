@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSubnetNetworkAclAssociationProps {
  public fun networkAclId(): String

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun networkAclId(networkAclId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.builder()

    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps,
  ) : CdkObject(cdkObject), CfnSubnetNetworkAclAssociationProps {
    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSubnetNetworkAclAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps):
        CfnSubnetNetworkAclAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetNetworkAclAssociationProps):
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps
  }
}
