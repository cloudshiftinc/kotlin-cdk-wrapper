package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamingDistribution internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun streamingDistributionConfig(): Any = unwrap(this).getStreamingDistributionConfig()

  public open fun streamingDistributionConfig(`value`: IResolvable) {
    unwrap(this).setStreamingDistributionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun streamingDistributionConfig(`value`: StreamingDistributionConfigProperty) {
    unwrap(this).setStreamingDistributionConfig(`value`.let(StreamingDistributionConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb15058a414f523fe7eb5c4826cc129a779e8c2ea5fd447a001c0106893a413")
  public open
      fun streamingDistributionConfig(`value`: StreamingDistributionConfigProperty.Builder.() -> Unit):
      Unit = streamingDistributionConfig(StreamingDistributionConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable)

    public
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e9e247bd8e0c49394b5256d88df77e390a367befd6d78e2d0c82fd1b014d789")
    public
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder.create(scope,
        id)

    override fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(IResolvable::unwrap))
    }

    override
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(StreamingDistributionConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e9e247bd8e0c49394b5256d88df77e390a367befd6d78e2d0c82fd1b014d789")
    override
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty.Builder.() -> Unit):
        Unit =
        streamingDistributionConfig(StreamingDistributionConfigProperty(streamingDistributionConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamingDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamingDistribution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution):
        CfnStreamingDistribution = CfnStreamingDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingDistribution):
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution = wrapped.cdkObject
  }

  public interface StreamingDistributionConfigProperty {
    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    public fun comment(): String

    public fun enabled(): Any

    public fun logging(): Any? = unwrap(this).getLogging()

    public fun priceClass(): String? = unwrap(this).getPriceClass()

    public fun s3Origin(): Any

    public fun trustedSigners(): Any

    public interface Builder {
      public fun aliases(aliases: List<String>)

      public fun comment(comment: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun logging(logging: IResolvable)

      public fun logging(logging: LoggingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f86d3e1713c896fb6b6048a204745494e4f7ad2e124a1ed4e078c164c50efe")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      public fun priceClass(priceClass: String)

      public fun s3Origin(s3Origin: IResolvable)

      public fun s3Origin(s3Origin: S3OriginProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4c12f2c7ecb120a8392f852fb6f6fbdb57dd7fbeb250122704d188034199aea")
      public fun s3Origin(s3Origin: S3OriginProperty.Builder.() -> Unit)

      public fun trustedSigners(trustedSigners: IResolvable)

      public fun trustedSigners(trustedSigners: TrustedSignersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743ef977a158c5f6c2f051d502ab89211e8cda4e0e8658699025623e3dd74121")
      public fun trustedSigners(trustedSigners: TrustedSignersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.builder()

      override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable::unwrap))
      }

      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f86d3e1713c896fb6b6048a204745494e4f7ad2e124a1ed4e078c164c50efe")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      override fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
      }

      override fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin.let(IResolvable::unwrap))
      }

      override fun s3Origin(s3Origin: S3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin.let(S3OriginProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4c12f2c7ecb120a8392f852fb6f6fbdb57dd7fbeb250122704d188034199aea")
      override fun s3Origin(s3Origin: S3OriginProperty.Builder.() -> Unit): Unit =
          s3Origin(S3OriginProperty(s3Origin))

      override fun trustedSigners(trustedSigners: IResolvable) {
        cdkBuilder.trustedSigners(trustedSigners.let(IResolvable::unwrap))
      }

      override fun trustedSigners(trustedSigners: TrustedSignersProperty) {
        cdkBuilder.trustedSigners(trustedSigners.let(TrustedSignersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743ef977a158c5f6c2f051d502ab89211e8cda4e0e8658699025623e3dd74121")
      override fun trustedSigners(trustedSigners: TrustedSignersProperty.Builder.() -> Unit): Unit =
          trustedSigners(TrustedSignersProperty(trustedSigners))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty,
    ) : StreamingDistributionConfigProperty {
      override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      override fun comment(): String = unwrap(this).getComment()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun logging(): Any? = unwrap(this).getLogging()

      override fun priceClass(): String? = unwrap(this).getPriceClass()

      override fun s3Origin(): Any = unwrap(this).getS3Origin()

      override fun trustedSigners(): Any = unwrap(this).getTrustedSigners()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingDistributionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty):
          StreamingDistributionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingDistributionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OriginProperty {
    public fun domainName(): String

    public fun originAccessIdentity(): String

    public interface Builder {
      public fun domainName(domainName: String)

      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.builder()

      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty,
    ) : S3OriginProperty {
      override fun domainName(): String = unwrap(this).getDomainName()

      override fun originAccessIdentity(): String = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty):
          S3OriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingProperty {
    public fun bucket(): String

    public fun enabled(): Any

    public fun prefix(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty,
    ) : LoggingProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun prefix(): String = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrustedSignersProperty {
    public fun awsAccountNumbers(): List<String> = unwrap(this).getAwsAccountNumbers() ?:
        emptyList()

    public fun enabled(): Any

    public interface Builder {
      public fun awsAccountNumbers(awsAccountNumbers: List<String>)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.builder()

      override fun awsAccountNumbers(awsAccountNumbers: List<String>) {
        cdkBuilder.awsAccountNumbers(awsAccountNumbers)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty,
    ) : TrustedSignersProperty {
      override fun awsAccountNumbers(): List<String> = unwrap(this).getAwsAccountNumbers() ?:
          emptyList()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrustedSignersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty):
          TrustedSignersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrustedSignersProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
