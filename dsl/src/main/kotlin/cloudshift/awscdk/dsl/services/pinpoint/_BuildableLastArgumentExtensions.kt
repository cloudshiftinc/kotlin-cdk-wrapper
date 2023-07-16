@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnApp
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel

public inline fun CfnADMChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAPNSChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAPNSSandboxChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAPNSVoipChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAPNSVoipSandboxChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnApp.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnApplicationSettings.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApplicationSettings.setCampaignHook(block: CfnApplicationSettingsCampaignHookPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationSettingsCampaignHookPropertyDsl()
  builder.apply(block)
  return setCampaignHook(builder.build())
}

public inline
    fun CfnApplicationSettings.setLimits(block: CfnApplicationSettingsLimitsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnApplicationSettingsLimitsPropertyDsl()
  builder.apply(block)
  return setLimits(builder.build())
}

public inline
    fun CfnApplicationSettings.setQuietTime(block: CfnApplicationSettingsQuietTimePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationSettingsQuietTimePropertyDsl()
  builder.apply(block)
  return setQuietTime(builder.build())
}

public inline fun CfnBaiduChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCampaign.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCampaign.setCampaignHook(block: CfnCampaignCampaignHookPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCampaignCampaignHookPropertyDsl()
  builder.apply(block)
  return setCampaignHook(builder.build())
}

public inline
    fun CfnCampaign.setCustomDeliveryConfiguration(block: CfnCampaignCustomDeliveryConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCampaignCustomDeliveryConfigurationPropertyDsl()
  builder.apply(block)
  return setCustomDeliveryConfiguration(builder.build())
}

public inline fun CfnCampaign.setLimits(block: CfnCampaignLimitsPropertyDsl.() -> Unit = {}) {
  val builder = CfnCampaignLimitsPropertyDsl()
  builder.apply(block)
  return setLimits(builder.build())
}

public inline
    fun CfnCampaign.setMessageConfiguration(block: CfnCampaignMessageConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCampaignMessageConfigurationPropertyDsl()
  builder.apply(block)
  return setMessageConfiguration(builder.build())
}

public inline fun CfnCampaign.setSchedule(block: CfnCampaignSchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnCampaignSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

public inline
    fun CfnCampaign.setTemplateConfiguration(block: CfnCampaignTemplateConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCampaignTemplateConfigurationPropertyDsl()
  builder.apply(block)
  return setTemplateConfiguration(builder.build())
}

public inline fun CfnEmailChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEmailTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventStream.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGCMChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInAppTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPushTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPushTemplate.setAdm(block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
  builder.apply(block)
  return setAdm(builder.build())
}

public inline
    fun CfnPushTemplate.setApns(block: CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl()
  builder.apply(block)
  return setApns(builder.build())
}

public inline
    fun CfnPushTemplate.setBaidu(block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
  builder.apply(block)
  return setBaidu(builder.build())
}

public inline
    fun CfnPushTemplate.setDefaultValue(block: CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl()
  builder.apply(block)
  return setDefaultValue(builder.build())
}

public inline
    fun CfnPushTemplate.setGcm(block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
  builder.apply(block)
  return setGcm(builder.build())
}

public inline fun CfnSMSChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSegment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSegment.setDimensions(block: CfnSegmentSegmentDimensionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSegmentSegmentDimensionsPropertyDsl()
  builder.apply(block)
  return setDimensions(builder.build())
}

public inline fun CfnSegment.setSegmentGroups(block: CfnSegmentSegmentGroupsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSegmentSegmentGroupsPropertyDsl()
  builder.apply(block)
  return setSegmentGroups(builder.build())
}

public inline fun CfnSmsTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVoiceChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
