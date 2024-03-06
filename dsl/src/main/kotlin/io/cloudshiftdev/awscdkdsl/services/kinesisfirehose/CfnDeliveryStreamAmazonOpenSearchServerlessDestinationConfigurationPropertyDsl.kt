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
 * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch
 * Service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AmazonOpenSearchServerlessDestinationConfigurationProperty
 * amazonOpenSearchServerlessDestinationConfigurationProperty =
 * AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()
 * .indexName("indexName")
 * .roleArn("roleArn")
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
 * .bufferingHints(AmazonOpenSearchServerlessBufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .collectionEndpoint("collectionEndpoint")
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
 * .retryOptions(AmazonOpenSearchServerlessRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()

    /**
     * @param bufferingHints The buffering options. If no value is specified, the default values for
     *   AmazonopensearchserviceBufferingHints are used.
     */
    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /**
     * @param bufferingHints The buffering options. If no value is specified, the default values for
     *   AmazonopensearchserviceBufferingHints are used.
     */
    public fun bufferingHints(
        bufferingHints: CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty
    ) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /** @param cloudWatchLoggingOptions the value to be set. */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /** @param cloudWatchLoggingOptions the value to be set. */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param collectionEndpoint The endpoint to use when communicating with the collection in the
     *   Serverless offering for Amazon OpenSearch Service.
     */
    public fun collectionEndpoint(collectionEndpoint: String) {
        cdkBuilder.collectionEndpoint(collectionEndpoint)
    }

    /** @param indexName The Serverless offering for Amazon OpenSearch Service index name. */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /** @param processingConfiguration the value to be set. */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /** @param processingConfiguration the value to be set. */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to the
     *   Serverless offering for Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The retry behavior in case Firehose is unable to deliver documents to the
     *   Serverless offering for Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */
    public fun retryOptions(
        retryOptions: CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty
    ) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for
     *   calling the Serverless offering for Amazon OpenSearch Service Configuration API and for
     *   indexing documents.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3BackupMode Defines how documents should be delivered to Amazon S3. When it is set to
     *   FailedDocumentsOnly, Firehose writes any documents that could not be indexed to the
     *   configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended to the key
     *   prefix. When set to AllDocuments, Firehose delivers all incoming records to Amazon S3, and
     *   also writes failed documents with AmazonOpenSearchService-failed/ appended to the prefix.
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /** @param s3Configuration the value to be set. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration the value to be set. */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param vpcConfiguration the value to be set. */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /** @param vpcConfiguration the value to be set. */
    public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build():
        CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty =
        cdkBuilder.build()
}
