@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamKMSEncryptionConfigPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.KMSEncryptionConfigProperty.Builder =
      CfnDeliveryStream.KMSEncryptionConfigProperty.builder()

  /**
   * @param awskmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS encryption key that Amazon S3
   * uses to encrypt data delivered by the Kinesis Data Firehose stream. 
   * The key must belong to the same region as the destination S3 bucket.
   */
  public fun awskmsKeyArn(awskmsKeyArn: String) {
    cdkBuilder.awskmsKeyArn(awskmsKeyArn)
  }

  public fun build(): CfnDeliveryStream.KMSEncryptionConfigProperty = cdkBuilder.build()
}
