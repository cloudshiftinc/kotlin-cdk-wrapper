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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

public object kinesisfirehose {
    /**
     * The `AWS::KinesisFirehose::DeliveryStream` resource specifies an Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) delivery stream that delivers real-time streaming data to an Amazon
     * Simple Storage Service (Amazon S3), Amazon Redshift, or Amazon Elasticsearch Service (Amazon
     * ES) destination.
     *
     * For more information, see
     * [Creating an Amazon Kinesis Data Firehose Delivery Stream](https://docs.aws.amazon.com/firehose/latest/dev/basic-create.html)
     * in the *Amazon Kinesis Data Firehose Developer Guide* .
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
     */
    public inline fun cfnDeliveryStream(
        scope: Construct,
        id: String,
        block: CfnDeliveryStreamDsl.() -> Unit = {},
    ): CfnDeliveryStream {
        val builder = CfnDeliveryStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * AmazonOpenSearchServerlessBufferingHintsProperty
     * amazonOpenSearchServerlessBufferingHintsProperty =
     * AmazonOpenSearchServerlessBufferingHintsProperty.builder()
     * .intervalInSeconds(123)
     * .sizeInMBs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html)
     */
    public inline fun cfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsProperty(
        block: CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty {
        val builder = CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
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
    public inline fun cfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationProperty(
        block:
            CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty {
        val builder =
            CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * AmazonOpenSearchServerlessRetryOptionsProperty amazonOpenSearchServerlessRetryOptionsProperty =
     * AmazonOpenSearchServerlessRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html)
     */
    public inline fun cfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsProperty(
        block: CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty {
        val builder = CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the buffering to perform before delivering data to the Amazon OpenSearch Service
     * destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * AmazonopensearchserviceBufferingHintsProperty amazonopensearchserviceBufferingHintsProperty =
     * AmazonopensearchserviceBufferingHintsProperty.builder()
     * .intervalInSeconds(123)
     * .sizeInMBs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchservicebufferinghints.html)
     */
    public inline fun cfnDeliveryStreamAmazonopensearchserviceBufferingHintsProperty(
        block: CfnDeliveryStreamAmazonopensearchserviceBufferingHintsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty {
        val builder = CfnDeliveryStreamAmazonopensearchserviceBufferingHintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationProperty(
        block:
            CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty {
        val builder = CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to
     * Amazon OpenSearch Service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * AmazonopensearchserviceRetryOptionsProperty amazonopensearchserviceRetryOptionsProperty =
     * AmazonopensearchserviceRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserviceretryoptions.html)
     */
    public inline fun cfnDeliveryStreamAmazonopensearchserviceRetryOptionsProperty(
        block: CfnDeliveryStreamAmazonopensearchserviceRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty {
        val builder = CfnDeliveryStreamAmazonopensearchserviceRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `BufferingHints` property type specifies how Amazon Kinesis Data Firehose (Kinesis Data
     * Firehose) buffers incoming data before delivering it to the destination.
     *
     * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the
     * data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * BufferingHintsProperty bufferingHintsProperty = BufferingHintsProperty.builder()
     * .intervalInSeconds(123)
     * .sizeInMBs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html)
     */
    public inline fun cfnDeliveryStreamBufferingHintsProperty(
        block: CfnDeliveryStreamBufferingHintsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.BufferingHintsProperty {
        val builder = CfnDeliveryStreamBufferingHintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `CloudWatchLoggingOptions` property type specifies Amazon CloudWatch Logs (CloudWatch
     * Logs) logging options that Amazon Kinesis Data Firehose (Kinesis Data Firehose) uses for the
     * delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * CloudWatchLoggingOptionsProperty cloudWatchLoggingOptionsProperty =
     * CloudWatchLoggingOptionsProperty.builder()
     * .enabled(false)
     * .logGroupName("logGroupName")
     * .logStreamName("logStreamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html)
     */
    public inline fun cfnDeliveryStreamCloudWatchLoggingOptionsProperty(
        block: CfnDeliveryStreamCloudWatchLoggingOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.CloudWatchLoggingOptionsProperty {
        val builder = CfnDeliveryStreamCloudWatchLoggingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `CopyCommand` property type configures the Amazon Redshift `COPY` command that Amazon
     * Kinesis Data Firehose (Kinesis Data Firehose) uses to load data into an Amazon Redshift
     * cluster from an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * CopyCommandProperty copyCommandProperty = CopyCommandProperty.builder()
     * .dataTableName("dataTableName")
     * // the properties below are optional
     * .copyOptions("copyOptions")
     * .dataTableColumns("dataTableColumns")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html)
     */
    public inline fun cfnDeliveryStreamCopyCommandProperty(
        block: CfnDeliveryStreamCopyCommandPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.CopyCommandProperty {
        val builder = CfnDeliveryStreamCopyCommandPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the
     * Parquet or ORC format before writing it to Amazon S3.
     *
     * Kinesis Data Firehose uses the serializer and deserializer that you specify, in addition to
     * the column information from the AWS Glue table, to deserialize your input data from JSON and
     * then serialize it to the Parquet or ORC format. For more information, see
     * [Kinesis Data Firehose Record Format Conversion](https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * DataFormatConversionConfigurationProperty dataFormatConversionConfigurationProperty =
     * DataFormatConversionConfigurationProperty.builder()
     * .enabled(false)
     * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
     * .deserializer(DeserializerProperty.builder()
     * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
     * .timestampFormats(List.of("timestampFormats"))
     * .build())
     * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
     * .caseInsensitive(false)
     * .columnToJsonKeyMappings(Map.of(
     * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
     * .convertDotsInJsonKeysToUnderscores(false)
     * .build())
     * .build())
     * .build())
     * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
     * .serializer(SerializerProperty.builder()
     * .orcSerDe(OrcSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .bloomFilterColumns(List.of("bloomFilterColumns"))
     * .bloomFilterFalsePositiveProbability(123)
     * .compression("compression")
     * .dictionaryKeyThreshold(123)
     * .enablePadding(false)
     * .formatVersion("formatVersion")
     * .paddingTolerance(123)
     * .rowIndexStride(123)
     * .stripeSizeBytes(123)
     * .build())
     * .parquetSerDe(ParquetSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .compression("compression")
     * .enableDictionaryCompression(false)
     * .maxPaddingBytes(123)
     * .pageSizeBytes(123)
     * .writerVersion("writerVersion")
     * .build())
     * .build())
     * .build())
     * .schemaConfiguration(SchemaConfigurationProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .region("region")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * .versionId("versionId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html)
     */
    public inline fun cfnDeliveryStreamDataFormatConversionConfigurationProperty(
        block: CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.DataFormatConversionConfigurationProperty {
        val builder = CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the type and Amazon Resource Name (ARN) of the CMK to use for Server-Side
     * Encryption (SSE).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * DeliveryStreamEncryptionConfigurationInputProperty
     * deliveryStreamEncryptionConfigurationInputProperty =
     * DeliveryStreamEncryptionConfigurationInputProperty.builder()
     * .keyType("keyType")
     * // the properties below are optional
     * .keyArn("keyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deliverystreamencryptionconfigurationinput.html)
     */
    public inline fun cfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputProperty(
        block: CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl.() -> Unit =
            {}
    ): CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty {
        val builder = CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deserializer you want Kinesis Data Firehose to use for converting the input data from
     * JSON.
     *
     * Kinesis Data Firehose then serializes the data to its final format using the `Serializer` .
     * Kinesis Data Firehose supports two types of deserializers: the
     * [Apache Hive JSON SerDe](https://docs.aws.amazon.com/https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON)
     * and the
     * [OpenX JSON SerDe](https://docs.aws.amazon.com/https://github.com/rcongiu/Hive-JSON-Serde) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * DeserializerProperty deserializerProperty = DeserializerProperty.builder()
     * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
     * .timestampFormats(List.of("timestampFormats"))
     * .build())
     * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
     * .caseInsensitive(false)
     * .columnToJsonKeyMappings(Map.of(
     * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
     * .convertDotsInJsonKeysToUnderscores(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-deserializer.html)
     */
    public inline fun cfnDeliveryStreamDeserializerProperty(
        block: CfnDeliveryStreamDeserializerPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.DeserializerProperty {
        val builder = CfnDeliveryStreamDeserializerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * DocumentIdOptionsProperty documentIdOptionsProperty = DocumentIdOptionsProperty.builder()
     * .defaultDocumentIdFormat("defaultDocumentIdFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html)
     */
    public inline fun cfnDeliveryStreamDocumentIdOptionsProperty(
        block: CfnDeliveryStreamDocumentIdOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.DocumentIdOptionsProperty {
        val builder = CfnDeliveryStreamDocumentIdOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `DynamicPartitioningConfiguration` property type specifies the configuration of the
     * dynamic partitioning mechanism that creates targeted data sets from the streaming data by
     * partitioning it based on partition keys.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * DynamicPartitioningConfigurationProperty dynamicPartitioningConfigurationProperty =
     * DynamicPartitioningConfigurationProperty.builder()
     * .enabled(false)
     * .retryOptions(RetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dynamicpartitioningconfiguration.html)
     */
    public inline fun cfnDeliveryStreamDynamicPartitioningConfigurationProperty(
        block: CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.DynamicPartitioningConfigurationProperty {
        val builder = CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ElasticsearchBufferingHints` property type specifies how Amazon Kinesis Data Firehose
     * (Kinesis Data Firehose) buffers incoming data while delivering it to the destination.
     *
     * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the
     * data.
     *
     * ElasticsearchBufferingHints is the property type for the `BufferingHints` property of the
     * [Amazon Kinesis Data Firehose DeliveryStream ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ElasticsearchBufferingHintsProperty elasticsearchBufferingHintsProperty =
     * ElasticsearchBufferingHintsProperty.builder()
     * .intervalInSeconds(123)
     * .sizeInMBs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html)
     */
    public inline fun cfnDeliveryStreamElasticsearchBufferingHintsProperty(
        block: CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ElasticsearchBufferingHintsProperty {
        val builder = CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDeliveryStreamElasticsearchDestinationConfigurationProperty(
        block: CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty {
        val builder = CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ElasticsearchRetryOptions` property type configures the retry behavior for when Amazon
     * Kinesis Data Firehose (Kinesis Data Firehose) can't deliver data to Amazon Elasticsearch
     * Service (Amazon ES).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ElasticsearchRetryOptionsProperty elasticsearchRetryOptionsProperty =
     * ElasticsearchRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html)
     */
    public inline fun cfnDeliveryStreamElasticsearchRetryOptionsProperty(
        block: CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ElasticsearchRetryOptionsProperty {
        val builder = CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `EncryptionConfiguration` property type specifies the encryption settings that Amazon
     * Kinesis Data Firehose (Kinesis Data Firehose) uses when delivering data to Amazon Simple
     * Storage Service (Amazon S3).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * EncryptionConfigurationProperty encryptionConfigurationProperty =
     * EncryptionConfigurationProperty.builder()
     * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
     * .awskmsKeyArn("awskmsKeyArn")
     * .build())
     * .noEncryptionConfig("noEncryptionConfig")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html)
     */
    public inline fun cfnDeliveryStreamEncryptionConfigurationProperty(
        block: CfnDeliveryStreamEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.EncryptionConfigurationProperty {
        val builder = CfnDeliveryStreamEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ExtendedS3DestinationConfiguration` property type configures an Amazon S3 destination
     * for an Amazon Kinesis Data Firehose delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ExtendedS3DestinationConfigurationProperty extendedS3DestinationConfigurationProperty =
     * ExtendedS3DestinationConfigurationProperty.builder()
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
     * .dataFormatConversionConfiguration(DataFormatConversionConfigurationProperty.builder()
     * .enabled(false)
     * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
     * .deserializer(DeserializerProperty.builder()
     * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
     * .timestampFormats(List.of("timestampFormats"))
     * .build())
     * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
     * .caseInsensitive(false)
     * .columnToJsonKeyMappings(Map.of(
     * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
     * .convertDotsInJsonKeysToUnderscores(false)
     * .build())
     * .build())
     * .build())
     * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
     * .serializer(SerializerProperty.builder()
     * .orcSerDe(OrcSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .bloomFilterColumns(List.of("bloomFilterColumns"))
     * .bloomFilterFalsePositiveProbability(123)
     * .compression("compression")
     * .dictionaryKeyThreshold(123)
     * .enablePadding(false)
     * .formatVersion("formatVersion")
     * .paddingTolerance(123)
     * .rowIndexStride(123)
     * .stripeSizeBytes(123)
     * .build())
     * .parquetSerDe(ParquetSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .compression("compression")
     * .enableDictionaryCompression(false)
     * .maxPaddingBytes(123)
     * .pageSizeBytes(123)
     * .writerVersion("writerVersion")
     * .build())
     * .build())
     * .build())
     * .schemaConfiguration(SchemaConfigurationProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .region("region")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * .versionId("versionId")
     * .build())
     * .build())
     * .dynamicPartitioningConfiguration(DynamicPartitioningConfigurationProperty.builder()
     * .enabled(false)
     * .retryOptions(RetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build())
     * .build())
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
     * .awskmsKeyArn("awskmsKeyArn")
     * .build())
     * .noEncryptionConfig("noEncryptionConfig")
     * .build())
     * .errorOutputPrefix("errorOutputPrefix")
     * .prefix("prefix")
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
     * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
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
     * .s3BackupMode("s3BackupMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html)
     */
    public inline fun cfnDeliveryStreamExtendedS3DestinationConfigurationProperty(
        block: CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty {
        val builder = CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The native Hive / HCatalog JsonSerDe.
     *
     * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two
     * deserializers you can choose, depending on which one offers the functionality you need. The
     * other option is the OpenX SerDe.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * HiveJsonSerDeProperty hiveJsonSerDeProperty = HiveJsonSerDeProperty.builder()
     * .timestampFormats(List.of("timestampFormats"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-hivejsonserde.html)
     */
    public inline fun cfnDeliveryStreamHiveJsonSerDeProperty(
        block: CfnDeliveryStreamHiveJsonSerDePropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.HiveJsonSerDeProperty {
        val builder = CfnDeliveryStreamHiveJsonSerDePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the metadata that's delivered to the specified HTTP endpoint destination.
     *
     * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
     * third-party service providers, including Datadog, MongoDB, and New Relic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * HttpEndpointCommonAttributeProperty httpEndpointCommonAttributeProperty =
     * HttpEndpointCommonAttributeProperty.builder()
     * .attributeName("attributeName")
     * .attributeValue("attributeValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointcommonattribute.html)
     */
    public inline fun cfnDeliveryStreamHttpEndpointCommonAttributeProperty(
        block: CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.HttpEndpointCommonAttributeProperty {
        val builder = CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration of the HTTP endpoint to which Kinesis Firehose delivers data.
     *
     * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
     * third-party service providers, including Datadog, MongoDB, and New Relic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * HttpEndpointConfigurationProperty httpEndpointConfigurationProperty =
     * HttpEndpointConfigurationProperty.builder()
     * .url("url")
     * // the properties below are optional
     * .accessKey("accessKey")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointconfiguration.html)
     */
    public inline fun cfnDeliveryStreamHttpEndpointConfigurationProperty(
        block: CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.HttpEndpointConfigurationProperty {
        val builder = CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDeliveryStreamHttpEndpointDestinationConfigurationProperty(
        block: CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty {
        val builder = CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the HTTP endpoint request.
     *
     * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
     * third-party service providers, including Datadog, MongoDB, and New Relic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * HttpEndpointRequestConfigurationProperty httpEndpointRequestConfigurationProperty =
     * HttpEndpointRequestConfigurationProperty.builder()
     * .commonAttributes(List.of(HttpEndpointCommonAttributeProperty.builder()
     * .attributeName("attributeName")
     * .attributeValue("attributeValue")
     * .build()))
     * .contentEncoding("contentEncoding")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-httpendpointrequestconfiguration.html)
     */
    public inline fun cfnDeliveryStreamHttpEndpointRequestConfigurationProperty(
        block: CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.HttpEndpointRequestConfigurationProperty {
        val builder = CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the deserializer you want to use to convert the format of the input data.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * InputFormatConfigurationProperty inputFormatConfigurationProperty =
     * InputFormatConfigurationProperty.builder()
     * .deserializer(DeserializerProperty.builder()
     * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
     * .timestampFormats(List.of("timestampFormats"))
     * .build())
     * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
     * .caseInsensitive(false)
     * .columnToJsonKeyMappings(Map.of(
     * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
     * .convertDotsInJsonKeysToUnderscores(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-inputformatconfiguration.html)
     */
    public inline fun cfnDeliveryStreamInputFormatConfigurationProperty(
        block: CfnDeliveryStreamInputFormatConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.InputFormatConfigurationProperty {
        val builder = CfnDeliveryStreamInputFormatConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `KMSEncryptionConfig` property type specifies the AWS Key Management Service ( AWS KMS)
     * encryption key that Amazon Simple Storage Service (Amazon S3) uses to encrypt data delivered
     * by the Amazon Kinesis Data Firehose (Kinesis Data Firehose) stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * KMSEncryptionConfigProperty kMSEncryptionConfigProperty = KMSEncryptionConfigProperty.builder()
     * .awskmsKeyArn("awskmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html)
     */
    public inline fun cfnDeliveryStreamKMSEncryptionConfigProperty(
        block: CfnDeliveryStreamKMSEncryptionConfigPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.KMSEncryptionConfigProperty {
        val builder = CfnDeliveryStreamKMSEncryptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `KinesisStreamSourceConfiguration` property type specifies the stream and role Amazon
     * Resource Names (ARNs) for a Kinesis stream used as the source for a delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * KinesisStreamSourceConfigurationProperty kinesisStreamSourceConfigurationProperty =
     * KinesisStreamSourceConfigurationProperty.builder()
     * .kinesisStreamArn("kinesisStreamArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
     */
    public inline fun cfnDeliveryStreamKinesisStreamSourceConfigurationProperty(
        block: CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.KinesisStreamSourceConfigurationProperty {
        val builder = CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The OpenX SerDe.
     *
     * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two
     * deserializers you can choose, depending on which one offers the functionality you need. The
     * other option is the native Hive / HCatalog JsonSerDe.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * OpenXJsonSerDeProperty openXJsonSerDeProperty = OpenXJsonSerDeProperty.builder()
     * .caseInsensitive(false)
     * .columnToJsonKeyMappings(Map.of(
     * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
     * .convertDotsInJsonKeysToUnderscores(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-openxjsonserde.html)
     */
    public inline fun cfnDeliveryStreamOpenXJsonSerDeProperty(
        block: CfnDeliveryStreamOpenXJsonSerDePropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.OpenXJsonSerDeProperty {
        val builder = CfnDeliveryStreamOpenXJsonSerDePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3.
     *
     * For more information, see
     * [Apache ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * OrcSerDeProperty orcSerDeProperty = OrcSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .bloomFilterColumns(List.of("bloomFilterColumns"))
     * .bloomFilterFalsePositiveProbability(123)
     * .compression("compression")
     * .dictionaryKeyThreshold(123)
     * .enablePadding(false)
     * .formatVersion("formatVersion")
     * .paddingTolerance(123)
     * .rowIndexStride(123)
     * .stripeSizeBytes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html)
     */
    public inline fun cfnDeliveryStreamOrcSerDeProperty(
        block: CfnDeliveryStreamOrcSerDePropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.OrcSerDeProperty {
        val builder = CfnDeliveryStreamOrcSerDePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of
     * your data before it writes it to Amazon S3.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * OutputFormatConfigurationProperty outputFormatConfigurationProperty =
     * OutputFormatConfigurationProperty.builder()
     * .serializer(SerializerProperty.builder()
     * .orcSerDe(OrcSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .bloomFilterColumns(List.of("bloomFilterColumns"))
     * .bloomFilterFalsePositiveProbability(123)
     * .compression("compression")
     * .dictionaryKeyThreshold(123)
     * .enablePadding(false)
     * .formatVersion("formatVersion")
     * .paddingTolerance(123)
     * .rowIndexStride(123)
     * .stripeSizeBytes(123)
     * .build())
     * .parquetSerDe(ParquetSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .compression("compression")
     * .enableDictionaryCompression(false)
     * .maxPaddingBytes(123)
     * .pageSizeBytes(123)
     * .writerVersion("writerVersion")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-outputformatconfiguration.html)
     */
    public inline fun cfnDeliveryStreamOutputFormatConfigurationProperty(
        block: CfnDeliveryStreamOutputFormatConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.OutputFormatConfigurationProperty {
        val builder = CfnDeliveryStreamOutputFormatConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3.
     *
     * For more information, see
     * [Apache Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ParquetSerDeProperty parquetSerDeProperty = ParquetSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .compression("compression")
     * .enableDictionaryCompression(false)
     * .maxPaddingBytes(123)
     * .pageSizeBytes(123)
     * .writerVersion("writerVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html)
     */
    public inline fun cfnDeliveryStreamParquetSerDeProperty(
        block: CfnDeliveryStreamParquetSerDePropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ParquetSerDeProperty {
        val builder = CfnDeliveryStreamParquetSerDePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ProcessingConfiguration` property configures data processing for an Amazon Kinesis Data
     * Firehose delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ProcessingConfigurationProperty processingConfigurationProperty =
     * ProcessingConfigurationProperty.builder()
     * .enabled(false)
     * .processors(List.of(ProcessorProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .parameters(List.of(ProcessorParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html)
     */
    public inline fun cfnDeliveryStreamProcessingConfigurationProperty(
        block: CfnDeliveryStreamProcessingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ProcessingConfigurationProperty {
        val builder = CfnDeliveryStreamProcessingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ProcessorParameter` property specifies a processor parameter in a data processor for an
     * Amazon Kinesis Data Firehose delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ProcessorParameterProperty processorParameterProperty = ProcessorParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html)
     */
    public inline fun cfnDeliveryStreamProcessorParameterProperty(
        block: CfnDeliveryStreamProcessorParameterPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ProcessorParameterProperty {
        val builder = CfnDeliveryStreamProcessorParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Processor` property specifies a data processor for an Amazon Kinesis Data Firehose
     * delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * ProcessorProperty processorProperty = ProcessorProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .parameters(List.of(ProcessorParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html)
     */
    public inline fun cfnDeliveryStreamProcessorProperty(
        block: CfnDeliveryStreamProcessorPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.ProcessorProperty {
        val builder = CfnDeliveryStreamProcessorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeliveryStream`.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
     */
    public inline fun cfnDeliveryStreamProps(
        block: CfnDeliveryStreamPropsDsl.() -> Unit = {}
    ): CfnDeliveryStreamProps {
        val builder = CfnDeliveryStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `RedshiftDestinationConfiguration` property type specifies an Amazon Redshift cluster to
     * which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * RedshiftDestinationConfigurationProperty redshiftDestinationConfigurationProperty =
     * RedshiftDestinationConfigurationProperty.builder()
     * .clusterJdbcurl("clusterJdbcurl")
     * .copyCommand(CopyCommandProperty.builder()
     * .dataTableName("dataTableName")
     * // the properties below are optional
     * .copyOptions("copyOptions")
     * .dataTableColumns("dataTableColumns")
     * .build())
     * .password("password")
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
     * .username("username")
     * // the properties below are optional
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
     * .retryOptions(RedshiftRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build())
     * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
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
     * .s3BackupMode("s3BackupMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html)
     */
    public inline fun cfnDeliveryStreamRedshiftDestinationConfigurationProperty(
        block: CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.RedshiftDestinationConfigurationProperty {
        val builder = CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to
     * Amazon Redshift.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * RedshiftRetryOptionsProperty redshiftRetryOptionsProperty =
     * RedshiftRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html)
     */
    public inline fun cfnDeliveryStreamRedshiftRetryOptionsProperty(
        block: CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.RedshiftRetryOptionsProperty {
        val builder = CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the
     * specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of
     * receipt from the specified HTTP endpoint destination.
     *
     * Kinesis Firehose supports any custom HTTP endpoint or HTTP endpoints owned by supported
     * third-party service providers, including Datadog, MongoDB, and New Relic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * RetryOptionsProperty retryOptionsProperty = RetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-retryoptions.html)
     */
    public inline fun cfnDeliveryStreamRetryOptionsProperty(
        block: CfnDeliveryStreamRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.RetryOptionsProperty {
        val builder = CfnDeliveryStreamRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service
     * (Amazon S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose)
     * delivers data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
     * S3DestinationConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html)
     */
    public inline fun cfnDeliveryStreamS3DestinationConfigurationProperty(
        block: CfnDeliveryStreamS3DestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.S3DestinationConfigurationProperty {
        val builder = CfnDeliveryStreamS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the schema to which you want Kinesis Data Firehose to configure your data before it
     * writes it to Amazon S3.
     *
     * This parameter is required if `Enabled` is set to true.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * SchemaConfigurationProperty schemaConfigurationProperty = SchemaConfigurationProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .region("region")
     * .roleArn("roleArn")
     * .tableName("tableName")
     * .versionId("versionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html)
     */
    public inline fun cfnDeliveryStreamSchemaConfigurationProperty(
        block: CfnDeliveryStreamSchemaConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.SchemaConfigurationProperty {
        val builder = CfnDeliveryStreamSchemaConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The serializer that you want Kinesis Data Firehose to use to convert data to the target
     * format before writing it to Amazon S3.
     *
     * Kinesis Data Firehose supports two types of serializers: the
     * [ORC SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html)
     * and the
     * [Parquet SerDe](https://docs.aws.amazon.com/https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * SerializerProperty serializerProperty = SerializerProperty.builder()
     * .orcSerDe(OrcSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .bloomFilterColumns(List.of("bloomFilterColumns"))
     * .bloomFilterFalsePositiveProbability(123)
     * .compression("compression")
     * .dictionaryKeyThreshold(123)
     * .enablePadding(false)
     * .formatVersion("formatVersion")
     * .paddingTolerance(123)
     * .rowIndexStride(123)
     * .stripeSizeBytes(123)
     * .build())
     * .parquetSerDe(ParquetSerDeProperty.builder()
     * .blockSizeBytes(123)
     * .compression("compression")
     * .enableDictionaryCompression(false)
     * .maxPaddingBytes(123)
     * .pageSizeBytes(123)
     * .writerVersion("writerVersion")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-serializer.html)
     */
    public inline fun cfnDeliveryStreamSerializerProperty(
        block: CfnDeliveryStreamSerializerPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.SerializerProperty {
        val builder = CfnDeliveryStreamSerializerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SplunkDestinationConfiguration` property type specifies the configuration of a
     * destination in Splunk for a Kinesis Data Firehose delivery stream.
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
    public inline fun cfnDeliveryStreamSplunkDestinationConfigurationProperty(
        block: CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.SplunkDestinationConfigurationProperty {
        val builder = CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SplunkRetryOptions` property type specifies retry behavior in case Kinesis Data Firehose
     * is unable to deliver documents to Splunk or if it doesn't receive an acknowledgment from
     * Splunk.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * SplunkRetryOptionsProperty splunkRetryOptionsProperty = SplunkRetryOptionsProperty.builder()
     * .durationInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html)
     */
    public inline fun cfnDeliveryStreamSplunkRetryOptionsProperty(
        block: CfnDeliveryStreamSplunkRetryOptionsPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.SplunkRetryOptionsProperty {
        val builder = CfnDeliveryStreamSplunkRetryOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the VPC of the Amazon ES destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisfirehose.*;
     * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
     * .roleArn("roleArn")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-vpcconfiguration.html)
     */
    public inline fun cfnDeliveryStreamVpcConfigurationProperty(
        block: CfnDeliveryStreamVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDeliveryStream.VpcConfigurationProperty {
        val builder = CfnDeliveryStreamVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
