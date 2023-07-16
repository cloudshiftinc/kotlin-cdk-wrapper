@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder =
      CfnDeliveryStream.SplunkDestinationConfigurationProperty.builder()

  public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  public fun hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds: Number) {
    cdkBuilder.hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds)
  }

  public fun hecEndpoint(hecEndpoint: String) {
    cdkBuilder.hecEndpoint(hecEndpoint)
  }

  public fun hecEndpointType(hecEndpointType: String) {
    cdkBuilder.hecEndpointType(hecEndpointType)
  }

  public fun hecToken(hecToken: String) {
    cdkBuilder.hecToken(hecToken)
  }

  public fun processingConfiguration(processingConfiguration: IResolvable) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  public
      fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  public fun retryOptions(retryOptions: IResolvable) {
    cdkBuilder.retryOptions(retryOptions)
  }

  public fun retryOptions(retryOptions: CfnDeliveryStream.SplunkRetryOptionsProperty) {
    cdkBuilder.retryOptions(retryOptions)
  }

  public fun s3BackupMode(s3BackupMode: String) {
    cdkBuilder.s3BackupMode(s3BackupMode)
  }

  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public
      fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnDeliveryStream.SplunkDestinationConfigurationProperty = cdkBuilder.build()
}
