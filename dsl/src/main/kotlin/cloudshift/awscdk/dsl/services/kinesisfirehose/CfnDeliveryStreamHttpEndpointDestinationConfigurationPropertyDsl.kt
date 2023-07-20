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
public class CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder()

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

    public fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun endpointConfiguration(endpointConfiguration: CfnDeliveryStream.HttpEndpointConfigurationProperty) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun processingConfiguration(processingConfiguration: IResolvable) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
        cdkBuilder.processingConfiguration(processingConfiguration)
    }

    public fun requestConfiguration(requestConfiguration: IResolvable) {
        cdkBuilder.requestConfiguration(requestConfiguration)
    }

    public fun requestConfiguration(requestConfiguration: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty) {
        cdkBuilder.requestConfiguration(requestConfiguration)
    }

    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
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

    public fun build(): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
        cdkBuilder.build()
}
