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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
 * Service.
 */
public inline fun CfnDeliveryStream.setAmazonOpenSearchServerlessDestinationConfiguration(
    block:
        CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl.() -> Unit =
        {}
) {
    val builder = CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setAmazonOpenSearchServerlessDestinationConfiguration(builder.build())
}

/** The destination in Amazon OpenSearch Service. */
public inline fun CfnDeliveryStream.setAmazonopensearchserviceDestinationConfiguration(
    block: CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl.() -> Unit =
        {}
) {
    val builder = CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setAmazonopensearchserviceDestinationConfiguration(builder.build())
}

/**
 * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side Encryption
 * (SSE).
 */
public inline fun CfnDeliveryStream.setDeliveryStreamEncryptionConfigurationInput(
    block: CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl()
    builder.apply(block)
    return setDeliveryStreamEncryptionConfigurationInput(builder.build())
}

/** An Amazon ES destination for the delivery stream. */
public inline fun CfnDeliveryStream.setElasticsearchDestinationConfiguration(
    block: CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setElasticsearchDestinationConfiguration(builder.build())
}

/** An Amazon S3 destination for the delivery stream. */
public inline fun CfnDeliveryStream.setExtendedS3DestinationConfiguration(
    block: CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setExtendedS3DestinationConfiguration(builder.build())
}

/** Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination. */
public inline fun CfnDeliveryStream.setHttpEndpointDestinationConfiguration(
    block: CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setHttpEndpointDestinationConfiguration(builder.build())
}

/**
 * When a Kinesis stream is used as the source for the delivery stream, a
 * [KinesisStreamSourceConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
 * containing the Kinesis stream ARN and the role ARN for the source stream.
 */
public inline fun CfnDeliveryStream.setKinesisStreamSourceConfiguration(
    block: CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setKinesisStreamSourceConfiguration(builder.build())
}

/** The configuration for the Amazon MSK cluster to be used as the source for a delivery stream. */
public inline fun CfnDeliveryStream.setMskSourceConfiguration(
    block: CfnDeliveryStreamMSKSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamMSKSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setMskSourceConfiguration(builder.build())
}

/** An Amazon Redshift destination for the delivery stream. */
public inline fun CfnDeliveryStream.setRedshiftDestinationConfiguration(
    block: CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setRedshiftDestinationConfiguration(builder.build())
}

/**
 * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service (Amazon
 * S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data.
 */
public inline fun CfnDeliveryStream.setS3DestinationConfiguration(
    block: CfnDeliveryStreamS3DestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setS3DestinationConfiguration(builder.build())
}

/** Configure Snowflake destination. */
public inline fun CfnDeliveryStream.setSnowflakeDestinationConfiguration(
    block: CfnDeliveryStreamSnowflakeDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamSnowflakeDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setSnowflakeDestinationConfiguration(builder.build())
}

/** The configuration of a destination in Splunk for the delivery stream. */
public inline fun CfnDeliveryStream.setSplunkDestinationConfiguration(
    block: CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setSplunkDestinationConfiguration(builder.build())
}
