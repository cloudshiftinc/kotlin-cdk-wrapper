@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigurationSetProps {
  public fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  public fun name(): String

  public fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  public fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  @CdkDslMarker
  public interface Builder {
    public fun deliveryOptions(deliveryOptions: IResolvable)

    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("552bb815a44a56c376f26c9659bc71d6ab8af1fdcfa1e9f4639d86100a5ea881")
    public
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun reputationOptions(reputationOptions: IResolvable)

    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a25f728e0ecd1a17c04905aa358a990758abd47cbd826403340772a78248787")
    public
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit)

    public fun sendingOptions(sendingOptions: IResolvable)

    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b6621e583f0961322ff9446a6e8cfe66178970cd92da7efa571f61889dd2b9b")
    public
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trackingOptions(trackingOptions: IResolvable)

    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d53dd18c418c99f31e03b64105254319ceafcf775f9c8d6778a2d38275c9edd6")
    public
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps.builder()

    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable::unwrap))
    }

    override fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(CfnConfigurationSet.DeliveryOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("552bb815a44a56c376f26c9659bc71d6ab8af1fdcfa1e9f4639d86100a5ea881")
    override
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit):
        Unit = deliveryOptions(CfnConfigurationSet.DeliveryOptionsProperty(deliveryOptions))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reputationOptions(reputationOptions: IResolvable) {
      cdkBuilder.reputationOptions(reputationOptions.let(IResolvable::unwrap))
    }

    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
      cdkBuilder.reputationOptions(reputationOptions.let(CfnConfigurationSet.ReputationOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a25f728e0ecd1a17c04905aa358a990758abd47cbd826403340772a78248787")
    override
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit):
        Unit = reputationOptions(CfnConfigurationSet.ReputationOptionsProperty(reputationOptions))

    override fun sendingOptions(sendingOptions: IResolvable) {
      cdkBuilder.sendingOptions(sendingOptions.let(IResolvable::unwrap))
    }

    override fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
      cdkBuilder.sendingOptions(sendingOptions.let(CfnConfigurationSet.SendingOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b6621e583f0961322ff9446a6e8cfe66178970cd92da7efa571f61889dd2b9b")
    override
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit):
        Unit = sendingOptions(CfnConfigurationSet.SendingOptionsProperty(sendingOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable::unwrap))
    }

    override fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(CfnConfigurationSet.TrackingOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d53dd18c418c99f31e03b64105254319ceafcf775f9c8d6778a2d38275c9edd6")
    override
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit):
        Unit = trackingOptions(CfnConfigurationSet.TrackingOptionsProperty(trackingOptions))

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetProps {
    override fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

    override fun name(): String = unwrap(this).getName()

    override fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

    override fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps):
        CfnConfigurationSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetProps):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
  }
}
