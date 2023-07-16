@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterCapacityProviderStrategyItemPropertyDsl {
  private val cdkBuilder: CfnCluster.CapacityProviderStrategyItemProperty.Builder =
      CfnCluster.CapacityProviderStrategyItemProperty.builder()

  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  public fun capacityProvider(capacityProvider: String) {
    cdkBuilder.capacityProvider(capacityProvider)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnCluster.CapacityProviderStrategyItemProperty = cdkBuilder.build()
}
