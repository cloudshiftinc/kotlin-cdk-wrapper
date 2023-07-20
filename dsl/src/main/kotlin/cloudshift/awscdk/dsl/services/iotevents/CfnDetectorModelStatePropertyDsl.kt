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

  public fun onEnter(onEnter: IResolvable) {
    cdkBuilder.onEnter(onEnter)
  }

  public fun onEnter(onEnter: CfnDetectorModel.OnEnterProperty) {
    cdkBuilder.onEnter(onEnter)
  }

  public fun onExit(onExit: IResolvable) {
    cdkBuilder.onExit(onExit)
  }

  public fun onExit(onExit: CfnDetectorModel.OnExitProperty) {
    cdkBuilder.onExit(onExit)
  }

  public fun onInput(onInput: IResolvable) {
    cdkBuilder.onInput(onInput)
  }

  public fun onInput(onInput: CfnDetectorModel.OnInputProperty) {
    cdkBuilder.onInput(onInput)
  }

  public fun stateName(stateName: String) {
    cdkBuilder.stateName(stateName)
  }

  public fun build(): CfnDetectorModel.StateProperty = cdkBuilder.build()
}
