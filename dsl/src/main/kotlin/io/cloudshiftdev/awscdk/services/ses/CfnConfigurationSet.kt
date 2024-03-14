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

public open class CfnConfigurationSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  public open fun deliveryOptions(`value`: IResolvable) {
    unwrap(this).setDeliveryOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun deliveryOptions(`value`: DeliveryOptionsProperty) {
    unwrap(this).setDeliveryOptions(`value`.let(DeliveryOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b48406aebe495571c3988281305bd27e18418f1ed8d88a707fb40bb854bd97b1")
  public open fun deliveryOptions(`value`: DeliveryOptionsProperty.Builder.() -> Unit): Unit =
      deliveryOptions(DeliveryOptionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  public open fun reputationOptions(`value`: IResolvable) {
    unwrap(this).setReputationOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun reputationOptions(`value`: ReputationOptionsProperty) {
    unwrap(this).setReputationOptions(`value`.let(ReputationOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("227804c3f3b263a655a52d0e1bea02051bfe38dd33043fb95ebe45c23c13ffd3")
  public open fun reputationOptions(`value`: ReputationOptionsProperty.Builder.() -> Unit): Unit =
      reputationOptions(ReputationOptionsProperty(`value`))

  public open fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  public open fun sendingOptions(`value`: IResolvable) {
    unwrap(this).setSendingOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun sendingOptions(`value`: SendingOptionsProperty) {
    unwrap(this).setSendingOptions(`value`.let(SendingOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e4e3cd59af11992de306054f8ff718fcf963a7eeb4e39600799f80a5e520af4")
  public open fun sendingOptions(`value`: SendingOptionsProperty.Builder.() -> Unit): Unit =
      sendingOptions(SendingOptionsProperty(`value`))

  public open fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

  public open fun suppressionOptions(`value`: IResolvable) {
    unwrap(this).setSuppressionOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun suppressionOptions(`value`: SuppressionOptionsProperty) {
    unwrap(this).setSuppressionOptions(`value`.let(SuppressionOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8757f0e719bb535158fdcaad6e5744831cfa05c271b21f1d7f8662adafe694dc")
  public open fun suppressionOptions(`value`: SuppressionOptionsProperty.Builder.() -> Unit): Unit =
      suppressionOptions(SuppressionOptionsProperty(`value`))

  public open fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  public open fun trackingOptions(`value`: IResolvable) {
    unwrap(this).setTrackingOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun trackingOptions(`value`: TrackingOptionsProperty) {
    unwrap(this).setTrackingOptions(`value`.let(TrackingOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64178774d79abefec51ad3f5d3e00d4ac1826e8e00ae6ce9fa1a2aee536102f8")
  public open fun trackingOptions(`value`: TrackingOptionsProperty.Builder.() -> Unit): Unit =
      trackingOptions(TrackingOptionsProperty(`value`))

  public open fun vdmOptions(): Any? = unwrap(this).getVdmOptions()

  public open fun vdmOptions(`value`: IResolvable) {
    unwrap(this).setVdmOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun vdmOptions(`value`: VdmOptionsProperty) {
    unwrap(this).setVdmOptions(`value`.let(VdmOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c497458775f4b4966b0e481d739d29db2add5f48b6ee35ccf3ddc647585d7840")
  public open fun vdmOptions(`value`: VdmOptionsProperty.Builder.() -> Unit): Unit =
      vdmOptions(VdmOptionsProperty(`value`))

  public interface Builder {
    public fun deliveryOptions(deliveryOptions: IResolvable) {
    }

    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bea76d4086f6acc6c515602f5efc12d6f5d2dcd3e9dc35e7920f14a83af7c1e7")
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun reputationOptions(reputationOptions: IResolvable) {
    }

    public fun reputationOptions(reputationOptions: ReputationOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c733d8e8b31cc6e04a50d62a5a57004f2628da598b37f0ba686bba934b96d4a")
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit) {
    }

    public fun sendingOptions(sendingOptions: IResolvable) {
    }

    public fun sendingOptions(sendingOptions: SendingOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e9c3e2a8b9ec17cd157bffa04702b878b5ea0856e2d9133e5a9b4be6ebae26a")
    public fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit) {
    }

    public fun suppressionOptions(suppressionOptions: IResolvable) {
    }

    public fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f217a82d0ce4dd438c1e6ecf7a3e479a7082ceb507fd0c05826e87dbef8e7958")
    public
        fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty.Builder.() -> Unit) {
    }

    public fun trackingOptions(trackingOptions: IResolvable) {
    }

    public fun trackingOptions(trackingOptions: TrackingOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb098918d914c45ab533668f71503aab74c3c4da79158f851169d8676c5dceaa")
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit) {
    }

    public fun vdmOptions(vdmOptions: IResolvable) {
    }

    public fun vdmOptions(vdmOptions: VdmOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("663fd102ee17bf2c720f3055c7766e60ebd408cc3c6bf6665f8eb2e8c30df482")
    public fun vdmOptions(vdmOptions: VdmOptionsProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnConfigurationSet.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSet.Builder.create(scope, id)

    public override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable::unwrap))
    }

    public override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(DeliveryOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bea76d4086f6acc6c515602f5efc12d6f5d2dcd3e9dc35e7920f14a83af7c1e7")
    public override
        fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit): Unit =
        deliveryOptions(DeliveryOptionsProperty(deliveryOptions))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable::unwrap))
    }

    public override fun reputationOptions(reputationOptions: ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(ReputationOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c733d8e8b31cc6e04a50d62a5a57004f2628da598b37f0ba686bba934b96d4a")
    public override
        fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit): Unit
        = reputationOptions(ReputationOptionsProperty(reputationOptions))

    public override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable::unwrap))
    }

    public override fun sendingOptions(sendingOptions: SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(SendingOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e9c3e2a8b9ec17cd157bffa04702b878b5ea0856e2d9133e5a9b4be6ebae26a")
    public override fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit):
        Unit = sendingOptions(SendingOptionsProperty(sendingOptions))

    public override fun suppressionOptions(suppressionOptions: IResolvable) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(IResolvable::unwrap))
    }

    public override fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(SuppressionOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f217a82d0ce4dd438c1e6ecf7a3e479a7082ceb507fd0c05826e87dbef8e7958")
    public override
        fun suppressionOptions(suppressionOptions: SuppressionOptionsProperty.Builder.() -> Unit):
        Unit = suppressionOptions(SuppressionOptionsProperty(suppressionOptions))

    public override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable::unwrap))
    }

    public override fun trackingOptions(trackingOptions: TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(TrackingOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb098918d914c45ab533668f71503aab74c3c4da79158f851169d8676c5dceaa")
    public override
        fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit): Unit =
        trackingOptions(TrackingOptionsProperty(trackingOptions))

    public override fun vdmOptions(vdmOptions: IResolvable) {
      cdkBuilder.vdmOptions(vdmOptions.let(IResolvable::unwrap))
    }

    public override fun vdmOptions(vdmOptions: VdmOptionsProperty) {
      cdkBuilder.vdmOptions(vdmOptions.let(VdmOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("663fd102ee17bf2c720f3055c7766e60ebd408cc3c6bf6665f8eb2e8c30df482")
    public override fun vdmOptions(vdmOptions: VdmOptionsProperty.Builder.() -> Unit): Unit =
        vdmOptions(VdmOptionsProperty(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet):
        CfnConfigurationSet = CfnConfigurationSet(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSet):
        software.amazon.awscdk.services.ses.CfnConfigurationSet = wrapped.cdkObject
  }

  public interface DeliveryOptionsProperty {
    public fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

    public fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()

    public interface Builder {
      public fun sendingPoolName(sendingPoolName: String) {
      }

      public fun tlsPolicy(tlsPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty.builder()

      public override fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
      }

      public override fun tlsPolicy(tlsPolicy: String) {
        cdkBuilder.tlsPolicy(tlsPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty,
    ) : DeliveryOptionsProperty {
      public override fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

      public override fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty):
          DeliveryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DeliveryOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GuardianOptionsProperty {
    public fun optimizedSharedDelivery(): String

    public interface Builder {
      public fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty.builder()

      public override fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty,
    ) : GuardianOptionsProperty {
      public override fun optimizedSharedDelivery(): String =
          unwrap(this).getOptimizedSharedDelivery()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GuardianOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty):
          GuardianOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardianOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.GuardianOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VdmOptionsProperty {
    public fun dashboardOptions(): Any? = unwrap(this).getDashboardOptions()

    public fun guardianOptions(): Any? = unwrap(this).getGuardianOptions()

    public interface Builder {
      public fun dashboardOptions(dashboardOptions: IResolvable) {
      }

      public fun dashboardOptions(dashboardOptions: DashboardOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ae1370c8118b3db5fccd7c5d77a47a0c9fc5c5ae23baf050aa25ce11aa094cd")
      public fun dashboardOptions(dashboardOptions: DashboardOptionsProperty.Builder.() -> Unit) {
      }

      public fun guardianOptions(guardianOptions: IResolvable) {
      }

      public fun guardianOptions(guardianOptions: GuardianOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9632d1b5dcfc878d2221fd033755a8f3e6b6e1ed1099d509a3393553918608b9")
      public fun guardianOptions(guardianOptions: GuardianOptionsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty.builder()

      public override fun dashboardOptions(dashboardOptions: IResolvable) {
        cdkBuilder.dashboardOptions(dashboardOptions.let(IResolvable::unwrap))
      }

      public override fun dashboardOptions(dashboardOptions: DashboardOptionsProperty) {
        cdkBuilder.dashboardOptions(dashboardOptions.let(DashboardOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ae1370c8118b3db5fccd7c5d77a47a0c9fc5c5ae23baf050aa25ce11aa094cd")
      public override
          fun dashboardOptions(dashboardOptions: DashboardOptionsProperty.Builder.() -> Unit): Unit
          = dashboardOptions(DashboardOptionsProperty(dashboardOptions))

      public override fun guardianOptions(guardianOptions: IResolvable) {
        cdkBuilder.guardianOptions(guardianOptions.let(IResolvable::unwrap))
      }

      public override fun guardianOptions(guardianOptions: GuardianOptionsProperty) {
        cdkBuilder.guardianOptions(guardianOptions.let(GuardianOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9632d1b5dcfc878d2221fd033755a8f3e6b6e1ed1099d509a3393553918608b9")
      public override
          fun guardianOptions(guardianOptions: GuardianOptionsProperty.Builder.() -> Unit): Unit =
          guardianOptions(GuardianOptionsProperty(guardianOptions))

      public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty,
    ) : VdmOptionsProperty {
      public override fun dashboardOptions(): Any? = unwrap(this).getDashboardOptions()

      public override fun guardianOptions(): Any? = unwrap(this).getGuardianOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VdmOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty):
          VdmOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VdmOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.VdmOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DashboardOptionsProperty {
    public fun engagementMetrics(): String

    public interface Builder {
      public fun engagementMetrics(engagementMetrics: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty.builder()

      public override fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty,
    ) : DashboardOptionsProperty {
      public override fun engagementMetrics(): String = unwrap(this).getEngagementMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashboardOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty):
          DashboardOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashboardOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.DashboardOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SendingOptionsProperty {
    public fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()

    public interface Builder {
      public fun sendingEnabled(sendingEnabled: Boolean) {
      }

      public fun sendingEnabled(sendingEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty.builder()

      public override fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
      }

      public override fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty,
    ) : SendingOptionsProperty {
      public override fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SendingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty):
          SendingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendingOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SendingOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SuppressionOptionsProperty {
    public fun suppressedReasons(): List<String> = unwrap(this).getSuppressedReasons() ?:
        emptyList()

    public interface Builder {
      public fun suppressedReasons(suppressedReasons: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty.builder()

      public override fun suppressedReasons(suppressedReasons: List<String>) {
        cdkBuilder.suppressedReasons(suppressedReasons)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty,
    ) : SuppressionOptionsProperty {
      public override fun suppressedReasons(): List<String> = unwrap(this).getSuppressedReasons() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SuppressionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty):
          SuppressionOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuppressionOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.SuppressionOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrackingOptionsProperty {
    public fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()

    public interface Builder {
      public fun customRedirectDomain(customRedirectDomain: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty.Builder =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty.builder()

      public override fun customRedirectDomain(customRedirectDomain: String) {
        cdkBuilder.customRedirectDomain(customRedirectDomain)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty,
    ) : TrackingOptionsProperty {
      public override fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty):
          TrackingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrackingOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.TrackingOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ReputationOptionsProperty {
    public fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()

    public interface Builder {
      public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
      }

      public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty.builder()

      public override fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
      }

      public override fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty,
    ) : ReputationOptionsProperty {
      public override fun reputationMetricsEnabled(): Any? =
          unwrap(this).getReputationMetricsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReputationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty):
          ReputationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReputationOptionsProperty):
          software.amazon.awscdk.services.ses.CfnConfigurationSet.ReputationOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
