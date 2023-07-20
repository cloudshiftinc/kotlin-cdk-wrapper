@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps

@CdkDslMarker
public class CfnScalingPlanPropsDsl {
  private val cdkBuilder: CfnScalingPlanProps.Builder = CfnScalingPlanProps.builder()

  private val _scalingInstructions: MutableList<Any> = mutableListOf()

  public fun applicationSource(applicationSource: IResolvable) {
    cdkBuilder.applicationSource(applicationSource)
  }

  public fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty) {
    cdkBuilder.applicationSource(applicationSource)
  }

  public fun scalingInstructions(vararg scalingInstructions: Any) {
    _scalingInstructions.addAll(listOf(*scalingInstructions))
  }

  public fun scalingInstructions(scalingInstructions: Collection<Any>) {
    _scalingInstructions.addAll(scalingInstructions)
  }

  public fun scalingInstructions(scalingInstructions: IResolvable) {
    cdkBuilder.scalingInstructions(scalingInstructions)
  }

  public fun build(): CfnScalingPlanProps {
    if(_scalingInstructions.isNotEmpty()) cdkBuilder.scalingInstructions(_scalingInstructions)
    return cdkBuilder.build()
  }
}
