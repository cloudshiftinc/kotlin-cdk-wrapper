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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBridgeOutput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput,
) : CfnResource(cdkObject), IInspectable {
  public open fun bridgeArn(): String = unwrap(this).getBridgeArn()

  public open fun bridgeArn(`value`: String) {
    unwrap(this).setBridgeArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkOutput(): Any = unwrap(this).getNetworkOutput()

  public open fun networkOutput(`value`: IResolvable) {
    unwrap(this).setNetworkOutput(`value`.let(IResolvable::unwrap))
  }

  public open fun networkOutput(`value`: BridgeNetworkOutputProperty) {
    unwrap(this).setNetworkOutput(`value`.let(BridgeNetworkOutputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06b513390b2dc3b8e9e4e7afeba95a6a219a46540554396680abdd2bf8350811")
  public open fun networkOutput(`value`: BridgeNetworkOutputProperty.Builder.() -> Unit): Unit =
      networkOutput(BridgeNetworkOutputProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun bridgeArn(bridgeArn: String)

    public fun name(name: String)

    public fun networkOutput(networkOutput: IResolvable)

    public fun networkOutput(networkOutput: BridgeNetworkOutputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63c91da5424a8f4038ef57a0a4d6fbaa9b9de0f8567926eec46aad2a834a19d3")
    public fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.Builder.create(scope, id)

    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkOutput(networkOutput: IResolvable) {
      cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
    }

    override fun networkOutput(networkOutput: BridgeNetworkOutputProperty) {
      cdkBuilder.networkOutput(networkOutput.let(BridgeNetworkOutputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63c91da5424a8f4038ef57a0a4d6fbaa9b9de0f8567926eec46aad2a834a19d3")
    override fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit): Unit
        = networkOutput(BridgeNetworkOutputProperty(networkOutput))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridgeOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridgeOutput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput):
        CfnBridgeOutput = CfnBridgeOutput(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeOutput):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput = wrapped.cdkObject
  }

  public interface BridgeNetworkOutputProperty {
    public fun ipAddress(): String

    public fun networkName(): String

    public fun port(): Number

    public fun protocol(): String

    public fun ttl(): Number

    @CdkDslMarker
    public interface Builder {
      public fun ipAddress(ipAddress: String)

      public fun networkName(networkName: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty.builder()

      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
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
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty,
    ) : CdkObject(cdkObject), BridgeNetworkOutputProperty {
      override fun ipAddress(): String = unwrap(this).getIpAddress()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty):
          BridgeNetworkOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty
    }
  }
}
