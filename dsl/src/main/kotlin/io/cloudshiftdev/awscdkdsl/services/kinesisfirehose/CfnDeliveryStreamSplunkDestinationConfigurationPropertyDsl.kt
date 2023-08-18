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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `SplunkDestinationConfiguration` property type specifies the configuration of a destination
 * in Splunk for a Kinesis Data Firehose delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SplunkDestinationConfigurationProperty splunkDestinationConfigurationProperty =
 * SplunkDestinationConfigurationProperty.builder()
 * .hecEndpoint("hecEndpoint")
 * .hecEndpointType("hecEndpointType")
 * .hecToken("hecToken")
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
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .hecAcknowledgmentTimeoutInSeconds(123)
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
 * .retryOptions(SplunkRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.SplunkDestinationConfigurationProperty.builder()

    /**
     * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
     *   stream.
     */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param cloudWatchLoggingOptions The Amazon CloudWatch logging options for your delivery
     *   stream.
     */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param hecAcknowledgmentTimeoutInSeconds The amount of time that Kinesis Data Firehose waits
     *   to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout
     *   period, Kinesis Data Firehose either tries to send the data again or considers it an error,
     *   based on your retry settings.
     */
    public fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number) {
        cdkBuilder.hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds)
    }

    /**
     * @param hecEndpoint The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose
     *   sends your data.
     */
    public fun hecEndpoint(hecEndpoint: String) {
        cdkBuilder.hecEndpoint(hecEndpoint)
    }

    /** @param hecEndpointType This type can be either `Raw` or `Event` . */
    public fun hecEndpointType(hecEndpointType: String) {
        cdkBuilder.hecEndpointType(hecEndpointType)
    }

    /**
     * @param hecToken This is a GUID that you obtain from your Splunk cluster when you create a new
     *   HEC endpoint.
     */
    public fun hecToken(hecToken: String) {
        cdkBuilder.hecToken(hecToken)
    }

    /** @param processingConfiguration The data processing configuration. */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /** @param processingConfiguration The data processing configuration. */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
     *   data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
     *   data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.SplunkRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param s3BackupMode Defines how documents should be delivered to Amazon S3. When set to
     *   `FailedEventsOnly` , Kinesis Data Firehose writes any data that could not be indexed to the
     *   configured Amazon S3 destination. When set to `AllEvents` , Kinesis Data Firehose delivers
     *   all incoming records to Amazon S3, and also writes failed documents to Amazon S3. The
     *   default value is `FailedEventsOnly` .
     *
     * You can update this backup mode from `FailedEventsOnly` to `AllEvents` . You can't update it
     * from `AllEvents` to `FailedEventsOnly` .
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /** @param s3Configuration The configuration for the backup Amazon S3 location. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration The configuration for the backup Amazon S3 location. */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun build(): CfnDeliveryStream.SplunkDestinationConfigurationProperty =
        cdkBuilder.build()
}
