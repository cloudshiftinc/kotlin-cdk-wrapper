@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterOnDemandProvisioningSpecificationPropertyDsl {
  private val cdkBuilder: CfnCluster.OnDemandProvisioningSpecificationProperty.Builder =
      CfnCluster.OnDemandProvisioningSpecificationProperty.builder()

  /**
   * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance fleets.
   * 
   * Currently, the only option is `lowest-price` (the default), which launches the lowest price
   * first.
   */
  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  public fun build(): CfnCluster.OnDemandProvisioningSpecificationProperty = cdkBuilder.build()
}
