@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyActionPropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.ActionProperty.Builder =
      CfnLifecyclePolicy.ActionProperty.builder()

  private val _crossRegionCopy: MutableList<Any> = mutableListOf()

  /**
   * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
   */
  public fun crossRegionCopy(vararg crossRegionCopy: Any) {
    _crossRegionCopy.addAll(listOf(*crossRegionCopy))
  }

  /**
   * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
   */
  public fun crossRegionCopy(crossRegionCopy: Collection<Any>) {
    _crossRegionCopy.addAll(crossRegionCopy)
  }

  /**
   * @param crossRegionCopy The rule for copying shared snapshots across Regions. 
   */
  public fun crossRegionCopy(crossRegionCopy: IResolvable) {
    cdkBuilder.crossRegionCopy(crossRegionCopy)
  }

  /**
   * @param name A descriptive name for the action. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnLifecyclePolicy.ActionProperty {
    if(_crossRegionCopy.isNotEmpty()) cdkBuilder.crossRegionCopy(_crossRegionCopy)
    return cdkBuilder.build()
  }
}
