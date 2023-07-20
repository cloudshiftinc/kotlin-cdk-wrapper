@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.String

@CdkDslMarker
public class CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder =
        CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.builder()

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    public fun bufferingHints(bufferingHints: CfnDeliveryStream.BufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
    }

    public fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: IResolvable) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration)
    }

    public fun dataFormatConversionConfiguration(dataFormatConversionConfiguration: CfnDeliveryStream.DataFormatConversionConfigurationProperty) {
        cdkBuilder.dataFormatConversionConfiguration(dataFormatConversionConfiguration)
    }

    public fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: IResolvable) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration)
    }

    public fun dynamicPartitioningConfiguration(dynamicPartitioningConfiguration: CfnDeliveryStream.DynamicPartitioningConfigurationProperty) {
        cdkBuilder.dynamicPartitioningConfiguration(dynamicPartitioningConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: CfnDeliveryStream.EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun errorOutputPrefix(errorOutputPrefix: String) {
        cdkBuilder.errorOutputPrefix(errorOutputPrefix)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun s3BackupConfiguration(s3BackupConfiguration: IResolvable) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    public fun s3BackupConfiguration(s3BackupConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
        cdkBuilder.s3BackupConfiguration(s3BackupConfiguration)
    }

    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    public fun build(): CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty =
        cdkBuilder.build()
}
