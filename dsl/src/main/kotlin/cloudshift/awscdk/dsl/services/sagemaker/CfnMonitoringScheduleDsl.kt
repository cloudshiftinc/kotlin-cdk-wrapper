@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.constructs.Construct

@CdkDslMarker
public class CfnMonitoringScheduleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMonitoringSchedule.Builder =
      CfnMonitoringSchedule.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the endpoint using the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-endpointname)
   * @param endpointName The name of the endpoint using the monitoring schedule. 
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * Contains the reason a monitoring job failed, if it failed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-failurereason)
   * @param failureReason Contains the reason a monitoring job failed, if it failed. 
   */
  public fun failureReason(failureReason: String) {
    cdkBuilder.failureReason(failureReason)
  }

  /**
   * Describes metadata on the last execution to run, if there was one.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
   * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there
   * was one. 
   */
  public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  /**
   * Describes metadata on the last execution to run, if there was one.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-lastmonitoringexecutionsummary)
   * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there
   * was one. 
   */
  public
      fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: CfnMonitoringSchedule.MonitoringExecutionSummaryProperty) {
    cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary)
  }

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
   * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule
   * and defines the monitoring job. 
   */
  public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  /**
   * The configuration object that specifies the monitoring schedule and defines the monitoring job.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringscheduleconfig)
   * @param monitoringScheduleConfig The configuration object that specifies the monitoring schedule
   * and defines the monitoring job. 
   */
  public
      fun monitoringScheduleConfig(monitoringScheduleConfig: CfnMonitoringSchedule.MonitoringScheduleConfigProperty) {
    cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig)
  }

  /**
   * The name of the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulename)
   * @param monitoringScheduleName The name of the monitoring schedule. 
   */
  public fun monitoringScheduleName(monitoringScheduleName: String) {
    cdkBuilder.monitoringScheduleName(monitoringScheduleName)
  }

  /**
   * The status of the monitoring schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-monitoringschedulestatus)
   * @param monitoringScheduleStatus The status of the monitoring schedule. 
   */
  public fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
    cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html#cfn-sagemaker-monitoringschedule-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMonitoringSchedule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
