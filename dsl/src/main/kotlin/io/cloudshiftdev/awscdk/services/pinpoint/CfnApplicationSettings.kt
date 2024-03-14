package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  public open fun campaignHook(`value`: IResolvable) {
    unwrap(this).setCampaignHook(`value`.let(IResolvable::unwrap))
  }

  public open fun campaignHook(`value`: CampaignHookProperty) {
    unwrap(this).setCampaignHook(`value`.let(CampaignHookProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("572df9d36b184bb68e981c10ad0d6d0a98e5e7b515c91e21455c5bcf9454f077")
  public open fun campaignHook(`value`: CampaignHookProperty.Builder.() -> Unit): Unit =
      campaignHook(CampaignHookProperty(`value`))

  public open fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

  public open fun cloudWatchMetricsEnabled(`value`: Boolean) {
    unwrap(this).setCloudWatchMetricsEnabled(`value`)
  }

  public open fun cloudWatchMetricsEnabled(`value`: IResolvable) {
    unwrap(this).setCloudWatchMetricsEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun limits(): Any? = unwrap(this).getLimits()

  public open fun limits(`value`: IResolvable) {
    unwrap(this).setLimits(`value`.let(IResolvable::unwrap))
  }

  public open fun limits(`value`: LimitsProperty) {
    unwrap(this).setLimits(`value`.let(LimitsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07084f7735578c586836b9ed290f4bdc7aa8ffb64ba71bbc960fe54c05a52c3b")
  public open fun limits(`value`: LimitsProperty.Builder.() -> Unit): Unit =
      limits(LimitsProperty(`value`))

  public open fun quietTime(): Any? = unwrap(this).getQuietTime()

  public open fun quietTime(`value`: IResolvable) {
    unwrap(this).setQuietTime(`value`.let(IResolvable::unwrap))
  }

  public open fun quietTime(`value`: QuietTimeProperty) {
    unwrap(this).setQuietTime(`value`.let(QuietTimeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83c7063b640f33535bed43fe056ecb6700adb03ef8ffeda42bb966ea41a3b908")
  public open fun quietTime(`value`: QuietTimeProperty.Builder.() -> Unit): Unit =
      quietTime(QuietTimeProperty(`value`))

  public interface Builder {
    public fun applicationId(applicationId: String) {
    }

    public fun campaignHook(campaignHook: IResolvable) {
    }

    public fun campaignHook(campaignHook: CampaignHookProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abfe5f6e64936476164afef70afb18eff364a1e76a371e2d133650f4478b7fd8")
    public fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit) {
    }

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
    }

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
    }

    public fun limits(limits: IResolvable) {
    }

    public fun limits(limits: LimitsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed85d66155567a9450c6bfa16a94acb7d536ee6a7a73c6fbdfc9734a6ae2c277")
    public fun limits(limits: LimitsProperty.Builder.() -> Unit) {
    }

    public fun quietTime(quietTime: IResolvable) {
    }

    public fun quietTime(quietTime: QuietTimeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22f5b180df47d9c7d4c5cd8481e68acca995533e7f3ffd465f5f99286178b3e1")
    public fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.Builder
        = software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.Builder.create(scope, id)

    public override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    public override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    public override fun campaignHook(campaignHook: CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CampaignHookProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abfe5f6e64936476164afef70afb18eff364a1e76a371e2d133650f4478b7fd8")
    public override fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit): Unit =
        campaignHook(CampaignHookProperty(campaignHook))

    public override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    public override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
    }

    public override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    public override fun limits(limits: LimitsProperty) {
      cdkBuilder.limits(limits.let(LimitsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed85d66155567a9450c6bfa16a94acb7d536ee6a7a73c6fbdfc9734a6ae2c277")
    public override fun limits(limits: LimitsProperty.Builder.() -> Unit): Unit =
        limits(LimitsProperty(limits))

    public override fun quietTime(quietTime: IResolvable) {
      cdkBuilder.quietTime(quietTime.let(IResolvable::unwrap))
    }

    public override fun quietTime(quietTime: QuietTimeProperty) {
      cdkBuilder.quietTime(quietTime.let(QuietTimeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22f5b180df47d9c7d4c5cd8481e68acca995533e7f3ffd465f5f99286178b3e1")
    public override fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit): Unit =
        quietTime(QuietTimeProperty(quietTime))

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnApplicationSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings):
        CfnApplicationSettings = CfnApplicationSettings(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationSettings):
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettings = wrapped.cdkObject
  }

  public interface LimitsProperty {
    public fun daily(): Number? = unwrap(this).getDaily()

    public fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

    public fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

    public fun total(): Number? = unwrap(this).getTotal()

    public interface Builder {
      public fun daily(daily: Number) {
      }

      public fun maximumDuration(maximumDuration: Number) {
      }

      public fun messagesPerSecond(messagesPerSecond: Number) {
      }

      public fun total(total: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty.builder()

      public override fun daily(daily: Number) {
        cdkBuilder.daily(daily)
      }

      public override fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
      }

      public override fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
      }

      public override fun total(total: Number) {
        cdkBuilder.total(total)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty,
    ) : LimitsProperty {
      public override fun daily(): Number? = unwrap(this).getDaily()

      public override fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

      public override fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

      public override fun total(): Number? = unwrap(this).getTotal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty):
          LimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CampaignHookProperty {
    public fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

    public fun mode(): String? = unwrap(this).getMode()

    public fun webUrl(): String? = unwrap(this).getWebUrl()

    public interface Builder {
      public fun lambdaFunctionName(lambdaFunctionName: String) {
      }

      public fun mode(mode: String) {
      }

      public fun webUrl(webUrl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty.builder()

      public override fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
      }

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public override fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty,
    ) : CampaignHookProperty {
      public override fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

      public override fun mode(): String? = unwrap(this).getMode()

      public override fun webUrl(): String? = unwrap(this).getWebUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty):
          CampaignHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignHookProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface QuietTimeProperty {
    public fun end(): String

    public fun start(): String

    public interface Builder {
      public fun end(end: String) {
      }

      public fun start(start: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty.builder()

      public override fun end(end: String) {
        cdkBuilder.end(end)
      }

      public override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty,
    ) : QuietTimeProperty {
      public override fun end(): String = unwrap(this).getEnd()

      public override fun start(): String = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QuietTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty):
          QuietTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuietTimeProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
