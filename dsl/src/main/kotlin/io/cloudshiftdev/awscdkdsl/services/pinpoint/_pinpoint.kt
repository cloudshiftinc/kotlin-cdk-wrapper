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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

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
    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the ADM channel to send push notifications through the Amazon Device Messaging
     * (ADM) service to apps that run on Amazon devices, such as Kindle Fire tablets. Before you can
     * use Amazon Pinpoint to send messages to Amazon devices, you have to enable the ADM channel
     * for an Amazon Pinpoint application.
     *
     * The ADMChannel resource represents the status and authentication settings for the ADM channel
     * for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnADMChannel cfnADMChannel = CfnADMChannel.Builder.create(this, "MyCfnADMChannel")
     * .applicationId("applicationId")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html)
     */
    public inline fun cfnADMChannel(
        scope: Construct,
        id: String,
        block: CfnADMChannelDsl.() -> Unit = {},
    ): CfnADMChannel {
        val builder = CfnADMChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnADMChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnADMChannelProps cfnADMChannelProps = CfnADMChannelProps.builder()
     * .applicationId("applicationId")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html)
     */
    public inline fun cfnADMChannelProps(
        block: CfnADMChannelPropsDsl.() -> Unit = {}
    ): CfnADMChannelProps {
        val builder = CfnADMChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the APNs channel to send push notification messages to the Apple Push
     * Notification service (APNs). Before you can use Amazon Pinpoint to send notifications to
     * APNs, you have to enable the APNs channel for an Amazon Pinpoint application.
     *
     * The APNSChannel resource represents the status and authentication settings for the APNs
     * channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSChannel cfnAPNSChannel = CfnAPNSChannel.Builder.create(this, "MyCfnAPNSChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html)
     */
    public inline fun cfnAPNSChannel(
        scope: Construct,
        id: String,
        block: CfnAPNSChannelDsl.() -> Unit = {},
    ): CfnAPNSChannel {
        val builder = CfnAPNSChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAPNSChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSChannelProps cfnAPNSChannelProps = CfnAPNSChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html)
     */
    public inline fun cfnAPNSChannelProps(
        block: CfnAPNSChannelPropsDsl.() -> Unit = {}
    ): CfnAPNSChannelProps {
        val builder = CfnAPNSChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the APNs sandbox channel to send push notification messages to the sandbox
     * environment of the Apple Push Notification service (APNs). Before you can use Amazon Pinpoint
     * to send notifications to the APNs sandbox environment, you have to enable the APNs sandbox
     * channel for an Amazon Pinpoint application.
     *
     * The APNSSandboxChannel resource represents the status and authentication settings of the APNs
     * sandbox channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSSandboxChannel cfnAPNSSandboxChannel = CfnAPNSSandboxChannel.Builder.create(this,
     * "MyCfnAPNSSandboxChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html)
     */
    public inline fun cfnAPNSSandboxChannel(
        scope: Construct,
        id: String,
        block: CfnAPNSSandboxChannelDsl.() -> Unit = {},
    ): CfnAPNSSandboxChannel {
        val builder = CfnAPNSSandboxChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAPNSSandboxChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSSandboxChannelProps cfnAPNSSandboxChannelProps = CfnAPNSSandboxChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html)
     */
    public inline fun cfnAPNSSandboxChannelProps(
        block: CfnAPNSSandboxChannelPropsDsl.() -> Unit = {}
    ): CfnAPNSSandboxChannelProps {
        val builder = CfnAPNSSandboxChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the APNs VoIP channel to send VoIP notification messages to the Apple Push
     * Notification service (APNs). Before you can use Amazon Pinpoint to send VoIP notifications to
     * APNs, you have to enable the APNs VoIP channel for an Amazon Pinpoint application.
     *
     * The APNSVoipChannel resource represents the status and authentication settings of the APNs
     * VoIP channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSVoipChannel cfnAPNSVoipChannel = CfnAPNSVoipChannel.Builder.create(this,
     * "MyCfnAPNSVoipChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html)
     */
    public inline fun cfnAPNSVoipChannel(
        scope: Construct,
        id: String,
        block: CfnAPNSVoipChannelDsl.() -> Unit = {},
    ): CfnAPNSVoipChannel {
        val builder = CfnAPNSVoipChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAPNSVoipChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSVoipChannelProps cfnAPNSVoipChannelProps = CfnAPNSVoipChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html)
     */
    public inline fun cfnAPNSVoipChannelProps(
        block: CfnAPNSVoipChannelPropsDsl.() -> Unit = {}
    ): CfnAPNSVoipChannelProps {
        val builder = CfnAPNSVoipChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the APNs VoIP sandbox channel to send VoIP notification messages to the sandbox
     * environment of the Apple Push Notification service (APNs). Before you can use Amazon Pinpoint
     * to send VoIP notifications to the APNs sandbox environment, you have to enable the APNs VoIP
     * sandbox channel for an Amazon Pinpoint application.
     *
     * The APNSVoipSandboxChannel resource represents the status and authentication settings of the
     * APNs VoIP sandbox channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSVoipSandboxChannel cfnAPNSVoipSandboxChannel =
     * CfnAPNSVoipSandboxChannel.Builder.create(this, "MyCfnAPNSVoipSandboxChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipsandboxchannel.html)
     */
    public inline fun cfnAPNSVoipSandboxChannel(
        scope: Construct,
        id: String,
        block: CfnAPNSVoipSandboxChannelDsl.() -> Unit = {},
    ): CfnAPNSVoipSandboxChannel {
        val builder = CfnAPNSVoipSandboxChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAPNSVoipSandboxChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnAPNSVoipSandboxChannelProps cfnAPNSVoipSandboxChannelProps =
     * CfnAPNSVoipSandboxChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .bundleId("bundleId")
     * .certificate("certificate")
     * .defaultAuthenticationMethod("defaultAuthenticationMethod")
     * .enabled(false)
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .tokenKey("tokenKey")
     * .tokenKeyId("tokenKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipsandboxchannel.html)
     */
    public inline fun cfnAPNSVoipSandboxChannelProps(
        block: CfnAPNSVoipSandboxChannelPropsDsl.() -> Unit = {}
    ): CfnAPNSVoipSandboxChannelProps {
        val builder = CfnAPNSVoipSandboxChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An *app* is an Amazon Pinpoint application, also referred to as a *project* .
     *
     * An application is a collection of related settings, customer information, segments,
     * campaigns, and other types of Amazon Pinpoint resources.
     *
     * The App resource represents an Amazon Pinpoint application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
     * .name("name")
     * // the properties below are optional
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-app.html)
     */
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnAppProps cfnAppProps = CfnAppProps.builder()
     * .name("name")
     * // the properties below are optional
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-app.html)
     */
    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings for an Amazon Pinpoint application.
     *
     * In Amazon Pinpoint, an *application* (also referred to as an *app* or *project* ) is a
     * collection of related settings, customer information, segments, and campaigns, and other
     * types of Amazon Pinpoint resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnApplicationSettings cfnApplicationSettings = CfnApplicationSettings.Builder.create(this,
     * "MyCfnApplicationSettings")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .campaignHook(CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build())
     * .cloudWatchMetricsEnabled(false)
     * .limits(LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .total(123)
     * .build())
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html)
     */
    public inline fun cfnApplicationSettings(
        scope: Construct,
        id: String,
        block: CfnApplicationSettingsDsl.() -> Unit = {},
    ): CfnApplicationSettings {
        val builder = CfnApplicationSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CampaignHookProperty campaignHookProperty = CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html)
     */
    public inline fun cfnApplicationSettingsCampaignHookProperty(
        block: CfnApplicationSettingsCampaignHookPropertyDsl.() -> Unit = {}
    ): CfnApplicationSettings.CampaignHookProperty {
        val builder = CfnApplicationSettingsCampaignHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default sending limits for campaigns in the application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * LimitsProperty limitsProperty = LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .total(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html)
     */
    public inline fun cfnApplicationSettingsLimitsProperty(
        block: CfnApplicationSettingsLimitsPropertyDsl.() -> Unit = {}
    ): CfnApplicationSettings.LimitsProperty {
        val builder = CfnApplicationSettingsLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnApplicationSettingsProps cfnApplicationSettingsProps = CfnApplicationSettingsProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .campaignHook(CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build())
     * .cloudWatchMetricsEnabled(false)
     * .limits(LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .total(123)
     * .build())
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html)
     */
    public inline fun cfnApplicationSettingsProps(
        block: CfnApplicationSettingsPropsDsl.() -> Unit = {}
    ): CfnApplicationSettingsProps {
        val builder = CfnApplicationSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the start and end times that define a time range when messages aren't sent to
     * endpoints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * QuietTimeProperty quietTimeProperty = QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html)
     */
    public inline fun cfnApplicationSettingsQuietTimeProperty(
        block: CfnApplicationSettingsQuietTimePropertyDsl.() -> Unit = {}
    ): CfnApplicationSettings.QuietTimeProperty {
        val builder = CfnApplicationSettingsQuietTimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the Baidu channel to send notifications to the Baidu Cloud Push notification
     * service. Before you can use Amazon Pinpoint to send notifications to the Baidu Cloud Push
     * service, you have to enable the Baidu channel for an Amazon Pinpoint application.
     *
     * The BaiduChannel resource represents the status and authentication settings of the Baidu
     * channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnBaiduChannel cfnBaiduChannel = CfnBaiduChannel.Builder.create(this, "MyCfnBaiduChannel")
     * .apiKey("apiKey")
     * .applicationId("applicationId")
     * .secretKey("secretKey")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html)
     */
    public inline fun cfnBaiduChannel(
        scope: Construct,
        id: String,
        block: CfnBaiduChannelDsl.() -> Unit = {},
    ): CfnBaiduChannel {
        val builder = CfnBaiduChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBaiduChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnBaiduChannelProps cfnBaiduChannelProps = CfnBaiduChannelProps.builder()
     * .apiKey("apiKey")
     * .applicationId("applicationId")
     * .secretKey("secretKey")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html)
     */
    public inline fun cfnBaiduChannelProps(
        block: CfnBaiduChannelPropsDsl.() -> Unit = {}
    ): CfnBaiduChannelProps {
        val builder = CfnBaiduChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings for a campaign.
     *
     * A *campaign* is a messaging initiative that engages a specific segment of users for an Amazon
     * Pinpoint application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object customConfig;
     * Object metrics;
     * Object tags;
     * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
     * .applicationId("applicationId")
     * .name("name")
     * .schedule(ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build())
     * .segmentId("segmentId")
     * // the properties below are optional
     * .additionalTreatments(List.of(WriteTreatmentResourceProperty.builder()
     * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build())
     * .messageConfiguration(MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build())
     * .sizePercent(123)
     * .templateConfiguration(TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build())
     * .treatmentDescription("treatmentDescription")
     * .treatmentName("treatmentName")
     * .build()))
     * .campaignHook(CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build())
     * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build())
     * .description("description")
     * .holdoutPercent(123)
     * .isPaused(false)
     * .limits(LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .session(123)
     * .total(123)
     * .build())
     * .messageConfiguration(MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build())
     * .priority(123)
     * .segmentVersion(123)
     * .tags(tags)
     * .templateConfiguration(TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build())
     * .treatmentDescription("treatmentDescription")
     * .treatmentName("treatmentName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html)
     */
    public inline fun cfnCampaign(
        scope: Construct,
        id: String,
        block: CfnCampaignDsl.() -> Unit = {},
    ): CfnCampaign {
        val builder = CfnCampaignDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies attribute-based criteria for including or excluding endpoints from a segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
     * .attributeType("attributeType")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html)
     */
    public inline fun cfnCampaignAttributeDimensionProperty(
        block: CfnCampaignAttributeDimensionPropertyDsl.() -> Unit = {}
    ): CfnCampaign.AttributeDimensionProperty {
        val builder = CfnCampaignAttributeDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the contents of a message that's sent through a custom channel to recipients of a
     * campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CampaignCustomMessageProperty campaignCustomMessageProperty =
     * CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigncustommessage.html)
     */
    public inline fun cfnCampaignCampaignCustomMessageProperty(
        block: CfnCampaignCampaignCustomMessagePropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignCustomMessageProperty {
        val builder = CfnCampaignCampaignCustomMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the content and "From" address for an email message that's sent to recipients of a
     * campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CampaignEmailMessageProperty campaignEmailMessageProperty =
     * CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html)
     */
    public inline fun cfnCampaignCampaignEmailMessageProperty(
        block: CfnCampaignCampaignEmailMessagePropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignEmailMessageProperty {
        val builder = CfnCampaignCampaignEmailMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings for events that cause a campaign to be sent.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * CampaignEventFilterProperty campaignEventFilterProperty = CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html)
     */
    public inline fun cfnCampaignCampaignEventFilterProperty(
        block: CfnCampaignCampaignEventFilterPropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignEventFilterProperty {
        val builder = CfnCampaignCampaignEventFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies settings for invoking an Lambda function that customizes a segment for a campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CampaignHookProperty campaignHookProperty = CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html)
     */
    public inline fun cfnCampaignCampaignHookProperty(
        block: CfnCampaignCampaignHookPropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignHookProperty {
        val builder = CfnCampaignCampaignHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the appearance of an in-app message, including the message type, the title and body
     * text, text and background colors, and the configurations of buttons that appear in the
     * message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object customConfig;
     * CampaignInAppMessageProperty campaignInAppMessageProperty =
     * CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html)
     */
    public inline fun cfnCampaignCampaignInAppMessageProperty(
        block: CfnCampaignCampaignInAppMessagePropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignInAppMessageProperty {
        val builder = CfnCampaignCampaignInAppMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the content and settings for an SMS message that's sent to recipients of a
     * campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CampaignSmsMessageProperty campaignSmsMessageProperty = CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html)
     */
    public inline fun cfnCampaignCampaignSmsMessageProperty(
        block: CfnCampaignCampaignSmsMessagePropertyDsl.() -> Unit = {}
    ): CfnCampaign.CampaignSmsMessageProperty {
        val builder = CfnCampaignCampaignSmsMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the delivery configuration settings for sending a campaign or campaign treatment
     * through a custom channel.
     *
     * This object is required if you use the `CampaignCustomMessage` object to define the message
     * to send for the campaign or campaign treatment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CustomDeliveryConfigurationProperty customDeliveryConfigurationProperty =
     * CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html)
     */
    public inline fun cfnCampaignCustomDeliveryConfigurationProperty(
        block: CfnCampaignCustomDeliveryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.CustomDeliveryConfigurationProperty {
        val builder = CfnCampaignCustomDeliveryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default behavior for a button that appears in an in-app message.
     *
     * You can optionally add button configurations that specifically apply to iOS, Android, or web
     * browser users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * DefaultButtonConfigurationProperty defaultButtonConfigurationProperty =
     * DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-defaultbuttonconfiguration.html)
     */
    public inline fun cfnCampaignDefaultButtonConfigurationProperty(
        block: CfnCampaignDefaultButtonConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.DefaultButtonConfigurationProperty {
        val builder = CfnCampaignDefaultButtonConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the dimensions for an event filter that determines when a campaign is sent or a
     * journey activity is performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * EventDimensionsProperty eventDimensionsProperty = EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html)
     */
    public inline fun cfnCampaignEventDimensionsProperty(
        block: CfnCampaignEventDimensionsPropertyDsl.() -> Unit = {}
    ): CfnCampaign.EventDimensionsProperty {
        val builder = CfnCampaignEventDimensionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of main body text of the in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * InAppMessageBodyConfigProperty inAppMessageBodyConfigProperty =
     * InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html)
     */
    public inline fun cfnCampaignInAppMessageBodyConfigProperty(
        block: CfnCampaignInAppMessageBodyConfigPropertyDsl.() -> Unit = {}
    ): CfnCampaign.InAppMessageBodyConfigProperty {
        val builder = CfnCampaignInAppMessageBodyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a button that appears in an in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * InAppMessageButtonProperty inAppMessageButtonProperty = InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebutton.html)
     */
    public inline fun cfnCampaignInAppMessageButtonProperty(
        block: CfnCampaignInAppMessageButtonPropertyDsl.() -> Unit = {}
    ): CfnCampaign.InAppMessageButtonProperty {
        val builder = CfnCampaignInAppMessageButtonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration and contents of an in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html)
     */
    public inline fun cfnCampaignInAppMessageContentProperty(
        block: CfnCampaignInAppMessageContentPropertyDsl.() -> Unit = {}
    ): CfnCampaign.InAppMessageContentProperty {
        val builder = CfnCampaignInAppMessageContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration and content of the header or title text of the in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * InAppMessageHeaderConfigProperty inAppMessageHeaderConfigProperty =
     * InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessageheaderconfig.html)
     */
    public inline fun cfnCampaignInAppMessageHeaderConfigProperty(
        block: CfnCampaignInAppMessageHeaderConfigPropertyDsl.() -> Unit = {}
    ): CfnCampaign.InAppMessageHeaderConfigProperty {
        val builder = CfnCampaignInAppMessageHeaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the limits on the messages that a campaign can send.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * LimitsProperty limitsProperty = LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .session(123)
     * .total(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-limits.html)
     */
    public inline fun cfnCampaignLimitsProperty(
        block: CfnCampaignLimitsPropertyDsl.() -> Unit = {}
    ): CfnCampaign.LimitsProperty {
        val builder = CfnCampaignLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the message configuration settings for a campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object customConfig;
     * MessageConfigurationProperty messageConfigurationProperty =
     * MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-messageconfiguration.html)
     */
    public inline fun cfnCampaignMessageConfigurationProperty(
        block: CfnCampaignMessageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.MessageConfigurationProperty {
        val builder = CfnCampaignMessageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the content and settings for a push notification that's sent to recipients of a
     * campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * MessageProperty messageProperty = MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-message.html)
     */
    public inline fun cfnCampaignMessageProperty(
        block: CfnCampaignMessagePropertyDsl.() -> Unit = {}
    ): CfnCampaign.MessageProperty {
        val builder = CfnCampaignMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies metric-based criteria for including or excluding endpoints from a segment.
     *
     * These criteria derive from custom metrics that you define for endpoints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html)
     */
    public inline fun cfnCampaignMetricDimensionProperty(
        block: CfnCampaignMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnCampaign.MetricDimensionProperty {
        val builder = CfnCampaignMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a button with settings that are specific to a certain device
     * type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * OverrideButtonConfigurationProperty overrideButtonConfigurationProperty =
     * OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html)
     */
    public inline fun cfnCampaignOverrideButtonConfigurationProperty(
        block: CfnCampaignOverrideButtonConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.OverrideButtonConfigurationProperty {
        val builder = CfnCampaignOverrideButtonConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCampaign`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object customConfig;
     * Object metrics;
     * Object tags;
     * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
     * .applicationId("applicationId")
     * .name("name")
     * .schedule(ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build())
     * .segmentId("segmentId")
     * // the properties below are optional
     * .additionalTreatments(List.of(WriteTreatmentResourceProperty.builder()
     * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build())
     * .messageConfiguration(MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build())
     * .sizePercent(123)
     * .templateConfiguration(TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build())
     * .treatmentDescription("treatmentDescription")
     * .treatmentName("treatmentName")
     * .build()))
     * .campaignHook(CampaignHookProperty.builder()
     * .lambdaFunctionName("lambdaFunctionName")
     * .mode("mode")
     * .webUrl("webUrl")
     * .build())
     * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build())
     * .description("description")
     * .holdoutPercent(123)
     * .isPaused(false)
     * .limits(LimitsProperty.builder()
     * .daily(123)
     * .maximumDuration(123)
     * .messagesPerSecond(123)
     * .session(123)
     * .total(123)
     * .build())
     * .messageConfiguration(MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build())
     * .priority(123)
     * .segmentVersion(123)
     * .tags(tags)
     * .templateConfiguration(TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build())
     * .treatmentDescription("treatmentDescription")
     * .treatmentName("treatmentName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-campaign.html)
     */
    public inline fun cfnCampaignProps(
        block: CfnCampaignPropsDsl.() -> Unit = {}
    ): CfnCampaignProps {
        val builder = CfnCampaignPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the start and end times that define a time range when messages aren't sent to
     * endpoints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * QuietTimeProperty quietTimeProperty = QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-quiettime.html)
     */
    public inline fun cfnCampaignQuietTimeProperty(
        block: CfnCampaignQuietTimePropertyDsl.() -> Unit = {}
    ): CfnCampaign.QuietTimeProperty {
        val builder = CfnCampaignQuietTimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the schedule settings for a campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-schedule.html)
     */
    public inline fun cfnCampaignScheduleProperty(
        block: CfnCampaignSchedulePropertyDsl.() -> Unit = {}
    ): CfnCampaign.ScheduleProperty {
        val builder = CfnCampaignSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the dimension type and values for a segment dimension.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * SetDimensionProperty setDimensionProperty = SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html)
     */
    public inline fun cfnCampaignSetDimensionProperty(
        block: CfnCampaignSetDimensionPropertyDsl.() -> Unit = {}
    ): CfnCampaign.SetDimensionProperty {
        val builder = CfnCampaignSetDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the message template to use for the message, for each type of channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * TemplateConfigurationProperty templateConfigurationProperty =
     * TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-templateconfiguration.html)
     */
    public inline fun cfnCampaignTemplateConfigurationProperty(
        block: CfnCampaignTemplateConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCampaign.TemplateConfigurationProperty {
        val builder = CfnCampaignTemplateConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the name and version of the message template to use for the message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * TemplateProperty templateProperty = TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-template.html)
     */
    public inline fun cfnCampaignTemplateProperty(
        block: CfnCampaignTemplatePropertyDsl.() -> Unit = {}
    ): CfnCampaign.TemplateProperty {
        val builder = CfnCampaignTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings for a campaign treatment.
     *
     * A *treatment* is a variation of a campaign that's used for A/B testing of a campaign.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object customConfig;
     * Object metrics;
     * WriteTreatmentResourceProperty writeTreatmentResourceProperty =
     * WriteTreatmentResourceProperty.builder()
     * .customDeliveryConfiguration(CustomDeliveryConfigurationProperty.builder()
     * .deliveryUri("deliveryUri")
     * .endpointTypes(List.of("endpointTypes"))
     * .build())
     * .messageConfiguration(MessageConfigurationProperty.builder()
     * .admMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .apnsMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .baiduMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .customMessage(CampaignCustomMessageProperty.builder()
     * .data("data")
     * .build())
     * .defaultMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .emailMessage(CampaignEmailMessageProperty.builder()
     * .body("body")
     * .fromAddress("fromAddress")
     * .htmlBody("htmlBody")
     * .title("title")
     * .build())
     * .gcmMessage(MessageProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageSmallIconUrl("imageSmallIconUrl")
     * .imageUrl("imageUrl")
     * .jsonBody("jsonBody")
     * .mediaUrl("mediaUrl")
     * .rawContent("rawContent")
     * .silentPush(false)
     * .timeToLive(123)
     * .title("title")
     * .url("url")
     * .build())
     * .inAppMessage(CampaignInAppMessageProperty.builder()
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(InAppMessageBodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(InAppMessageHeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(InAppMessageButtonProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .build())
     * .smsMessage(CampaignSmsMessageProperty.builder()
     * .body("body")
     * .entityId("entityId")
     * .messageType("messageType")
     * .originationNumber("originationNumber")
     * .senderId("senderId")
     * .templateId("templateId")
     * .build())
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .endTime("endTime")
     * .eventFilter(CampaignEventFilterProperty.builder()
     * .dimensions(EventDimensionsProperty.builder()
     * .attributes(attributes)
     * .eventType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .metrics(metrics)
     * .build())
     * .filterType("filterType")
     * .build())
     * .frequency("frequency")
     * .isLocalTime(false)
     * .quietTime(QuietTimeProperty.builder()
     * .end("end")
     * .start("start")
     * .build())
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build())
     * .sizePercent(123)
     * .templateConfiguration(TemplateConfigurationProperty.builder()
     * .emailTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .pushTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .smsTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .voiceTemplate(TemplateProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .build())
     * .treatmentDescription("treatmentDescription")
     * .treatmentName("treatmentName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-writetreatmentresource.html)
     */
    public inline fun cfnCampaignWriteTreatmentResourceProperty(
        block: CfnCampaignWriteTreatmentResourcePropertyDsl.() -> Unit = {}
    ): CfnCampaign.WriteTreatmentResourceProperty {
        val builder = CfnCampaignWriteTreatmentResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the email channel to send email to users. Before you can use Amazon Pinpoint to
     * send email, you must enable the email channel for an Amazon Pinpoint application.
     *
     * The EmailChannel resource represents the status, identity, and other settings of the email
     * channel for an application
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnEmailChannel cfnEmailChannel = CfnEmailChannel.Builder.create(this, "MyCfnEmailChannel")
     * .applicationId("applicationId")
     * .fromAddress("fromAddress")
     * .identity("identity")
     * // the properties below are optional
     * .configurationSet("configurationSet")
     * .enabled(false)
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html)
     */
    public inline fun cfnEmailChannel(
        scope: Construct,
        id: String,
        block: CfnEmailChannelDsl.() -> Unit = {},
    ): CfnEmailChannel {
        val builder = CfnEmailChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEmailChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnEmailChannelProps cfnEmailChannelProps = CfnEmailChannelProps.builder()
     * .applicationId("applicationId")
     * .fromAddress("fromAddress")
     * .identity("identity")
     * // the properties below are optional
     * .configurationSet("configurationSet")
     * .enabled(false)
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html)
     */
    public inline fun cfnEmailChannelProps(
        block: CfnEmailChannelPropsDsl.() -> Unit = {}
    ): CfnEmailChannelProps {
        val builder = CfnEmailChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a message template that you can use in messages that are sent through the email
     * channel.
     *
     * A *message template* is a set of content and settings that you can define, save, and reuse in
     * messages for any of your Amazon Pinpoint applications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnEmailTemplate cfnEmailTemplate = CfnEmailTemplate.Builder.create(this, "MyCfnEmailTemplate")
     * .subject("subject")
     * .templateName("templateName")
     * // the properties below are optional
     * .defaultSubstitutions("defaultSubstitutions")
     * .htmlPart("htmlPart")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .textPart("textPart")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html)
     */
    public inline fun cfnEmailTemplate(
        scope: Construct,
        id: String,
        block: CfnEmailTemplateDsl.() -> Unit = {},
    ): CfnEmailTemplate {
        val builder = CfnEmailTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEmailTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnEmailTemplateProps cfnEmailTemplateProps = CfnEmailTemplateProps.builder()
     * .subject("subject")
     * .templateName("templateName")
     * // the properties below are optional
     * .defaultSubstitutions("defaultSubstitutions")
     * .htmlPart("htmlPart")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .textPart("textPart")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html)
     */
    public inline fun cfnEmailTemplateProps(
        block: CfnEmailTemplatePropsDsl.() -> Unit = {}
    ): CfnEmailTemplateProps {
        val builder = CfnEmailTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new event stream for an application or updates the settings of an existing event
     * stream for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnEventStream cfnEventStream = CfnEventStream.Builder.create(this, "MyCfnEventStream")
     * .applicationId("applicationId")
     * .destinationStreamArn("destinationStreamArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html)
     */
    public inline fun cfnEventStream(
        scope: Construct,
        id: String,
        block: CfnEventStreamDsl.() -> Unit = {},
    ): CfnEventStream {
        val builder = CfnEventStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventStream`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnEventStreamProps cfnEventStreamProps = CfnEventStreamProps.builder()
     * .applicationId("applicationId")
     * .destinationStreamArn("destinationStreamArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html)
     */
    public inline fun cfnEventStreamProps(
        block: CfnEventStreamPropsDsl.() -> Unit = {}
    ): CfnEventStreamProps {
        val builder = CfnEventStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * You can use the GCM channel to send push notification messages to the Firebase Cloud
     * Messaging (FCM) service, which replaced the Google Cloud Messaging (GCM) service. Before you
     * use Amazon Pinpoint to send notifications to FCM, you have to enable the GCM channel for an
     * Amazon Pinpoint application.
     *
     * The GCMChannel resource represents the status and authentication settings of the GCM channel
     * for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnGCMChannel cfnGCMChannel = CfnGCMChannel.Builder.create(this, "MyCfnGCMChannel")
     * .apiKey("apiKey")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
     */
    public inline fun cfnGCMChannel(
        scope: Construct,
        id: String,
        block: CfnGCMChannelDsl.() -> Unit = {},
    ): CfnGCMChannel {
        val builder = CfnGCMChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGCMChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnGCMChannelProps cfnGCMChannelProps = CfnGCMChannelProps.builder()
     * .apiKey("apiKey")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
     */
    public inline fun cfnGCMChannelProps(
        block: CfnGCMChannelPropsDsl.() -> Unit = {}
    ): CfnGCMChannelProps {
        val builder = CfnGCMChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a message template that you can use to send in-app messages.
     *
     * A message template is a set of content and settings that you can define, save, and reuse in
     * messages for any of your Amazon Pinpoint applications. The In-App channel is unavailable in
     * AWS GovCloud (US).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object customConfig;
     * Object tags;
     * CfnInAppTemplate cfnInAppTemplate = CfnInAppTemplate.Builder.create(this, "MyCfnInAppTemplate")
     * .templateName("templateName")
     * // the properties below are optional
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(BodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(HeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html)
     */
    public inline fun cfnInAppTemplate(
        scope: Construct,
        id: String,
        block: CfnInAppTemplateDsl.() -> Unit = {},
    ): CfnInAppTemplate {
        val builder = CfnInAppTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of the main body text of the in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * BodyConfigProperty bodyConfigProperty = BodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html)
     */
    public inline fun cfnInAppTemplateBodyConfigProperty(
        block: CfnInAppTemplateBodyConfigPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.BodyConfigProperty {
        val builder = CfnInAppTemplateBodyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the behavior of buttons that appear in an in-app message template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * ButtonConfigProperty buttonConfigProperty = ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html)
     */
    public inline fun cfnInAppTemplateButtonConfigProperty(
        block: CfnInAppTemplateButtonConfigPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.ButtonConfigProperty {
        val builder = CfnInAppTemplateButtonConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default behavior of a button that appears in an in-app message.
     *
     * You can optionally add button configurations that specifically apply to iOS, Android, or web
     * browser users.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * DefaultButtonConfigurationProperty defaultButtonConfigurationProperty =
     * DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html)
     */
    public inline fun cfnInAppTemplateDefaultButtonConfigurationProperty(
        block: CfnInAppTemplateDefaultButtonConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.DefaultButtonConfigurationProperty {
        val builder = CfnInAppTemplateDefaultButtonConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration and content of the header or title text of the in-app message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * HeaderConfigProperty headerConfigProperty = HeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html)
     */
    public inline fun cfnInAppTemplateHeaderConfigProperty(
        block: CfnInAppTemplateHeaderConfigPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.HeaderConfigProperty {
        val builder = CfnInAppTemplateHeaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of an in-app message, including its header, body, buttons,
     * colors, and images.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(BodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(HeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html)
     */
    public inline fun cfnInAppTemplateInAppMessageContentProperty(
        block: CfnInAppTemplateInAppMessageContentPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.InAppMessageContentProperty {
        val builder = CfnInAppTemplateInAppMessageContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of a button with settings that are specific to a certain device
     * type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * OverrideButtonConfigurationProperty overrideButtonConfigurationProperty =
     * OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html)
     */
    public inline fun cfnInAppTemplateOverrideButtonConfigurationProperty(
        block: CfnInAppTemplateOverrideButtonConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInAppTemplate.OverrideButtonConfigurationProperty {
        val builder = CfnInAppTemplateOverrideButtonConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInAppTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object customConfig;
     * Object tags;
     * CfnInAppTemplateProps cfnInAppTemplateProps = CfnInAppTemplateProps.builder()
     * .templateName("templateName")
     * // the properties below are optional
     * .content(List.of(InAppMessageContentProperty.builder()
     * .backgroundColor("backgroundColor")
     * .bodyConfig(BodyConfigProperty.builder()
     * .alignment("alignment")
     * .body("body")
     * .textColor("textColor")
     * .build())
     * .headerConfig(HeaderConfigProperty.builder()
     * .alignment("alignment")
     * .header("header")
     * .textColor("textColor")
     * .build())
     * .imageUrl("imageUrl")
     * .primaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .secondaryBtn(ButtonConfigProperty.builder()
     * .android(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .defaultConfig(DefaultButtonConfigurationProperty.builder()
     * .backgroundColor("backgroundColor")
     * .borderRadius(123)
     * .buttonAction("buttonAction")
     * .link("link")
     * .text("text")
     * .textColor("textColor")
     * .build())
     * .ios(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .web(OverrideButtonConfigurationProperty.builder()
     * .buttonAction("buttonAction")
     * .link("link")
     * .build())
     * .build())
     * .build()))
     * .customConfig(customConfig)
     * .layout("layout")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html)
     */
    public inline fun cfnInAppTemplateProps(
        block: CfnInAppTemplatePropsDsl.() -> Unit = {}
    ): CfnInAppTemplateProps {
        val builder = CfnInAppTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a message template that you can use in messages that are sent through a push
     * notification channel.
     *
     * A *message template* is a set of content and settings that you can define, save, and reuse in
     * messages for any of your Amazon Pinpoint applications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnPushTemplate cfnPushTemplate = CfnPushTemplate.Builder.create(this, "MyCfnPushTemplate")
     * .templateName("templateName")
     * // the properties below are optional
     * .adm(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .apns(APNSPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .mediaUrl("mediaUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .baidu(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .default(DefaultPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .defaultSubstitutions("defaultSubstitutions")
     * .gcm(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html)
     */
    public inline fun cfnPushTemplate(
        scope: Construct,
        id: String,
        block: CfnPushTemplateDsl.() -> Unit = {},
    ): CfnPushTemplate {
        val builder = CfnPushTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies channel-specific content and settings for a message template that can be used in
     * push notifications that are sent through the APNs (Apple Push Notification service) channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * APNSPushNotificationTemplateProperty aPNSPushNotificationTemplateProperty =
     * APNSPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .mediaUrl("mediaUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html)
     */
    public inline fun cfnPushTemplateAPNSPushNotificationTemplateProperty(
        block: CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl.() -> Unit = {}
    ): CfnPushTemplate.APNSPushNotificationTemplateProperty {
        val builder = CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies channel-specific content and settings for a message template that can be used in
     * push notifications that are sent through the ADM (Amazon Device Messaging), Baidu (Baidu
     * Cloud Push), or GCM (Firebase Cloud Messaging, formerly Google Cloud Messaging) channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * AndroidPushNotificationTemplateProperty androidPushNotificationTemplateProperty =
     * AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html)
     */
    public inline fun cfnPushTemplateAndroidPushNotificationTemplateProperty(
        block: CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl.() -> Unit = {}
    ): CfnPushTemplate.AndroidPushNotificationTemplateProperty {
        val builder = CfnPushTemplateAndroidPushNotificationTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default settings and content for a message template that can be used in
     * messages that are sent through a push notification channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * DefaultPushNotificationTemplateProperty defaultPushNotificationTemplateProperty =
     * DefaultPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html)
     */
    public inline fun cfnPushTemplateDefaultPushNotificationTemplateProperty(
        block: CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl.() -> Unit = {}
    ): CfnPushTemplate.DefaultPushNotificationTemplateProperty {
        val builder = CfnPushTemplateDefaultPushNotificationTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPushTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnPushTemplateProps cfnPushTemplateProps = CfnPushTemplateProps.builder()
     * .templateName("templateName")
     * // the properties below are optional
     * .adm(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .apns(APNSPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .mediaUrl("mediaUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .baidu(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .default(DefaultPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .defaultSubstitutions("defaultSubstitutions")
     * .gcm(AndroidPushNotificationTemplateProperty.builder()
     * .action("action")
     * .body("body")
     * .imageIconUrl("imageIconUrl")
     * .imageUrl("imageUrl")
     * .smallImageIconUrl("smallImageIconUrl")
     * .sound("sound")
     * .title("title")
     * .url("url")
     * .build())
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html)
     */
    public inline fun cfnPushTemplateProps(
        block: CfnPushTemplatePropsDsl.() -> Unit = {}
    ): CfnPushTemplateProps {
        val builder = CfnPushTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * To send an SMS text message, you send the message through the SMS channel. Before you can use
     * Amazon Pinpoint to send text messages, you have to enable the SMS channel for an Amazon
     * Pinpoint application.
     *
     * The SMSChannel resource represents the status, sender ID, and other settings for the SMS
     * channel for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnSMSChannel cfnSMSChannel = CfnSMSChannel.Builder.create(this, "MyCfnSMSChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .senderId("senderId")
     * .shortCode("shortCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html)
     */
    public inline fun cfnSMSChannel(
        scope: Construct,
        id: String,
        block: CfnSMSChannelDsl.() -> Unit = {},
    ): CfnSMSChannel {
        val builder = CfnSMSChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSMSChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnSMSChannelProps cfnSMSChannelProps = CfnSMSChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .senderId("senderId")
     * .shortCode("shortCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html)
     */
    public inline fun cfnSMSChannelProps(
        block: CfnSMSChannelPropsDsl.() -> Unit = {}
    ): CfnSMSChannelProps {
        val builder = CfnSMSChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Updates the configuration, dimension, and other settings for an existing segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * Object tags;
     * Object userAttributes;
     * CfnSegment cfnSegment = CfnSegment.Builder.create(this, "MyCfnSegment")
     * .applicationId("applicationId")
     * .name("name")
     * // the properties below are optional
     * .dimensions(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build())
     * .segmentGroups(SegmentGroupsProperty.builder()
     * .groups(List.of(GroupsProperty.builder()
     * .dimensions(List.of(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build()))
     * .sourceSegments(List.of(SourceSegmentsProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .version(123)
     * .build()))
     * .sourceType("sourceType")
     * .type("type")
     * .build()))
     * .include("include")
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html)
     */
    public inline fun cfnSegment(
        scope: Construct,
        id: String,
        block: CfnSegmentDsl.() -> Unit = {},
    ): CfnSegment {
        val builder = CfnSegmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies attribute-based criteria for including or excluding endpoints from a segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
     * .attributeType("attributeType")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html)
     */
    public inline fun cfnSegmentAttributeDimensionProperty(
        block: CfnSegmentAttributeDimensionPropertyDsl.() -> Unit = {}
    ): CfnSegment.AttributeDimensionProperty {
        val builder = CfnSegmentAttributeDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies behavior-based criteria for the segment, such as how recently users have used your
     * app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * BehaviorProperty behaviorProperty = BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-behavior.html)
     */
    public inline fun cfnSegmentBehaviorProperty(
        block: CfnSegmentBehaviorPropertyDsl.() -> Unit = {}
    ): CfnSegment.BehaviorProperty {
        val builder = CfnSegmentBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the GPS coordinates of a location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html)
     */
    public inline fun cfnSegmentCoordinatesProperty(
        block: CfnSegmentCoordinatesPropertyDsl.() -> Unit = {}
    ): CfnSegment.CoordinatesProperty {
        val builder = CfnSegmentCoordinatesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies demographic-based criteria, such as device platform, for the segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * DemographicProperty demographicProperty = DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html)
     */
    public inline fun cfnSegmentDemographicProperty(
        block: CfnSegmentDemographicPropertyDsl.() -> Unit = {}
    ): CfnSegment.DemographicProperty {
        val builder = CfnSegmentDemographicPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the GPS coordinates of the endpoint location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * GPSPointProperty gPSPointProperty = GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-gpspoint.html)
     */
    public inline fun cfnSegmentGPSPointProperty(
        block: CfnSegmentGPSPointPropertyDsl.() -> Unit = {}
    ): CfnSegment.GPSPointProperty {
        val builder = CfnSegmentGPSPointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An array that defines the set of segment criteria to evaluate when handling segment groups
     * for the segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * Object userAttributes;
     * GroupsProperty groupsProperty = GroupsProperty.builder()
     * .dimensions(List.of(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build()))
     * .sourceSegments(List.of(SourceSegmentsProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .version(123)
     * .build()))
     * .sourceType("sourceType")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html)
     */
    public inline fun cfnSegmentGroupsProperty(
        block: CfnSegmentGroupsPropertyDsl.() -> Unit = {}
    ): CfnSegment.GroupsProperty {
        val builder = CfnSegmentGroupsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies location-based criteria, such as region or GPS coordinates, for the segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * LocationProperty locationProperty = LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html)
     */
    public inline fun cfnSegmentLocationProperty(
        block: CfnSegmentLocationPropertyDsl.() -> Unit = {}
    ): CfnSegment.LocationProperty {
        val builder = CfnSegmentLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSegment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * Object tags;
     * Object userAttributes;
     * CfnSegmentProps cfnSegmentProps = CfnSegmentProps.builder()
     * .applicationId("applicationId")
     * .name("name")
     * // the properties below are optional
     * .dimensions(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build())
     * .segmentGroups(SegmentGroupsProperty.builder()
     * .groups(List.of(GroupsProperty.builder()
     * .dimensions(List.of(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build()))
     * .sourceSegments(List.of(SourceSegmentsProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .version(123)
     * .build()))
     * .sourceType("sourceType")
     * .type("type")
     * .build()))
     * .include("include")
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html)
     */
    public inline fun cfnSegmentProps(block: CfnSegmentPropsDsl.() -> Unit = {}): CfnSegmentProps {
        val builder = CfnSegmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how recently segment members were active.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * RecencyProperty recencyProperty = RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-recency.html)
     */
    public inline fun cfnSegmentRecencyProperty(
        block: CfnSegmentRecencyPropertyDsl.() -> Unit = {}
    ): CfnSegment.RecencyProperty {
        val builder = CfnSegmentRecencyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the dimension settings for a segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * Object userAttributes;
     * SegmentDimensionsProperty segmentDimensionsProperty = SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html)
     */
    public inline fun cfnSegmentSegmentDimensionsProperty(
        block: CfnSegmentSegmentDimensionsPropertyDsl.() -> Unit = {}
    ): CfnSegment.SegmentDimensionsProperty {
        val builder = CfnSegmentSegmentDimensionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the set of segment criteria to evaluate when handling segment groups for the
     * segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object attributes;
     * Object metrics;
     * Object userAttributes;
     * SegmentGroupsProperty segmentGroupsProperty = SegmentGroupsProperty.builder()
     * .groups(List.of(GroupsProperty.builder()
     * .dimensions(List.of(SegmentDimensionsProperty.builder()
     * .attributes(attributes)
     * .behavior(BehaviorProperty.builder()
     * .recency(RecencyProperty.builder()
     * .duration("duration")
     * .recencyType("recencyType")
     * .build())
     * .build())
     * .demographic(DemographicProperty.builder()
     * .appVersion(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .channel(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .deviceType(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .make(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .model(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .platform(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .build())
     * .location(LocationProperty.builder()
     * .country(SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build())
     * .gpsPoint(GPSPointProperty.builder()
     * .coordinates(CoordinatesProperty.builder()
     * .latitude(123)
     * .longitude(123)
     * .build())
     * .rangeInKilometers(123)
     * .build())
     * .build())
     * .metrics(metrics)
     * .userAttributes(userAttributes)
     * .build()))
     * .sourceSegments(List.of(SourceSegmentsProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .version(123)
     * .build()))
     * .sourceType("sourceType")
     * .type("type")
     * .build()))
     * .include("include")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html)
     */
    public inline fun cfnSegmentSegmentGroupsProperty(
        block: CfnSegmentSegmentGroupsPropertyDsl.() -> Unit = {}
    ): CfnSegment.SegmentGroupsProperty {
        val builder = CfnSegmentSegmentGroupsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the dimension type and values for a segment dimension.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * SetDimensionProperty setDimensionProperty = SetDimensionProperty.builder()
     * .dimensionType("dimensionType")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-setdimension.html)
     */
    public inline fun cfnSegmentSetDimensionProperty(
        block: CfnSegmentSetDimensionPropertyDsl.() -> Unit = {}
    ): CfnSegment.SetDimensionProperty {
        val builder = CfnSegmentSetDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the base segment to build the segment on.
     *
     * A base segment, also called a *source segment* , defines the initial population of endpoints
     * for a segment. When you add dimensions to the segment, Amazon Pinpoint filters the base
     * segment by using the dimensions that you specify.
     *
     * You can specify more than one dimensional segment or only one imported segment. If you
     * specify an imported segment, the segment size estimate that displays on the Amazon Pinpoint
     * console indicates the size of the imported segment without any filters applied to it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * SourceSegmentsProperty sourceSegmentsProperty = SourceSegmentsProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .version(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html)
     */
    public inline fun cfnSegmentSourceSegmentsProperty(
        block: CfnSegmentSourceSegmentsPropertyDsl.() -> Unit = {}
    ): CfnSegment.SourceSegmentsProperty {
        val builder = CfnSegmentSourceSegmentsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a message template that you can use in messages that are sent through the SMS
     * channel.
     *
     * A *message template* is a set of content and settings that you can define, save, and reuse in
     * messages for any of your Amazon Pinpoint applications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnSmsTemplate cfnSmsTemplate = CfnSmsTemplate.Builder.create(this, "MyCfnSmsTemplate")
     * .body("body")
     * .templateName("templateName")
     * // the properties below are optional
     * .defaultSubstitutions("defaultSubstitutions")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html)
     */
    public inline fun cfnSmsTemplate(
        scope: Construct,
        id: String,
        block: CfnSmsTemplateDsl.() -> Unit = {},
    ): CfnSmsTemplate {
        val builder = CfnSmsTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSmsTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * Object tags;
     * CfnSmsTemplateProps cfnSmsTemplateProps = CfnSmsTemplateProps.builder()
     * .body("body")
     * .templateName("templateName")
     * // the properties below are optional
     * .defaultSubstitutions("defaultSubstitutions")
     * .tags(tags)
     * .templateDescription("templateDescription")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html)
     */
    public inline fun cfnSmsTemplateProps(
        block: CfnSmsTemplatePropsDsl.() -> Unit = {}
    ): CfnSmsTemplateProps {
        val builder = CfnSmsTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *channel* is a type of platform that you can deliver messages to.
     *
     * To send a voice message, you send the message through the voice channel. Before you can use
     * Amazon Pinpoint to send voice messages, you have to enable the voice channel for an Amazon
     * Pinpoint application.
     *
     * The VoiceChannel resource represents the status and other information about the voice channel
     * for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnVoiceChannel cfnVoiceChannel = CfnVoiceChannel.Builder.create(this, "MyCfnVoiceChannel")
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html)
     */
    public inline fun cfnVoiceChannel(
        scope: Construct,
        id: String,
        block: CfnVoiceChannelDsl.() -> Unit = {},
    ): CfnVoiceChannel {
        val builder = CfnVoiceChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVoiceChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpoint.*;
     * CfnVoiceChannelProps cfnVoiceChannelProps = CfnVoiceChannelProps.builder()
     * .applicationId("applicationId")
     * // the properties below are optional
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html)
     */
    public inline fun cfnVoiceChannelProps(
        block: CfnVoiceChannelPropsDsl.() -> Unit = {}
    ): CfnVoiceChannelProps {
        val builder = CfnVoiceChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
