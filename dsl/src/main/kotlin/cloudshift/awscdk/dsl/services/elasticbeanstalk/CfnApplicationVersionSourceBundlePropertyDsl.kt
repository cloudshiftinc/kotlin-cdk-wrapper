@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion

@CdkDslMarker
public class CfnApplicationVersionSourceBundlePropertyDsl {
  private val cdkBuilder: CfnApplicationVersion.SourceBundleProperty.Builder =
      CfnApplicationVersion.SourceBundleProperty.builder()

  /**
   * @param s3Bucket The Amazon S3 bucket where the data is located. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The Amazon S3 key where the data is located. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnApplicationVersion.SourceBundleProperty = cdkBuilder.build()
}
