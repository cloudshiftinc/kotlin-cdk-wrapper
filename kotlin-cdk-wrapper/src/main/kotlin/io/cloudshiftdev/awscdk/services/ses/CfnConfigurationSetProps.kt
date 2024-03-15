@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConfigurationSetProps {
  public fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

  public fun name(): String? = unwrap(this).getName()

  public fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

  public fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

  public fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

  public fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

  public fun vdmOptions(): Any? = unwrap(this).getVdmOptions()

  @CdkDslMarker
  public interface Builder {
    public fun deliveryOptions(deliveryOptions: IResolvable)

    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf6289bbefa5e46969b3364e4d6b808c8b989b975f87416589ce94051d1fc36")
    public
        fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun reputationOptions(reputationOptions: IResolvable)

    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c7b8a0979b6dd4bf62103f4b02e718f928a3daed90946a3d903d7ee044eddb6")
    public
        fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit)

    public fun sendingOptions(sendingOptions: IResolvable)

    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af6dfaf61c62e11864702199d9943b5a7f857e760df422e64d9e69de22ff5408")
    public
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit)

    public fun suppressionOptions(suppressionOptions: IResolvable)

    public
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1766b436ee2ace67fccd7b8e27f9639a0748817207fa01d61224cb821c592cad")
    public
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit)

    public fun trackingOptions(trackingOptions: IResolvable)

    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a270122f66bb2d23246474cc97c9b86630efa5b4188f0024907557c8ab4dd13c")
    public
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit)

    public fun vdmOptions(vdmOptions: IResolvable)

    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a18daf2058f44250195442572a690d207b0100f0fe949a03b4b22e620fb2a3")
    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnConfigurationSetProps.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSetProps.builder()

    override fun deliveryOptions(deliveryOptions: IResolvable) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(IResolvable::unwrap))
    }

    override fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
      cdkBuilder.deliveryOptions(deliveryOptions.let(CfnConfigurationSet.DeliveryOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf6289bbefa5e46969b3364e4d6b808c8b989b975f87416589ce94051d1fc36")
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
    @JvmName("7c7b8a0979b6dd4bf62103f4b02e718f928a3daed90946a3d903d7ee044eddb6")
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
    @JvmName("af6dfaf61c62e11864702199d9943b5a7f857e760df422e64d9e69de22ff5408")
    override
        fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit):
        Unit = sendingOptions(CfnConfigurationSet.SendingOptionsProperty(sendingOptions))

    override fun suppressionOptions(suppressionOptions: IResolvable) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(IResolvable::unwrap))
    }

    override
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty) {
      cdkBuilder.suppressionOptions(suppressionOptions.let(CfnConfigurationSet.SuppressionOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1766b436ee2ace67fccd7b8e27f9639a0748817207fa01d61224cb821c592cad")
    override
        fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit):
        Unit =
        suppressionOptions(CfnConfigurationSet.SuppressionOptionsProperty(suppressionOptions))

    override fun trackingOptions(trackingOptions: IResolvable) {
      cdkBuilder.trackingOptions(trackingOptions.let(IResolvable::unwrap))
    }

    override fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
      cdkBuilder.trackingOptions(trackingOptions.let(CfnConfigurationSet.TrackingOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a270122f66bb2d23246474cc97c9b86630efa5b4188f0024907557c8ab4dd13c")
    override
        fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit):
        Unit = trackingOptions(CfnConfigurationSet.TrackingOptionsProperty(trackingOptions))

    override fun vdmOptions(vdmOptions: IResolvable) {
      cdkBuilder.vdmOptions(vdmOptions.let(IResolvable::unwrap))
    }

    override fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty) {
      cdkBuilder.vdmOptions(vdmOptions.let(CfnConfigurationSet.VdmOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5a18daf2058f44250195442572a690d207b0100f0fe949a03b4b22e620fb2a3")
    override fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty.Builder.() -> Unit):
        Unit = vdmOptions(CfnConfigurationSet.VdmOptionsProperty(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetProps {
    override fun deliveryOptions(): Any? = unwrap(this).getDeliveryOptions()

    override fun name(): String? = unwrap(this).getName()

    override fun reputationOptions(): Any? = unwrap(this).getReputationOptions()

    override fun sendingOptions(): Any? = unwrap(this).getSendingOptions()

    override fun suppressionOptions(): Any? = unwrap(this).getSuppressionOptions()

    override fun trackingOptions(): Any? = unwrap(this).getTrackingOptions()

    override fun vdmOptions(): Any? = unwrap(this).getVdmOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetProps):
        CfnConfigurationSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetProps):
        software.amazon.awscdk.services.ses.CfnConfigurationSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnConfigurationSetProps
  }
}
