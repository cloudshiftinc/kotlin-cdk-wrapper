@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRecordingConfigurationProps {
  public fun destinationConfiguration(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun recordingReconnectWindowSeconds(): Number? =
      unwrap(this).getRecordingReconnectWindowSeconds()

  public fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    public
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58180dd4e9264a9c8911be547ae7711ddc29314df75c8f32ab8db35c7186bb6c")
    public
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number)

    public fun renditionConfiguration(renditionConfiguration: IResolvable)

    public
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cda16ae9df549bb6c087fdea06900e71e8f7d940b95b30468a33e9d114198c")
    public
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable)

    public
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b0021c4b1e2f576647e42217dede135f3ceb4a05c2cef1f9334c060539e15c")
    public
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.Builder =
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.builder()

    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(CfnRecordingConfiguration.DestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58180dd4e9264a9c8911be547ae7711ddc29314df75c8f32ab8db35c7186bb6c")
    override
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        destinationConfiguration(CfnRecordingConfiguration.DestinationConfigurationProperty(destinationConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
      cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    override fun renditionConfiguration(renditionConfiguration: IResolvable) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(CfnRecordingConfiguration.RenditionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cda16ae9df549bb6c087fdea06900e71e8f7d940b95b30468a33e9d114198c")
    override
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty.Builder.() -> Unit):
        Unit =
        renditionConfiguration(CfnRecordingConfiguration.RenditionConfigurationProperty(renditionConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable::unwrap))
    }

    override
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(CfnRecordingConfiguration.ThumbnailConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b0021c4b1e2f576647e42217dede135f3ceb4a05c2cef1f9334c060539e15c")
    override
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder.() -> Unit):
        Unit =
        thumbnailConfiguration(CfnRecordingConfiguration.ThumbnailConfigurationProperty(thumbnailConfiguration))

    public fun build(): software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps,
  ) : CdkObject(cdkObject), CfnRecordingConfigurationProps {
    override fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

    override fun name(): String? = unwrap(this).getName()

    override fun recordingReconnectWindowSeconds(): Number? =
        unwrap(this).getRecordingReconnectWindowSeconds()

    override fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps):
        CfnRecordingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordingConfigurationProps):
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
  }
}
