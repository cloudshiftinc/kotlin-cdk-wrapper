@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketNotificationFilterPropertyDsl {
  private val cdkBuilder: CfnBucket.NotificationFilterProperty.Builder =
      CfnBucket.NotificationFilterProperty.builder()

  public fun s3Key(s3Key: IResolvable) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun s3Key(s3Key: CfnBucket.S3KeyFilterProperty) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnBucket.NotificationFilterProperty = cdkBuilder.build()
}
