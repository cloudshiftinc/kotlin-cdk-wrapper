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
public class CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder =
        CfnDeliveryStream.RedshiftDestinationConfigurationProperty.builder()

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
        cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
    }

    public fun clusterJdbcurl(clusterJdbcurl: String) {
        cdkBuilder.clusterJdbcurl(clusterJdbcurl)
    }

    public fun copyCommand(copyCommand: IResolvable) {
        cdkBuilder.copyCommand(copyCommand)
    }

    public fun copyCommand(copyCommand: CfnDeliveryStream.CopyCommandProperty) {
        cdkBuilder.copyCommand(copyCommand)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
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

    public fun retryOptions(retryOptions: CfnDeliveryStream.RedshiftRetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
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

    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnDeliveryStream.RedshiftDestinationConfigurationProperty =
        cdkBuilder.build()
}
