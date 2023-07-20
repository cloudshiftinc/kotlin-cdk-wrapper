@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannelProps
import software.amazon.awscdk.services.pinpoint.CfnApp
import software.amazon.awscdk.services.pinpoint.CfnAppProps
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnCampaignProps
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.amazon.awscdk.services.pinpoint.CfnSegmentProps
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps
import software.constructs.Construct

public object pinpoint {
  public inline fun cfnADMChannel(
    scope: Construct,
    id: String,
    block: CfnADMChannelDsl.() -> Unit = {},
  ): CfnADMChannel {
    val builder = CfnADMChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnADMChannelProps(block: CfnADMChannelPropsDsl.() -> Unit = {}):
      CfnADMChannelProps {
    val builder = CfnADMChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSChannel(
    scope: Construct,
    id: String,
    block: CfnAPNSChannelDsl.() -> Unit = {},
  ): CfnAPNSChannel {
    val builder = CfnAPNSChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSChannelProps(block: CfnAPNSChannelPropsDsl.() -> Unit = {}):
      CfnAPNSChannelProps {
    val builder = CfnAPNSChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSSandboxChannel(
    scope: Construct,
    id: String,
    block: CfnAPNSSandboxChannelDsl.() -> Unit = {},
  ): CfnAPNSSandboxChannel {
    val builder = CfnAPNSSandboxChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSSandboxChannelProps(block: CfnAPNSSandboxChannelPropsDsl.() -> Unit =
      {}): CfnAPNSSandboxChannelProps {
    val builder = CfnAPNSSandboxChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSVoipChannel(
    scope: Construct,
    id: String,
    block: CfnAPNSVoipChannelDsl.() -> Unit = {},
  ): CfnAPNSVoipChannel {
    val builder = CfnAPNSVoipChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSVoipChannelProps(block: CfnAPNSVoipChannelPropsDsl.() -> Unit = {}):
      CfnAPNSVoipChannelProps {
    val builder = CfnAPNSVoipChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAPNSVoipSandboxChannel(
    scope: Construct,
    id: String,
    block: CfnAPNSVoipSandboxChannelDsl.() -> Unit = {},
  ): CfnAPNSVoipSandboxChannel {
    val builder = CfnAPNSVoipSandboxChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAPNSVoipSandboxChannelProps(block: CfnAPNSVoipSandboxChannelPropsDsl.() -> Unit = {}):
      CfnAPNSVoipSandboxChannelProps {
    val builder = CfnAPNSVoipSandboxChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApp(
    scope: Construct,
    id: String,
    block: CfnAppDsl.() -> Unit = {},
  ): CfnApp {
    val builder = CfnAppDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
    val builder = CfnAppPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationSettings(
    scope: Construct,
    id: String,
    block: CfnApplicationSettingsDsl.() -> Unit = {},
  ): CfnApplicationSettings {
    val builder = CfnApplicationSettingsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationSettingsCampaignHookProperty(block: CfnApplicationSettingsCampaignHookPropertyDsl.() -> Unit
      = {}): CfnApplicationSettings.CampaignHookProperty {
    val builder = CfnApplicationSettingsCampaignHookPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationSettingsLimitsProperty(block: CfnApplicationSettingsLimitsPropertyDsl.() -> Unit
      = {}): CfnApplicationSettings.LimitsProperty {
    val builder = CfnApplicationSettingsLimitsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationSettingsProps(block: CfnApplicationSettingsPropsDsl.() -> Unit =
      {}): CfnApplicationSettingsProps {
    val builder = CfnApplicationSettingsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationSettingsQuietTimeProperty(block: CfnApplicationSettingsQuietTimePropertyDsl.() -> Unit
      = {}): CfnApplicationSettings.QuietTimeProperty {
    val builder = CfnApplicationSettingsQuietTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBaiduChannel(
    scope: Construct,
    id: String,
    block: CfnBaiduChannelDsl.() -> Unit = {},
  ): CfnBaiduChannel {
    val builder = CfnBaiduChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBaiduChannelProps(block: CfnBaiduChannelPropsDsl.() -> Unit = {}):
      CfnBaiduChannelProps {
    val builder = CfnBaiduChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaign(
    scope: Construct,
    id: String,
    block: CfnCampaignDsl.() -> Unit = {},
  ): CfnCampaign {
    val builder = CfnCampaignDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignAttributeDimensionProperty(block: CfnCampaignAttributeDimensionPropertyDsl.() -> Unit
      = {}): CfnCampaign.AttributeDimensionProperty {
    val builder = CfnCampaignAttributeDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignCustomMessageProperty(block: CfnCampaignCampaignCustomMessagePropertyDsl.() -> Unit
      = {}): CfnCampaign.CampaignCustomMessageProperty {
    val builder = CfnCampaignCampaignCustomMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignEmailMessageProperty(block: CfnCampaignCampaignEmailMessagePropertyDsl.() -> Unit
      = {}): CfnCampaign.CampaignEmailMessageProperty {
    val builder = CfnCampaignCampaignEmailMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignEventFilterProperty(block: CfnCampaignCampaignEventFilterPropertyDsl.() -> Unit
      = {}): CfnCampaign.CampaignEventFilterProperty {
    val builder = CfnCampaignCampaignEventFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignHookProperty(block: CfnCampaignCampaignHookPropertyDsl.() -> Unit =
      {}): CfnCampaign.CampaignHookProperty {
    val builder = CfnCampaignCampaignHookPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignInAppMessageProperty(block: CfnCampaignCampaignInAppMessagePropertyDsl.() -> Unit
      = {}): CfnCampaign.CampaignInAppMessageProperty {
    val builder = CfnCampaignCampaignInAppMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCampaignSmsMessageProperty(block: CfnCampaignCampaignSmsMessagePropertyDsl.() -> Unit
      = {}): CfnCampaign.CampaignSmsMessageProperty {
    val builder = CfnCampaignCampaignSmsMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignCustomDeliveryConfigurationProperty(block: CfnCampaignCustomDeliveryConfigurationPropertyDsl.() -> Unit
      = {}): CfnCampaign.CustomDeliveryConfigurationProperty {
    val builder = CfnCampaignCustomDeliveryConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignDefaultButtonConfigurationProperty(block: CfnCampaignDefaultButtonConfigurationPropertyDsl.() -> Unit
      = {}): CfnCampaign.DefaultButtonConfigurationProperty {
    val builder = CfnCampaignDefaultButtonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignEventDimensionsProperty(block: CfnCampaignEventDimensionsPropertyDsl.() -> Unit
      = {}): CfnCampaign.EventDimensionsProperty {
    val builder = CfnCampaignEventDimensionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignInAppMessageBodyConfigProperty(block: CfnCampaignInAppMessageBodyConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.InAppMessageBodyConfigProperty {
    val builder = CfnCampaignInAppMessageBodyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignInAppMessageButtonProperty(block: CfnCampaignInAppMessageButtonPropertyDsl.() -> Unit
      = {}): CfnCampaign.InAppMessageButtonProperty {
    val builder = CfnCampaignInAppMessageButtonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignInAppMessageContentProperty(block: CfnCampaignInAppMessageContentPropertyDsl.() -> Unit
      = {}): CfnCampaign.InAppMessageContentProperty {
    val builder = CfnCampaignInAppMessageContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignInAppMessageHeaderConfigProperty(block: CfnCampaignInAppMessageHeaderConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.InAppMessageHeaderConfigProperty {
    val builder = CfnCampaignInAppMessageHeaderConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignLimitsProperty(block: CfnCampaignLimitsPropertyDsl.() -> Unit = {}):
      CfnCampaign.LimitsProperty {
    val builder = CfnCampaignLimitsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignMessageConfigurationProperty(block: CfnCampaignMessageConfigurationPropertyDsl.() -> Unit
      = {}): CfnCampaign.MessageConfigurationProperty {
    val builder = CfnCampaignMessageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignMessageProperty(block: CfnCampaignMessagePropertyDsl.() -> Unit =
      {}): CfnCampaign.MessageProperty {
    val builder = CfnCampaignMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignMetricDimensionProperty(block: CfnCampaignMetricDimensionPropertyDsl.() -> Unit
      = {}): CfnCampaign.MetricDimensionProperty {
    val builder = CfnCampaignMetricDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignOverrideButtonConfigurationProperty(block: CfnCampaignOverrideButtonConfigurationPropertyDsl.() -> Unit
      = {}): CfnCampaign.OverrideButtonConfigurationProperty {
    val builder = CfnCampaignOverrideButtonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignProps(block: CfnCampaignPropsDsl.() -> Unit = {}): CfnCampaignProps {
    val builder = CfnCampaignPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignQuietTimeProperty(block: CfnCampaignQuietTimePropertyDsl.() -> Unit =
      {}): CfnCampaign.QuietTimeProperty {
    val builder = CfnCampaignQuietTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignScheduleProperty(block: CfnCampaignSchedulePropertyDsl.() -> Unit =
      {}): CfnCampaign.ScheduleProperty {
    val builder = CfnCampaignSchedulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignSetDimensionProperty(block: CfnCampaignSetDimensionPropertyDsl.() -> Unit =
      {}): CfnCampaign.SetDimensionProperty {
    val builder = CfnCampaignSetDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignTemplateConfigurationProperty(block: CfnCampaignTemplateConfigurationPropertyDsl.() -> Unit
      = {}): CfnCampaign.TemplateConfigurationProperty {
    val builder = CfnCampaignTemplateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignTemplateProperty(block: CfnCampaignTemplatePropertyDsl.() -> Unit =
      {}): CfnCampaign.TemplateProperty {
    val builder = CfnCampaignTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignWriteTreatmentResourceProperty(block: CfnCampaignWriteTreatmentResourcePropertyDsl.() -> Unit
      = {}): CfnCampaign.WriteTreatmentResourceProperty {
    val builder = CfnCampaignWriteTreatmentResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailChannel(
    scope: Construct,
    id: String,
    block: CfnEmailChannelDsl.() -> Unit = {},
  ): CfnEmailChannel {
    val builder = CfnEmailChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailChannelProps(block: CfnEmailChannelPropsDsl.() -> Unit = {}):
      CfnEmailChannelProps {
    val builder = CfnEmailChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailTemplate(
    scope: Construct,
    id: String,
    block: CfnEmailTemplateDsl.() -> Unit = {},
  ): CfnEmailTemplate {
    val builder = CfnEmailTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEmailTemplateProps(block: CfnEmailTemplatePropsDsl.() -> Unit = {}):
      CfnEmailTemplateProps {
    val builder = CfnEmailTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventStream(
    scope: Construct,
    id: String,
    block: CfnEventStreamDsl.() -> Unit = {},
  ): CfnEventStream {
    val builder = CfnEventStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventStreamProps(block: CfnEventStreamPropsDsl.() -> Unit = {}):
      CfnEventStreamProps {
    val builder = CfnEventStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGCMChannel(
    scope: Construct,
    id: String,
    block: CfnGCMChannelDsl.() -> Unit = {},
  ): CfnGCMChannel {
    val builder = CfnGCMChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGCMChannelProps(block: CfnGCMChannelPropsDsl.() -> Unit = {}):
      CfnGCMChannelProps {
    val builder = CfnGCMChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInAppTemplate(
    scope: Construct,
    id: String,
    block: CfnInAppTemplateDsl.() -> Unit = {},
  ): CfnInAppTemplate {
    val builder = CfnInAppTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateBodyConfigProperty(block: CfnInAppTemplateBodyConfigPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.BodyConfigProperty {
    val builder = CfnInAppTemplateBodyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateButtonConfigProperty(block: CfnInAppTemplateButtonConfigPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.ButtonConfigProperty {
    val builder = CfnInAppTemplateButtonConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateDefaultButtonConfigurationProperty(block: CfnInAppTemplateDefaultButtonConfigurationPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.DefaultButtonConfigurationProperty {
    val builder = CfnInAppTemplateDefaultButtonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateHeaderConfigProperty(block: CfnInAppTemplateHeaderConfigPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.HeaderConfigProperty {
    val builder = CfnInAppTemplateHeaderConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateInAppMessageContentProperty(block: CfnInAppTemplateInAppMessageContentPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.InAppMessageContentProperty {
    val builder = CfnInAppTemplateInAppMessageContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInAppTemplateOverrideButtonConfigurationProperty(block: CfnInAppTemplateOverrideButtonConfigurationPropertyDsl.() -> Unit
      = {}): CfnInAppTemplate.OverrideButtonConfigurationProperty {
    val builder = CfnInAppTemplateOverrideButtonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInAppTemplateProps(block: CfnInAppTemplatePropsDsl.() -> Unit = {}):
      CfnInAppTemplateProps {
    val builder = CfnInAppTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPushTemplate(
    scope: Construct,
    id: String,
    block: CfnPushTemplateDsl.() -> Unit = {},
  ): CfnPushTemplate {
    val builder = CfnPushTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPushTemplateAPNSPushNotificationTemplateProperty(block: CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl.() -> Unit
      = {}): CfnPushTemplate.APNSPushNotificationTemplateProperty {
    val builder = CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPushTemplateAndroidPushNotificationTemplateProperty(block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit
      = {}): CfnPushTemplate.AndroidPushNotificationTemplateProperty {
    val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPushTemplateDefaultPushNotificationTemplateProperty(block: CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl.() -> Unit
      = {}): CfnPushTemplate.DefaultPushNotificationTemplateProperty {
    val builder = CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPushTemplateProps(block: CfnPushTemplatePropsDsl.() -> Unit = {}):
      CfnPushTemplateProps {
    val builder = CfnPushTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSMSChannel(
    scope: Construct,
    id: String,
    block: CfnSMSChannelDsl.() -> Unit = {},
  ): CfnSMSChannel {
    val builder = CfnSMSChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSMSChannelProps(block: CfnSMSChannelPropsDsl.() -> Unit = {}):
      CfnSMSChannelProps {
    val builder = CfnSMSChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegment(
    scope: Construct,
    id: String,
    block: CfnSegmentDsl.() -> Unit = {},
  ): CfnSegment {
    val builder = CfnSegmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSegmentAttributeDimensionProperty(block: CfnSegmentAttributeDimensionPropertyDsl.() -> Unit
      = {}): CfnSegment.AttributeDimensionProperty {
    val builder = CfnSegmentAttributeDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentBehaviorProperty(block: CfnSegmentBehaviorPropertyDsl.() -> Unit =
      {}): CfnSegment.BehaviorProperty {
    val builder = CfnSegmentBehaviorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentCoordinatesProperty(block: CfnSegmentCoordinatesPropertyDsl.() -> Unit
      = {}): CfnSegment.CoordinatesProperty {
    val builder = CfnSegmentCoordinatesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentDemographicProperty(block: CfnSegmentDemographicPropertyDsl.() -> Unit
      = {}): CfnSegment.DemographicProperty {
    val builder = CfnSegmentDemographicPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentGPSPointProperty(block: CfnSegmentGPSPointPropertyDsl.() -> Unit =
      {}): CfnSegment.GPSPointProperty {
    val builder = CfnSegmentGPSPointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentGroupsProperty(block: CfnSegmentGroupsPropertyDsl.() -> Unit = {}):
      CfnSegment.GroupsProperty {
    val builder = CfnSegmentGroupsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentLocationProperty(block: CfnSegmentLocationPropertyDsl.() -> Unit =
      {}): CfnSegment.LocationProperty {
    val builder = CfnSegmentLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentProps(block: CfnSegmentPropsDsl.() -> Unit = {}): CfnSegmentProps {
    val builder = CfnSegmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSegmentRecencyProperty(block: CfnSegmentRecencyPropertyDsl.() -> Unit = {}):
      CfnSegment.RecencyProperty {
    val builder = CfnSegmentRecencyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSegmentSegmentDimensionsProperty(block: CfnSegmentSegmentDimensionsPropertyDsl.() -> Unit
      = {}): CfnSegment.SegmentDimensionsProperty {
    val builder = CfnSegmentSegmentDimensionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSegmentSegmentGroupsProperty(block: CfnSegmentSegmentGroupsPropertyDsl.() -> Unit =
      {}): CfnSegment.SegmentGroupsProperty {
    val builder = CfnSegmentSegmentGroupsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSegmentSetDimensionProperty(block: CfnSegmentSetDimensionPropertyDsl.() -> Unit = {}):
      CfnSegment.SetDimensionProperty {
    val builder = CfnSegmentSetDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSegmentSourceSegmentsProperty(block: CfnSegmentSourceSegmentsPropertyDsl.() -> Unit =
      {}): CfnSegment.SourceSegmentsProperty {
    val builder = CfnSegmentSourceSegmentsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSmsTemplate(
    scope: Construct,
    id: String,
    block: CfnSmsTemplateDsl.() -> Unit = {},
  ): CfnSmsTemplate {
    val builder = CfnSmsTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSmsTemplateProps(block: CfnSmsTemplatePropsDsl.() -> Unit = {}):
      CfnSmsTemplateProps {
    val builder = CfnSmsTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVoiceChannel(
    scope: Construct,
    id: String,
    block: CfnVoiceChannelDsl.() -> Unit = {},
  ): CfnVoiceChannel {
    val builder = CfnVoiceChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVoiceChannelProps(block: CfnVoiceChannelPropsDsl.() -> Unit = {}):
      CfnVoiceChannelProps {
    val builder = CfnVoiceChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
