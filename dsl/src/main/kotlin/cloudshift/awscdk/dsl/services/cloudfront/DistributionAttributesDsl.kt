@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.DistributionAttributes

@CdkDslMarker
public class DistributionAttributesDsl {
  private val cdkBuilder: DistributionAttributes.Builder = DistributionAttributes.builder()

  public fun distributionId(distributionId: String) {
    cdkBuilder.distributionId(distributionId)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): DistributionAttributes = cdkBuilder.build()
}
