@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes

/**
 * Attributes used to import a Distribution.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CloudFrontWebDistributionAttributes cloudFrontWebDistributionAttributes =
 * CloudFrontWebDistributionAttributes.builder()
 * .distributionId("distributionId")
 * .domainName("domainName")
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFrontWebDistributionAttributesDsl {
  private val cdkBuilder: CloudFrontWebDistributionAttributes.Builder =
      CloudFrontWebDistributionAttributes.builder()

  /**
   * @param distributionId The distribution ID for this distribution. 
   */
  public fun distributionId(distributionId: String) {
    cdkBuilder.distributionId(distributionId)
  }

  /**
   * @param domainName The generated domain name of the Distribution, such as
   * d111111abcdef8.cloudfront.net. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CloudFrontWebDistributionAttributes = cdkBuilder.build()
}
