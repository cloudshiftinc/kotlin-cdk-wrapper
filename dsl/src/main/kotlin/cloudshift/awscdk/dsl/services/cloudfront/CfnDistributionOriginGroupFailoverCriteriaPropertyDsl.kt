@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex data type that includes information about the failover criteria for an origin group,
 * including the status codes for which CloudFront will failover from the primary origin to the second
 * origin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginGroupFailoverCriteriaProperty originGroupFailoverCriteriaProperty =
 * OriginGroupFailoverCriteriaProperty.builder()
 * .statusCodes(StatusCodesProperty.builder()
 * .items(List.of(123))
 * .quantity(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html)
 */
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
