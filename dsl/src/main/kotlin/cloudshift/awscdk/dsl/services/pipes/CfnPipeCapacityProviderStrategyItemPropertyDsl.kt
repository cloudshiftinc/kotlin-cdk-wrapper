@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeCapacityProviderStrategyItemPropertyDsl {
  private val cdkBuilder: CfnPipe.CapacityProviderStrategyItemProperty.Builder =
      CfnPipe.CapacityProviderStrategyItemProperty.builder()

  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  public fun capacityProvider(capacityProvider: String) {
    cdkBuilder.capacityProvider(capacityProvider)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnPipe.CapacityProviderStrategyItemProperty = cdkBuilder.build()
}
