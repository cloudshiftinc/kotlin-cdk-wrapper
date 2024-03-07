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

package io.cloudshiftdev.awscdkdsl.services.ses

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.AddHeaderActionConfig
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
import software.amazon.awscdk.services.ses.BounceActionConfig
import software.amazon.awscdk.services.ses.ByoDkimOptions
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import software.amazon.awscdk.services.ses.CfnContactList
import software.amazon.awscdk.services.ses.CfnContactListProps
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnEmailIdentityProps
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps
import software.amazon.awscdk.services.ses.CloudWatchDimension
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import software.amazon.awscdk.services.ses.DkimIdentityConfig
import software.amazon.awscdk.services.ses.DkimRecord
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.amazon.awscdk.services.ses.LambdaActionConfig
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleActionConfig
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.amazon.awscdk.services.ses.S3ActionConfig
import software.amazon.awscdk.services.ses.SNSActionConfig
import software.amazon.awscdk.services.ses.StopActionConfig
import software.amazon.awscdk.services.ses.VdmAttributes
import software.amazon.awscdk.services.ses.VdmAttributesProps
import software.amazon.awscdk.services.ses.WorkmailActionConfig
import software.constructs.Construct

public object ses {
    /**
     * AddHeaderAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * AddHeaderActionConfig addHeaderActionConfig = AddHeaderActionConfig.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build();
     * ```
     */
    public inline fun addHeaderActionConfig(
        block: AddHeaderActionConfigDsl.() -> Unit = {}
    ): AddHeaderActionConfig {
        val builder = AddHeaderActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An allow list receipt filter.
     *
     * Example:
     * ```
     * AllowListReceiptFilter.Builder.create(this, "AllowList")
     * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
     * .build();
     * ```
     */
    public inline fun allowListReceiptFilter(
        scope: Construct,
        id: String,
        block: AllowListReceiptFilterDsl.() -> Unit = {},
    ): AllowListReceiptFilter {
        val builder = AllowListReceiptFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for am AllowListReceiptFilter.
     *
     * Example:
     * ```
     * AllowListReceiptFilter.Builder.create(this, "AllowList")
     * .ips(List.of("10.0.0.0/16", "1.2.3.4/16"))
     * .build();
     * ```
     */
    public inline fun allowListReceiptFilterProps(
        block: AllowListReceiptFilterPropsDsl.() -> Unit = {}
    ): AllowListReceiptFilterProps {
        val builder = AllowListReceiptFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * BoundAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * BounceActionConfig bounceActionConfig = BounceActionConfig.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun bounceActionConfig(
        block: BounceActionConfigDsl.() -> Unit = {}
    ): BounceActionConfig {
        val builder = BounceActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for BYO DKIM.
     *
     * Example:
     * ```
     * IPublicHostedZone myHostedZone;
     * EmailIdentity.Builder.create(this, "Identity")
     * .identity(Identity.publicHostedZone(myHostedZone))
     * .dkimIdentity(DkimIdentity.byoDkim(ByoDkimOptions.builder()
     * .privateKey(SecretValue.secretsManager("dkim-private-key"))
     * .publicKey("...base64-encoded-public-key...")
     * .selector("selector")
     * .build()))
     * .build();
     * ```
     */
    public inline fun byoDkimOptions(block: ByoDkimOptionsDsl.() -> Unit = {}): ByoDkimOptions {
        val builder = ByoDkimOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration sets let you create groups of rules that you can apply to the emails you send
     * using Amazon SES.
     *
     * For more information about using configuration sets, see
     * [Using Amazon SES Configuration Sets](https://docs.aws.amazon.com/ses/latest/dg/using-configuration-sets.html)
     * in the [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/) .
     *
     * *Required permissions:*
     *
     * To apply any of the resource options, you will need to have the corresponding AWS Identity
     * and Access Management (IAM) SES API v2 permissions:
     * * `ses:GetConfigurationSet`
     * * (This permission is replacing the v1 *ses:DescribeConfigurationSet* permission which will
     *   not work with these v2 resource options.)
     * * `ses:PutConfigurationSetDeliveryOptions`
     * * `ses:PutConfigurationSetReputationOptions`
     * * `ses:PutConfigurationSetSendingOptions`
     * * `ses:PutConfigurationSetSuppressionOptions`
     * * `ses:PutConfigurationSetTrackingOptions`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnConfigurationSet cfnConfigurationSet = CfnConfigurationSet.Builder.create(this,
     * "MyCfnConfigurationSet")
     * .deliveryOptions(DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .tlsPolicy("tlsPolicy")
     * .build())
     * .name("name")
     * .reputationOptions(ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build())
     * .sendingOptions(SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build())
     * .suppressionOptions(SuppressionOptionsProperty.builder()
     * .suppressedReasons(List.of("suppressedReasons"))
     * .build())
     * .trackingOptions(TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build())
     * .vdmOptions(VdmOptionsProperty.builder()
     * .dashboardOptions(DashboardOptionsProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build())
     * .guardianOptions(GuardianOptionsProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html)
     */
    public inline fun cfnConfigurationSet(
        scope: Construct,
        id: String,
        block: CfnConfigurationSetDsl.() -> Unit = {},
    ): CfnConfigurationSet {
        val builder = CfnConfigurationSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for your VDM configuration as applicable to the Dashboard.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DashboardOptionsProperty dashboardOptionsProperty = DashboardOptionsProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-dashboardoptions.html)
     */
    public inline fun cfnConfigurationSetDashboardOptionsProperty(
        block: CfnConfigurationSetDashboardOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.DashboardOptionsProperty {
        val builder = CfnConfigurationSetDashboardOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .tlsPolicy("tlsPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html)
     */
    public inline fun cfnConfigurationSetDeliveryOptionsProperty(
        block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.DeliveryOptionsProperty {
        val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a configuration set event destination.
     *
     * An event destination is an AWS service that Amazon SES publishes email sending events to.
     * When you specify an event destination, you provide one, and only one, destination. You can
     * send event data to Amazon CloudWatch, Amazon Kinesis Data Firehose, or Amazon Simple
     * Notification Service (Amazon SNS).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnConfigurationSetEventDestination cfnConfigurationSetEventDestination =
     * CfnConfigurationSetEventDestination.Builder.create(this, "MyCfnConfigurationSetEventDestination")
     * .configurationSetName("configurationSetName")
     * .eventDestination(EventDestinationProperty.builder()
     * .matchingEventTypes(List.of("matchingEventTypes"))
     * // the properties below are optional
     * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
     * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build()))
     * .build())
     * .enabled(false)
     * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
     * .deliveryStreamArn("deliveryStreamArn")
     * .iamRoleArn("iamRoleArn")
     * .build())
     * .name("name")
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestination(
        scope: Construct,
        id: String,
        block: CfnConfigurationSetEventDestinationDsl.() -> Unit = {},
    ): CfnConfigurationSetEventDestination {
        val builder = CfnConfigurationSetEventDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information associated with an Amazon CloudWatch event destination to which email
     * sending events are published.
     *
     * Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which
     * enable you to publish email sending events. For information about using configuration sets,
     * see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CloudWatchDestinationProperty cloudWatchDestinationProperty =
     * CloudWatchDestinationProperty.builder()
     * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationCloudWatchDestinationProperty(
        block: CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the dimension configuration to use when you publish email sending events to Amazon
     * CloudWatch.
     *
     * For information about publishing email sending events to Amazon CloudWatch, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DimensionConfigurationProperty dimensionConfigurationProperty =
     * DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html)
     */
    public inline fun cfnConfigurationSetEventDestinationDimensionConfigurationProperty(
        block: CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.DimensionConfigurationProperty {
        val builder = CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an event destination.
     *
     * When you create or update an event destination, you must provide one, and only one,
     * destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon
     * Simple Notification Service (Amazon SNS).
     *
     * Event destinations are associated with configuration sets, which enable you to publish email
     * sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification
     * Service (Amazon SNS). For information about using configuration sets, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * EventDestinationProperty eventDestinationProperty = EventDestinationProperty.builder()
     * .matchingEventTypes(List.of("matchingEventTypes"))
     * // the properties below are optional
     * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
     * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build()))
     * .build())
     * .enabled(false)
     * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
     * .deliveryStreamArn("deliveryStreamArn")
     * .iamRoleArn("iamRoleArn")
     * .build())
     * .name("name")
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationEventDestinationProperty(
        block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.EventDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis
     * Firehose event destination.
     *
     * Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets,
     * which enable you to publish email sending events. For information about using configuration
     * sets, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * KinesisFirehoseDestinationProperty kinesisFirehoseDestinationProperty =
     * KinesisFirehoseDestinationProperty.builder()
     * .deliveryStreamArn("deliveryStreamArn")
     * .iamRoleArn("iamRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationKinesisFirehoseDestinationProperty(
        block: CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl.() -> Unit =
            {}
    ): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationSetEventDestination`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnConfigurationSetEventDestinationProps cfnConfigurationSetEventDestinationProps =
     * CfnConfigurationSetEventDestinationProps.builder()
     * .configurationSetName("configurationSetName")
     * .eventDestination(EventDestinationProperty.builder()
     * .matchingEventTypes(List.of("matchingEventTypes"))
     * // the properties below are optional
     * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
     * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build()))
     * .build())
     * .enabled(false)
     * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
     * .deliveryStreamArn("deliveryStreamArn")
     * .iamRoleArn("iamRoleArn")
     * .build())
     * .name("name")
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationProps(
        block: CfnConfigurationSetEventDestinationPropsDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestinationProps {
        val builder = CfnConfigurationSetEventDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS)
     * event destination.
     *
     * Event destinations, such as Amazon SNS, are associated with configuration sets, which enable
     * you to publish email sending events. For information about using configuration sets, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * SnsDestinationProperty snsDestinationProperty = SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-snsdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationSnsDestinationProperty(
        block: CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.SnsDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for your VDM configuration as applicable to the Guardian.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * GuardianOptionsProperty guardianOptionsProperty = GuardianOptionsProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-guardianoptions.html)
     */
    public inline fun cfnConfigurationSetGuardianOptionsProperty(
        block: CfnConfigurationSetGuardianOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.GuardianOptionsProperty {
        val builder = CfnConfigurationSetGuardianOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnConfigurationSetProps cfnConfigurationSetProps = CfnConfigurationSetProps.builder()
     * .deliveryOptions(DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .tlsPolicy("tlsPolicy")
     * .build())
     * .name("name")
     * .reputationOptions(ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build())
     * .sendingOptions(SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build())
     * .suppressionOptions(SuppressionOptionsProperty.builder()
     * .suppressedReasons(List.of("suppressedReasons"))
     * .build())
     * .trackingOptions(TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build())
     * .vdmOptions(VdmOptionsProperty.builder()
     * .dashboardOptions(DashboardOptionsProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build())
     * .guardianOptions(GuardianOptionsProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html)
     */
    public inline fun cfnConfigurationSetProps(
        block: CfnConfigurationSetPropsDsl.() -> Unit = {}
    ): CfnConfigurationSetProps {
        val builder = CfnConfigurationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the reputation settings for a configuration set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ReputationOptionsProperty reputationOptionsProperty = ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-reputationoptions.html)
     */
    public inline fun cfnConfigurationSetReputationOptionsProperty(
        block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.ReputationOptionsProperty {
        val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to enable or disable email sending for messages that use this configuration set in the
     * current AWS Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-sendingoptions.html)
     */
    public inline fun cfnConfigurationSetSendingOptionsProperty(
        block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.SendingOptionsProperty {
        val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains information about the suppression list preferences for your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * SuppressionOptionsProperty suppressionOptionsProperty = SuppressionOptionsProperty.builder()
     * .suppressedReasons(List.of("suppressedReasons"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-suppressionoptions.html)
     */
    public inline fun cfnConfigurationSetSuppressionOptionsProperty(
        block: CfnConfigurationSetSuppressionOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.SuppressionOptionsProperty {
        val builder = CfnConfigurationSetSuppressionOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A domain that is used to redirect email recipients to an Amazon SES-operated domain.
     *
     * This domain captures open and click events generated by Amazon SES emails.
     *
     * For more information, see
     * [Configuring Custom Domains to Handle Open and Click Tracking](https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html)
     * in the *Amazon SES Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * TrackingOptionsProperty trackingOptionsProperty = TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-trackingoptions.html)
     */
    public inline fun cfnConfigurationSetTrackingOptionsProperty(
        block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.TrackingOptionsProperty {
        val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to a configuration set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * VdmOptionsProperty vdmOptionsProperty = VdmOptionsProperty.builder()
     * .dashboardOptions(DashboardOptionsProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build())
     * .guardianOptions(GuardianOptionsProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html)
     */
    public inline fun cfnConfigurationSetVdmOptionsProperty(
        block: CfnConfigurationSetVdmOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.VdmOptionsProperty {
        val builder = CfnConfigurationSetVdmOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list that contains contacts that have subscribed to a particular topic or topics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnContactList cfnContactList = CfnContactList.Builder.create(this, "MyCfnContactList")
     * .contactListName("contactListName")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .topics(List.of(TopicProperty.builder()
     * .defaultSubscriptionStatus("defaultSubscriptionStatus")
     * .displayName("displayName")
     * .topicName("topicName")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html)
     */
    public inline fun cfnContactList(
        scope: Construct,
        id: String,
        block: CfnContactListDsl.() -> Unit = {},
    ): CfnContactList {
        val builder = CfnContactListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnContactList`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnContactListProps cfnContactListProps = CfnContactListProps.builder()
     * .contactListName("contactListName")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .topics(List.of(TopicProperty.builder()
     * .defaultSubscriptionStatus("defaultSubscriptionStatus")
     * .displayName("displayName")
     * .topicName("topicName")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html)
     */
    public inline fun cfnContactListProps(
        block: CfnContactListPropsDsl.() -> Unit = {}
    ): CfnContactListProps {
        val builder = CfnContactListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An interest group, theme, or label within a list.
     *
     * Lists can have multiple topics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * TopicProperty topicProperty = TopicProperty.builder()
     * .defaultSubscriptionStatus("defaultSubscriptionStatus")
     * .displayName("displayName")
     * .topicName("topicName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-contactlist-topic.html)
     */
    public inline fun cfnContactListTopicProperty(
        block: CfnContactListTopicPropertyDsl.() -> Unit = {}
    ): CfnContactList.TopicProperty {
        val builder = CfnContactListTopicPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new pool of dedicated IP addresses.
     *
     * A pool can include one or more dedicated IP addresses that are associated with your AWS
     * account . You can associate a pool with a configuration set. When you send an email that uses
     * that configuration set, the message is sent from one of the addresses in the associated pool.
     *
     * You can't delete dedicated IP pools that have a `STANDARD` scaling mode with one or more
     * dedicated IP addresses. This constraint doesn't apply to dedicated IP pools that have a
     * `MANAGED` scaling mode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnDedicatedIpPool cfnDedicatedIpPool = CfnDedicatedIpPool.Builder.create(this,
     * "MyCfnDedicatedIpPool")
     * .poolName("poolName")
     * .scalingMode("scalingMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html)
     */
    public inline fun cfnDedicatedIpPool(
        scope: Construct,
        id: String,
        block: CfnDedicatedIpPoolDsl.() -> Unit = {},
    ): CfnDedicatedIpPool {
        val builder = CfnDedicatedIpPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDedicatedIpPool`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnDedicatedIpPoolProps cfnDedicatedIpPoolProps = CfnDedicatedIpPoolProps.builder()
     * .poolName("poolName")
     * .scalingMode("scalingMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html)
     */
    public inline fun cfnDedicatedIpPoolProps(
        block: CfnDedicatedIpPoolPropsDsl.() -> Unit = {}
    ): CfnDedicatedIpPoolProps {
        val builder = CfnDedicatedIpPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an identity for using within SES.
     *
     * An identity is an email address or domain that you use when you send email. Before you can
     * use an identity to send email, you first have to verify it. By verifying an identity, you
     * demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2
     * permission to send email from the identity.
     *
     * When you verify an email address, SES sends an email to the address. Your email address is
     * verified as soon as you follow the link in the verification email. When you verify a domain
     * without specifying the DkimSigningAttributes properties, OR only the NextSigningKeyLength
     * property of DkimSigningAttributes, this resource provides a set of CNAME token names and
     * values (DkimDNSTokenName1, DkimDNSTokenValue1, DkimDNSTokenName2, DkimDNSTokenValue2,
     * DkimDNSTokenName3, DkimDNSTokenValue3) as outputs. You can then add these to the DNS
     * configuration for your domain. Your domain is verified when Amazon SES detects these records
     * in the DNS configuration for your domain. This verification method is known as Easy DKIM.
     *
     * Alternatively, you can perform the verification process by providing your own public-private
     * key pair. This verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM,
     * your resource must include DkimSigningAttributes properties DomainSigningSelector and
     * DomainSigningPrivateKey. When you specify this object, you provide a selector
     * (DomainSigningSelector) (a component of the DNS record name that identifies the public key to
     * use for DKIM authentication) and a private key (DomainSigningPrivateKey).
     *
     * Additionally, you can associate an existing configuration set with the email identity that
     * you're verifying.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnEmailIdentity cfnEmailIdentity = CfnEmailIdentity.Builder.create(this, "MyCfnEmailIdentity")
     * .emailIdentity("emailIdentity")
     * // the properties below are optional
     * .configurationSetAttributes(ConfigurationSetAttributesProperty.builder()
     * .configurationSetName("configurationSetName")
     * .build())
     * .dkimAttributes(DkimAttributesProperty.builder()
     * .signingEnabled(false)
     * .build())
     * .dkimSigningAttributes(DkimSigningAttributesProperty.builder()
     * .domainSigningPrivateKey("domainSigningPrivateKey")
     * .domainSigningSelector("domainSigningSelector")
     * .nextSigningKeyLength("nextSigningKeyLength")
     * .build())
     * .feedbackAttributes(FeedbackAttributesProperty.builder()
     * .emailForwardingEnabled(false)
     * .build())
     * .mailFromAttributes(MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html)
     */
    public inline fun cfnEmailIdentity(
        scope: Construct,
        id: String,
        block: CfnEmailIdentityDsl.() -> Unit = {},
    ): CfnEmailIdentity {
        val builder = CfnEmailIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to associate a configuration set with an email identity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ConfigurationSetAttributesProperty configurationSetAttributesProperty =
     * ConfigurationSetAttributesProperty.builder()
     * .configurationSetName("configurationSetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-configurationsetattributes.html)
     */
    public inline fun cfnEmailIdentityConfigurationSetAttributesProperty(
        block: CfnEmailIdentityConfigurationSetAttributesPropertyDsl.() -> Unit = {}
    ): CfnEmailIdentity.ConfigurationSetAttributesProperty {
        val builder = CfnEmailIdentityConfigurationSetAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to enable or disable DKIM authentication for an email identity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DkimAttributesProperty dkimAttributesProperty = DkimAttributesProperty.builder()
     * .signingEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimattributes.html)
     */
    public inline fun cfnEmailIdentityDkimAttributesProperty(
        block: CfnEmailIdentityDkimAttributesPropertyDsl.() -> Unit = {}
    ): CfnEmailIdentity.DkimAttributesProperty {
        val builder = CfnEmailIdentityDkimAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to configure or change the DKIM authentication settings for an email domain identity.
     *
     * You can use this operation to do any of the following:
     * * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
     * * Update the key length that should be used for Easy DKIM.
     * * Change from using no DKIM authentication to using Easy DKIM.
     * * Change from using no DKIM authentication to using BYODKIM.
     * * Change from using Easy DKIM to using BYODKIM.
     * * Change from using BYODKIM to using Easy DKIM.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DkimSigningAttributesProperty dkimSigningAttributesProperty =
     * DkimSigningAttributesProperty.builder()
     * .domainSigningPrivateKey("domainSigningPrivateKey")
     * .domainSigningSelector("domainSigningSelector")
     * .nextSigningKeyLength("nextSigningKeyLength")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-dkimsigningattributes.html)
     */
    public inline fun cfnEmailIdentityDkimSigningAttributesProperty(
        block: CfnEmailIdentityDkimSigningAttributesPropertyDsl.() -> Unit = {}
    ): CfnEmailIdentity.DkimSigningAttributesProperty {
        val builder = CfnEmailIdentityDkimSigningAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to enable or disable feedback forwarding for an identity.
     *
     * This setting determines what happens when an identity is used to send an email that results
     * in a bounce or complaint event.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * FeedbackAttributesProperty feedbackAttributesProperty = FeedbackAttributesProperty.builder()
     * .emailForwardingEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-feedbackattributes.html)
     */
    public inline fun cfnEmailIdentityFeedbackAttributesProperty(
        block: CfnEmailIdentityFeedbackAttributesPropertyDsl.() -> Unit = {}
    ): CfnEmailIdentity.FeedbackAttributesProperty {
        val builder = CfnEmailIdentityFeedbackAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html)
     */
    public inline fun cfnEmailIdentityMailFromAttributesProperty(
        block: CfnEmailIdentityMailFromAttributesPropertyDsl.() -> Unit = {}
    ): CfnEmailIdentity.MailFromAttributesProperty {
        val builder = CfnEmailIdentityMailFromAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEmailIdentity`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnEmailIdentityProps cfnEmailIdentityProps = CfnEmailIdentityProps.builder()
     * .emailIdentity("emailIdentity")
     * // the properties below are optional
     * .configurationSetAttributes(ConfigurationSetAttributesProperty.builder()
     * .configurationSetName("configurationSetName")
     * .build())
     * .dkimAttributes(DkimAttributesProperty.builder()
     * .signingEnabled(false)
     * .build())
     * .dkimSigningAttributes(DkimSigningAttributesProperty.builder()
     * .domainSigningPrivateKey("domainSigningPrivateKey")
     * .domainSigningSelector("domainSigningSelector")
     * .nextSigningKeyLength("nextSigningKeyLength")
     * .build())
     * .feedbackAttributes(FeedbackAttributesProperty.builder()
     * .emailForwardingEnabled(false)
     * .build())
     * .mailFromAttributes(MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html)
     */
    public inline fun cfnEmailIdentityProps(
        block: CfnEmailIdentityPropsDsl.() -> Unit = {}
    ): CfnEmailIdentityProps {
        val builder = CfnEmailIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify a new IP address filter.
     *
     * You use IP address filters when you receive email with Amazon SES.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptFilter cfnReceiptFilter = CfnReceiptFilter.Builder.create(this, "MyCfnReceiptFilter")
     * .filter(FilterProperty.builder()
     * .ipFilter(IpFilterProperty.builder()
     * .cidr("cidr")
     * .policy("policy")
     * .build())
     * // the properties below are optional
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
     */
    public inline fun cfnReceiptFilter(
        scope: Construct,
        id: String,
        block: CfnReceiptFilterDsl.() -> Unit = {},
    ): CfnReceiptFilter {
        val builder = CfnReceiptFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IP address filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .ipFilter(IpFilterProperty.builder()
     * .cidr("cidr")
     * .policy("policy")
     * .build())
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html)
     */
    public inline fun cfnReceiptFilterFilterProperty(
        block: CfnReceiptFilterFilterPropertyDsl.() -> Unit = {}
    ): CfnReceiptFilter.FilterProperty {
        val builder = CfnReceiptFilterFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A receipt IP address filter enables you to specify whether to accept or reject mail
     * originating from an IP address or range of IP addresses.
     *
     * For information about setting up IP address filters, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * IpFilterProperty ipFilterProperty = IpFilterProperty.builder()
     * .cidr("cidr")
     * .policy("policy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html)
     */
    public inline fun cfnReceiptFilterIpFilterProperty(
        block: CfnReceiptFilterIpFilterPropertyDsl.() -> Unit = {}
    ): CfnReceiptFilter.IpFilterProperty {
        val builder = CfnReceiptFilterIpFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReceiptFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptFilterProps cfnReceiptFilterProps = CfnReceiptFilterProps.builder()
     * .filter(FilterProperty.builder()
     * .ipFilter(IpFilterProperty.builder()
     * .cidr("cidr")
     * .policy("policy")
     * .build())
     * // the properties below are optional
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
     */
    public inline fun cfnReceiptFilterProps(
        block: CfnReceiptFilterPropsDsl.() -> Unit = {}
    ): CfnReceiptFilterProps {
        val builder = CfnReceiptFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a receipt rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptRule cfnReceiptRule = CfnReceiptRule.Builder.create(this, "MyCfnReceiptRule")
     * .rule(RuleProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .addHeaderAction(AddHeaderActionProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build())
     * .bounceAction(BounceActionProperty.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build())
     * .lambdaAction(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build())
     * .s3Action(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build())
     * .snsAction(SNSActionProperty.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build())
     * .stopAction(StopActionProperty.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .workmailAction(WorkmailActionProperty.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .build()))
     * .enabled(false)
     * .name("name")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy("tlsPolicy")
     * .build())
     * .ruleSetName("ruleSetName")
     * // the properties below are optional
     * .after("after")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html)
     */
    public inline fun cfnReceiptRule(
        scope: Construct,
        id: String,
        block: CfnReceiptRuleDsl.() -> Unit = {},
    ): CfnReceiptRule {
        val builder = CfnReceiptRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An action that Amazon SES can take when it receives an email on behalf of one or more email
     * addresses or domains that you own.
     *
     * An instance of this data type can represent only one action.
     *
     * For information about setting up receipt rules, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .addHeaderAction(AddHeaderActionProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build())
     * .bounceAction(BounceActionProperty.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build())
     * .lambdaAction(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build())
     * .s3Action(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build())
     * .snsAction(SNSActionProperty.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build())
     * .stopAction(StopActionProperty.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .workmailAction(WorkmailActionProperty.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html)
     */
    public inline fun cfnReceiptRuleActionProperty(
        block: CfnReceiptRuleActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.ActionProperty {
        val builder = CfnReceiptRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action adds a header to the received email.
     *
     * For information about adding a header using a receipt rule, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-add-header.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * AddHeaderActionProperty addHeaderActionProperty = AddHeaderActionProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html)
     */
    public inline fun cfnReceiptRuleAddHeaderActionProperty(
        block: CfnReceiptRuleAddHeaderActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.AddHeaderActionProperty {
        val builder = CfnReceiptRuleAddHeaderActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action rejects the received email by returning a bounce
     * response to the sender and, optionally, publishes a notification to Amazon Simple
     * Notification Service (Amazon SNS).
     *
     * For information about sending a bounce message in response to a received email, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-bounce.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * BounceActionProperty bounceActionProperty = BounceActionProperty.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html)
     */
    public inline fun cfnReceiptRuleBounceActionProperty(
        block: CfnReceiptRuleBounceActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.BounceActionProperty {
        val builder = CfnReceiptRuleBounceActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action calls an AWS Lambda function and, optionally,
     * publishes a notification to Amazon Simple Notification Service (Amazon SNS).
     *
     * To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of
     * another account, Amazon SES must have permission to access those resources. For information
     * about giving permissions, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html)
     * .
     *
     * For information about using AWS Lambda actions in receipt rules, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-lambda.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * LambdaActionProperty lambdaActionProperty = LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html)
     */
    public inline fun cfnReceiptRuleLambdaActionProperty(
        block: CfnReceiptRuleLambdaActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.LambdaActionProperty {
        val builder = CfnReceiptRuleLambdaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReceiptRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptRuleProps cfnReceiptRuleProps = CfnReceiptRuleProps.builder()
     * .rule(RuleProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .addHeaderAction(AddHeaderActionProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build())
     * .bounceAction(BounceActionProperty.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build())
     * .lambdaAction(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build())
     * .s3Action(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build())
     * .snsAction(SNSActionProperty.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build())
     * .stopAction(StopActionProperty.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .workmailAction(WorkmailActionProperty.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .build()))
     * .enabled(false)
     * .name("name")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy("tlsPolicy")
     * .build())
     * .ruleSetName("ruleSetName")
     * // the properties below are optional
     * .after("after")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html)
     */
    public inline fun cfnReceiptRuleProps(
        block: CfnReceiptRulePropsDsl.() -> Unit = {}
    ): CfnReceiptRuleProps {
        val builder = CfnReceiptRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Receipt rules enable you to specify which actions Amazon SES should take when it receives
     * mail on behalf of one or more email addresses or domains that you own.
     *
     * Each receipt rule defines a set of email addresses or domains that it applies to. If the
     * email addresses or domains match at least one recipient address of the message, Amazon SES
     * executes all of the receipt rule's actions on the message.
     *
     * For information about setting up receipt rules, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
     * .actions(List.of(ActionProperty.builder()
     * .addHeaderAction(AddHeaderActionProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build())
     * .bounceAction(BounceActionProperty.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build())
     * .lambdaAction(LambdaActionProperty.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build())
     * .s3Action(S3ActionProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build())
     * .snsAction(SNSActionProperty.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build())
     * .stopAction(StopActionProperty.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .workmailAction(WorkmailActionProperty.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .build()))
     * .enabled(false)
     * .name("name")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy("tlsPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html)
     */
    public inline fun cfnReceiptRuleRuleProperty(
        block: CfnReceiptRuleRulePropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.RuleProperty {
        val builder = CfnReceiptRuleRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action saves the received message to an Amazon Simple
     * Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple
     * Notification Service (Amazon SNS).
     *
     * To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt
     * your emails, or publish to an Amazon SNS topic of another account, Amazon SES must have
     * permission to access those resources. For information about granting permissions, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html)
     * .
     *
     * When you save your emails to an Amazon S3 bucket, the maximum email size (including headers)
     * is 40 MB. Emails larger than that bounces.
     *
     * For information about specifying Amazon S3 actions in receipt rules, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-s3.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html)
     */
    public inline fun cfnReceiptRuleS3ActionProperty(
        block: CfnReceiptRuleS3ActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.S3ActionProperty {
        val builder = CfnReceiptRuleS3ActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action publishes a notification to Amazon Simple
     * Notification Service (Amazon SNS).
     *
     * This action includes a complete copy of the email content in the Amazon SNS notifications.
     * Amazon SNS notifications for all other actions simply provide information about the email.
     * They do not include the email content itself.
     *
     * If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission
     * to publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a
     * policy to the topic to give Amazon SES permissions to access it. For information about giving
     * permissions, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html)
     * .
     *
     * You can only publish emails that are 150 KB or less (including the header) to Amazon SNS.
     * Larger emails bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.
     *
     * For information about using a receipt rule to publish an Amazon SNS notification, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-sns.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * SNSActionProperty sNSActionProperty = SNSActionProperty.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html)
     */
    public inline fun cfnReceiptRuleSNSActionProperty(
        block: CfnReceiptRuleSNSActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.SNSActionProperty {
        val builder = CfnReceiptRuleSNSActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an empty receipt rule set.
     *
     * For information about setting up receipt rule sets, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules)
     * .
     *
     * You can execute this operation no more than once per second.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptRuleSet cfnReceiptRuleSet = CfnReceiptRuleSet.Builder.create(this,
     * "MyCfnReceiptRuleSet")
     * .ruleSetName("ruleSetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
     */
    public inline fun cfnReceiptRuleSet(
        scope: Construct,
        id: String,
        block: CfnReceiptRuleSetDsl.() -> Unit = {},
    ): CfnReceiptRuleSet {
        val builder = CfnReceiptRuleSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReceiptRuleSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnReceiptRuleSetProps cfnReceiptRuleSetProps = CfnReceiptRuleSetProps.builder()
     * .ruleSetName("ruleSetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
     */
    public inline fun cfnReceiptRuleSetProps(
        block: CfnReceiptRuleSetPropsDsl.() -> Unit = {}
    ): CfnReceiptRuleSetProps {
        val builder = CfnReceiptRuleSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action terminates the evaluation of the receipt rule
     * set and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon
     * SNS).
     *
     * For information about setting a stop action in a receipt rule, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-stop.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * StopActionProperty stopActionProperty = StopActionProperty.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html)
     */
    public inline fun cfnReceiptRuleStopActionProperty(
        block: CfnReceiptRuleStopActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.StopActionProperty {
        val builder = CfnReceiptRuleStopActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes
     * a notification to Amazon Simple Notification Service (Amazon SNS).
     *
     * It usually isn't necessary to set this up manually, because Amazon WorkMail adds the rule
     * automatically during its setup procedure.
     *
     * For information using a receipt rule to call Amazon WorkMail, see the
     * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-workmail.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * WorkmailActionProperty workmailActionProperty = WorkmailActionProperty.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html)
     */
    public inline fun cfnReceiptRuleWorkmailActionProperty(
        block: CfnReceiptRuleWorkmailActionPropertyDsl.() -> Unit = {}
    ): CfnReceiptRule.WorkmailActionProperty {
        val builder = CfnReceiptRuleWorkmailActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an email template.
     *
     * Email templates enable you to send personalized email to one or more destinations in a single
     * API operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnTemplate cfnTemplate = CfnTemplate.Builder.create(this, "MyCfnTemplate")
     * .template(TemplateProperty.builder()
     * .subjectPart("subjectPart")
     * // the properties below are optional
     * .htmlPart("htmlPart")
     * .templateName("templateName")
     * .textPart("textPart")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
     */
    public inline fun cfnTemplate(
        scope: Construct,
        id: String,
        block: CfnTemplateDsl.() -> Unit = {},
    ): CfnTemplate {
        val builder = CfnTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnTemplateProps cfnTemplateProps = CfnTemplateProps.builder()
     * .template(TemplateProperty.builder()
     * .subjectPart("subjectPart")
     * // the properties below are optional
     * .htmlPart("htmlPart")
     * .templateName("templateName")
     * .textPart("textPart")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
     */
    public inline fun cfnTemplateProps(
        block: CfnTemplatePropsDsl.() -> Unit = {}
    ): CfnTemplateProps {
        val builder = CfnTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * TemplateProperty templateProperty = TemplateProperty.builder()
     * .subjectPart("subjectPart")
     * // the properties below are optional
     * .htmlPart("htmlPart")
     * .templateName("templateName")
     * .textPart("textPart")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html)
     */
    public inline fun cfnTemplateTemplateProperty(
        block: CfnTemplateTemplatePropertyDsl.() -> Unit = {}
    ): CfnTemplate.TemplateProperty {
        val builder = CfnTemplateTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Virtual Deliverability Manager (VDM) attributes that apply to your Amazon SES account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnVdmAttributes cfnVdmAttributes = CfnVdmAttributes.Builder.create(this, "MyCfnVdmAttributes")
     * .dashboardAttributes(DashboardAttributesProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build())
     * .guardianAttributes(GuardianAttributesProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html)
     */
    public inline fun cfnVdmAttributes(
        scope: Construct,
        id: String,
        block: CfnVdmAttributesDsl.() -> Unit = {},
    ): CfnVdmAttributes {
        val builder = CfnVdmAttributesDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for your VDM configuration as applicable to the Dashboard.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DashboardAttributesProperty dashboardAttributesProperty = DashboardAttributesProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-dashboardattributes.html)
     */
    public inline fun cfnVdmAttributesDashboardAttributesProperty(
        block: CfnVdmAttributesDashboardAttributesPropertyDsl.() -> Unit = {}
    ): CfnVdmAttributes.DashboardAttributesProperty {
        val builder = CfnVdmAttributesDashboardAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for your VDM configuration as applicable to the Guardian.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * GuardianAttributesProperty guardianAttributesProperty = GuardianAttributesProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-guardianattributes.html)
     */
    public inline fun cfnVdmAttributesGuardianAttributesProperty(
        block: CfnVdmAttributesGuardianAttributesPropertyDsl.() -> Unit = {}
    ): CfnVdmAttributes.GuardianAttributesProperty {
        val builder = CfnVdmAttributesGuardianAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVdmAttributes`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CfnVdmAttributesProps cfnVdmAttributesProps = CfnVdmAttributesProps.builder()
     * .dashboardAttributes(DashboardAttributesProperty.builder()
     * .engagementMetrics("engagementMetrics")
     * .build())
     * .guardianAttributes(GuardianAttributesProperty.builder()
     * .optimizedSharedDelivery("optimizedSharedDelivery")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html)
     */
    public inline fun cfnVdmAttributesProps(
        block: CfnVdmAttributesPropsDsl.() -> Unit = {}
    ): CfnVdmAttributesProps {
        val builder = CfnVdmAttributesPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudWatch dimension upon which to categorize your emails.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * CloudWatchDimension cloudWatchDimension = CloudWatchDimension.builder()
     * .defaultValue("defaultValue")
     * .name("name")
     * .source(CloudWatchDimensionSource.EMAIL_HEADER)
     * .build();
     * ```
     */
    public inline fun cloudWatchDimension(
        block: CloudWatchDimensionDsl.() -> Unit = {}
    ): CloudWatchDimension {
        val builder = CloudWatchDimensionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration set.
     *
     * Example:
     * ```
     * IDedicatedIpPool myPool;
     * ConfigurationSet.Builder.create(this, "ConfigurationSet")
     * .customTrackingRedirectDomain("track.cdk.dev")
     * .suppressionReasons(SuppressionReasons.COMPLAINTS_ONLY)
     * .tlsPolicy(ConfigurationSetTlsPolicy.REQUIRE)
     * .dedicatedIpPool(myPool)
     * .build();
     * ```
     */
    public inline fun configurationSet(
        scope: Construct,
        id: String,
        block: ConfigurationSetDsl.() -> Unit = {},
    ): ConfigurationSet {
        val builder = ConfigurationSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration set event destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ConfigurationSet configurationSet;
     * EventDestination eventDestination;
     * ConfigurationSetEventDestination configurationSetEventDestination =
     * ConfigurationSetEventDestination.Builder.create(this, "MyConfigurationSetEventDestination")
     * .configurationSet(configurationSet)
     * .destination(eventDestination)
     * // the properties below are optional
     * .configurationSetEventDestinationName("configurationSetEventDestinationName")
     * .enabled(false)
     * .events(List.of(EmailSendingEvent.SEND))
     * .build();
     * ```
     */
    public inline fun configurationSetEventDestination(
        scope: Construct,
        id: String,
        block: ConfigurationSetEventDestinationDsl.() -> Unit = {},
    ): ConfigurationSetEventDestination {
        val builder = ConfigurationSetEventDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a configuration set event destination.
     *
     * Example:
     * ```
     * ConfigurationSet myConfigurationSet;
     * Topic myTopic;
     * myConfigurationSet.addEventDestination("ToSns",
     * ConfigurationSetEventDestinationOptions.builder()
     * .destination(EventDestination.snsTopic(myTopic))
     * .build());
     * ```
     */
    public inline fun configurationSetEventDestinationOptions(
        block: ConfigurationSetEventDestinationOptionsDsl.() -> Unit = {}
    ): ConfigurationSetEventDestinationOptions {
        val builder = ConfigurationSetEventDestinationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a configuration set event destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ConfigurationSet configurationSet;
     * EventDestination eventDestination;
     * ConfigurationSetEventDestinationProps configurationSetEventDestinationProps =
     * ConfigurationSetEventDestinationProps.builder()
     * .configurationSet(configurationSet)
     * .destination(eventDestination)
     * // the properties below are optional
     * .configurationSetEventDestinationName("configurationSetEventDestinationName")
     * .enabled(false)
     * .events(List.of(EmailSendingEvent.SEND))
     * .build();
     * ```
     */
    public inline fun configurationSetEventDestinationProps(
        block: ConfigurationSetEventDestinationPropsDsl.() -> Unit = {}
    ): ConfigurationSetEventDestinationProps {
        val builder = ConfigurationSetEventDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a configuration set.
     *
     * Example:
     * ```
     * IDedicatedIpPool myPool;
     * ConfigurationSet.Builder.create(this, "ConfigurationSet")
     * .customTrackingRedirectDomain("track.cdk.dev")
     * .suppressionReasons(SuppressionReasons.COMPLAINTS_ONLY)
     * .tlsPolicy(ConfigurationSetTlsPolicy.REQUIRE)
     * .dedicatedIpPool(myPool)
     * .build();
     * ```
     */
    public inline fun configurationSetProps(
        block: ConfigurationSetPropsDsl.() -> Unit = {}
    ): ConfigurationSetProps {
        val builder = ConfigurationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dedicated IP pool.
     *
     * Example:
     * ```
     * DedicatedIpPool.Builder.create(this, "Pool")
     * .dedicatedIpPoolName("mypool")
     * .scalingMode(ScalingMode.STANDARD)
     * .build();
     * ```
     */
    public inline fun dedicatedIpPool(
        scope: Construct,
        id: String,
        block: DedicatedIpPoolDsl.() -> Unit = {},
    ): DedicatedIpPool {
        val builder = DedicatedIpPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a dedicated IP pool.
     *
     * Example:
     * ```
     * DedicatedIpPool.Builder.create(this, "Pool")
     * .dedicatedIpPoolName("mypool")
     * .scalingMode(ScalingMode.STANDARD)
     * .build();
     * ```
     */
    public inline fun dedicatedIpPoolProps(
        block: DedicatedIpPoolPropsDsl.() -> Unit = {}
    ): DedicatedIpPoolProps {
        val builder = DedicatedIpPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for DKIM identity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DkimIdentityConfig dkimIdentityConfig = DkimIdentityConfig.builder()
     * .domainSigningPrivateKey("domainSigningPrivateKey")
     * .domainSigningSelector("domainSigningSelector")
     * .nextSigningKeyLength(EasyDkimSigningKeyLength.RSA_1024_BIT)
     * .build();
     * ```
     */
    public inline fun dkimIdentityConfig(
        block: DkimIdentityConfigDsl.() -> Unit = {}
    ): DkimIdentityConfig {
        val builder = DkimIdentityConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A DKIM record.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * DkimRecord dkimRecord = DkimRecord.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun dkimRecord(block: DkimRecordDsl.() -> Unit = {}): DkimRecord {
        val builder = DkimRecordDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule added at the top of the rule set to drop spam/virus.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ReceiptRule receiptRule;
     * IReceiptRuleAction receiptRuleAction;
     * ReceiptRuleSet receiptRuleSet;
     * DropSpamReceiptRule dropSpamReceiptRule = DropSpamReceiptRule.Builder.create(this,
     * "MyDropSpamReceiptRule")
     * .ruleSet(receiptRuleSet)
     * // the properties below are optional
     * .actions(List.of(receiptRuleAction))
     * .after(receiptRule)
     * .enabled(false)
     * .receiptRuleName("receiptRuleName")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy(TlsPolicy.OPTIONAL)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda-example-functions.html)
     */
    public inline fun dropSpamReceiptRule(
        scope: Construct,
        id: String,
        block: DropSpamReceiptRuleDsl.() -> Unit = {},
    ): DropSpamReceiptRule {
        val builder = DropSpamReceiptRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ReceiptRule receiptRule;
     * IReceiptRuleAction receiptRuleAction;
     * ReceiptRuleSet receiptRuleSet;
     * DropSpamReceiptRuleProps dropSpamReceiptRuleProps = DropSpamReceiptRuleProps.builder()
     * .ruleSet(receiptRuleSet)
     * // the properties below are optional
     * .actions(List.of(receiptRuleAction))
     * .after(receiptRule)
     * .enabled(false)
     * .receiptRuleName("receiptRuleName")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy(TlsPolicy.OPTIONAL)
     * .build();
     * ```
     */
    public inline fun dropSpamReceiptRuleProps(
        block: DropSpamReceiptRulePropsDsl.() -> Unit = {}
    ): DropSpamReceiptRuleProps {
        val builder = DropSpamReceiptRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An email identity.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * User user;
     * EmailIdentity identity = EmailIdentity.Builder.create(this, "Identity")
     * .identity(Identity.domain("cdk.dev"))
     * .build();
     * identity.grantSendEmail(user);
     * ```
     */
    public inline fun emailIdentity(
        scope: Construct,
        id: String,
        block: EmailIdentityDsl.() -> Unit = {},
    ): EmailIdentity {
        val builder = EmailIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an email identity.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * User user;
     * EmailIdentity identity = EmailIdentity.Builder.create(this, "Identity")
     * .identity(Identity.domain("cdk.dev"))
     * .build();
     * identity.grantSendEmail(user);
     * ```
     */
    public inline fun emailIdentityProps(
        block: EmailIdentityPropsDsl.() -> Unit = {}
    ): EmailIdentityProps {
        val builder = EmailIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * LambdaAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * LambdaActionConfig lambdaActionConfig = LambdaActionConfig.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun lambdaActionConfig(
        block: LambdaActionConfigDsl.() -> Unit = {}
    ): LambdaActionConfig {
        val builder = LambdaActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A receipt filter.
     *
     * When instantiated without props, it creates a block all receipt filter.
     *
     * Example:
     * ```
     * ReceiptFilter.Builder.create(this, "Filter")
     * .ip("1.2.3.4/16")
     * .build();
     * ```
     */
    public inline fun receiptFilter(
        scope: Construct,
        id: String,
        block: ReceiptFilterDsl.() -> Unit = {},
    ): ReceiptFilter {
        val builder = ReceiptFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ReceiptFilter.
     *
     * Example:
     * ```
     * ReceiptFilter.Builder.create(this, "Filter")
     * .ip("1.2.3.4/16")
     * .build();
     * ```
     */
    public inline fun receiptFilterProps(
        block: ReceiptFilterPropsDsl.() -> Unit = {}
    ): ReceiptFilterProps {
        val builder = ReceiptFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new receipt rule.
     *
     * Example:
     * ```
     * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
     * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .build());
     * ```
     */
    public inline fun receiptRule(
        scope: Construct,
        id: String,
        block: ReceiptRuleDsl.() -> Unit = {},
    ): ReceiptRule {
        val builder = ReceiptRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a receipt rule action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ReceiptRuleActionConfig receiptRuleActionConfig = ReceiptRuleActionConfig.builder()
     * .addHeaderAction(AddHeaderActionConfig.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build())
     * .bounceAction(BounceActionConfig.builder()
     * .message("message")
     * .sender("sender")
     * .smtpReplyCode("smtpReplyCode")
     * // the properties below are optional
     * .statusCode("statusCode")
     * .topicArn("topicArn")
     * .build())
     * .lambdaAction(LambdaActionConfig.builder()
     * .functionArn("functionArn")
     * // the properties below are optional
     * .invocationType("invocationType")
     * .topicArn("topicArn")
     * .build())
     * .s3Action(S3ActionConfig.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build())
     * .snsAction(SNSActionConfig.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build())
     * .stopAction(StopActionConfig.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .workmailAction(WorkmailActionConfig.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     */
    public inline fun receiptRuleActionConfig(
        block: ReceiptRuleActionConfigDsl.() -> Unit = {}
    ): ReceiptRuleActionConfig {
        val builder = ReceiptRuleActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a receipt rule to a receipt rule set.
     *
     * Example:
     * ```
     * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
     * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .build());
     * ```
     */
    public inline fun receiptRuleOptions(
        block: ReceiptRuleOptionsDsl.() -> Unit = {}
    ): ReceiptRuleOptions {
        val builder = ReceiptRuleOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ReceiptRule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * ReceiptRule receiptRule;
     * IReceiptRuleAction receiptRuleAction;
     * ReceiptRuleSet receiptRuleSet;
     * ReceiptRuleProps receiptRuleProps = ReceiptRuleProps.builder()
     * .ruleSet(receiptRuleSet)
     * // the properties below are optional
     * .actions(List.of(receiptRuleAction))
     * .after(receiptRule)
     * .enabled(false)
     * .receiptRuleName("receiptRuleName")
     * .recipients(List.of("recipients"))
     * .scanEnabled(false)
     * .tlsPolicy(TlsPolicy.OPTIONAL)
     * .build();
     * ```
     */
    public inline fun receiptRuleProps(
        block: ReceiptRulePropsDsl.() -> Unit = {}
    ): ReceiptRuleProps {
        val builder = ReceiptRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new receipt rule set.
     *
     * Example:
     * ```
     * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
     * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .build());
     * ```
     */
    public inline fun receiptRuleSet(
        scope: Construct,
        id: String,
        block: ReceiptRuleSetDsl.() -> Unit = {},
    ): ReceiptRuleSet {
        val builder = ReceiptRuleSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ReceiptRuleSet.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.ses.actions.*;
     * Bucket bucket = new Bucket(this, "Bucket");
     * Topic topic = new Topic(this, "Topic");
     * ReceiptRuleSet.Builder.create(this, "RuleSet")
     * .rules(List.of(ReceiptRuleOptions.builder()
     * .recipients(List.of("hello&#64;aws.com"))
     * .actions(List.of(
     * AddHeader.Builder.create()
     * .name("X-Special-Header")
     * .value("aws")
     * .build(),
     * S3.Builder.create()
     * .bucket(bucket)
     * .objectKeyPrefix("emails/")
     * .topic(topic)
     * .build()))
     * .build(), ReceiptRuleOptions.builder()
     * .recipients(List.of("aws.com"))
     * .actions(List.of(
     * Sns.Builder.create()
     * .topic(topic)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun receiptRuleSetProps(
        block: ReceiptRuleSetPropsDsl.() -> Unit = {}
    ): ReceiptRuleSetProps {
        val builder = ReceiptRuleSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3Action configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * S3ActionConfig s3ActionConfig = S3ActionConfig.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .kmsKeyArn("kmsKeyArn")
     * .objectKeyPrefix("objectKeyPrefix")
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun s3ActionConfig(block: S3ActionConfigDsl.() -> Unit = {}): S3ActionConfig {
        val builder = S3ActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * SNSAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * SNSActionConfig sNSActionConfig = SNSActionConfig.builder()
     * .encoding("encoding")
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun sNSActionConfig(block: SNSActionConfigDsl.() -> Unit = {}): SNSActionConfig {
        val builder = SNSActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * StopAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * StopActionConfig stopActionConfig = StopActionConfig.builder()
     * .scope("scope")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun stopActionConfig(
        block: StopActionConfigDsl.() -> Unit = {}
    ): StopActionConfig {
        val builder = StopActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Virtual Deliverablity Manager (VDM) attributes.
     *
     * Example:
     * ```
     * // Enables engagement tracking and optimized shared delivery by default
     * // Enables engagement tracking and optimized shared delivery by default
     * new VdmAttributes(this, "Vdm");
     * ```
     */
    public inline fun vdmAttributes(
        scope: Construct,
        id: String,
        block: VdmAttributesDsl.() -> Unit = {},
    ): VdmAttributes {
        val builder = VdmAttributesDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Virtual Deliverablity Manager (VDM) attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * VdmAttributesProps vdmAttributesProps = VdmAttributesProps.builder()
     * .engagementMetrics(false)
     * .optimizedSharedDelivery(false)
     * .build();
     * ```
     */
    public inline fun vdmAttributesProps(
        block: VdmAttributesPropsDsl.() -> Unit = {}
    ): VdmAttributesProps {
        val builder = VdmAttributesPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * WorkmailAction configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ses.*;
     * WorkmailActionConfig workmailActionConfig = WorkmailActionConfig.builder()
     * .organizationArn("organizationArn")
     * // the properties below are optional
     * .topicArn("topicArn")
     * .build();
     * ```
     */
    public inline fun workmailActionConfig(
        block: WorkmailActionConfigDsl.() -> Unit = {}
    ): WorkmailActionConfig {
        val builder = WorkmailActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public object DkimIdentity {
        public fun byoDkim(
            block: ByoDkimOptionsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.ses.DkimIdentity {
            val builder = ByoDkimOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.ses.DkimIdentity.byoDkim(builder.build())
        }
    }
}
