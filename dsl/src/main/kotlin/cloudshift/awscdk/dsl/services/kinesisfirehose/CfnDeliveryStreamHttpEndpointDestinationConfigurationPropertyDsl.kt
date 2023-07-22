@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder =
      CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder()

  /**
   * @param bufferingHints The buffering options that can be used before data is delivered to the
   * specified destination.
   * Kinesis Data Firehose treats these options as hints, and it might choose to use more optimal
   * values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you specify a
   * value for one of them, you must also provide a value for the other.
   */
  public fun bufferingHints(bufferingHints: IResolvable) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param bufferingHints The buffering options that can be used before data is delivered to the
   * specified destination.
   * Kinesis Data Firehose treats these options as hints, and it might choose to use more optimal
   * values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if you specify a
   * value for one of them, you must also provide a value for the other.
   */
  public fun bufferingHints(bufferingHints: CfnDeliveryStream.BufferingHintsProperty) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
   * delivery stream.
   */
  public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param cloudWatchLoggingOptions Describes the Amazon CloudWatch logging options for your
   * delivery stream.
   */
  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
   * destination. 
   */
  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param endpointConfiguration The configuration of the HTTP endpoint selected as the
   * destination. 
   */
  public
      fun endpointConfiguration(endpointConfiguration: CfnDeliveryStream.HttpEndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param processingConfiguration Describes the data processing configuration.
   */
  public fun processingConfiguration(processingConfiguration: IResolvable) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  /**
   * @param processingConfiguration Describes the data processing configuration.
   */
  public
      fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  /**
   * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
   * specified as the destination.
   */
  public fun requestConfiguration(requestConfiguration: IResolvable) {
    cdkBuilder.requestConfiguration(requestConfiguration)
  }

  /**
   * @param requestConfiguration The configuration of the request sent to the HTTP endpoint
   * specified as the destination.
   */
  public
      fun requestConfiguration(requestConfiguration: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty) {
    cdkBuilder.requestConfiguration(requestConfiguration)
  }

  /**
   * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
   * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
   * acknowledgment of receipt from the specified HTTP endpoint destination.
   */
  public fun retryOptions(retryOptions: IResolvable) {
    cdkBuilder.retryOptions(retryOptions)
  }

  /**
   * @param retryOptions Describes the retry behavior in case Kinesis Data Firehose is unable to
   * deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid
   * acknowledgment of receipt from the specified HTTP endpoint destination.
   */
  public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
    cdkBuilder.retryOptions(retryOptions)
  }

  /**
   * @param roleArn Kinesis Data Firehose uses this IAM role for all the permissions that the
   * delivery stream needs.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param s3BackupMode Describes the S3 bucket backup options for the data that Kinesis Data
   * Firehose delivers to the HTTP endpoint destination.
   * You can back up all documents (AllData) or only the documents that Kinesis Data Firehose could
   * not deliver to the specified HTTP endpoint destination (FailedDataOnly).
   */
  public fun s3BackupMode(s3BackupMode: String) {
    cdkBuilder.s3BackupMode(s3BackupMode)
  }

  /**
   * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
   */
  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param s3Configuration Describes the configuration of a destination in Amazon S3. 
   */
  public
      fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
      cdkBuilder.build()
}
