@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.DistributionAttributes

@CdkDslMarker
public class DistributionAttributesDsl {
  private val cdkBuilder: DistributionAttributes.Builder = DistributionAttributes.builder()

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

  public fun build(): DistributionAttributes = cdkBuilder.build()
}
