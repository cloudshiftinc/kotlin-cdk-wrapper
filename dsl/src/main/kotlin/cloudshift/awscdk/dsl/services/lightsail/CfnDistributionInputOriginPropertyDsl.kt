@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDistribution

@CdkDslMarker
public class CfnDistributionInputOriginPropertyDsl {
  private val cdkBuilder: CfnDistribution.InputOriginProperty.Builder =
      CfnDistribution.InputOriginProperty.builder()

  /**
   * @param name The name of the origin resource.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param protocolPolicy The protocol that your Amazon Lightsail distribution uses when
   * establishing a connection with your origin to pull content.
   */
  public fun protocolPolicy(protocolPolicy: String) {
    cdkBuilder.protocolPolicy(protocolPolicy)
  }

  /**
   * @param regionName The AWS Region name of the origin resource.
   */
  public fun regionName(regionName: String) {
    cdkBuilder.regionName(regionName)
  }

  public fun build(): CfnDistribution.InputOriginProperty = cdkBuilder.build()
}
