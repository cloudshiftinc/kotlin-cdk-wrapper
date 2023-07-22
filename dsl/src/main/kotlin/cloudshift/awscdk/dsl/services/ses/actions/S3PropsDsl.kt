@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.ses.actions.S3Props
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class S3PropsDsl {
  private val cdkBuilder: S3Props.Builder = S3Props.builder()

  /**
   * @param bucket The S3 bucket that incoming email will be saved to. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
   * the S3 bucket.
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * @param objectKeyPrefix The key prefix of the S3 bucket.
   */
  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  /**
   * @param topic The SNS topic to notify when the S3 action is taken.
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): S3Props = cdkBuilder.build()
}
