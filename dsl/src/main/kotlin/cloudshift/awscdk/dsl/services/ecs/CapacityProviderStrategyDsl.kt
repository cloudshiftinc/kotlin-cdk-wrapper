@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy

@CdkDslMarker
public class CapacityProviderStrategyDsl {
  private val cdkBuilder: CapacityProviderStrategy.Builder = CapacityProviderStrategy.builder()

  /**
   * @param base The base value designates how many tasks, at a minimum, to run on the specified
   * capacity provider.
   * Only one
   * capacity provider in a capacity provider strategy can have a base defined. If no value is
   * specified, the default
   * value of 0 is used.
   */
  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  /**
   * @param capacityProvider The name of the capacity provider. 
   */
  public fun capacityProvider(capacityProvider: String) {
    cdkBuilder.capacityProvider(capacityProvider)
  }

  /**
   * @param weight The weight value designates the relative percentage of the total number of tasks
   * launched that should use the specified capacity provider.
   * The weight value is taken into consideration after the base value, if defined, is satisfied.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CapacityProviderStrategy = cdkBuilder.build()
}
