@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBridgeProps {
  public fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

  public fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

  public fun name(): String

  public fun outputs(): Any? = unwrap(this).getOutputs()

  public fun placementArn(): String

  public fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  public fun sources(): Any

  @CdkDslMarker
  public interface Builder {
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable)

    public fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00a44f5337692dc3b05c2338a1ba9908a67b0abac8e0e7e784cc8992d5f6f43")
    public
        fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty.Builder.() -> Unit)

    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable)

    public fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeb90e11d39737f1807c3f7cb093da150771dfd68ec81f99ae6c2d2f58cc1e22")
    public
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outputs(outputs: IResolvable)

    public fun outputs(outputs: List<Any>)

    public fun outputs(vararg outputs: Any)

    public fun placementArn(placementArn: String)

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    public fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a0476c51cbb40bfb99276f362787e0c6072067a3b021e950144be8b0d33e93e")
    public
        fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeProps.builder()

    override fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(IResolvable::unwrap))
    }

    override fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(CfnBridge.EgressGatewayBridgeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00a44f5337692dc3b05c2338a1ba9908a67b0abac8e0e7e784cc8992d5f6f43")
    override
        fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = egressGatewayBridge(CfnBridge.EgressGatewayBridgeProperty(egressGatewayBridge))

    override fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IResolvable::unwrap))
    }

    override
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(CfnBridge.IngressGatewayBridgeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeb90e11d39737f1807c3f7cb093da150771dfd68ec81f99ae6c2d2f58cc1e22")
    override
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = ingressGatewayBridge(CfnBridge.IngressGatewayBridgeProperty(ingressGatewayBridge))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    override fun placementArn(placementArn: String) {
      cdkBuilder.placementArn(placementArn)
    }

    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    override fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(CfnBridge.FailoverConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a0476c51cbb40bfb99276f362787e0c6072067a3b021e950144be8b0d33e93e")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(CfnBridge.FailoverConfigProperty(sourceFailoverConfig))

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps,
  ) : CdkObject(cdkObject), CfnBridgeProps {
    override fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

    override fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

    override fun name(): String = unwrap(this).getName()

    override fun outputs(): Any? = unwrap(this).getOutputs()

    override fun placementArn(): String = unwrap(this).getPlacementArn()

    override fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

    override fun sources(): Any = unwrap(this).getSources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps):
        CfnBridgeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeProps
  }
}
