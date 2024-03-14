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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowOutput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrOutputArn(): String = unwrap(this).getAttrOutputArn()

  public open fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

  public open fun cidrAllowList(`value`: List<String>) {
    unwrap(this).setCidrAllowList(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destination(): String? = unwrap(this).getDestination()

  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  public open fun encryption(): Any? = unwrap(this).getEncryption()

  public open fun encryption(`value`: IResolvable) {
    unwrap(this).setEncryption(`value`.let(IResolvable::unwrap))
  }

  public open fun encryption(`value`: EncryptionProperty) {
    unwrap(this).setEncryption(`value`.let(EncryptionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("34150c17429825542e545bf1fdc131117f5c2a63847265dd4a6f1ebe9a35a31d")
  public open fun encryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      encryption(EncryptionProperty(`value`))

  public open fun flowArn(): String = unwrap(this).getFlowArn()

  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  public open fun maxLatency(`value`: Number) {
    unwrap(this).setMaxLatency(`value`)
  }

  public open fun minLatency(): Number? = unwrap(this).getMinLatency()

  public open fun minLatency(`value`: Number) {
    unwrap(this).setMinLatency(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun protocol(): String = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun remoteId(): String? = unwrap(this).getRemoteId()

  public open fun remoteId(`value`: String) {
    unwrap(this).setRemoteId(`value`)
  }

  public open fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

  public open fun smoothingLatency(`value`: Number) {
    unwrap(this).setSmoothingLatency(`value`)
  }

  public open fun streamId(): String? = unwrap(this).getStreamId()

  public open fun streamId(`value`: String) {
    unwrap(this).setStreamId(`value`)
  }

  public open fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

  public open fun vpcInterfaceAttachment(`value`: IResolvable) {
    unwrap(this).setVpcInterfaceAttachment(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcInterfaceAttachment(`value`: VpcInterfaceAttachmentProperty) {
    unwrap(this).setVpcInterfaceAttachment(`value`.let(VpcInterfaceAttachmentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c8cd4ddbfa9debad1194d03150a7f31338a3a470c154b7b68f9e76914764e8")
  public open
      fun vpcInterfaceAttachment(`value`: VpcInterfaceAttachmentProperty.Builder.() -> Unit): Unit =
      vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(`value`))

  public interface Builder {
    public fun cidrAllowList(cidrAllowList: List<String>) {
    }

    public fun description(description: String) {
    }

    public fun destination(destination: String) {
    }

    public fun encryption(encryption: IResolvable) {
    }

    public fun encryption(encryption: EncryptionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40bfe21686627a21508f97b0b94d2276d2b7a80627f2b75acc06b464e5314460")
    public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit) {
    }

    public fun flowArn(flowArn: String) {
    }

    public fun maxLatency(maxLatency: Number) {
    }

    public fun minLatency(minLatency: Number) {
    }

    public fun name(name: String) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: String) {
    }

    public fun remoteId(remoteId: String) {
    }

    public fun smoothingLatency(smoothingLatency: Number) {
    }

    public fun streamId(streamId: String) {
    }

    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
    }

    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d453e2c57e9a6614af8b22f664e7a79444a20efe7a3e2be75552713a7e6a708b")
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.Builder.create(scope, id)

    public override fun cidrAllowList(cidrAllowList: List<String>) {
      cdkBuilder.cidrAllowList(cidrAllowList)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    public override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    public override fun encryption(encryption: EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40bfe21686627a21508f97b0b94d2276d2b7a80627f2b75acc06b464e5314460")
    public override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(EncryptionProperty(encryption))

    public override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
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

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public override fun remoteId(remoteId: String) {
      cdkBuilder.remoteId(remoteId)
    }

    public override fun smoothingLatency(smoothingLatency: Number) {
      cdkBuilder.smoothingLatency(smoothingLatency)
    }

    public override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    public override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
    }

    public override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d453e2c57e9a6614af8b22f664e7a79444a20efe7a3e2be75552713a7e6a708b")
    public override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
        Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowOutput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput):
        CfnFlowOutput = CfnFlowOutput(cdkObject)

    internal fun unwrap(wrapped: CfnFlowOutput):
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutput = wrapped.cdkObject
  }

  public interface EncryptionProperty {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun keyType(): String? = unwrap(this).getKeyType()

    public fun roleArn(): String

    public fun secretArn(): String

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun keyType(keyType: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun secretArn(secretArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty,
    ) : EncryptionProperty {
      public override fun algorithm(): String? = unwrap(this).getAlgorithm()

      public override fun keyType(): String? = unwrap(this).getKeyType()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty = (wrapped
          as Wrapper).cdkObject
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
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty.builder()

      public override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
