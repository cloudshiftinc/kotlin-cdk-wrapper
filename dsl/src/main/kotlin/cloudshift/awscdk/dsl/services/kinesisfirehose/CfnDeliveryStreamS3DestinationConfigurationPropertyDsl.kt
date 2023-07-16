@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamS3DestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder =
      CfnDeliveryStream.S3DestinationConfigurationProperty.builder()

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

  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  public fun compressionFormat(compressionFormat: String) {
    cdkBuilder.compressionFormat(compressionFormat)
  }

  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public
      fun encryptionConfiguration(encryptionConfiguration: CfnDeliveryStream.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public fun errorOutputPrefix(errorOutputPrefix: String) {
    cdkBuilder.errorOutputPrefix(errorOutputPrefix)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDeliveryStream.S3DestinationConfigurationProperty = cdkBuilder.build()
}
