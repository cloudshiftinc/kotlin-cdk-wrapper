@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.BaselineConfigProperty.Builder =
      CfnMonitoringSchedule.BaselineConfigProperty.builder()

  /**
   * @param constraintsResource The Amazon S3 URI for the constraints resource.
   */
  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  /**
   * @param constraintsResource The Amazon S3 URI for the constraints resource.
   */
  public
      fun constraintsResource(constraintsResource: CfnMonitoringSchedule.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  /**
   * @param statisticsResource The baseline statistics file in Amazon S3 that the current monitoring
   * job should be validated against.
   */
  public fun statisticsResource(statisticsResource: IResolvable) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  /**
   * @param statisticsResource The baseline statistics file in Amazon S3 that the current monitoring
   * job should be validated against.
   */
  public
      fun statisticsResource(statisticsResource: CfnMonitoringSchedule.StatisticsResourceProperty) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  public fun build(): CfnMonitoringSchedule.BaselineConfigProperty = cdkBuilder.build()
}
