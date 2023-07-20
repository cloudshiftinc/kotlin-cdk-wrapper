@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnSegment

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

public inline fun CfnCampaign.setSchedule(block: CfnCampaignSchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnCampaignSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
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

public inline
    fun CfnCampaign.setTemplateConfiguration(block: CfnCampaignTemplateConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCampaignTemplateConfigurationPropertyDsl()
  builder.apply(block)
  return setTemplateConfiguration(builder.build())
}
