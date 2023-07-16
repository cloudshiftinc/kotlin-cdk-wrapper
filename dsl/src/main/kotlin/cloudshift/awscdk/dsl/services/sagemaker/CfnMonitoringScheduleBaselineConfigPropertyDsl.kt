@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.BaselineConfigProperty.Builder =
      CfnMonitoringSchedule.BaselineConfigProperty.builder()

  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public
      fun constraintsResource(constraintsResource: CfnMonitoringSchedule.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun statisticsResource(statisticsResource: IResolvable) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  public
      fun statisticsResource(statisticsResource: CfnMonitoringSchedule.StatisticsResourceProperty) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  public fun build(): CfnMonitoringSchedule.BaselineConfigProperty = cdkBuilder.build()
}
