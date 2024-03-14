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

public open class CfnFlow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFlowArn(): String = unwrap(this).getAttrFlowArn()

  public open fun attrFlowAvailabilityZone(): String = unwrap(this).getAttrFlowAvailabilityZone()

  public open fun attrSourceIngestIp(): String = unwrap(this).getAttrSourceIngestIp()

  public open fun attrSourceSourceArn(): String = unwrap(this).getAttrSourceSourceArn()

  public open fun attrSourceSourceIngestPort(): String =
      unwrap(this).getAttrSourceSourceIngestPort()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1cab647f51a5450b2a4fcffeffe02c98559948506b0b730b43959630b2684b8c")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  public open fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  public open fun sourceFailoverConfig(`value`: IResolvable) {
    unwrap(this).setSourceFailoverConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty) {
    unwrap(this).setSourceFailoverConfig(`value`.let(FailoverConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6ceeb1eb4eed29a4ba3a766c50ca14ac56f766293c5979c53dffa685b655f0c")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

  public interface Builder {
    public fun availabilityZone(availabilityZone: String) {
    }

    public fun name(name: String) {
    }

    public fun source(source: IResolvable) {
    }

    public fun source(source: SourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    public fun source(source: SourceProperty.Builder.() -> Unit) {
    }

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    }

    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    public
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder.create(scope, id)

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    public override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    public override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    public override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    public override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    public override
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(FailoverConfigProperty(sourceFailoverConfig))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.mediaconnect.CfnFlow =
        wrapped.cdkObject
  }

  public interface SourcePriorityProperty {
    public fun primarySource(): String

    public interface Builder {
      public fun primarySource(primarySource: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.builder()

      public override fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty,
    ) : SourcePriorityProperty {
      public override fun primarySource(): String = unwrap(this).getPrimarySource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourcePriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty):
          SourcePriorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FailoverConfigProperty {
    public fun failoverMode(): String? = unwrap(this).getFailoverMode()

    public fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

    public fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun failoverMode(failoverMode: String) {
      }

      public fun recoveryWindow(recoveryWindow: Number) {
      }

      public fun sourcePriority(sourcePriority: IResolvable) {
      }

      public fun sourcePriority(sourcePriority: SourcePriorityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
      public fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit) {
      }

      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.builder()

      public override fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
      }

      public override fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
      }

      public override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable::unwrap))
      }

      public override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
      public override fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit):
          Unit = sourcePriority(SourcePriorityProperty(sourcePriority))

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty,
    ) : FailoverConfigProperty {
      public override fun failoverMode(): String? = unwrap(this).getFailoverMode()

      public override fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

      public override fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

      public override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty):
          FailoverConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionProperty {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun deviceId(): String? = unwrap(this).getDeviceId()

    public fun keyType(): String? = unwrap(this).getKeyType()

    public fun region(): String? = unwrap(this).getRegion()

    public fun resourceId(): String? = unwrap(this).getResourceId()

    public fun roleArn(): String

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun constantInitializationVector(constantInitializationVector: String) {
      }

      public fun deviceId(deviceId: String) {
      }

      public fun keyType(keyType: String) {
      }

      public fun region(region: String) {
      }

      public fun resourceId(resourceId: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun secretArn(secretArn: String) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      public override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      public override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty,
    ) : EncryptionProperty {
      public override fun algorithm(): String? = unwrap(this).getAlgorithm()

      public override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      public override fun deviceId(): String? = unwrap(this).getDeviceId()

      public override fun keyType(): String? = unwrap(this).getKeyType()

      public override fun region(): String? = unwrap(this).getRegion()

      public override fun resourceId(): String? = unwrap(this).getResourceId()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun secretArn(): String? = unwrap(this).getSecretArn()

      public override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceProperty {
    public fun decryption(): Any? = unwrap(this).getDecryption()

    public fun description(): String? = unwrap(this).getDescription()

    public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    public fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

    public fun ingestIp(): String? = unwrap(this).getIngestIp()

    public fun ingestPort(): Number? = unwrap(this).getIngestPort()

    public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    public fun minLatency(): Number? = unwrap(this).getMinLatency()

    public fun name(): String? = unwrap(this).getName()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

    public fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    public fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

    public fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

    public fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

    public fun streamId(): String? = unwrap(this).getStreamId()

    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    public fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

    public interface Builder {
      public fun decryption(decryption: IResolvable) {
      }

      public fun decryption(decryption: EncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit) {
      }

      public fun description(description: String) {
      }

      public fun entitlementArn(entitlementArn: String) {
      }

      public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
      }

      public fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      public
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit) {
      }

      public fun ingestIp(ingestIp: String) {
      }

      public fun ingestPort(ingestPort: Number) {
      }

      public fun maxBitrate(maxBitrate: Number) {
      }

      public fun maxLatency(maxLatency: Number) {
      }

      public fun minLatency(minLatency: Number) {
      }

      public fun name(name: String) {
      }

      public fun protocol(protocol: String) {
      }

      public fun senderControlPort(senderControlPort: Number) {
      }

      public fun senderIpAddress(senderIpAddress: String) {
      }

      public fun sourceArn(sourceArn: String) {
      }

      public fun sourceIngestPort(sourceIngestPort: String) {
      }

      public fun sourceListenerAddress(sourceListenerAddress: String) {
      }

      public fun sourceListenerPort(sourceListenerPort: Number) {
      }

      public fun streamId(streamId: String) {
      }

      public fun vpcInterfaceName(vpcInterfaceName: String) {
      }

      public fun whitelistCidr(whitelistCidr: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.builder()

      public override fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
      }

      public override fun decryption(decryption: EncryptionProperty) {
        cdkBuilder.decryption(decryption.let(EncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      public override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
          decryption(EncryptionProperty(decryption))

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
      }

      public override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
      }

      public override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      public override
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit):
          Unit = gatewayBridgeSource(GatewayBridgeSourceProperty(gatewayBridgeSource))

      public override fun ingestIp(ingestIp: String) {
        cdkBuilder.ingestIp(ingestIp)
      }

      public override fun ingestPort(ingestPort: Number) {
        cdkBuilder.ingestPort(ingestPort)
      }

      public override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      public override fun maxLatency(maxLatency: Number) {
        cdkBuilder.maxLatency(maxLatency)
      }

      public override fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public override fun senderControlPort(senderControlPort: Number) {
        cdkBuilder.senderControlPort(senderControlPort)
      }

      public override fun senderIpAddress(senderIpAddress: String) {
        cdkBuilder.senderIpAddress(senderIpAddress)
      }

      public override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public override fun sourceIngestPort(sourceIngestPort: String) {
        cdkBuilder.sourceIngestPort(sourceIngestPort)
      }

      public override fun sourceListenerAddress(sourceListenerAddress: String) {
        cdkBuilder.sourceListenerAddress(sourceListenerAddress)
      }

      public override fun sourceListenerPort(sourceListenerPort: Number) {
        cdkBuilder.sourceListenerPort(sourceListenerPort)
      }

      public override fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
      }

      public override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public override fun whitelistCidr(whitelistCidr: String) {
        cdkBuilder.whitelistCidr(whitelistCidr)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    ) : SourceProperty {
      public override fun decryption(): Any? = unwrap(this).getDecryption()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

      public override fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

      public override fun ingestIp(): String? = unwrap(this).getIngestIp()

      public override fun ingestPort(): Number? = unwrap(this).getIngestPort()

      public override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      public override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

      public override fun minLatency(): Number? = unwrap(this).getMinLatency()

      public override fun name(): String? = unwrap(this).getName()

      public override fun protocol(): String? = unwrap(this).getProtocol()

      public override fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

      public override fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

      public override fun sourceArn(): String? = unwrap(this).getSourceArn()

      public override fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

      public override fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

      public override fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

      public override fun streamId(): String? = unwrap(this).getStreamId()

      public override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

      public override fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GatewayBridgeSourceProperty {
    public fun bridgeArn(): String

    public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

    public interface Builder {
      public fun bridgeArn(bridgeArn: String) {
      }

      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      }

      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      public
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.builder()

      public override fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
      }

      public override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      public override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      public override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty,
    ) : GatewayBridgeSourceProperty {
      public override fun bridgeArn(): String = unwrap(this).getBridgeArn()

      public override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayBridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty):
          GatewayBridgeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcInterfaceAttachmentProperty {
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    public interface Builder {
      public fun vpcInterfaceName(vpcInterfaceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.builder()

      public override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
