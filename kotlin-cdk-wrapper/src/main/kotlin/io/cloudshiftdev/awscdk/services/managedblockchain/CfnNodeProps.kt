@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnNodeProps {
  public fun memberId(): String? = unwrap(this).getMemberId()

  public fun networkId(): String

  public fun nodeConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun memberId(memberId: String)

    public fun networkId(networkId: String)

    public fun nodeConfiguration(nodeConfiguration: IResolvable)

    public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be4725402bc701968638ba0d3dab62f65ce5c00e6e8aebececaeed97357a83fb")
    public
        fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnNodeProps.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnNodeProps.builder()

    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    override fun nodeConfiguration(nodeConfiguration: IResolvable) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(IResolvable::unwrap))
    }

    override fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(CfnNode.NodeConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be4725402bc701968638ba0d3dab62f65ce5c00e6e8aebececaeed97357a83fb")
    override
        fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty.Builder.() -> Unit):
        Unit = nodeConfiguration(CfnNode.NodeConfigurationProperty(nodeConfiguration))

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNodeProps,
  ) : CdkObject(cdkObject), CfnNodeProps {
    override fun memberId(): String? = unwrap(this).getMemberId()

    override fun networkId(): String = unwrap(this).getNetworkId()

    override fun nodeConfiguration(): Any = unwrap(this).getNodeConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNodeProps):
        CfnNodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNodeProps):
        software.amazon.awscdk.services.managedblockchain.CfnNodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.managedblockchain.CfnNodeProps
  }
}
