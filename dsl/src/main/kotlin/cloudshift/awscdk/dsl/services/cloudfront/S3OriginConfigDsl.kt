@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.S3OriginConfig
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3OriginConfigDsl {
  private val cdkBuilder: S3OriginConfig.Builder = S3OriginConfig.builder()

  public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
    cdkBuilder.originAccessIdentity(originAccessIdentity)
  }

  public fun originHeaders(originHeaders: Map<String, String>) {
    cdkBuilder.originHeaders(originHeaders)
  }

  public fun originPath(originPath: String) {
    cdkBuilder.originPath(originPath)
  }

  public fun originShieldRegion(originShieldRegion: String) {
    cdkBuilder.originShieldRegion(originShieldRegion)
  }

  public fun s3BucketSource(s3BucketSource: IBucket) {
    cdkBuilder.s3BucketSource(s3BucketSource)
  }

  public fun build(): S3OriginConfig = cdkBuilder.build()
}
