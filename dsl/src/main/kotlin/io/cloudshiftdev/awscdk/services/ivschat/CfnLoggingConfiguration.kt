package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

  public open fun destinationConfiguration(`value`: IResolvable) {
    unwrap(this).setDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationConfiguration(`value`: DestinationConfigurationProperty) {
    unwrap(this).setDestinationConfiguration(`value`.let(DestinationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb8803b76214424d9d7ba44fb4c29105aea5a7b60d31a5615f2c7607904e1171")
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

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    public fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18eb57c632a1391c6a0d20056d1ab98d9496299c5c2cd11e1bc8805249aef694")
    public
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.Builder
        = software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.Builder.create(scope, id)

    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(DestinationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18eb57c632a1391c6a0d20056d1ab98d9496299c5c2cd11e1bc8805249aef694")
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit):
        Unit = destinationConfiguration(DestinationConfigurationProperty(destinationConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration = wrapped.cdkObject
  }

  public interface CloudWatchLogsDestinationConfigurationProperty {
    public fun logGroupName(): String

    public interface Builder {
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.builder()

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty,
    ) : CloudWatchLogsDestinationConfigurationProperty {
      override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty):
          CloudWatchLogsDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FirehoseDestinationConfigurationProperty {
    public fun deliveryStreamName(): String

    public interface Builder {
      public fun deliveryStreamName(deliveryStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder()

      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty,
    ) : FirehoseDestinationConfigurationProperty {
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FirehoseDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty):
          FirehoseDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseDestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DestinationConfigurationProperty {
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    public fun firehose(): Any? = unwrap(this).getFirehose()

    public fun s3(): Any? = unwrap(this).getS3()

    public interface Builder {
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3968e85bcc2c237bcec17c819acdc83e32d3ffadd52380cabcb56b86085b3fef")
      public
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty.Builder.() -> Unit)

      public fun firehose(firehose: IResolvable)

      public fun firehose(firehose: FirehoseDestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5833b0964624baeda12c696042c032ca461b193e07f2a8a9ca7a9ff2c58cd6a")
      public fun firehose(firehose: FirehoseDestinationConfigurationProperty.Builder.() -> Unit)

      public fun s3(s3: IResolvable)

      public fun s3(s3: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a3f0da321aee205bede398975e578ba3c4c961686a7cb73d1cce27830adf22")
      public fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty.builder()

      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsDestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3968e85bcc2c237bcec17c819acdc83e32d3ffadd52380cabcb56b86085b3fef")
      override
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty(cloudWatchLogs))

      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      override fun firehose(firehose: FirehoseDestinationConfigurationProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseDestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5833b0964624baeda12c696042c032ca461b193e07f2a8a9ca7a9ff2c58cd6a")
      override fun firehose(firehose: FirehoseDestinationConfigurationProperty.Builder.() -> Unit):
          Unit = firehose(FirehoseDestinationConfigurationProperty(firehose))

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a3f0da321aee205bede398975e578ba3c4c961686a7cb73d1cce27830adf22")
      override fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty,
    ) : DestinationConfigurationProperty {
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      override fun firehose(): Any? = unwrap(this).getFirehose()

      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty):
          DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DestinationConfigurationProperty {
    public fun bucketName(): String

    public interface Builder {
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty,
    ) : S3DestinationConfigurationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
