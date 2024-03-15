@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBridge internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrBridgeArn(): String = unwrap(this).getAttrBridgeArn()

  public open fun attrBridgeState(): String = unwrap(this).getAttrBridgeState()

  public open fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

  public open fun egressGatewayBridge(`value`: IResolvable) {
    unwrap(this).setEgressGatewayBridge(`value`.let(IResolvable::unwrap))
  }

  public open fun egressGatewayBridge(`value`: EgressGatewayBridgeProperty) {
    unwrap(this).setEgressGatewayBridge(`value`.let(EgressGatewayBridgeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70fb1c84e742a3e95c3bab10489b85dab946dd3d65202b8b1eafbdceb732229e")
  public open fun egressGatewayBridge(`value`: EgressGatewayBridgeProperty.Builder.() -> Unit): Unit
      = egressGatewayBridge(EgressGatewayBridgeProperty(`value`))

  public open fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

  public open fun ingressGatewayBridge(`value`: IResolvable) {
    unwrap(this).setIngressGatewayBridge(`value`.let(IResolvable::unwrap))
  }

  public open fun ingressGatewayBridge(`value`: IngressGatewayBridgeProperty) {
    unwrap(this).setIngressGatewayBridge(`value`.let(IngressGatewayBridgeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c770bd80ef4aac3e8ba9121245762b8868e5bd45bd039957214b6f9c513167b1")
  public open fun ingressGatewayBridge(`value`: IngressGatewayBridgeProperty.Builder.() -> Unit):
      Unit = ingressGatewayBridge(IngressGatewayBridgeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outputs(): Any? = unwrap(this).getOutputs()

  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable::unwrap))
  }

  public open fun outputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputs(__idx_ac66f0)
  }

  public open fun outputs(vararg __idx_ac66f0: Any): Unit = outputs(__idx_ac66f0.toList())

  public open fun placementArn(): String = unwrap(this).getPlacementArn()

  public open fun placementArn(`value`: String) {
    unwrap(this).setPlacementArn(`value`)
  }

  public open fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  public open fun sourceFailoverConfig(`value`: IResolvable) {
    unwrap(this).setSourceFailoverConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty) {
    unwrap(this).setSourceFailoverConfig(`value`.let(FailoverConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3162252ac2aeda6c684f71034bb13e000c16bd60b64a157569b49ef8ca461bf")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

  public open fun sources(): Any = unwrap(this).getSources()

  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  public open fun sources(vararg __idx_ac66f0: Any): Unit = sources(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable)

    public fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4e47ca6e679dc8a042e36f6f677bb466453247f12689dee9a713dc94ee64e5")
    public
        fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty.Builder.() -> Unit)

    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable)

    public fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79ee9332cc61112458697a9323457833ddf24d8bb615b3fb77d585d5ef31c910")
    public
        fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outputs(outputs: IResolvable)

    public fun outputs(outputs: List<Any>)

    public fun outputs(vararg outputs: Any)

    public fun placementArn(placementArn: String)

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7040cbc2c28d5d704b49433fec10cbe8b1f77470dcaa5c83df6fab2ed2295b2f")
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridge.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridge.Builder.create(scope, id)

    override fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(IResolvable::unwrap))
    }

    override fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(EgressGatewayBridgeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4e47ca6e679dc8a042e36f6f677bb466453247f12689dee9a713dc94ee64e5")
    override
        fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = egressGatewayBridge(EgressGatewayBridgeProperty(egressGatewayBridge))

    override fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IResolvable::unwrap))
    }

    override fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IngressGatewayBridgeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79ee9332cc61112458697a9323457833ddf24d8bb615b3fb77d585d5ef31c910")
    override
        fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = ingressGatewayBridge(IngressGatewayBridgeProperty(ingressGatewayBridge))

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

    override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7040cbc2c28d5d704b49433fec10cbe8b1f77470dcaa5c83df6fab2ed2295b2f")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(FailoverConfigProperty(sourceFailoverConfig))

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridge = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnBridge.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridge {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridge(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge): CfnBridge
        = CfnBridge(cdkObject)

    internal fun unwrap(wrapped: CfnBridge): software.amazon.awscdk.services.mediaconnect.CfnBridge
        = wrapped.cdkObject
  }

  public interface BridgeNetworkOutputProperty {
    public fun ipAddress(): String

    public fun name(): String

    public fun networkName(): String

    public fun port(): Number

    public fun protocol(): String

    public fun ttl(): Number

    @CdkDslMarker
    public interface Builder {
      public fun ipAddress(ipAddress: String)

      public fun name(name: String)

      public fun networkName(networkName: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty.builder()

      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty,
    ) : CdkObject(cdkObject), BridgeNetworkOutputProperty {
      override fun ipAddress(): String = unwrap(this).getIpAddress()

      override fun name(): String = unwrap(this).getName()

      override fun networkName(): String = unwrap(this).getNetworkName()

      override fun port(): Number = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()

      override fun ttl(): Number = unwrap(this).getTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty):
          BridgeNetworkOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty
    }
  }

  public interface FailoverConfigProperty {
    public fun failoverMode(): String

    public fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

    public fun state(): String? = unwrap(this).getState()

    @CdkDslMarker
    public interface Builder {
      public fun failoverMode(failoverMode: String)

      public fun sourcePriority(sourcePriority: IResolvable)

      public fun sourcePriority(sourcePriority: SourcePriorityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7418a01e3373546a55fa87100fa1ffc695721eb0587c200ba81655dc45139f31")
      public fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty.builder()

      override fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
      }

      override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable::unwrap))
      }

      override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7418a01e3373546a55fa87100fa1ffc695721eb0587c200ba81655dc45139f31")
      override fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit): Unit =
          sourcePriority(SourcePriorityProperty(sourcePriority))

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty,
    ) : CdkObject(cdkObject), FailoverConfigProperty {
      override fun failoverMode(): String = unwrap(this).getFailoverMode()

      override fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty):
          FailoverConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty
    }
  }

  public interface VpcInterfaceAttachmentProperty {
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    @CdkDslMarker
    public interface Builder {
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty.builder()

      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty
    }
  }

  public interface BridgeNetworkSourceProperty {
    public fun multicastIp(): String

    public fun name(): String

    public fun networkName(): String

    public fun port(): Number

    public fun protocol(): String

    @CdkDslMarker
    public interface Builder {
      public fun multicastIp(multicastIp: String)

      public fun name(name: String)

      public fun networkName(networkName: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty.builder()

      override fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty,
    ) : CdkObject(cdkObject), BridgeNetworkSourceProperty {
      override fun multicastIp(): String = unwrap(this).getMulticastIp()

      override fun name(): String = unwrap(this).getName()

      override fun networkName(): String = unwrap(this).getNetworkName()

      override fun port(): Number = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty):
          BridgeNetworkSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty
    }
  }

  public interface BridgeSourceProperty {
    public fun flowSource(): Any? = unwrap(this).getFlowSource()

    public fun networkSource(): Any? = unwrap(this).getNetworkSource()

    @CdkDslMarker
    public interface Builder {
      public fun flowSource(flowSource: IResolvable)

      public fun flowSource(flowSource: BridgeFlowSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45d2eff2fd255d30ed98d40feff6e53f403ac34a4c7daf243a57686b87e54af5")
      public fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit)

      public fun networkSource(networkSource: IResolvable)

      public fun networkSource(networkSource: BridgeNetworkSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca4ea347a4cdfc805830fcde7e6f90b961d0460b8b8db96c5c78aa12aaeccc7")
      public fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty.builder()

      override fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
      }

      override fun flowSource(flowSource: BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource.let(BridgeFlowSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45d2eff2fd255d30ed98d40feff6e53f403ac34a4c7daf243a57686b87e54af5")
      override fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
          flowSource(BridgeFlowSourceProperty(flowSource))

      override fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
      }

      override fun networkSource(networkSource: BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource.let(BridgeNetworkSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca4ea347a4cdfc805830fcde7e6f90b961d0460b8b8db96c5c78aa12aaeccc7")
      override fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit):
          Unit = networkSource(BridgeNetworkSourceProperty(networkSource))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty,
    ) : CdkObject(cdkObject), BridgeSourceProperty {
      override fun flowSource(): Any? = unwrap(this).getFlowSource()

      override fun networkSource(): Any? = unwrap(this).getNetworkSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty):
          BridgeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty
    }
  }

  public interface SourcePriorityProperty {
    public fun primarySource(): String? = unwrap(this).getPrimarySource()

    @CdkDslMarker
    public interface Builder {
      public fun primarySource(primarySource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty.builder()

      override fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty,
    ) : CdkObject(cdkObject), SourcePriorityProperty {
      override fun primarySource(): String? = unwrap(this).getPrimarySource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourcePriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty):
          SourcePriorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty
    }
  }

  public interface BridgeFlowSourceProperty {
    public fun flowArn(): String

    public fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun flowArn(flowArn: String)

      public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable)

      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d23f1afc5e019a814f9266f05f382243aa3930501625b26daa562ac61008c25")
      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty.builder()

      override fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
      }

      override fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d23f1afc5e019a814f9266f05f382243aa3930501625b26daa562ac61008c25")
      override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit =
          flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty(flowVpcInterfaceAttachment))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty,
    ) : CdkObject(cdkObject), BridgeFlowSourceProperty {
      override fun flowArn(): String = unwrap(this).getFlowArn()

      override fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeFlowSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty):
          BridgeFlowSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeFlowSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty
    }
  }

  public interface EgressGatewayBridgeProperty {
    public fun maxBitrate(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxBitrate(maxBitrate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty.builder()

      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty,
    ) : CdkObject(cdkObject), EgressGatewayBridgeProperty {
      override fun maxBitrate(): Number = unwrap(this).getMaxBitrate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EgressGatewayBridgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty):
          EgressGatewayBridgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressGatewayBridgeProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty
    }
  }

  public interface BridgeOutputProperty {
    public fun networkOutput(): Any? = unwrap(this).getNetworkOutput()

    @CdkDslMarker
    public interface Builder {
      public fun networkOutput(networkOutput: IResolvable)

      public fun networkOutput(networkOutput: BridgeNetworkOutputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78717ab00e5fb8eb26b94f79a4a0b158b7039dd47d8f8bfec02c150daa38fc97")
      public fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty.builder()

      override fun networkOutput(networkOutput: IResolvable) {
        cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
      }

      override fun networkOutput(networkOutput: BridgeNetworkOutputProperty) {
        cdkBuilder.networkOutput(networkOutput.let(BridgeNetworkOutputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78717ab00e5fb8eb26b94f79a4a0b158b7039dd47d8f8bfec02c150daa38fc97")
      override fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit):
          Unit = networkOutput(BridgeNetworkOutputProperty(networkOutput))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty,
    ) : CdkObject(cdkObject), BridgeOutputProperty {
      override fun networkOutput(): Any? = unwrap(this).getNetworkOutput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty):
          BridgeOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty
    }
  }

  public interface IngressGatewayBridgeProperty {
    public fun maxBitrate(): Number

    public fun maxOutputs(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxBitrate(maxBitrate: Number)

      public fun maxOutputs(maxOutputs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty.builder()

      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      override fun maxOutputs(maxOutputs: Number) {
        cdkBuilder.maxOutputs(maxOutputs)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty,
    ) : CdkObject(cdkObject), IngressGatewayBridgeProperty {
      override fun maxBitrate(): Number = unwrap(this).getMaxBitrate()

      override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressGatewayBridgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty):
          IngressGatewayBridgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressGatewayBridgeProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty
    }
  }
}
