@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigScalingTriggerPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.ScalingTriggerProperty.Builder =
      CfnInstanceGroupConfig.ScalingTriggerProperty.builder()

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters, scaling activity
   * begins.
   */
  public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
    cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
  }

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters, scaling activity
   * begins.
   */
  public
      fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty) {
    cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
  }

  public fun build(): CfnInstanceGroupConfig.ScalingTriggerProperty = cdkBuilder.build()
}
