@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionOriginGroupFailoverCriteriaPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder =
      CfnDistribution.OriginGroupFailoverCriteriaProperty.builder()

  public fun statusCodes(statusCodes: IResolvable) {
    cdkBuilder.statusCodes(statusCodes)
  }

  public fun statusCodes(statusCodes: CfnDistribution.StatusCodesProperty) {
    cdkBuilder.statusCodes(statusCodes)
  }

  public fun build(): CfnDistribution.OriginGroupFailoverCriteriaProperty = cdkBuilder.build()
}
