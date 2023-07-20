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

  public fun behavior(behavior: String) {
    cdkBuilder.behavior(behavior)
  }

  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  public fun requirement(requirement: String) {
    cdkBuilder.requirement(requirement)
  }

  public fun build(): CfnLoggingConfiguration.FilterProperty {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
