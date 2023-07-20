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
public class CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()

    public fun bufferingHints(bufferingHints: IResolvable) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    public fun bufferingHints(bufferingHints: CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty) {
        cdkBuilder.bufferingHints(bufferingHints)
    }

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun collectionEndpoint(collectionEndpoint: String) {
        cdkBuilder.collectionEndpoint(collectionEndpoint)
    }

    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun retryOptions(retryOptions: CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun s3BackupMode(s3BackupMode: String) {
        cdkBuilder.s3BackupMode(s3BackupMode)
    }

    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty =
        cdkBuilder.build()
}
