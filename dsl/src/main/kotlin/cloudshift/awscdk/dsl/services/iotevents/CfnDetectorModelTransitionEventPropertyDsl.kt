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
public class CfnDetectorModelTransitionEventPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.TransitionEventProperty.Builder =
      CfnDetectorModel.TransitionEventProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  public fun eventName(eventName: String) {
    cdkBuilder.eventName(eventName)
  }

  public fun nextState(nextState: String) {
    cdkBuilder.nextState(nextState)
  }

  public fun build(): CfnDetectorModel.TransitionEventProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
