@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelStatePropertyDsl {
  private val cdkBuilder: CfnDetectorModel.StateProperty.Builder =
      CfnDetectorModel.StateProperty.builder()

  /**
   * @param onEnter When entering this state, perform these `actions` if the `condition` is TRUE.
   */
  public fun onEnter(onEnter: IResolvable) {
    cdkBuilder.onEnter(onEnter)
  }

  /**
   * @param onEnter When entering this state, perform these `actions` if the `condition` is TRUE.
   */
  public fun onEnter(onEnter: CfnDetectorModel.OnEnterProperty) {
    cdkBuilder.onEnter(onEnter)
  }

  /**
   * @param onExit When exiting this state, perform these `actions` if the specified `condition` is
   * `TRUE` .
   */
  public fun onExit(onExit: IResolvable) {
    cdkBuilder.onExit(onExit)
  }

  /**
   * @param onExit When exiting this state, perform these `actions` if the specified `condition` is
   * `TRUE` .
   */
  public fun onExit(onExit: CfnDetectorModel.OnExitProperty) {
    cdkBuilder.onExit(onExit)
  }

  /**
   * @param onInput When an input is received and the `condition` is TRUE, perform the specified
   * `actions` .
   */
  public fun onInput(onInput: IResolvable) {
    cdkBuilder.onInput(onInput)
  }

  /**
   * @param onInput When an input is received and the `condition` is TRUE, perform the specified
   * `actions` .
   */
  public fun onInput(onInput: CfnDetectorModel.OnInputProperty) {
    cdkBuilder.onInput(onInput)
  }

  /**
   * @param stateName The name of the state. 
   */
  public fun stateName(stateName: String) {
    cdkBuilder.stateName(stateName)
  }

  public fun build(): CfnDetectorModel.StateProperty = cdkBuilder.build()
}
