package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnConfigurationSetEventDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

  public open fun configurationSetName(`value`: String) {
    unwrap(this).setConfigurationSetName(`value`)
  }

  public open fun eventDestination(): Any = unwrap(this).getEventDestination()

  public open fun eventDestination(`value`: IResolvable) {
    unwrap(this).setEventDestination(`value`.let(IResolvable::unwrap))
  }

  public open fun eventDestination(`value`: EventDestinationProperty) {
    unwrap(this).setEventDestination(`value`.let(EventDestinationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("161eb83cbe5a17d079b5c9c3a492fa1c5cf750bd79c194bbc0ceaa3fc021e04d")
  public open fun eventDestination(`value`: EventDestinationProperty.Builder.() -> Unit): Unit =
      eventDestination(EventDestinationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun configurationSetName(configurationSetName: String)

    public fun eventDestination(eventDestination: IResolvable)

    public fun eventDestination(eventDestination: EventDestinationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f4d87013c9c0fe207561ee83bdde5e8d51ca236fe5b45cb88067774bcccb78")
    public fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder.create(scope,
        id)

    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    override fun eventDestination(eventDestination: EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(EventDestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f4d87013c9c0fe207561ee83bdde5e8d51ca236fe5b45cb88067774bcccb78")
    override fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit):
        Unit = eventDestination(EventDestinationProperty(eventDestination))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSetEventDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSetEventDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination):
        CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination = wrapped.cdkObject
  }

  public interface KinesisFirehoseDestinationProperty {
    public fun deliveryStreamArn(): String

    public fun iamRoleArn(): String

    public interface Builder {
      public fun deliveryStreamArn(deliveryStreamArn: String)

      public fun iamRoleArn(iamRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

      override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty,
    ) : KinesisFirehoseDestinationProperty {
      override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

      override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty):
          KinesisFirehoseDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DimensionConfigurationProperty {
    public fun defaultDimensionValue(): String

    public fun dimensionName(): String

    public fun dimensionValueSource(): String

    public interface Builder {
      public fun defaultDimensionValue(defaultDimensionValue: String)

      public fun dimensionName(dimensionName: String)

      public fun dimensionValueSource(dimensionValueSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

      override fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
      }

      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      override fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty,
    ) : DimensionConfigurationProperty {
      override fun defaultDimensionValue(): String = unwrap(this).getDefaultDimensionValue()

      override fun dimensionName(): String = unwrap(this).getDimensionName()

      override fun dimensionValueSource(): String = unwrap(this).getDimensionValueSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty):
          DimensionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionConfigurationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventDestinationProperty {
    public fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

    public fun matchingEventTypes(): List<String>

    public fun name(): String? = unwrap(this).getName()

    public fun snsDestination(): Any? = unwrap(this).getSnsDestination()

    public interface Builder {
      public fun cloudWatchDestination(cloudWatchDestination: IResolvable)

      public fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      public
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable)

      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit)

      public fun matchingEventTypes(matchingEventTypes: List<String>)

      public fun name(name: String)

      public fun snsDestination(snsDestination: IResolvable)

      public fun snsDestination(snsDestination: SnsDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      public fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

      override fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(IResolvable::unwrap))
      }

      override fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(CloudWatchDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("278e4dff254572ecbe9e82bc4744a7e10e6ac6eda054f05dc7ebf5e76de16c9c")
      override
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatchDestination(CloudWatchDestinationProperty(cloudWatchDestination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(IResolvable::unwrap))
      }

      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(KinesisFirehoseDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea582a16a05b679d481121ad0dd24ffca83b813af5b007a6f5fb342cad5105b")
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDestination(KinesisFirehoseDestinationProperty(kinesisFirehoseDestination))

      override fun matchingEventTypes(matchingEventTypes: List<String>) {
        cdkBuilder.matchingEventTypes(matchingEventTypes)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun snsDestination(snsDestination: IResolvable) {
        cdkBuilder.snsDestination(snsDestination.let(IResolvable::unwrap))
      }

      override fun snsDestination(snsDestination: SnsDestinationProperty) {
        cdkBuilder.snsDestination(snsDestination.let(SnsDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ab54454e6b879739a0b83849de763b91d732f6b07bc63e0f52b0a6c5e489bb4")
      override fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit): Unit =
          snsDestination(SnsDestinationProperty(snsDestination))

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty,
    ) : EventDestinationProperty {
      override fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

      override fun matchingEventTypes(): List<String> = unwrap(this).getMatchingEventTypes() ?:
          emptyList()

      override fun name(): String? = unwrap(this).getName()

      override fun snsDestination(): Any? = unwrap(this).getSnsDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty):
          EventDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnsDestinationProperty {
    public fun topicArn(): String

    public interface Builder {
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty,
    ) : SnsDestinationProperty {
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty):
          SnsDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchDestinationProperty {
    public fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()

    public interface Builder {
      public fun dimensionConfigurations(dimensionConfigurations: IResolvable)

      public fun dimensionConfigurations(dimensionConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

      override fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations.let(IResolvable::unwrap))
      }

      override fun dimensionConfigurations(dimensionConfigurations: List<Any>) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty,
    ) : CloudWatchDestinationProperty {
      override fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty):
          CloudWatchDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchDestinationProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
