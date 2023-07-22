@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionOriginGroupFailoverCriteriaPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder =
      CfnDistribution.OriginGroupFailoverCriteriaProperty.builder()

  /**
   * @param statusCodes The status codes that, when returned from the primary origin, will trigger
   * CloudFront to failover to the second origin. 
   */
  public fun statusCodes(statusCodes: IResolvable) {
    cdkBuilder.statusCodes(statusCodes)
  }

  /**
   * @param statusCodes The status codes that, when returned from the primary origin, will trigger
   * CloudFront to failover to the second origin. 
   */
  public fun statusCodes(statusCodes: CfnDistribution.StatusCodesProperty) {
    cdkBuilder.statusCodes(statusCodes)
  }

  public fun build(): CfnDistribution.OriginGroupFailoverCriteriaProperty = cdkBuilder.build()
}
