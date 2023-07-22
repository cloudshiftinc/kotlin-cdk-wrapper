@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.ComparisonOperator
import software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions
import software.amazon.awscdk.services.cloudwatch.TreatMissingData

@CdkDslMarker
public class CreateAlarmOptionsDsl {
  private val cdkBuilder: CreateAlarmOptions.Builder = CreateAlarmOptions.builder()

  /**
   * @param actionsEnabled Whether the actions for this alarm are enabled.
   */
  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * @param alarmDescription Description for the alarm.
   */
  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  /**
   * @param alarmName Name of the alarm.
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * @param comparisonOperator Comparison to use to check if metric is breaching.
   */
  public fun comparisonOperator(comparisonOperator: ComparisonOperator) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm.
   * This is used only if you are setting an "M
   * out of N" alarm. In that case, this value is the M. For more information, see Evaluating an
   * Alarm in the Amazon
   * CloudWatch User Guide.
   */
  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  /**
   * @param evaluateLowSampleCountPercentile Specifies whether to evaluate the data and potentially
   * change the alarm state if there are too few data points to be statistically significant.
   * Used only for alarms that are based on percentiles.
   */
  public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
    cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
  }

  /**
   * @param evaluationPeriods The number of periods over which data is compared to the specified
   * threshold. 
   */
  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  /**
   * @param threshold The value against which the specified statistic is compared. 
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * @param treatMissingData Sets how this alarm is to handle missing data points.
   */
  public fun treatMissingData(treatMissingData: TreatMissingData) {
    cdkBuilder.treatMissingData(treatMissingData)
  }

  public fun build(): CreateAlarmOptions = cdkBuilder.build()
}
