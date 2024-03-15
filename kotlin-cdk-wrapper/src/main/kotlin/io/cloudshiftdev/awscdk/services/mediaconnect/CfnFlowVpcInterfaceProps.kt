@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFlowVpcInterfaceProps {
  public fun flowArn(): String

  public fun name(): String

  public fun roleArn(): String

  public fun securityGroupIds(): List<String>

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun flowArn(flowArn: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.builder()

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps,
  ) : CdkObject(cdkObject), CfnFlowVpcInterfaceProps {
    override fun flowArn(): String = unwrap(this).getFlowArn()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowVpcInterfaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps):
        CfnFlowVpcInterfaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVpcInterfaceProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
  }
}
