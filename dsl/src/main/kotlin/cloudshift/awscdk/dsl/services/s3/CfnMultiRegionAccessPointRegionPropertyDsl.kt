@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint

@CdkDslMarker
public class CfnMultiRegionAccessPointRegionPropertyDsl {
  private val cdkBuilder: CfnMultiRegionAccessPoint.RegionProperty.Builder =
      CfnMultiRegionAccessPoint.RegionProperty.builder()

  /**
   * @param bucket The name of the associated bucket for the Region. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param bucketAccountId The AWS account ID that owns the Amazon S3 bucket that's associated with
   * this Multi-Region Access Point.
   */
  public fun bucketAccountId(bucketAccountId: String) {
    cdkBuilder.bucketAccountId(bucketAccountId)
  }

  public fun build(): CfnMultiRegionAccessPoint.RegionProperty = cdkBuilder.build()
}
