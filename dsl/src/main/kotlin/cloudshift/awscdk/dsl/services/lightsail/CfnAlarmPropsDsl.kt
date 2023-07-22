@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnAlarmProps

@CdkDslMarker
public class CfnAlarmPropsDsl {
  private val cdkBuilder: CfnAlarmProps.Builder = CfnAlarmProps.builder()

  private val _contactProtocols: MutableList<String> = mutableListOf()

  private val _notificationTriggers: MutableList<String> = mutableListOf()

  /**
   * @param alarmName The name of the alarm. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * @param comparisonOperator The arithmetic operation to use when comparing the specified
   * statistic and threshold. 
   */
  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
   * messaging), or both.
   * *Allowed Values* : `Email` | `SMS`
   */
  public fun contactProtocols(vararg contactProtocols: String) {
    _contactProtocols.addAll(listOf(*contactProtocols))
  }

  /**
   * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
   * messaging), or both.
   * *Allowed Values* : `Email` | `SMS`
   */
  public fun contactProtocols(contactProtocols: Collection<String>) {
    _contactProtocols.addAll(contactProtocols)
  }

  /**
   * @param datapointsToAlarm The number of data points within the evaluation periods that must be
   * breaching to cause the alarm to go to the `ALARM` state.
   */
  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  /**
   * @param evaluationPeriods The number of periods over which data is compared to the specified
   * threshold. 
   */
  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  /**
   * @param metricName The name of the metric associated with the alarm. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
   */
  public fun monitoredResourceName(monitoredResourceName: String) {
    cdkBuilder.monitoredResourceName(monitoredResourceName)
  }

  /**
   * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
   */
  public fun notificationEnabled(notificationEnabled: Boolean) {
    cdkBuilder.notificationEnabled(notificationEnabled)
  }

  /**
   * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
   */
  public fun notificationEnabled(notificationEnabled: IResolvable) {
    cdkBuilder.notificationEnabled(notificationEnabled)
  }

  /**
   * @param notificationTriggers The alarm states that trigger a notification.
   *
   * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
   * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack will
   * drift.
   *
   *
   * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
   */
  public fun notificationTriggers(vararg notificationTriggers: String) {
    _notificationTriggers.addAll(listOf(*notificationTriggers))
  }

  /**
   * @param notificationTriggers The alarm states that trigger a notification.
   *
   * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
   * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack will
   * drift.
   *
   *
   * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
   */
  public fun notificationTriggers(notificationTriggers: Collection<String>) {
    _notificationTriggers.addAll(notificationTriggers)
  }

  /**
   * @param threshold The value against which the specified statistic is compared. 
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * @param treatMissingData Specifies how the alarm handles missing data points.
   * An alarm can treat missing data in the following ways:
   *
   * * `breaching` - Assumes the missing data is not within the threshold. Missing data counts
   * towards the number of times that the metric is not within the threshold.
   * * `notBreaching` - Assumes the missing data is within the threshold. Missing data does not
   * count towards the number of times that the metric is not within the threshold.
   * * `ignore` - Ignores the missing data. Maintains the current alarm state.
   * * `missing` - Missing data is treated as missing.
   */
  public fun treatMissingData(treatMissingData: String) {
    cdkBuilder.treatMissingData(treatMissingData)
  }

  public fun build(): CfnAlarmProps {
    if(_contactProtocols.isNotEmpty()) cdkBuilder.contactProtocols(_contactProtocols)
    if(_notificationTriggers.isNotEmpty()) cdkBuilder.notificationTriggers(_notificationTriggers)
    return cdkBuilder.build()
  }
}
