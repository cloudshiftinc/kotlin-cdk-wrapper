@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnRecordingConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

  public open fun destinationConfiguration(`value`: IResolvable) {
    unwrap(this).setDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationConfiguration(`value`: DestinationConfigurationProperty) {
    unwrap(this).setDestinationConfiguration(`value`.let(DestinationConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1921f679292ab1ae792a66300e1e0d230f2f7cba64e28ec7975cc6fc4c92aeac")
  public open
      fun destinationConfiguration(`value`: DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = destinationConfiguration(DestinationConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recordingReconnectWindowSeconds(): Number? =
      unwrap(this).getRecordingReconnectWindowSeconds()

  public open fun recordingReconnectWindowSeconds(`value`: Number) {
    unwrap(this).setRecordingReconnectWindowSeconds(`value`)
  }

  public open fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

  public open fun renditionConfiguration(`value`: IResolvable) {
    unwrap(this).setRenditionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun renditionConfiguration(`value`: RenditionConfigurationProperty) {
    unwrap(this).setRenditionConfiguration(`value`.let(RenditionConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("998630e0944425bfb8c6aa257c81d1294bf15c3111d89530bdf26fc71f34980b")
  public open
      fun renditionConfiguration(`value`: RenditionConfigurationProperty.Builder.() -> Unit): Unit =
      renditionConfiguration(RenditionConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

  public open fun thumbnailConfiguration(`value`: IResolvable) {
    unwrap(this).setThumbnailConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun thumbnailConfiguration(`value`: ThumbnailConfigurationProperty) {
    unwrap(this).setThumbnailConfiguration(`value`.let(ThumbnailConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783585c19e0119f64cc61872ea9770f740260629bcdd9e1d511a651cd596b5bf")
  public open
      fun thumbnailConfiguration(`value`: ThumbnailConfigurationProperty.Builder.() -> Unit): Unit =
      thumbnailConfiguration(ThumbnailConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    public fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d407aa52af6315fb1a25da2154bbca3bc18a842da6c107df7f70a70267d611")
    public
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number)

    public fun renditionConfiguration(renditionConfiguration: IResolvable)

    public fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4293250e20969ee1d8871f0ac5697aea6481c930d08da9419416730803c5c5e1")
    public
        fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable)

    public fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b4057fa8d0b9a6fb3c9537c51e3b0b34b433634c0beaa0966bd68e04cdf83fe")
    public
        fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder =
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder.create(scope, id)

    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(DestinationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d407aa52af6315fb1a25da2154bbca3bc18a842da6c107df7f70a70267d611")
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit):
        Unit = destinationConfiguration(DestinationConfigurationProperty(destinationConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
      cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    override fun renditionConfiguration(renditionConfiguration: IResolvable) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(IResolvable::unwrap))
    }

    override fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(RenditionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4293250e20969ee1d8871f0ac5697aea6481c930d08da9419416730803c5c5e1")
    override
        fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty.Builder.() -> Unit):
        Unit = renditionConfiguration(RenditionConfigurationProperty(renditionConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable::unwrap))
    }

    override fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(ThumbnailConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b4057fa8d0b9a6fb3c9537c51e3b0b34b433634c0beaa0966bd68e04cdf83fe")
    override
        fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit):
        Unit = thumbnailConfiguration(ThumbnailConfigurationProperty(thumbnailConfiguration))

    public fun build(): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecordingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecordingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration):
        CfnRecordingConfiguration = CfnRecordingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnRecordingConfiguration):
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration = wrapped.cdkObject
  }

  public interface ThumbnailConfigurationProperty {
    public fun recordingMode(): String? = unwrap(this).getRecordingMode()

    public fun resolution(): String? = unwrap(this).getResolution()

    public fun storage(): List<String> = unwrap(this).getStorage() ?: emptyList()

    public fun targetIntervalSeconds(): Number? = unwrap(this).getTargetIntervalSeconds()

    @CdkDslMarker
    public interface Builder {
      public fun recordingMode(recordingMode: String)

      public fun resolution(resolution: String)

      public fun storage(storage: List<String>)

      public fun storage(vararg storage: String)

      public fun targetIntervalSeconds(targetIntervalSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty.builder()

      override fun recordingMode(recordingMode: String) {
        cdkBuilder.recordingMode(recordingMode)
      }

      override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      override fun storage(storage: List<String>) {
        cdkBuilder.storage(storage)
      }

      override fun storage(vararg storage: String): Unit = storage(storage.toList())

      override fun targetIntervalSeconds(targetIntervalSeconds: Number) {
        cdkBuilder.targetIntervalSeconds(targetIntervalSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty,
    ) : CdkObject(cdkObject), ThumbnailConfigurationProperty {
      override fun recordingMode(): String? = unwrap(this).getRecordingMode()

      override fun resolution(): String? = unwrap(this).getResolution()

      override fun storage(): List<String> = unwrap(this).getStorage() ?: emptyList()

      override fun targetIntervalSeconds(): Number? = unwrap(this).getTargetIntervalSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThumbnailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty):
          ThumbnailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThumbnailConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
    }
  }

  public interface RenditionConfigurationProperty {
    public fun renditionSelection(): String? = unwrap(this).getRenditionSelection()

    public fun renditions(): List<String> = unwrap(this).getRenditions() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun renditionSelection(renditionSelection: String)

      public fun renditions(renditions: List<String>)

      public fun renditions(vararg renditions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty.builder()

      override fun renditionSelection(renditionSelection: String) {
        cdkBuilder.renditionSelection(renditionSelection)
      }

      override fun renditions(renditions: List<String>) {
        cdkBuilder.renditions(renditions)
      }

      override fun renditions(vararg renditions: String): Unit = renditions(renditions.toList())

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty,
    ) : CdkObject(cdkObject), RenditionConfigurationProperty {
      override fun renditionSelection(): String? = unwrap(this).getRenditionSelection()

      override fun renditions(): List<String> = unwrap(this).getRenditions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenditionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty):
          RenditionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenditionConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
    }
  }

  public interface S3DestinationConfigurationProperty {
    public fun bucketName(): String

    @CdkDslMarker
    public interface Builder {
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), S3DestinationConfigurationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
    }
  }

  public interface DestinationConfigurationProperty {
    public fun s3(): Any? = unwrap(this).getS3()

    @CdkDslMarker
    public interface Builder {
      public fun s3(s3: IResolvable)

      public fun s3(s3: S3DestinationConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6ad42ab79105fc24c2341e6d6a65a26eefa911bae8021e12fd5343174471510")
      public fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.builder()

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6ad42ab79105fc24c2341e6d6a65a26eefa911bae8021e12fd5343174471510")
      override fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), DestinationConfigurationProperty {
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty):
          DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
    }
  }
}
