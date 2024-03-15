@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDecoderManifestProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun modelManifestArn(): String

  public fun name(): String

  public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  public fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun modelManifestArn(modelManifestArn: String)

    public fun name(name: String)

    public fun networkInterfaces(networkInterfaces: IResolvable)

    public fun networkInterfaces(networkInterfaces: List<Any>)

    public fun networkInterfaces(vararg networkInterfaces: Any)

    public fun signalDecoders(signalDecoders: IResolvable)

    public fun signalDecoders(signalDecoders: List<Any>)

    public fun signalDecoders(vararg signalDecoders: Any)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces)
    }

    override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
        networkInterfaces(networkInterfaces.toList())

    override fun signalDecoders(signalDecoders: IResolvable) {
      cdkBuilder.signalDecoders(signalDecoders.let(IResolvable::unwrap))
    }

    override fun signalDecoders(signalDecoders: List<Any>) {
      cdkBuilder.signalDecoders(signalDecoders)
    }

    override fun signalDecoders(vararg signalDecoders: Any): Unit =
        signalDecoders(signalDecoders.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps,
  ) : CdkObject(cdkObject), CfnDecoderManifestProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

    override fun name(): String = unwrap(this).getName()

    override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    override fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDecoderManifestProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps):
        CfnDecoderManifestProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDecoderManifestProps):
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
  }
}
