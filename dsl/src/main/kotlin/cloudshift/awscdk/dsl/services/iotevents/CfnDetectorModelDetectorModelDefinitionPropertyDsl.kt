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
public class CfnDetectorModelDetectorModelDefinitionPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.DetectorModelDefinitionProperty.Builder =
      CfnDetectorModel.DetectorModelDefinitionProperty.builder()

  private val _states: MutableList<Any> = mutableListOf()

  /**
   * @param initialStateName The state that is entered at the creation of each detector (instance). 
   */
  public fun initialStateName(initialStateName: String) {
    cdkBuilder.initialStateName(initialStateName)
  }

  /**
   * @param states Information about the states of the detector. 
   */
  public fun states(vararg states: Any) {
    _states.addAll(listOf(*states))
  }

  /**
   * @param states Information about the states of the detector. 
   */
  public fun states(states: Collection<Any>) {
    _states.addAll(states)
  }

  /**
   * @param states Information about the states of the detector. 
   */
  public fun states(states: IResolvable) {
    cdkBuilder.states(states)
  }

  public fun build(): CfnDetectorModel.DetectorModelDefinitionProperty {
    if(_states.isNotEmpty()) cdkBuilder.states(_states)
    return cdkBuilder.build()
  }
}
