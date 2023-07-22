@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarmRule

@CdkDslMarker
public class CompositeAlarmPropsDsl {
  private val cdkBuilder: CompositeAlarmProps.Builder = CompositeAlarmProps.builder()

  /**
   * @param actionsEnabled Whether the actions for this alarm are enabled.
   */
  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM
   * state.
   */
  public fun actionsSuppressor(actionsSuppressor: IAlarm) {
    cdkBuilder.actionsSuppressor(actionsSuppressor)
  }

  /**
   * @param actionsSuppressorExtensionPeriod The maximum duration that the composite alarm waits
   * after suppressor alarm goes out of the ALARM state.
   * After this time, the composite alarm performs its actions.
   */
  public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
    cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
  }

  /**
   * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for the
   * suppressor alarm to go into the ALARM state.
   * After this time, the composite alarm performs its actions.
   */
  public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
    cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
  }

  /**
   * @param alarmDescription Description for the alarm.
   */
  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  /**
   * @param alarmRule Expression that specifies which other alarms are to be evaluated to determine
   * this composite alarm's state. 
   */
  public fun alarmRule(alarmRule: IAlarmRule) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * @param compositeAlarmName Name of the alarm.
   */
  public fun compositeAlarmName(compositeAlarmName: String) {
    cdkBuilder.compositeAlarmName(compositeAlarmName)
  }

  public fun build(): CompositeAlarmProps = cdkBuilder.build()
}
