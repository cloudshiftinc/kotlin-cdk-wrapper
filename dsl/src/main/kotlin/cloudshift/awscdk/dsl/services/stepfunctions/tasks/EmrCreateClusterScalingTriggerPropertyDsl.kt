@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingTriggerPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingTriggerProperty.Builder =
      EmrCreateCluster.ScalingTriggerProperty.builder()

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters,
   * scaling activity begins.
   */
  public
      fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl()
    builder.apply(cloudWatchAlarmDefinition)
    cdkBuilder.cloudWatchAlarmDefinition(builder.build())
  }

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters,
   * scaling activity begins.
   */
  public
      fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: EmrCreateCluster.CloudWatchAlarmDefinitionProperty) {
    cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
  }

  public fun build(): EmrCreateCluster.ScalingTriggerProperty = cdkBuilder.build()
}
