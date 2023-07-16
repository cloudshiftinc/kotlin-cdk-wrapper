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

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): S3Props = cdkBuilder.build()
}
