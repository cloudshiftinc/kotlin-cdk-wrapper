@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnBridgeSourceProps {
  public fun bridgeArn(): String

  public fun flowSource(): Any? = unwrap(this).getFlowSource()

  public fun name(): String

  public fun networkSource(): Any? = unwrap(this).getNetworkSource()

  @CdkDslMarker
  public interface Builder {
    public fun bridgeArn(bridgeArn: String)

    public fun flowSource(flowSource: IResolvable)

    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671163b1a05c2c8a867c977ca6b807fd696e3cb4df0c764b74f9af2736559cc0")
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun networkSource(networkSource: IResolvable)

    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33d05cf2dfa41a6a9ec4a7c76df17f0a77b8403c4659c75d5e34c8bb83ab018")
    public
        fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps.builder()

    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    override fun flowSource(flowSource: IResolvable) {
      cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
    }

    override fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
      cdkBuilder.flowSource(flowSource.let(CfnBridgeSource.BridgeFlowSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671163b1a05c2c8a867c977ca6b807fd696e3cb4df0c764b74f9af2736559cc0")
    override
        fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty.Builder.() -> Unit):
        Unit = flowSource(CfnBridgeSource.BridgeFlowSourceProperty(flowSource))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkSource(networkSource: IResolvable) {
      cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
    }

    override fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
      cdkBuilder.networkSource(networkSource.let(CfnBridgeSource.BridgeNetworkSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33d05cf2dfa41a6a9ec4a7c76df17f0a77b8403c4659c75d5e34c8bb83ab018")
    override
        fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty.Builder.() -> Unit):
        Unit = networkSource(CfnBridgeSource.BridgeNetworkSourceProperty(networkSource))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps,
  ) : CdkObject(cdkObject), CfnBridgeSourceProps {
    override fun bridgeArn(): String = unwrap(this).getBridgeArn()

    override fun flowSource(): Any? = unwrap(this).getFlowSource()

    override fun name(): String = unwrap(this).getName()

    override fun networkSource(): Any? = unwrap(this).getNetworkSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps):
        CfnBridgeSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeSourceProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
  }
}
