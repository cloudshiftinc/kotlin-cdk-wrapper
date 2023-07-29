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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `ExtendedS3DestinationConfiguration` property type configures an Amazon S3 destination for an
 * Amazon Kinesis Data Firehose delivery stream.
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
@CdkDslMarker
public class CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder =
        CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder()

    /**
     * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. For constraints, see
     *   [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     *   in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    /** @param bufferingHints The buffering option. */
    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    /** @param bufferingHints The buffering option. */
    public fun bufferingHints(bufferingHints: CfnDeliveryStream.BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

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
     * @param compressionFormat The compression format. If no value is specified, the default is
     *   `UNCOMPRESSED` .
     */
    public fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
    }

    /**
     * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
     *   converting data from the JSON format to the Parquet or ORC format before writing it to
     *   Amazon S3.
     */
    public fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration)
    }

    /**
     * @param dataFormatConversionConfiguration The serializer, deserializer, and schema for
     *   converting data from the JSON format to the Parquet or ORC format before writing it to
     *   Amazon S3.
     */
    public fun dataFormatConversionConfiguration(
        dataFormatConversionConfiguration:
            CfnDeliveryStream.DataFormatConversionConfigurationProperty
    ) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration)
    }

    /**
     * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
     *   mechanism that creates targeted data sets from the streaming data by partitioning it based
     *   on partition keys.
     */
    public fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration)
    }

    /**
     * @param dynamicPartitioningConfiguration The configuration of the dynamic partitioning
     *   mechanism that creates targeted data sets from the streaming data by partitioning it based
     *   on partition keys.
     */
    public fun dynamicPartitioningConfiguration(
        dynamicPartitioningConfiguration: CfnDeliveryStream.DynamicPartitioningConfigurationProperty
    ) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration)
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
     *   delivery stream. The default value is `NoEncryption` .
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the Kinesis Data Firehose
     *   delivery stream. The default value is `NoEncryption` .
     */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnDeliveryStream.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
     *   records before writing them to S3. This prefix appears immediately following the bucket
     *   name. For information about how to specify this prefix, see
     *   [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     *   .
     */
    public fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
    }

    /**
     * @param prefix The `YYYY/MM/DD/HH` time format prefix is automatically used for delivered
     *   Amazon S3 files. For more information, see
     *   [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     *   in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
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
     * @param roleArn The Amazon Resource Name (ARN) of the AWS credentials. For constraints, see
     *   [ExtendedS3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ExtendedS3DestinationConfiguration.html)
     *   in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param s3BackupConfiguration The configuration for backup in Amazon S3. */
    public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    /** @param s3BackupConfiguration The configuration for backup in Amazon S3. */
    public fun s3BackupConfiguration(
        s3BackupConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    /**
     * @param s3BackupMode The Amazon S3 backup mode. After you create a delivery stream, you can
     *   update it to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't
     *   update the delivery stream to disable it.
     */
    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    public fun build(): CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty =
        cdkBuilder.build()
}
