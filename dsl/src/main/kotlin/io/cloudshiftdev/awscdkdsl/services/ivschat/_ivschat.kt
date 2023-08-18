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

package io.cloudshiftdev.awscdkdsl.services.ivschat

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.amazon.awscdk.services.ivschat.CfnRoomProps
import software.constructs.Construct

public object ivschat {
    /**
     * The `AWS::IVSChat::LoggingConfiguration` resource specifies an logging configuration that
     * allows clients to store and record sent messages.
     *
     * For more information, see
     * [CreateLoggingConfiguration](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateLoggingConfiguration.html)
     * in the *Amazon Interactive Video Service Chat API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
     * "MyCfnLoggingConfiguration")
     * .destinationConfiguration(DestinationConfigurationProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
     * .logGroupName("logGroupName")
     * .build())
     * .firehose(FirehoseDestinationConfigurationProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .build())
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build())
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfiguration(
        scope: Construct,
        id: String,
        block: CfnLoggingConfigurationDsl.() -> Unit = {},
    ): CfnLoggingConfiguration {
        val builder = CfnLoggingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CloudWatchLogsDestinationConfiguration property type specifies a CloudWatch Logs location
     * where chat logs will be stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * CloudWatchLogsDestinationConfigurationProperty cloudWatchLogsDestinationConfigurationProperty =
     * CloudWatchLogsDestinationConfigurationProperty.builder()
     * .logGroupName("logGroupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationCloudWatchLogsDestinationConfigurationProperty(
        block: CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The DestinationConfiguration property type describes a location where chat logs will be
     * stored.
     *
     * Each member represents the configuration of one log destination. For logging, you define only
     * one type of destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * DestinationConfigurationProperty destinationConfigurationProperty =
     * DestinationConfigurationProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
     * .logGroupName("logGroupName")
     * .build())
     * .firehose(FirehoseDestinationConfigurationProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .build())
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationDestinationConfigurationProperty(
        block: CfnLoggingConfigurationDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.DestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The FirehoseDestinationConfiguration property type specifies a Kinesis Firehose location
     * where chat logs will be stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * FirehoseDestinationConfigurationProperty firehoseDestinationConfigurationProperty =
     * FirehoseDestinationConfigurationProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-firehosedestinationconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationFirehoseDestinationConfigurationProperty(
        block: CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoggingConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
     * CfnLoggingConfigurationProps.builder()
     * .destinationConfiguration(DestinationConfigurationProperty.builder()
     * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
     * .logGroupName("logGroupName")
     * .build())
     * .firehose(FirehoseDestinationConfigurationProperty.builder()
     * .deliveryStreamName("deliveryStreamName")
     * .build())
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build())
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationProps(
        block: CfnLoggingConfigurationPropsDsl.() -> Unit = {}
    ): CfnLoggingConfigurationProps {
        val builder = CfnLoggingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3DestinationConfiguration property type specifies an S3 location where chat logs will be
     * stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
     * S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-s3destinationconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationS3DestinationConfigurationProperty(
        block: CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.S3DestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IVSChat::Room` resource specifies an room that allows clients to connect and pass
     * messages.
     *
     * For more information, see
     * [CreateRoom](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateRoom.html) in
     * the *Amazon Interactive Video Service Chat API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * CfnRoom cfnRoom = CfnRoom.Builder.create(this, "MyCfnRoom")
     * .loggingConfigurationIdentifiers(List.of("loggingConfigurationIdentifiers"))
     * .maximumMessageLength(123)
     * .maximumMessageRatePerSecond(123)
     * .messageReviewHandler(MessageReviewHandlerProperty.builder()
     * .fallbackResult("fallbackResult")
     * .uri("uri")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html)
     */
    public inline fun cfnRoom(
        scope: Construct,
        id: String,
        block: CfnRoomDsl.() -> Unit = {},
    ): CfnRoom {
        val builder = CfnRoomDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The MessageReviewHandler property type specifies configuration information for optional
     * message review.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * MessageReviewHandlerProperty messageReviewHandlerProperty =
     * MessageReviewHandlerProperty.builder()
     * .fallbackResult("fallbackResult")
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html)
     */
    public inline fun cfnRoomMessageReviewHandlerProperty(
        block: CfnRoomMessageReviewHandlerPropertyDsl.() -> Unit = {}
    ): CfnRoom.MessageReviewHandlerProperty {
        val builder = CfnRoomMessageReviewHandlerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRoom`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivschat.*;
     * CfnRoomProps cfnRoomProps = CfnRoomProps.builder()
     * .loggingConfigurationIdentifiers(List.of("loggingConfigurationIdentifiers"))
     * .maximumMessageLength(123)
     * .maximumMessageRatePerSecond(123)
     * .messageReviewHandler(MessageReviewHandlerProperty.builder()
     * .fallbackResult("fallbackResult")
     * .uri("uri")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html)
     */
    public inline fun cfnRoomProps(block: CfnRoomPropsDsl.() -> Unit = {}): CfnRoomProps {
        val builder = CfnRoomPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
