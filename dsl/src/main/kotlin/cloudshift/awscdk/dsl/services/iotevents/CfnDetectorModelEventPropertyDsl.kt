@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelEventPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.EventProperty.Builder =
      CfnDetectorModel.EventProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  /**
   * @param actions The actions to be performed.
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The actions to be performed.
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions The actions to be performed.
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param condition Optional.
   * The Boolean expression that, when TRUE, causes the `actions` to be performed. If not present,
   * the actions are performed (=TRUE). If the expression result is not a Boolean value, the actions
   * are not performed (=FALSE).
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param eventName The name of the event. 
   */
  public fun eventName(eventName: String) {
    cdkBuilder.eventName(eventName)
  }

  public fun build(): CfnDetectorModel.EventProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
