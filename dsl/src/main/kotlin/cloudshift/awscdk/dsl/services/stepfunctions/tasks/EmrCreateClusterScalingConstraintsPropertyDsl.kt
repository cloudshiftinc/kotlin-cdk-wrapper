@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingConstraintsPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingConstraintsProperty.Builder =
      EmrCreateCluster.ScalingConstraintsProperty.builder()

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): EmrCreateCluster.ScalingConstraintsProperty = cdkBuilder.build()
}
