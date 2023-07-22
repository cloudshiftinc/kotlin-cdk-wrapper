@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelOnInputPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.OnInputProperty.Builder =
      CfnDetectorModel.OnInputProperty.builder()

  private val _events: MutableList<Any> = mutableListOf()

  private val _transitionEvents: MutableList<Any> = mutableListOf()

  /**
   * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
   */
  public fun events(vararg events: Any) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
   */
  public fun events(events: Collection<Any>) {
    _events.addAll(events)
  }

  /**
   * @param events Specifies the actions performed when the `condition` evaluates to TRUE.
   */
  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  /**
   * @param transitionEvents Specifies the actions performed, and the next state entered, when a
   * `condition` evaluates to TRUE.
   */
  public fun transitionEvents(vararg transitionEvents: Any) {
    _transitionEvents.addAll(listOf(*transitionEvents))
  }

  /**
   * @param transitionEvents Specifies the actions performed, and the next state entered, when a
   * `condition` evaluates to TRUE.
   */
  public fun transitionEvents(transitionEvents: Collection<Any>) {
    _transitionEvents.addAll(transitionEvents)
  }

  /**
   * @param transitionEvents Specifies the actions performed, and the next state entered, when a
   * `condition` evaluates to TRUE.
   */
  public fun transitionEvents(transitionEvents: IResolvable) {
    cdkBuilder.transitionEvents(transitionEvents)
  }

  public fun build(): CfnDetectorModel.OnInputProperty {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_transitionEvents.isNotEmpty()) cdkBuilder.transitionEvents(_transitionEvents)
    return cdkBuilder.build()
  }
}
