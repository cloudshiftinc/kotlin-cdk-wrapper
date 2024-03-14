package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun channelName(): String? = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun channelStorage(): Any? = unwrap(this).getChannelStorage()

  public open fun channelStorage(`value`: IResolvable) {
    unwrap(this).setChannelStorage(`value`.let(IResolvable::unwrap))
  }

  public open fun channelStorage(`value`: ChannelStorageProperty) {
    unwrap(this).setChannelStorage(`value`.let(ChannelStorageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03476dd732592a6dd40175a2b6460b35b25cb45bff67d8bd3ad73beb92fc1b96")
  public open fun channelStorage(`value`: ChannelStorageProperty.Builder.() -> Unit): Unit =
      channelStorage(ChannelStorageProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable::unwrap))
  }

  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63fc05a852f6eb77a310b7d891ee7d96a3b6c6c18f36f9b1f9e04d2d58ea1fbe")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun channelName(channelName: String)

    public fun channelStorage(channelStorage: IResolvable)

    public fun channelStorage(channelStorage: ChannelStorageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20cf75877cfe6cc88719ec577e83cc2a0a1d9433b5031e19782230121bec86c3")
    public fun channelStorage(channelStorage: ChannelStorageProperty.Builder.() -> Unit)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afd016681a3e2f10369d872bcfb1bb4acde1bd130d387ad2c3ef17a619c0176c")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnChannel.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnChannel.Builder.create(scope, id)

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun channelStorage(channelStorage: IResolvable) {
      cdkBuilder.channelStorage(channelStorage.let(IResolvable::unwrap))
    }

    override fun channelStorage(channelStorage: ChannelStorageProperty) {
      cdkBuilder.channelStorage(channelStorage.let(ChannelStorageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20cf75877cfe6cc88719ec577e83cc2a0a1d9433b5031e19782230121bec86c3")
    override fun channelStorage(channelStorage: ChannelStorageProperty.Builder.() -> Unit): Unit =
        channelStorage(ChannelStorageProperty(channelStorage))

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afd016681a3e2f10369d872bcfb1bb4acde1bd130d387ad2c3ef17a619c0176c")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.iotanalytics.CfnChannel = wrapped.cdkObject
  }

  public interface CustomerManagedS3Property {
    public fun bucket(): String

    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    public fun roleArn(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun keyPrefix(keyPrefix: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property,
    ) : CustomerManagedS3Property {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property):
          CustomerManagedS3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3Property):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChannelStorageProperty {
    public fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

    public fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()

    public interface Builder {
      public fun customerManagedS3(customerManagedS3: IResolvable)

      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7eb6cf71b02dbb0e5cf3fe556179354d70e550ee3cdb0ffeff0dce7e4e3dc22d")
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit)

      public fun serviceManagedS3(serviceManagedS3: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty.builder()

      override fun customerManagedS3(customerManagedS3: IResolvable) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(IResolvable::unwrap))
      }

      override fun customerManagedS3(customerManagedS3: CustomerManagedS3Property) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(CustomerManagedS3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7eb6cf71b02dbb0e5cf3fe556179354d70e550ee3cdb0ffeff0dce7e4e3dc22d")
      override
          fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit):
          Unit = customerManagedS3(CustomerManagedS3Property(customerManagedS3))

      override fun serviceManagedS3(serviceManagedS3: Any) {
        cdkBuilder.serviceManagedS3(serviceManagedS3)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty,
    ) : ChannelStorageProperty {
      override fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

      override fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty):
          ChannelStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RetentionPeriodProperty {
    public fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    public interface Builder {
      public fun numberOfDays(numberOfDays: Number)

      public fun unlimited(unlimited: Boolean)

      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.builder()

      override fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
      }

      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty,
    ) : RetentionPeriodProperty {
      override fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
