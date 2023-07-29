@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pinpoint

import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnSegment

/** The message template to use for the ADM (Amazon Device Messaging) channel. */
public inline fun CfnPushTemplate.setAdm(
    block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return setAdm(builder.build())
}

/** The message template to use for the APNs (Apple Push Notification service) channel. */
public inline fun CfnPushTemplate.setApns(
    block: CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return setApns(builder.build())
}

/** The message template to use for the Baidu (Baidu Cloud Push) channel. */
public inline fun CfnPushTemplate.setBaidu(
    block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return setBaidu(builder.build())
}

/** The default message template to use for push notification channels. */
public inline fun CfnPushTemplate.setDefaultValue(
    block: CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return setDefaultValue(builder.build())
}

/**
 * The message template to use for the GCM channel, which is used to send notifications through the
 * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
 */
public inline fun CfnPushTemplate.setGcm(
    block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return setGcm(builder.build())
}

/** The schedule settings for the campaign. */
public inline fun CfnCampaign.setSchedule(block: CfnCampaignSchedulePropertyDsl.() -> Unit = {}) {
    val builder = CfnCampaignSchedulePropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/** Specifies the Lambda function to use as a code hook for a campaign. */
public inline fun CfnCampaign.setCampaignHook(
    block: CfnCampaignCampaignHookPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignCampaignHookPropertyDsl()
    builder.apply(block)
    return setCampaignHook(builder.build())
}

/** The delivery configuration settings for sending the treatment through a custom channel. */
public inline fun CfnCampaign.setCustomDeliveryConfiguration(
    block: CfnCampaignCustomDeliveryConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignCustomDeliveryConfigurationPropertyDsl()
    builder.apply(block)
    return setCustomDeliveryConfiguration(builder.build())
}

/** The messaging limits for the campaign. */
public inline fun CfnCampaign.setLimits(block: CfnCampaignLimitsPropertyDsl.() -> Unit = {}) {
    val builder = CfnCampaignLimitsPropertyDsl()
    builder.apply(block)
    return setLimits(builder.build())
}

/** The message configuration settings for the campaign. */
public inline fun CfnCampaign.setMessageConfiguration(
    block: CfnCampaignMessageConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignMessageConfigurationPropertyDsl()
    builder.apply(block)
    return setMessageConfiguration(builder.build())
}

/** The message template to use for the treatment. */
public inline fun CfnCampaign.setTemplateConfiguration(
    block: CfnCampaignTemplateConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignTemplateConfigurationPropertyDsl()
    builder.apply(block)
    return setTemplateConfiguration(builder.build())
}

/**
 * The settings for the Lambda function to use by default as a code hook for campaigns in the
 * application.
 */
public inline fun CfnApplicationSettings.setCampaignHook(
    block: CfnApplicationSettingsCampaignHookPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationSettingsCampaignHookPropertyDsl()
    builder.apply(block)
    return setCampaignHook(builder.build())
}

/** The default sending limits for campaigns in the application. */
public inline fun CfnApplicationSettings.setLimits(
    block: CfnApplicationSettingsLimitsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationSettingsLimitsPropertyDsl()
    builder.apply(block)
    return setLimits(builder.build())
}

/** The default quiet time for campaigns in the application. */
public inline fun CfnApplicationSettings.setQuietTime(
    block: CfnApplicationSettingsQuietTimePropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationSettingsQuietTimePropertyDsl()
    builder.apply(block)
    return setQuietTime(builder.build())
}

/** The criteria that define the dimensions for the segment. */
public inline fun CfnSegment.setDimensions(
    block: CfnSegmentSegmentDimensionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSegmentSegmentDimensionsPropertyDsl()
    builder.apply(block)
    return setDimensions(builder.build())
}

/**
 * The segment group to use and the dimensions to apply to the group's base segments in order to
 * build the segment.
 */
public inline fun CfnSegment.setSegmentGroups(
    block: CfnSegmentSegmentGroupsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSegmentSegmentGroupsPropertyDsl()
    builder.apply(block)
    return setSegmentGroups(builder.build())
}
