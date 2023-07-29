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

package cloudshift.awscdk.dsl.services.pinpointemail

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.constructs.Construct

public object pinpointemail {
    /**
     * Create a configuration set.
     *
     * *Configuration sets* are groups of rules that you can apply to the emails you send using
     * Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
     * configuration set in the headers of the email. When you apply a configuration set to an
     * email, all of the rules in that configuration set are applied to the email.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnConfigurationSet cfnConfigurationSet = CfnConfigurationSet.Builder.create(this,
     * "MyCfnConfigurationSet")
     * .name("name")
     * // the properties below are optional
     * .deliveryOptions(DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .build())
     * .reputationOptions(ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build())
     * .sendingOptions(SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build())
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trackingOptions(TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html)
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
     * Used to associate a configuration set with a dedicated IP pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html)
     */
    public inline fun cfnConfigurationSetDeliveryOptionsProperty(
        block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.DeliveryOptionsProperty {
        val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create an event destination.
     *
     * In Amazon Pinpoint, *events* include message sends, deliveries, opens, clicks, bounces, and
     * complaints. *Event destinations* are places that you can send information about these events
     * to. For example, you can send event data to Amazon SNS to receive notifications when you
     * receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to
     * Amazon S3 for long-term storage.
     *
     * A single configuration set can include more than one event destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnConfigurationSetEventDestination cfnConfigurationSetEventDestination =
     * CfnConfigurationSetEventDestination.Builder.create(this, "MyCfnConfigurationSetEventDestination")
     * .configurationSetName("configurationSetName")
     * .eventDestinationName("eventDestinationName")
     * // the properties below are optional
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
     * .pinpointDestination(PinpointDestinationProperty.builder()
     * .applicationArn("applicationArn")
     * .build())
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html)
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
     * An object that defines an Amazon CloudWatch destination for email events.
     *
     * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationCloudWatchDestinationProperty(
        block: CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An array of objects that define the dimensions to use when you send email events to Amazon
     * CloudWatch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * DimensionConfigurationProperty dimensionConfigurationProperty =
     * DimensionConfigurationProperty.builder()
     * .defaultDimensionValue("defaultDimensionValue")
     * .dimensionName("dimensionName")
     * .dimensionValueSource("dimensionValueSource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html)
     */
    public inline fun cfnConfigurationSetEventDestinationDimensionConfigurationProperty(
        block: CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.DimensionConfigurationProperty {
        val builder = CfnConfigurationSetEventDestinationDimensionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In Amazon Pinpoint, *events* include message sends, deliveries, opens, clicks, bounces, and
     * complaints.
     *
     * *Event destinations* are places that you can send information about these events to. For
     * example, you can send event data to Amazon SNS to receive notifications when you receive
     * bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon
     * S3 for long-term storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
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
     * .pinpointDestination(PinpointDestinationProperty.builder()
     * .applicationArn("applicationArn")
     * .build())
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationEventDestinationProperty(
        block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.EventDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines an Amazon Kinesis Data Firehose destination for email events.
     *
     * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3
     * and Amazon Redshift.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * KinesisFirehoseDestinationProperty kinesisFirehoseDestinationProperty =
     * KinesisFirehoseDestinationProperty.builder()
     * .deliveryStreamArn("deliveryStreamArn")
     * .iamRoleArn("iamRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html)
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
     * An object that defines a Amazon Pinpoint destination for email events.
     *
     * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can
     * use these attributes to create segments for your campaigns.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * PinpointDestinationProperty pinpointDestinationProperty = PinpointDestinationProperty.builder()
     * .applicationArn("applicationArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationPinpointDestinationProperty(
        block: CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.PinpointDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl()
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
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnConfigurationSetEventDestinationProps cfnConfigurationSetEventDestinationProps =
     * CfnConfigurationSetEventDestinationProps.builder()
     * .configurationSetName("configurationSetName")
     * .eventDestinationName("eventDestinationName")
     * // the properties below are optional
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
     * .pinpointDestination(PinpointDestinationProperty.builder()
     * .applicationArn("applicationArn")
     * .build())
     * .snsDestination(SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationProps(
        block: CfnConfigurationSetEventDestinationPropsDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestinationProps {
        val builder = CfnConfigurationSetEventDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines an Amazon SNS destination for email events.
     *
     * You can use Amazon SNS to send notification when certain email events occur.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * SnsDestinationProperty snsDestinationProperty = SnsDestinationProperty.builder()
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html)
     */
    public inline fun cfnConfigurationSetEventDestinationSnsDestinationProperty(
        block: CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSetEventDestination.SnsDestinationProperty {
        val builder = CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl()
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
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnConfigurationSetProps cfnConfigurationSetProps = CfnConfigurationSetProps.builder()
     * .name("name")
     * // the properties below are optional
     * .deliveryOptions(DeliveryOptionsProperty.builder()
     * .sendingPoolName("sendingPoolName")
     * .build())
     * .reputationOptions(ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build())
     * .sendingOptions(SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build())
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trackingOptions(TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationset.html)
     */
    public inline fun cfnConfigurationSetProps(
        block: CfnConfigurationSetPropsDsl.() -> Unit = {}
    ): CfnConfigurationSetProps {
        val builder = CfnConfigurationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enable or disable collection of reputation metrics for emails that you send using this
     * configuration set in the current AWS Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * ReputationOptionsProperty reputationOptionsProperty = ReputationOptionsProperty.builder()
     * .reputationMetricsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html)
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
     * import software.amazon.awscdk.services.pinpointemail.*;
     * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
     * .sendingEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html)
     */
    public inline fun cfnConfigurationSetSendingOptionsProperty(
        block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.SendingOptionsProperty {
        val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * configuration set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-tags.html)
     */
    public inline fun cfnConfigurationSetTagsProperty(
        block: CfnConfigurationSetTagsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.TagsProperty {
        val builder = CfnConfigurationSetTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines the tracking options for a configuration set.
     *
     * When you use Amazon Pinpoint to send an email, it contains an invisible image that's used to
     * track when recipients open your email. If your email contains links, those links are changed
     * slightly in order to track when recipients click them.
     *
     * These images and links include references to a domain operated by AWS . You can optionally
     * configure Amazon Pinpoint to use a domain that you operate for these images and links.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * TrackingOptionsProperty trackingOptionsProperty = TrackingOptionsProperty.builder()
     * .customRedirectDomain("customRedirectDomain")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html)
     */
    public inline fun cfnConfigurationSetTrackingOptionsProperty(
        block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationSet.TrackingOptionsProperty {
        val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A request to create a new dedicated IP pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnDedicatedIpPool cfnDedicatedIpPool = CfnDedicatedIpPool.Builder.create(this,
     * "MyCfnDedicatedIpPool")
     * .poolName("poolName")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html)
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
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnDedicatedIpPoolProps cfnDedicatedIpPoolProps = CfnDedicatedIpPoolProps.builder()
     * .poolName("poolName")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html)
     */
    public inline fun cfnDedicatedIpPoolProps(
        block: CfnDedicatedIpPoolPropsDsl.() -> Unit = {}
    ): CfnDedicatedIpPoolProps {
        val builder = CfnDedicatedIpPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-dedicatedippool-tags.html)
     */
    public inline fun cfnDedicatedIpPoolTagsProperty(
        block: CfnDedicatedIpPoolTagsPropertyDsl.() -> Unit = {}
    ): CfnDedicatedIpPool.TagsProperty {
        val builder = CfnDedicatedIpPoolTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an identity to use for sending email through Amazon Pinpoint.
     *
     * In Amazon Pinpoint, an *identity* is an email address or domain that you use when you send
     * email. Before you can use Amazon Pinpoint to send an email from an identity, you first have
     * to verify it. By verifying an identity, you demonstrate that you're the owner of the address
     * or domain, and that you've given Amazon Pinpoint permission to send email from that identity.
     *
     * When you verify an email address, Amazon Pinpoint sends an email to the address. Your email
     * address is verified as soon as you follow the link in the verification email.
     *
     * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert
     * into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your
     * domain is verified when Amazon Pinpoint detects these records in the DNS configuration for
     * your domain. It usually takes around 72 hours to complete the domain verification process.
     *
     * When you use CloudFormation to specify an identity, CloudFormation might indicate that the
     * identity was created successfully. However, you have to verify the identity before you can
     * use it to send email.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnIdentity cfnIdentity = CfnIdentity.Builder.create(this, "MyCfnIdentity")
     * .name("name")
     * // the properties below are optional
     * .dkimSigningEnabled(false)
     * .feedbackForwardingEnabled(false)
     * .mailFromAttributes(MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build())
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html)
     */
    public inline fun cfnIdentity(
        scope: Construct,
        id: String,
        block: CfnIdentityDsl.() -> Unit = {},
    ): CfnIdentity {
        val builder = CfnIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of attributes that are associated with a MAIL FROM domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html)
     */
    public inline fun cfnIdentityMailFromAttributesProperty(
        block: CfnIdentityMailFromAttributesPropertyDsl.() -> Unit = {}
    ): CfnIdentity.MailFromAttributesProperty {
        val builder = CfnIdentityMailFromAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentity`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * CfnIdentityProps cfnIdentityProps = CfnIdentityProps.builder()
     * .name("name")
     * // the properties below are optional
     * .dkimSigningEnabled(false)
     * .feedbackForwardingEnabled(false)
     * .mailFromAttributes(MailFromAttributesProperty.builder()
     * .behaviorOnMxFailure("behaviorOnMxFailure")
     * .mailFromDomain("mailFromDomain")
     * .build())
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html)
     */
    public inline fun cfnIdentityProps(
        block: CfnIdentityPropsDsl.() -> Unit = {}
    ): CfnIdentityProps {
        val builder = CfnIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * identity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.pinpointemail.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-tags.html)
     */
    public inline fun cfnIdentityTagsProperty(
        block: CfnIdentityTagsPropertyDsl.() -> Unit = {}
    ): CfnIdentity.TagsProperty {
        val builder = CfnIdentityTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
