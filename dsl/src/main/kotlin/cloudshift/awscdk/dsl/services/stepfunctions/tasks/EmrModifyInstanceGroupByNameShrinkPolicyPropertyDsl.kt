@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

@CdkDslMarker
public class EmrModifyInstanceGroupByNameShrinkPolicyPropertyDsl {
  private val cdkBuilder: EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder =
      EmrModifyInstanceGroupByName.ShrinkPolicyProperty.builder()

  public fun decommissionTimeout(decommissionTimeout: Duration) {
    cdkBuilder.decommissionTimeout(decommissionTimeout)
  }

  public
      fun instanceResizePolicy(block: EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrModifyInstanceGroupByNameInstanceResizePolicyPropertyDsl()
    builder.apply(block)
    cdkBuilder.instanceResizePolicy(builder.build())
  }

  public
      fun instanceResizePolicy(instanceResizePolicy: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty) {
    cdkBuilder.instanceResizePolicy(instanceResizePolicy)
  }

  public fun build(): EmrModifyInstanceGroupByName.ShrinkPolicyProperty = cdkBuilder.build()
}
