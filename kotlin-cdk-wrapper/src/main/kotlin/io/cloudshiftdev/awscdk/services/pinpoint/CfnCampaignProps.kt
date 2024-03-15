@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCampaignProps {
  public fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

  public fun applicationId(): String

  public fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  public fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

  public fun isPaused(): Any? = unwrap(this).getIsPaused()

  public fun limits(): Any? = unwrap(this).getLimits()

  public fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

  public fun name(): String

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun schedule(): Any

  public fun segmentId(): String

  public fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

  public fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

  public fun treatmentName(): String? = unwrap(this).getTreatmentName()

  @CdkDslMarker
  public interface Builder {
    public fun additionalTreatments(additionalTreatments: IResolvable)

    public fun additionalTreatments(additionalTreatments: List<Any>)

    public fun additionalTreatments(vararg additionalTreatments: Any)

    public fun applicationId(applicationId: String)

    public fun campaignHook(campaignHook: IResolvable)

    public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7765edaf3643eed4f16af292a0530960c03cc3d63b639fa3595ac3ccddfd048b")
    public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty.Builder.() -> Unit)

    public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable)

    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef17dc66d71ce14660edfe0fafc57a5c392397c27b45a7a9dd40d0fc2d1a16c2")
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun holdoutPercent(holdoutPercent: Number)

    public fun isPaused(isPaused: Boolean)

    public fun isPaused(isPaused: IResolvable)

    public fun limits(limits: IResolvable)

    public fun limits(limits: CfnCampaign.LimitsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bccf8bde9d07fa206c1c3111e8a2abdbb90665708e16bab7cf6839e2432f68f8")
    public fun limits(limits: CfnCampaign.LimitsProperty.Builder.() -> Unit)

    public fun messageConfiguration(messageConfiguration: IResolvable)

    public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621da6393ff90d2efc4524e80d590e3e2d4195c99fd9aec0d6136bc524f9df03")
    public
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnCampaign.ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185f36fa4276f0b8fcba9e8b1761925ef9ec7ebc207df3eca981325f941886c5")
    public fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit)

    public fun segmentId(segmentId: String)

    public fun segmentVersion(segmentVersion: Number)

    public fun tags(tags: Any)

    public fun templateConfiguration(templateConfiguration: IResolvable)

    public
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dced4d0b704f7a2a535874cf3447517fa892e3e3d0ae5e1078802a75ff11d3ad")
    public
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty.Builder.() -> Unit)

    public fun treatmentDescription(treatmentDescription: String)

    public fun treatmentName(treatmentName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnCampaignProps.builder()

    override fun additionalTreatments(additionalTreatments: IResolvable) {
      cdkBuilder.additionalTreatments(additionalTreatments.let(IResolvable::unwrap))
    }

    override fun additionalTreatments(additionalTreatments: List<Any>) {
      cdkBuilder.additionalTreatments(additionalTreatments)
    }

    override fun additionalTreatments(vararg additionalTreatments: Any): Unit =
        additionalTreatments(additionalTreatments.toList())

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    override fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CfnCampaign.CampaignHookProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7765edaf3643eed4f16af292a0530960c03cc3d63b639fa3595ac3ccddfd048b")
    override fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty.Builder.() -> Unit):
        Unit = campaignHook(CfnCampaign.CampaignHookProperty(campaignHook))

    override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable::unwrap))
    }

    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CfnCampaign.CustomDeliveryConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef17dc66d71ce14660edfe0fafc57a5c392397c27b45a7a9dd40d0fc2d1a16c2")
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDeliveryConfiguration(CfnCampaign.CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun holdoutPercent(holdoutPercent: Number) {
      cdkBuilder.holdoutPercent(holdoutPercent)
    }

    override fun isPaused(isPaused: Boolean) {
      cdkBuilder.isPaused(isPaused)
    }

    override fun isPaused(isPaused: IResolvable) {
      cdkBuilder.isPaused(isPaused.let(IResolvable::unwrap))
    }

    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    override fun limits(limits: CfnCampaign.LimitsProperty) {
      cdkBuilder.limits(limits.let(CfnCampaign.LimitsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bccf8bde9d07fa206c1c3111e8a2abdbb90665708e16bab7cf6839e2432f68f8")
    override fun limits(limits: CfnCampaign.LimitsProperty.Builder.() -> Unit): Unit =
        limits(CfnCampaign.LimitsProperty(limits))

    override fun messageConfiguration(messageConfiguration: IResolvable) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable::unwrap))
    }

    override
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(CfnCampaign.MessageConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621da6393ff90d2efc4524e80d590e3e2d4195c99fd9aec0d6136bc524f9df03")
    override
        fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty.Builder.() -> Unit):
        Unit = messageConfiguration(CfnCampaign.MessageConfigurationProperty(messageConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnCampaign.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCampaign.ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("185f36fa4276f0b8fcba9e8b1761925ef9ec7ebc207df3eca981325f941886c5")
    override fun schedule(schedule: CfnCampaign.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCampaign.ScheduleProperty(schedule))

    override fun segmentId(segmentId: String) {
      cdkBuilder.segmentId(segmentId)
    }

    override fun segmentVersion(segmentVersion: Number) {
      cdkBuilder.segmentVersion(segmentVersion)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
    }

    override
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(CfnCampaign.TemplateConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dced4d0b704f7a2a535874cf3447517fa892e3e3d0ae5e1078802a75ff11d3ad")
    override
        fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty.Builder.() -> Unit):
        Unit =
        templateConfiguration(CfnCampaign.TemplateConfigurationProperty(templateConfiguration))

    override fun treatmentDescription(treatmentDescription: String) {
      cdkBuilder.treatmentDescription(treatmentDescription)
    }

    override fun treatmentName(treatmentName: String) {
      cdkBuilder.treatmentName(treatmentName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaignProps,
  ) : CdkObject(cdkObject), CfnCampaignProps {
    override fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun campaignHook(): Any? = unwrap(this).getCampaignHook()

    override fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

    override fun isPaused(): Any? = unwrap(this).getIsPaused()

    override fun limits(): Any? = unwrap(this).getLimits()

    override fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

    override fun name(): String = unwrap(this).getName()

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun schedule(): Any = unwrap(this).getSchedule()

    override fun segmentId(): String = unwrap(this).getSegmentId()

    override fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    override fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

    override fun treatmentName(): String? = unwrap(this).getTreatmentName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaignProps):
        CfnCampaignProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.pinpoint.CfnCampaignProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.pinpoint.CfnCampaignProps
  }
}
