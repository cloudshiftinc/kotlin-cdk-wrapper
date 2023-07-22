@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger

@CdkDslMarker
public class CfnTriggerPredicatePropertyDsl {
  private val cdkBuilder: CfnTrigger.PredicateProperty.Builder =
      CfnTrigger.PredicateProperty.builder()

  private val _conditions: MutableList<Any> = mutableListOf()

  /**
   * @param conditions A list of the conditions that determine when the trigger will fire.
   */
  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  /**
   * @param conditions A list of the conditions that determine when the trigger will fire.
   */
  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  /**
   * @param conditions A list of the conditions that determine when the trigger will fire.
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param logical An optional field if only one condition is listed.
   * If multiple conditions are listed, then this field is required.
   */
  public fun logical(logical: String) {
    cdkBuilder.logical(logical)
  }

  public fun build(): CfnTrigger.PredicateProperty {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
