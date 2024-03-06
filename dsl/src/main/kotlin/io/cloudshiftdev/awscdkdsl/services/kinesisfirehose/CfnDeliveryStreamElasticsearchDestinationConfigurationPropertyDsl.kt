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
 * The `ElasticsearchDestinationConfiguration` property type specifies an Amazon Elasticsearch
 * Service (Amazon ES) domain that Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers
 * data to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ElasticsearchDestinationConfigurationProperty elasticsearchDestinationConfigurationProperty =
 * ElasticsearchDestinationConfigurationProperty.builder()
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
 * .bufferingHints(ElasticsearchBufferingHintsProperty.builder()
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
 * .retryOptions(ElasticsearchRetryOptionsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.builder()

    /**
     * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
     *   delivering it to the Amazon ES domain.
     */
    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /**
     * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
     *   delivering it to the Amazon ES domain.
     */
    public fun bufferingHints(
        bufferingHints: CfnDeliveryStream.ElasticsearchBufferingHintsProperty
    ) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /**
     * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
     *   stream.
     */
    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param cloudWatchLoggingOptions The Amazon CloudWatch Logs logging options for the delivery
     *   stream.
     */
    public fun cloudWatchLoggingOptions(
        cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    ) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    /**
     * @param clusterEndpoint The endpoint to use when communicating with the cluster. Specify
     *   either this `ClusterEndpoint` or the `DomainARN` field.
     */
    public fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    /**
     * @param documentIdOptions Indicates the method for setting up document ID. The supported
     *   methods are Firehose generated document ID and OpenSearch Service generated document ID.
     */
    public fun documentIdOptions(documentIdOptions: IResolvable) {
        cdkBuilder.documentIdOptions(documentIdOptions)
    }

    /**
     * @param documentIdOptions Indicates the method for setting up document ID. The supported
     *   methods are Firehose generated document ID and OpenSearch Service generated document ID.
     */
    public fun documentIdOptions(documentIdOptions: CfnDeliveryStream.DocumentIdOptionsProperty) {
        cdkBuilder.documentIdOptions(documentIdOptions)
    }

    /**
     * @param domainArn The ARN of the Amazon ES domain. The IAM role must have permissions for
     *   `DescribeElasticsearchDomain` , `DescribeElasticsearchDomains` , and
     *   `DescribeElasticsearchDomainConfig` after assuming the role specified in *RoleARN* .
     *
     * Specify either `ClusterEndpoint` or `DomainARN` .
     */
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    /**
     * @param indexName The name of the Elasticsearch index to which Kinesis Data Firehose adds data
     *   for indexing.
     */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /**
     * @param indexRotationPeriod The frequency of Elasticsearch index rotation. If you enable index
     *   rotation, Kinesis Data Firehose appends a portion of the UTC arrival timestamp to the
     *   specified index name, and rotates the appended timestamp accordingly. For more information,
     *   see
     *   [Index Rotation for the Amazon ES Destination](https://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation)
     *   in the *Amazon Kinesis Data Firehose Developer Guide* .
     */
    public fun indexRotationPeriod(indexRotationPeriod: String) {
        cdkBuilder.indexRotationPeriod(indexRotationPeriod)
    }

    /**
     * @param processingConfiguration The data processing configuration for the Kinesis Data
     *   Firehose delivery stream.
     */
    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param processingConfiguration The data processing configuration for the Kinesis Data
     *   Firehose delivery stream.
     */
    public fun processingConfiguration(
        processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty
    ) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    /**
     * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
     *   to Amazon ES.
     */
    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param retryOptions The retry behavior when Kinesis Data Firehose is unable to deliver data
     *   to Amazon ES.
     */
    public fun retryOptions(retryOptions: CfnDeliveryStream.ElasticsearchRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data
     *   Firehose for calling the Amazon ES Configuration API and for indexing documents. For more
     *   information, see
     *   [Controlling Access with Amazon Kinesis Data Firehose](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html)
     *   .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3BackupMode The condition under which Kinesis Data Firehose delivers data to Amazon
     *   Simple Storage Service (Amazon S3). You can send Amazon S3 all documents (all data) or only
     *   the documents that Kinesis Data Firehose could not deliver to the Amazon ES destination.
     *   For more information and valid values, see the `S3BackupMode` content for the
     *   [ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchDestinationConfiguration.html)
     *   data type in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    /** @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration The S3 bucket where Kinesis Data Firehose backs up incoming data. */
    public fun s3Configuration(
        s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param typeName The Elasticsearch type name that Amazon ES adds to documents when indexing
     *   data.
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /** @param vpcConfiguration The details of the VPC of the Amazon ES destination. */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /** @param vpcConfiguration The details of the VPC of the Amazon ES destination. */
    public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty =
        cdkBuilder.build()
}
