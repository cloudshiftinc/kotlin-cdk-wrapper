package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnConfigurationSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  public open fun deliveryOptions(`value`: IResolvable) {
    unwrap(this).setDeliveryOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun deliveryOptions(`value`: DeliveryOptionsProperty) {
    unwrap(this).setDeliveryOptions(`value`.let(DeliveryOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d696b86f9b64e27073d36b6ccd62589eaedf8e1aaabc012d4734668fe4845bad")
  public open fun deliveryOptions(`value`: DeliveryOptionsProperty.Builder.() -> Unit): Unit =
      deliveryOptions(DeliveryOptionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

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
  @JvmName("de5f867ede2460fbe422a4cac1cb4b69fb8fbe348273b21a2f4381a43f9b7371")
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
  @JvmName("1e2c939ba18db2115dc0e81b7dfabd6de49e625132ae2d2283824f4e8593eced")
  public open fun sendingOptions(`value`: SendingOptionsProperty.Builder.() -> Unit): Unit =
      sendingOptions(SendingOptionsProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  public open fun trackingOptions(`value`: IResolvable) {
    unwrap(this).setTrackingOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun trackingOptions(`value`: TrackingOptionsProperty) {
    unwrap(this).setTrackingOptions(`value`.let(TrackingOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414a77bb9f916bbb50572293f156ca82cb258f9e4bef9195ba9b7179837ea611")
  public open fun trackingOptions(`value`: TrackingOptionsProperty.Builder.() -> Unit): Unit =
      trackingOptions(TrackingOptionsProperty(`value`))

  public interface Builder {
    public fun deliveryOptions(deliveryOptions: IResolvable)

    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a07871b3acc4af8f790d4a826c2cacd3a072660b2c5dd6e40348c3602776c251")
    public fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun reputationOptions(reputationOptions: IResolvable)

    public fun reputationOptions(reputationOptions: ReputationOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c87f58ba9ab7d77bf51962c018f0732efc87ba85fd3f97271fe17bec0169749b")
    public fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit)

    public fun sendingOptions(sendingOptions: IResolvable)

    public fun sendingOptions(sendingOptions: SendingOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bf94ab737b0c4433e761b89676a3a65789808e2fb25788d73e5f789825af2df")
    public fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trackingOptions(trackingOptions: IResolvable)

    public fun trackingOptions(trackingOptions: TrackingOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952610ede443fa8b88b6802bf9c4d9d2d717839104b58c7c328e1f4be9aeb7c8")
    public fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.Builder.create(scope, id)

    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable::unwrap))
    }

    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(DeliveryOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a07871b3acc4af8f790d4a826c2cacd3a072660b2c5dd6e40348c3602776c251")
    override fun deliveryOptions(deliveryOptions: DeliveryOptionsProperty.Builder.() -> Unit): Unit
        = deliveryOptions(DeliveryOptionsProperty(deliveryOptions))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable::unwrap))
    }

    override fun reputationOptions(reputationOptions: ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(ReputationOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c87f58ba9ab7d77bf51962c018f0732efc87ba85fd3f97271fe17bec0169749b")
    override fun reputationOptions(reputationOptions: ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(ReputationOptionsProperty(reputationOptions))

    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable::unwrap))
    }

    override fun sendingOptions(sendingOptions: SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(SendingOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bf94ab737b0c4433e761b89676a3a65789808e2fb25788d73e5f789825af2df")
    override fun sendingOptions(sendingOptions: SendingOptionsProperty.Builder.() -> Unit): Unit =
        sendingOptions(SendingOptionsProperty(sendingOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable::unwrap))
    }

    override fun trackingOptions(trackingOptions: TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(TrackingOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("952610ede443fa8b88b6802bf9c4d9d2d717839104b58c7c328e1f4be9aeb7c8")
    override fun trackingOptions(trackingOptions: TrackingOptionsProperty.Builder.() -> Unit): Unit
        = trackingOptions(TrackingOptionsProperty(trackingOptions))

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet =
        cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet):
        CfnConfigurationSet = CfnConfigurationSet(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSet):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet = wrapped.cdkObject
  }

  public interface DeliveryOptionsProperty {
    public fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()

    public interface Builder {
      public fun sendingPoolName(sendingPoolName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty.builder()

      override fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty,
    ) : DeliveryOptionsProperty {
      override fun sendingPoolName(): String? = unwrap(this).getSendingPoolName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty):
          DeliveryOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliveryOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SendingOptionsProperty {
    public fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()

    public interface Builder {
      public fun sendingEnabled(sendingEnabled: Boolean)

      public fun sendingEnabled(sendingEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty.builder()

      override fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
      }

      override fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty,
    ) : SendingOptionsProperty {
      override fun sendingEnabled(): Any? = unwrap(this).getSendingEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SendingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty):
          SendingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendingOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrackingOptionsProperty {
    public fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()

    public interface Builder {
      public fun customRedirectDomain(customRedirectDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty.builder()

      override fun customRedirectDomain(customRedirectDomain: String) {
        cdkBuilder.customRedirectDomain(customRedirectDomain)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty,
    ) : TrackingOptionsProperty {
      override fun customRedirectDomain(): String? = unwrap(this).getCustomRedirectDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty):
          TrackingOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrackingOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReputationOptionsProperty {
    public fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()

    public interface Builder {
      public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean)

      public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty.builder()

      override fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
      }

      override fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty,
    ) : ReputationOptionsProperty {
      override fun reputationMetricsEnabled(): Any? = unwrap(this).getReputationMetricsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReputationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty):
          ReputationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReputationOptionsProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
