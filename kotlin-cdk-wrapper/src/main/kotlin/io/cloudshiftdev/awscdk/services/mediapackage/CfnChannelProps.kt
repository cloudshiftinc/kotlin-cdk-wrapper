@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnChannelProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  public fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

  public fun id(): String

  public fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    public fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f6e31b184dad57e45154299101465dee25d352ddaec0d900a0b2ca27e97edd7")
    public
        fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit)

    public fun hlsIngest(hlsIngest: IResolvable)

    public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114fedf728458f87cca22f473e2cfe5c551e5a406d3bee64e831920a9e78ac36")
    public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun ingressAccessLogs(ingressAccessLogs: IResolvable)

    public fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17f0fbe9e87e41af5f2007a2bf99098a50efd7b281ca269701a8d5d341a37b54")
    public
        fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnChannelProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnChannelProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    override fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(CfnChannel.LogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f6e31b184dad57e45154299101465dee25d352ddaec0d900a0b2ca27e97edd7")
    override
        fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(CfnChannel.LogConfigurationProperty(egressAccessLogs))

    override fun hlsIngest(hlsIngest: IResolvable) {
      cdkBuilder.hlsIngest(hlsIngest.let(IResolvable::unwrap))
    }

    override fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty) {
      cdkBuilder.hlsIngest(hlsIngest.let(CfnChannel.HlsIngestProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("114fedf728458f87cca22f473e2cfe5c551e5a406d3bee64e831920a9e78ac36")
    override fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty.Builder.() -> Unit): Unit =
        hlsIngest(CfnChannel.HlsIngestProperty(hlsIngest))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(IResolvable::unwrap))
    }

    override fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(CfnChannel.LogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17f0fbe9e87e41af5f2007a2bf99098a50efd7b281ca269701a8d5d341a37b54")
    override
        fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty.Builder.() -> Unit):
        Unit = ingressAccessLogs(CfnChannel.LogConfigurationProperty(ingressAccessLogs))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

    override fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

    override fun id(): String = unwrap(this).getId()

    override fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.mediapackage.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnChannelProps
  }
}
