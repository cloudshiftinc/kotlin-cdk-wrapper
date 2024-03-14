package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBridgeSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource,
) : CfnResource(cdkObject), IInspectable {
  public open fun bridgeArn(): String = unwrap(this).getBridgeArn()

  public open fun bridgeArn(`value`: String) {
    unwrap(this).setBridgeArn(`value`)
  }

  public open fun flowSource(): Any? = unwrap(this).getFlowSource()

  public open fun flowSource(`value`: IResolvable) {
    unwrap(this).setFlowSource(`value`.let(IResolvable::unwrap))
  }

  public open fun flowSource(`value`: BridgeFlowSourceProperty) {
    unwrap(this).setFlowSource(`value`.let(BridgeFlowSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f35bd9d9dce9c21e47c1c586b44f3cd49d19e35ef4924b38c43a6e8bb09d0ad0")
  public open fun flowSource(`value`: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
      flowSource(BridgeFlowSourceProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkSource(): Any? = unwrap(this).getNetworkSource()

  public open fun networkSource(`value`: IResolvable) {
    unwrap(this).setNetworkSource(`value`.let(IResolvable::unwrap))
  }

  public open fun networkSource(`value`: BridgeNetworkSourceProperty) {
    unwrap(this).setNetworkSource(`value`.let(BridgeNetworkSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10b7826c27059c2c2192a3b1e1af166be2e9076e8f9397fa1299854f59705561")
  public open fun networkSource(`value`: BridgeNetworkSourceProperty.Builder.() -> Unit): Unit =
      networkSource(BridgeNetworkSourceProperty(`value`))

  public interface Builder {
    public fun bridgeArn(bridgeArn: String) {
    }

    public fun flowSource(flowSource: IResolvable) {
    }

    public fun flowSource(flowSource: BridgeFlowSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14219218af9bf4119d9a300e98e1eba9e68fb69255d59134be5c58b26a0a3266")
    public fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun networkSource(networkSource: IResolvable) {
    }

    public fun networkSource(networkSource: BridgeNetworkSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c433b768300479d0195d0079aaf4b5ad0d06975e9878cb5629961d760ccb830")
    public fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.Builder.create(scope, id)

    public override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    public override fun flowSource(flowSource: IResolvable) {
      cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
    }

    public override fun flowSource(flowSource: BridgeFlowSourceProperty) {
      cdkBuilder.flowSource(flowSource.let(BridgeFlowSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14219218af9bf4119d9a300e98e1eba9e68fb69255d59134be5c58b26a0a3266")
    public override fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
        flowSource(BridgeFlowSourceProperty(flowSource))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun networkSource(networkSource: IResolvable) {
      cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
    }

    public override fun networkSource(networkSource: BridgeNetworkSourceProperty) {
      cdkBuilder.networkSource(networkSource.let(BridgeNetworkSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c433b768300479d0195d0079aaf4b5ad0d06975e9878cb5629961d760ccb830")
    public override
        fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit): Unit =
        networkSource(BridgeNetworkSourceProperty(networkSource))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridgeSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridgeSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource):
        CfnBridgeSource = CfnBridgeSource(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeSource):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSource = wrapped.cdkObject
  }

  public interface VpcInterfaceAttachmentProperty {
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    public interface Builder {
      public fun vpcInterfaceName(vpcInterfaceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty.builder()

      public override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty,
    ) : VpcInterfaceAttachmentProperty {
      public override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BridgeNetworkSourceProperty {
    public fun multicastIp(): String

    public fun networkName(): String

    public fun port(): Number

    public fun protocol(): String

    public interface Builder {
      public fun multicastIp(multicastIp: String) {
      }

      public fun networkName(networkName: String) {
      }

      public fun port(port: Number) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty.builder()

      public override fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
      }

      public override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty,
    ) : BridgeNetworkSourceProperty {
      public override fun multicastIp(): String = unwrap(this).getMulticastIp()

      public override fun networkName(): String = unwrap(this).getNetworkName()

      public override fun port(): Number = unwrap(this).getPort()

      public override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty):
          BridgeNetworkSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BridgeFlowSourceProperty {
    public fun flowArn(): String

    public fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

    public interface Builder {
      public fun flowArn(flowArn: String) {
      }

      public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
      }

      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f5dfd0f80287bd748769d5a24c4c5a1aba5deafd383f87751193631c586b24c")
      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty.builder()

      public override fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
      }

      public override fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      public override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f5dfd0f80287bd748769d5a24c4c5a1aba5deafd383f87751193631c586b24c")
      public override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit =
          flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty(flowVpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty,
    ) : BridgeFlowSourceProperty {
      public override fun flowArn(): String = unwrap(this).getFlowArn()

      public override fun flowVpcInterfaceAttachment(): Any? =
          unwrap(this).getFlowVpcInterfaceAttachment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeFlowSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty):
          BridgeFlowSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeFlowSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
