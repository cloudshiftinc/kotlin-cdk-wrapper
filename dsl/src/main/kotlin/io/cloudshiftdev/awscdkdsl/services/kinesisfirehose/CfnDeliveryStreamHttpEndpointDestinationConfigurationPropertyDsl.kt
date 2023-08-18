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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Describes the configuration of the HTTP endpoint destination.
 *
 * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
 * third-party service providers, including Datadog, MongoDB, and New Relic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * HttpEndpointDestinationConfigurationProperty httpEndpointDestinationConfigurationProperty =
 * HttpEndpointDestinationConfigurationProperty.builder()
 * .endpointConfiguration(HttpEndpointConfigurationProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .accessKey("accessKey")
 * .name("name")
 * .build())
 * .s3Configuration(S3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .processingConfiguration(ProcessingConfigurationProperty.builder()
 * .enabled(false)
 * .processors(List.of(ProcessorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(List.of(ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .build())
 * .requestConfiguration(HttpEndpointRequestConfigurationProperty.builder()
 * .commonAttributes(List.of(HttpEndpointCommonAttributeProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .build()))
 * .contentEncoding("contentEncoding")
 * .build())
 * .retryOptions(RetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .roleArn("roleArn")
 * .s3BackupMode("s3BackupMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder()

    /**
     * @param bufferingHints The buffering options that can be used before data is delivered to the
     *   specified destination. Kinesis Data Firehose treats these options as hints, and it might
     *   choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are
     *   optional. However, if you specify a value for one of them, you must also provide a value
     *   for the other.
     */
    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /**
     * @param bufferingHints The buffering options that can be used before data is delivered to the
     *   specified destination. Kinesis Data Firehose treats these options as hints, and it might
     *   choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are
     *   optional. However, if you specify a value for one of them, you must also provide a value
     *   for the other.
     */
    public fun bufferingHints(bufferingHints: CfnDeliveryStream.BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /**
     * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
     *   delivery stream.
     */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
     *   delivery stream.
     */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
     *   destination.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
     *   destination.
     */
    public fun endpointConfiguration(
        endpointConfiguration: CfnDeliveryStream.HttpEndpointConfigurationProperty
    ) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /** @param processingConfiguration Describes the data processing configuration. */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /** @param processingConfiguration Describes the data processing configuration. */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
     *   specified as the destination.
     */
    public fun requestConfiguration(requestConfiguration: IResolvable) {
        cdkBuilder.requestConfiguration(requestConfiguration)
    }

    /**
     * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
     *   specified as the destination.
     */
    public fun requestConfiguration(
        requestConfiguration: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty
    ) {
        cdkBuilder.requestConfiguration(requestConfiguration)
    }

    /**
     * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
     *   deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
     *   acknowledgment of receipt from the specified HTTP endpoint destination.
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
     *   deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
     *   acknowledgment of receipt from the specified HTTP endpoint destination.
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param roleArn Kinesis Data Firehose uses this IAM role for all the permissions that the
     *   delivery stream needs.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3BackupMode Describes the S3 bucket backup options for the data that Kinesis Data
     *   Firehose delivers to the HTTP endpoint destination. You can back up all documents (AllData)
     *   or only the documents that Kinesis Data Firehose could not deliver to the specified HTTP
     *   endpoint destination (FailedDataOnly).
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /** @param s3Configuration Describes the configuration of a destination in Amazon S3. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration Describes the configuration of a destination in Amazon S3. */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
        cdkBuilder.build()
}
