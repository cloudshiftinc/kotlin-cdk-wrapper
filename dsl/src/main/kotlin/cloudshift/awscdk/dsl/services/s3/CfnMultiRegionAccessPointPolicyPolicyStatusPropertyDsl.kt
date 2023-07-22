@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy

@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl {
  private val cdkBuilder: CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder =
      CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder()

  /**
   * @param isPublic The policy status for this bucket. 
   * `TRUE` indicates that this bucket is public. `FALSE` indicates that the bucket is not public.
   */
  public fun isPublic(isPublic: String) {
    cdkBuilder.isPublic(isPublic)
  }

  public fun build(): CfnMultiRegionAccessPointPolicy.PolicyStatusProperty = cdkBuilder.build()
}
