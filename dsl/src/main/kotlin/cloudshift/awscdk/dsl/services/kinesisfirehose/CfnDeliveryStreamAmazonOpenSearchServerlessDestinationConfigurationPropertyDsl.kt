@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl {
  private val cdkBuilder:
      CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.Builder =
      CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty.builder()

  /**
   * @param bufferingHints the value to be set.
   */
  public fun bufferingHints(bufferingHints: IResolvable) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param bufferingHints the value to be set.
   */
  public
      fun bufferingHints(bufferingHints: CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param cloudWatchLoggingOptions the value to be set.
   */
  public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param cloudWatchLoggingOptions the value to be set.
   */
  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param collectionEndpoint the value to be set.
   */
  public fun collectionEndpoint(collectionEndpoint: String) {
    cdkBuilder.collectionEndpoint(collectionEndpoint)
  }

  /**
   * @param indexName the value to be set. 
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * @param processingConfiguration the value to be set.
   */
  public fun processingConfiguration(processingConfiguration: IResolvable) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  /**
   * @param processingConfiguration the value to be set.
   */
  public
      fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  /**
   * @param retryOptions the value to be set.
   */
  public fun retryOptions(retryOptions: IResolvable) {
    cdkBuilder.retryOptions(retryOptions)
  }

  /**
   * @param retryOptions the value to be set.
   */
  public
      fun retryOptions(retryOptions: CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty) {
    cdkBuilder.retryOptions(retryOptions)
  }

  /**
   * @param roleArn the value to be set. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param s3BackupMode the value to be set.
   */
  public fun s3BackupMode(s3BackupMode: String) {
    cdkBuilder.s3BackupMode(s3BackupMode)
  }

  /**
   * @param s3Configuration the value to be set. 
   */
  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param s3Configuration the value to be set. 
   */
  public
      fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param vpcConfiguration the value to be set.
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration the value to be set.
   */
  public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty =
      cdkBuilder.build()
}
