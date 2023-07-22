@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionLegacyS3OriginPropertyDsl {
  private val cdkBuilder: CfnDistribution.LegacyS3OriginProperty.Builder =
      CfnDistribution.LegacyS3OriginProperty.builder()

  /**
   * @param dnsName the value to be set. 
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param originAccessIdentity the value to be set.
   */
  public fun originAccessIdentity(originAccessIdentity: String) {
    cdkBuilder.originAccessIdentity(originAccessIdentity)
  }

  public fun build(): CfnDistribution.LegacyS3OriginProperty = cdkBuilder.build()
}
