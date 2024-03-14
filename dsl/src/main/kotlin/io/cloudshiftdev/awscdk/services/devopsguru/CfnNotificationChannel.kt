package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNotificationChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun config(): Any = unwrap(this).getConfig()

  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun config(`value`: NotificationChannelConfigProperty) {
    unwrap(this).setConfig(`value`.let(NotificationChannelConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbc1f33de0fe350c59559bd01e3e13d163d6bd2f59bf8c9832bb7960709b4945")
  public open fun config(`value`: NotificationChannelConfigProperty.Builder.() -> Unit): Unit =
      config(NotificationChannelConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun config(config: IResolvable) {
    }

    public fun config(config: NotificationChannelConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ee7a5ab933661560d32f0bc4b1ecb8c9e8ddfa70c3abb985c8669ed42dcb7e5")
    public fun config(config: NotificationChannelConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.Builder =
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.Builder.create(scope, id)

    public override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    public override fun config(config: NotificationChannelConfigProperty) {
      cdkBuilder.config(config.let(NotificationChannelConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ee7a5ab933661560d32f0bc4b1ecb8c9e8ddfa70c3abb985c8669ed42dcb7e5")
    public override fun config(config: NotificationChannelConfigProperty.Builder.() -> Unit): Unit =
        config(NotificationChannelConfigProperty(config))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel):
        CfnNotificationChannel = CfnNotificationChannel(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationChannel):
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel = wrapped.cdkObject
  }

  public interface NotificationFilterConfigProperty {
    public fun messageTypes(): List<String> = unwrap(this).getMessageTypes() ?: emptyList()

    public fun severities(): List<String> = unwrap(this).getSeverities() ?: emptyList()

    public interface Builder {
      public fun messageTypes(messageTypes: List<String>) {
      }

      public fun severities(severities: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty.builder()

      public override fun messageTypes(messageTypes: List<String>) {
        cdkBuilder.messageTypes(messageTypes)
      }

      public override fun severities(severities: List<String>) {
        cdkBuilder.severities(severities)
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty,
    ) : NotificationFilterConfigProperty {
      public override fun messageTypes(): List<String> = unwrap(this).getMessageTypes() ?:
          emptyList()

      public override fun severities(): List<String> = unwrap(this).getSeverities() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty):
          NotificationFilterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationFilterConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationChannelConfigProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public fun sns(): Any? = unwrap(this).getSns()

    public interface Builder {
      public fun filters(filters: IResolvable) {
      }

      public fun filters(filters: NotificationFilterConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a6598eb4c4f3b86436cc52c7dbd55fb7b4a5abcfe8733b7290f45f2f3227dd")
      public fun filters(filters: NotificationFilterConfigProperty.Builder.() -> Unit) {
      }

      public fun sns(sns: IResolvable) {
      }

      public fun sns(sns: SnsChannelConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58a795a7aae4312066872a05c81d7e16e31913fd0387c72972646cc2d13f2418")
      public fun sns(sns: SnsChannelConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.builder()

      public override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      public override fun filters(filters: NotificationFilterConfigProperty) {
        cdkBuilder.filters(filters.let(NotificationFilterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a6598eb4c4f3b86436cc52c7dbd55fb7b4a5abcfe8733b7290f45f2f3227dd")
      public override fun filters(filters: NotificationFilterConfigProperty.Builder.() -> Unit):
          Unit = filters(NotificationFilterConfigProperty(filters))

      public override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      public override fun sns(sns: SnsChannelConfigProperty) {
        cdkBuilder.sns(sns.let(SnsChannelConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58a795a7aae4312066872a05c81d7e16e31913fd0387c72972646cc2d13f2418")
      public override fun sns(sns: SnsChannelConfigProperty.Builder.() -> Unit): Unit =
          sns(SnsChannelConfigProperty(sns))

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty,
    ) : NotificationChannelConfigProperty {
      public override fun filters(): Any? = unwrap(this).getFilters()

      public override fun sns(): Any? = unwrap(this).getSns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationChannelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty):
          NotificationChannelConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationChannelConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnsChannelConfigProperty {
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun topicArn(topicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty.builder()

      public override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty,
    ) : SnsChannelConfigProperty {
      public override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsChannelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty):
          SnsChannelConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsChannelConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
