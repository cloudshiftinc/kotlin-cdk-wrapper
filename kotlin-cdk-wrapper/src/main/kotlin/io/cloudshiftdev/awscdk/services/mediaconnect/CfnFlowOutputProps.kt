@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFlowOutputProps {
  public fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun destination(): String? = unwrap(this).getDestination()

  public fun encryption(): Any? = unwrap(this).getEncryption()

  public fun flowArn(): String

  public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  public fun minLatency(): Number? = unwrap(this).getMinLatency()

  public fun name(): String? = unwrap(this).getName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): String

  public fun remoteId(): String? = unwrap(this).getRemoteId()

  public fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

  public fun streamId(): String? = unwrap(this).getStreamId()

  public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

  @CdkDslMarker
  public interface Builder {
    public fun cidrAllowList(cidrAllowList: List<String>)

    public fun cidrAllowList(vararg cidrAllowList: String)

    public fun description(description: String)

    public fun destination(destination: String)

    public fun encryption(encryption: IResolvable)

    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f59ced2d139f794ca3d4f98e5468ddee0649043a41bfa5db7c3e30fd5d413d93")
    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty.Builder.() -> Unit)

    public fun flowArn(flowArn: String)

    public fun maxLatency(maxLatency: Number)

    public fun minLatency(minLatency: Number)

    public fun name(name: String)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun remoteId(remoteId: String)

    public fun smoothingLatency(smoothingLatency: Number)

    public fun streamId(streamId: String)

    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53231f0185723a488a606bc19d0ac25b401cce21ea6fa43381af0fef59ba93c")
    public
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps.builder()

    override fun cidrAllowList(cidrAllowList: List<String>) {
      cdkBuilder.cidrAllowList(cidrAllowList)
    }

    override fun cidrAllowList(vararg cidrAllowList: String): Unit =
        cidrAllowList(cidrAllowList.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    override fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(CfnFlowOutput.EncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f59ced2d139f794ca3d4f98e5468ddee0649043a41bfa5db7c3e30fd5d413d93")
    override fun encryption(encryption: CfnFlowOutput.EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(CfnFlowOutput.EncryptionProperty(encryption))

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
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

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun remoteId(remoteId: String) {
      cdkBuilder.remoteId(remoteId)
    }

    override fun smoothingLatency(smoothingLatency: Number) {
      cdkBuilder.smoothingLatency(smoothingLatency)
    }

    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
    }

    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty) {
      cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(CfnFlowOutput.VpcInterfaceAttachmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53231f0185723a488a606bc19d0ac25b401cce21ea6fa43381af0fef59ba93c")
    override
        fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder.() -> Unit):
        Unit =
        vpcInterfaceAttachment(CfnFlowOutput.VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps,
  ) : CdkObject(cdkObject), CfnFlowOutputProps {
    override fun cidrAllowList(): List<String> = unwrap(this).getCidrAllowList() ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun destination(): String? = unwrap(this).getDestination()

    override fun encryption(): Any? = unwrap(this).getEncryption()

    override fun flowArn(): String = unwrap(this).getFlowArn()

    override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    override fun minLatency(): Number? = unwrap(this).getMinLatency()

    override fun name(): String? = unwrap(this).getName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): String = unwrap(this).getProtocol()

    override fun remoteId(): String? = unwrap(this).getRemoteId()

    override fun smoothingLatency(): Number? = unwrap(this).getSmoothingLatency()

    override fun streamId(): String? = unwrap(this).getStreamId()

    override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps):
        CfnFlowOutputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowOutputProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps
  }
}
