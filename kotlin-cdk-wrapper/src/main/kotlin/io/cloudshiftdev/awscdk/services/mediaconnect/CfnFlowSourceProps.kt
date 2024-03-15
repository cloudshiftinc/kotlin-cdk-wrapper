@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFlowSourceProps {
  public fun decryption(): Any? = unwrap(this).getDecryption()

  public fun description(): String

  public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

  public fun flowArn(): String? = unwrap(this).getFlowArn()

  public fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

  public fun ingestPort(): Number? = unwrap(this).getIngestPort()

  public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

  public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  public fun minLatency(): Number? = unwrap(this).getMinLatency()

  public fun name(): String

  public fun protocol(): String? = unwrap(this).getProtocol()

  public fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

  public fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

  public fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

  public fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

  public fun streamId(): String? = unwrap(this).getStreamId()

  public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

  public fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

  @CdkDslMarker
  public interface Builder {
    public fun decryption(decryption: IResolvable)

    public fun decryption(decryption: CfnFlowSource.EncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0976742db86495e5476f81a237be48492ec425993aeaf16c967a70445457db")
    public fun decryption(decryption: CfnFlowSource.EncryptionProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun entitlementArn(entitlementArn: String)

    public fun flowArn(flowArn: String)

    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

    public fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("269657b8a09c3885e667977a7b2e75de5100021b63bd0633dd13f7f80860882c")
    public
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty.Builder.() -> Unit)

    public fun ingestPort(ingestPort: Number)

    public fun maxBitrate(maxBitrate: Number)

    public fun maxLatency(maxLatency: Number)

    public fun minLatency(minLatency: Number)

    public fun name(name: String)

    public fun protocol(protocol: String)

    public fun senderControlPort(senderControlPort: Number)

    public fun senderIpAddress(senderIpAddress: String)

    public fun sourceListenerAddress(sourceListenerAddress: String)

    public fun sourceListenerPort(sourceListenerPort: Number)

    public fun streamId(streamId: String)

    public fun vpcInterfaceName(vpcInterfaceName: String)

    public fun whitelistCidr(whitelistCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps.builder()

    override fun decryption(decryption: IResolvable) {
      cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
    }

    override fun decryption(decryption: CfnFlowSource.EncryptionProperty) {
      cdkBuilder.decryption(decryption.let(CfnFlowSource.EncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0976742db86495e5476f81a237be48492ec425993aeaf16c967a70445457db")
    override fun decryption(decryption: CfnFlowSource.EncryptionProperty.Builder.() -> Unit): Unit =
        decryption(CfnFlowSource.EncryptionProperty(decryption))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entitlementArn(entitlementArn: String) {
      cdkBuilder.entitlementArn(entitlementArn)
    }

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
    }

    override
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(CfnFlowSource.GatewayBridgeSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("269657b8a09c3885e667977a7b2e75de5100021b63bd0633dd13f7f80860882c")
    override
        fun gatewayBridgeSource(gatewayBridgeSource: CfnFlowSource.GatewayBridgeSourceProperty.Builder.() -> Unit):
        Unit = gatewayBridgeSource(CfnFlowSource.GatewayBridgeSourceProperty(gatewayBridgeSource))

    override fun ingestPort(ingestPort: Number) {
      cdkBuilder.ingestPort(ingestPort)
    }

    override fun maxBitrate(maxBitrate: Number) {
      cdkBuilder.maxBitrate(maxBitrate)
    }

    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

    override fun minLatency(minLatency: Number) {
      cdkBuilder.minLatency(minLatency)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun senderControlPort(senderControlPort: Number) {
      cdkBuilder.senderControlPort(senderControlPort)
    }

    override fun senderIpAddress(senderIpAddress: String) {
      cdkBuilder.senderIpAddress(senderIpAddress)
    }

    override fun sourceListenerAddress(sourceListenerAddress: String) {
      cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    override fun sourceListenerPort(sourceListenerPort: Number) {
      cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    override fun vpcInterfaceName(vpcInterfaceName: String) {
      cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    override fun whitelistCidr(whitelistCidr: String) {
      cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps,
  ) : CdkObject(cdkObject), CfnFlowSourceProps {
    override fun decryption(): Any? = unwrap(this).getDecryption()

    override fun description(): String = unwrap(this).getDescription()

    override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    override fun flowArn(): String? = unwrap(this).getFlowArn()

    override fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

    override fun ingestPort(): Number? = unwrap(this).getIngestPort()

    override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    override fun minLatency(): Number? = unwrap(this).getMinLatency()

    override fun name(): String = unwrap(this).getName()

    override fun protocol(): String? = unwrap(this).getProtocol()

    override fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

    override fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

    override fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

    override fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

    override fun streamId(): String? = unwrap(this).getStreamId()

    override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    override fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps):
        CfnFlowSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowSourceProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowSourceProps
  }
}
