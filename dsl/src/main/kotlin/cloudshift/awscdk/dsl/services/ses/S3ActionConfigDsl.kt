@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.S3ActionConfig

@CdkDslMarker
public class S3ActionConfigDsl {
  private val cdkBuilder: S3ActionConfig.Builder = S3ActionConfig.builder()

  /**
   * @param bucketName The name of the Amazon S3 bucket that you want to send incoming mail to. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
   * before saving them to the Amazon S3 bucket.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
   */
  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  /**
   * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
   * Amazon S3 bucket.
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): S3ActionConfig = cdkBuilder.build()
}
