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
 * Describes the configuration of a destination in Amazon OpenSearch Service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AmazonopensearchserviceDestinationConfigurationProperty
 * amazonopensearchserviceDestinationConfigurationProperty =
 * AmazonopensearchserviceDestinationConfigurationProperty.builder()
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
 * .bufferingHints(AmazonopensearchserviceBufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .clusterEndpoint("clusterEndpoint")
 * .documentIdOptions(DocumentIdOptionsProperty.builder()
 * .defaultDocumentIdFormat("defaultDocumentIdFormat")
 * .build())
 * .domainArn("domainArn")
 * .indexRotationPeriod("indexRotationPeriod")
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
 * .retryOptions(AmazonopensearchserviceRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .typeName("typeName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicedestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.builder()

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
        bufferingHints: CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty
    ) {
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
     * @param clusterEndpoint The endpoint to use when communicating with the cluster. Specify
     *   either this ClusterEndpoint or the DomainARN field.
     */
    public fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    /** @param documentIdOptions the value to be set. */
    public fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions)
    }

    /** @param documentIdOptions the value to be set. */
    public fun documentIdOptions(documentIdOptions: CfnDeliveryStream.DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions)
    }

    /** @param domainArn The ARN of the Amazon OpenSearch Service domain. */
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    /** @param indexName The Amazon OpenSearch Service index name. */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /**
     * @param indexRotationPeriod The Amazon OpenSearch Service index rotation period. Index
     *   rotation appends a timestamp to the IndexName to facilitate the expiration of old data.
     */
    public fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
    }

    /** @param processingConfiguration Describes a data processing configuration. */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /** @param processingConfiguration Describes a data processing configuration. */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
     *   documents to Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The retry behavior in case Kinesis Data Firehose is unable to deliver
     *   documents to Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */
    public fun retryOptions(
        retryOptions: CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty
    ) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
     *   Firehose for calling the Amazon OpenSearch Service Configuration API and for indexing
     *   documents.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param s3BackupMode Defines how documents should be delivered to Amazon S3. */
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

    /** @param typeName The Amazon OpenSearch Service type name. */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service destination.
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /**
     * @param vpcConfiguration The details of the VPC of the Amazon OpenSearch Service destination.
     */
    public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty =
        cdkBuilder.build()
}
