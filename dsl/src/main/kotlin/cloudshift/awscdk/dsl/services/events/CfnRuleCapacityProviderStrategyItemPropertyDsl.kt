@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleCapacityProviderStrategyItemPropertyDsl {
  private val cdkBuilder: CfnRule.CapacityProviderStrategyItemProperty.Builder =
      CfnRule.CapacityProviderStrategyItemProperty.builder()

  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  public fun capacityProvider(capacityProvider: String) {
    cdkBuilder.capacityProvider(capacityProvider)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnRule.CapacityProviderStrategyItemProperty = cdkBuilder.build()
}
