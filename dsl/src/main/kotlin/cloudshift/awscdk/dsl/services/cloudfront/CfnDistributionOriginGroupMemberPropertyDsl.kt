@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionOriginGroupMemberPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginGroupMemberProperty.Builder =
      CfnDistribution.OriginGroupMemberProperty.builder()

  /**
   * @param originId The ID for an origin in an origin group. 
   */
  public fun originId(originId: String) {
    cdkBuilder.originId(originId)
  }

  public fun build(): CfnDistribution.OriginGroupMemberProperty = cdkBuilder.build()
}
