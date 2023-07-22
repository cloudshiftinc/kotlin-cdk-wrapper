@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.CompositeAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarmRule
import software.constructs.Construct

@CdkDslMarker
public class CompositeAlarmDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CompositeAlarm.Builder = CompositeAlarm.Builder.create(scope, id)

  /**
   * Whether the actions for this alarm are enabled.
   *
   * Default: true
   *
   * @param actionsEnabled Whether the actions for this alarm are enabled. 
   */
  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * Actions will be suppressed if the suppressor alarm is in the ALARM state.
   *
   * Default: - alarm will not be suppressed.
   *
   * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM
   * state. 
   */
  public fun actionsSuppressor(actionsSuppressor: IAlarm) {
    cdkBuilder.actionsSuppressor(actionsSuppressor)
  }

  /**
   * The maximum duration that the composite alarm waits after suppressor alarm goes out of the
   * ALARM state.
   *
   * After this time, the composite alarm performs its actions.
   *
   * Default: - 1 minute extension period will be set.
   *
   * @param actionsSuppressorExtensionPeriod The maximum duration that the composite alarm waits
   * after suppressor alarm goes out of the ALARM state. 
   */
  public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
    cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
  }

  /**
   * The maximum duration that the composite alarm waits for the suppressor alarm to go into the
   * ALARM state.
   *
   * After this time, the composite alarm performs its actions.
   *
   * Default: - 1 minute wait period will be set.
   *
   * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for the
   * suppressor alarm to go into the ALARM state. 
   */
  public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
    cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
  }

  /**
   * Description for the alarm.
   *
   * Default: - No description.
   *
   * @param alarmDescription Description for the alarm. 
   */
  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  /**
   * Expression that specifies which other alarms are to be evaluated to determine this composite
   * alarm's state.
   *
   * @param alarmRule Expression that specifies which other alarms are to be evaluated to determine
   * this composite alarm's state. 
   */
  public fun alarmRule(alarmRule: IAlarmRule) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * Name of the alarm.
   *
   * Default: - Automatically generated name.
   *
   * @param compositeAlarmName Name of the alarm. 
   */
  public fun compositeAlarmName(compositeAlarmName: String) {
    cdkBuilder.compositeAlarmName(compositeAlarmName)
  }

  public fun build(): CompositeAlarm = cdkBuilder.build()
}
