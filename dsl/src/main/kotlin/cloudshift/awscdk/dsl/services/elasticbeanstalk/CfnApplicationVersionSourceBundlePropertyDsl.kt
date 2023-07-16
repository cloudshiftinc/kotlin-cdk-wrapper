@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion

@CdkDslMarker
public class CfnApplicationVersionSourceBundlePropertyDsl {
  private val cdkBuilder: CfnApplicationVersion.SourceBundleProperty.Builder =
      CfnApplicationVersion.SourceBundleProperty.builder()

  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnApplicationVersion.SourceBundleProperty = cdkBuilder.build()
}
