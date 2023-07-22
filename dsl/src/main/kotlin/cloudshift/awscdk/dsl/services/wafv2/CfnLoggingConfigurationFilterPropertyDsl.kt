@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationFilterPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.FilterProperty.Builder =
      CfnLoggingConfiguration.FilterProperty.builder()

  private val _conditions: MutableList<Any> = mutableListOf()

  /**
   * @param behavior How to handle logs that satisfy the filter's conditions and requirement. 
   */
  public fun behavior(behavior: String) {
    cdkBuilder.behavior(behavior)
  }

  /**
   * @param conditions Match conditions for the filter. 
   */
  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  /**
   * @param conditions Match conditions for the filter. 
   */
  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  /**
   * @param conditions Match conditions for the filter. 
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param requirement Logic to apply to the filtering conditions. 
   * You can specify that, in order to satisfy the filter, a log must match all conditions or must
   * match at least one condition.
   */
  public fun requirement(requirement: String) {
    cdkBuilder.requirement(requirement)
  }

  public fun build(): CfnLoggingConfiguration.FilterProperty {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
