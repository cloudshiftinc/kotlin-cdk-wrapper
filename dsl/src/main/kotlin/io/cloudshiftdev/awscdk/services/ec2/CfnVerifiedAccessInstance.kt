package io.cloudshiftdev.awscdk.services.ec2

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

public open class CfnVerifiedAccessInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrVerifiedAccessInstanceId(): String =
      unwrap(this).getAttrVerifiedAccessInstanceId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

  public open fun fipsEnabled(`value`: Boolean) {
    unwrap(this).setFipsEnabled(`value`)
  }

  public open fun fipsEnabled(`value`: IResolvable) {
    unwrap(this).setFipsEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

  public open fun loggingConfigurations(`value`: IResolvable) {
    unwrap(this).setLoggingConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfigurations(`value`: VerifiedAccessLogsProperty) {
    unwrap(this).setLoggingConfigurations(`value`.let(VerifiedAccessLogsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c5e806110dd174bbb0e8f423cf5f9572d6f877d3f7eef6312dd126d303a8077")
  public open fun loggingConfigurations(`value`: VerifiedAccessLogsProperty.Builder.() -> Unit):
      Unit = loggingConfigurations(VerifiedAccessLogsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun verifiedAccessTrustProviderIds(): List<String> =
      unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

  public open fun verifiedAccessTrustProviderIds(`value`: List<String>) {
    unwrap(this).setVerifiedAccessTrustProviderIds(`value`)
  }

  public open fun verifiedAccessTrustProviders(): Any? =
      unwrap(this).getVerifiedAccessTrustProviders()

  public open fun verifiedAccessTrustProviders(`value`: IResolvable) {
    unwrap(this).setVerifiedAccessTrustProviders(`value`.let(IResolvable::unwrap))
  }

  public open fun verifiedAccessTrustProviders(__idx_ac66f0: List<Any>) {
    unwrap(this).setVerifiedAccessTrustProviders(__idx_ac66f0)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun fipsEnabled(fipsEnabled: Boolean) {
    }

    public fun fipsEnabled(fipsEnabled: IResolvable) {
    }

    public fun loggingConfigurations(loggingConfigurations: IResolvable) {
    }

    public fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99df720468d1e979b85ec3ee08dff0ce186fbc0bbf564c059bf72d92494764a8")
    public
        fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>) {
    }

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
    }

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun fipsEnabled(fipsEnabled: Boolean) {
      cdkBuilder.fipsEnabled(fipsEnabled)
    }

    public override fun fipsEnabled(fipsEnabled: IResolvable) {
      cdkBuilder.fipsEnabled(fipsEnabled.let(IResolvable::unwrap))
    }

    public override fun loggingConfigurations(loggingConfigurations: IResolvable) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(IResolvable::unwrap))
    }

    public override fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(VerifiedAccessLogsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99df720468d1e979b85ec3ee08dff0ce186fbc0bbf564c059bf72d92494764a8")
    public override
        fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty.Builder.() -> Unit):
        Unit = loggingConfigurations(VerifiedAccessLogsProperty(loggingConfigurations))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override
        fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>) {
      cdkBuilder.verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds)
    }

    public override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders.let(IResolvable::unwrap))
    }

    public override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance):
        CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessInstance):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance = wrapped.cdkObject
  }

  public interface VerifiedAccessLogsProperty {
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    public fun includeTrustContext(): Any? = unwrap(this).getIncludeTrustContext()

    public fun kinesisDataFirehose(): Any? = unwrap(this).getKinesisDataFirehose()

    public fun logVersion(): String? = unwrap(this).getLogVersion()

    public fun s3(): Any? = unwrap(this).getS3()

    public interface Builder {
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
      }

      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39b540269ddc0fae51ac097e3797d65413d3ae85ee6b5395fa380bbb12a67c60")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit) {
      }

      public fun includeTrustContext(includeTrustContext: Boolean) {
      }

      public fun includeTrustContext(includeTrustContext: IResolvable) {
      }

      public fun kinesisDataFirehose(kinesisDataFirehose: IResolvable) {
      }

      public fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a0f2a2fe07149a1be9a246f07526a0fd870e0759fa81bd7393a2180b8a15013")
      public
          fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty.Builder.() -> Unit) {
      }

      public fun logVersion(logVersion: String) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c69bfd4264fe92e2ffb6015e86765982d8efc263627ca8eb32bc2adaeb15d2e")
      public fun s3(s3: S3Property.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder()

      public override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      public override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39b540269ddc0fae51ac097e3797d65413d3ae85ee6b5395fa380bbb12a67c60")
      public override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsProperty(cloudWatchLogs))

      public override fun includeTrustContext(includeTrustContext: Boolean) {
        cdkBuilder.includeTrustContext(includeTrustContext)
      }

      public override fun includeTrustContext(includeTrustContext: IResolvable) {
        cdkBuilder.includeTrustContext(includeTrustContext.let(IResolvable::unwrap))
      }

      public override fun kinesisDataFirehose(kinesisDataFirehose: IResolvable) {
        cdkBuilder.kinesisDataFirehose(kinesisDataFirehose.let(IResolvable::unwrap))
      }

      public override fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty) {
        cdkBuilder.kinesisDataFirehose(kinesisDataFirehose.let(KinesisDataFirehoseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a0f2a2fe07149a1be9a246f07526a0fd870e0759fa81bd7393a2180b8a15013")
      public override
          fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty.Builder.() -> Unit):
          Unit = kinesisDataFirehose(KinesisDataFirehoseProperty(kinesisDataFirehose))

      public override fun logVersion(logVersion: String) {
        cdkBuilder.logVersion(logVersion)
      }

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c69bfd4264fe92e2ffb6015e86765982d8efc263627ca8eb32bc2adaeb15d2e")
      public override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty,
    ) : VerifiedAccessLogsProperty {
      public override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      public override fun includeTrustContext(): Any? = unwrap(this).getIncludeTrustContext()

      public override fun kinesisDataFirehose(): Any? = unwrap(this).getKinesisDataFirehose()

      public override fun logVersion(): String? = unwrap(this).getLogVersion()

      public override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VerifiedAccessLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty):
          VerifiedAccessLogsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedAccessLogsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3Property {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketOwner(bucketOwner: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun prefix(prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property.Builder =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property,
    ) : S3Property {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun logGroup(): String? = unwrap(this).getLogGroup()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun logGroup(logGroup: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty,
    ) : CloudWatchLogsProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun logGroup(): String? = unwrap(this).getLogGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty):
          CloudWatchLogsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisDataFirehoseProperty {
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun deliveryStream(deliveryStream: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.builder()

      public override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty,
    ) : KinesisDataFirehoseProperty {
      public override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDataFirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty):
          KinesisDataFirehoseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisDataFirehoseProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VerifiedAccessTrustProviderProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

    public fun trustProviderType(): String? = unwrap(this).getTrustProviderType()

    public fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

    public fun verifiedAccessTrustProviderId(): String? =
        unwrap(this).getVerifiedAccessTrustProviderId()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun deviceTrustProviderType(deviceTrustProviderType: String) {
      }

      public fun trustProviderType(trustProviderType: String) {
      }

      public fun userTrustProviderType(userTrustProviderType: String) {
      }

      public fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun deviceTrustProviderType(deviceTrustProviderType: String) {
        cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
      }

      public override fun trustProviderType(trustProviderType: String) {
        cdkBuilder.trustProviderType(trustProviderType)
      }

      public override fun userTrustProviderType(userTrustProviderType: String) {
        cdkBuilder.userTrustProviderType(userTrustProviderType)
      }

      public override fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String) {
        cdkBuilder.verifiedAccessTrustProviderId(verifiedAccessTrustProviderId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty,
    ) : VerifiedAccessTrustProviderProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun deviceTrustProviderType(): String? =
          unwrap(this).getDeviceTrustProviderType()

      public override fun trustProviderType(): String? = unwrap(this).getTrustProviderType()

      public override fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

      public override fun verifiedAccessTrustProviderId(): String? =
          unwrap(this).getVerifiedAccessTrustProviderId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VerifiedAccessTrustProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty):
          VerifiedAccessTrustProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedAccessTrustProviderProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
