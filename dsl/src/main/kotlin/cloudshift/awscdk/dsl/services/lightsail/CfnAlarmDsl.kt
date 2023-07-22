@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnAlarm
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Alarm` resource specifies an alarm that can be used to monitor a single
 * metric for one of your Lightsail resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnAlarm cfnAlarm = CfnAlarm.Builder.create(this, "MyCfnAlarm")
 * .alarmName("alarmName")
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * .metricName("metricName")
 * .monitoredResourceName("monitoredResourceName")
 * .threshold(123)
 * // the properties below are optional
 * .contactProtocols(List.of("contactProtocols"))
 * .datapointsToAlarm(123)
 * .notificationEnabled(false)
 * .notificationTriggers(List.of("notificationTriggers"))
 * .treatMissingData("treatMissingData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html)
 */
@CdkDslMarker
public class CfnAlarmDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlarm.Builder = CfnAlarm.Builder.create(scope, id)

  private val _contactProtocols: MutableList<String> = mutableListOf()

  private val _notificationTriggers: MutableList<String> = mutableListOf()

  /**
   * The name of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-alarmname)
   * @param alarmName The name of the alarm. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-comparisonoperator)
   * @param comparisonOperator The arithmetic operation to use when comparing the specified
   * statistic and threshold. 
   */
  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   *
   * *Allowed Values* : `Email` | `SMS`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
   * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
   * messaging), or both. 
   */
  public fun contactProtocols(vararg contactProtocols: String) {
    _contactProtocols.addAll(listOf(*contactProtocols))
  }

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   *
   * *Allowed Values* : `Email` | `SMS`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
   * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
   * messaging), or both. 
   */
  public fun contactProtocols(contactProtocols: Collection<String>) {
    _contactProtocols.addAll(contactProtocols)
  }

  /**
   * The number of data points within the evaluation periods that must be breaching to cause the
   * alarm to go to the `ALARM` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-datapointstoalarm)
   * @param datapointsToAlarm The number of data points within the evaluation periods that must be
   * breaching to cause the alarm to go to the `ALARM` state. 
   */
  public fun datapointsToAlarm(datapointsToAlarm: Number) {
    cdkBuilder.datapointsToAlarm(datapointsToAlarm)
  }

  /**
   * The number of periods over which data is compared to the specified threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-evaluationperiods)
   * @param evaluationPeriods The number of periods over which data is compared to the specified
   * threshold. 
   */
  public fun evaluationPeriods(evaluationPeriods: Number) {
    cdkBuilder.evaluationPeriods(evaluationPeriods)
  }

  /**
   * The name of the metric associated with the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-metricname)
   * @param metricName The name of the metric associated with the alarm. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The name of the Lightsail resource that the alarm monitors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-monitoredresourcename)
   * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
   */
  public fun monitoredResourceName(monitoredResourceName: String) {
    cdkBuilder.monitoredResourceName(monitoredResourceName)
  }

  /**
   * A Boolean value indicating whether the alarm is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
   * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
   */
  public fun notificationEnabled(notificationEnabled: Boolean) {
    cdkBuilder.notificationEnabled(notificationEnabled)
  }

  /**
   * A Boolean value indicating whether the alarm is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
   * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
   */
  public fun notificationEnabled(notificationEnabled: IResolvable) {
    cdkBuilder.notificationEnabled(notificationEnabled)
  }

  /**
   * The alarm states that trigger a notification.
   *
   *
   * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
   * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack will
   * drift.
   *
   *
   * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationtriggers)
   * @param notificationTriggers The alarm states that trigger a notification. 
   */
  public fun notificationTriggers(vararg notificationTriggers: String) {
    _notificationTriggers.addAll(listOf(*notificationTriggers))
  }

  /**
   * The alarm states that trigger a notification.
   *
   *
   * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
   * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack will
   * drift.
   *
   *
   * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationtriggers)
   * @param notificationTriggers The alarm states that trigger a notification. 
   */
  public fun notificationTriggers(notificationTriggers: Collection<String>) {
    _notificationTriggers.addAll(notificationTriggers)
  }

  /**
   * The value against which the specified statistic is compared.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-threshold)
   * @param threshold The value against which the specified statistic is compared. 
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * Specifies how the alarm handles missing data points.
   *
   * An alarm can treat missing data in the following ways:
   *
   * * `breaching` - Assumes the missing data is not within the threshold. Missing data counts
   * towards the number of times that the metric is not within the threshold.
   * * `notBreaching` - Assumes the missing data is within the threshold. Missing data does not
   * count towards the number of times that the metric is not within the threshold.
   * * `ignore` - Ignores the missing data. Maintains the current alarm state.
   * * `missing` - Missing data is treated as missing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-treatmissingdata)
   * @param treatMissingData Specifies how the alarm handles missing data points. 
   */
  public fun treatMissingData(treatMissingData: String) {
    cdkBuilder.treatMissingData(treatMissingData)
  }

  public fun build(): CfnAlarm {
    if(_contactProtocols.isNotEmpty()) cdkBuilder.contactProtocols(_contactProtocols)
    if(_notificationTriggers.isNotEmpty()) cdkBuilder.notificationTriggers(_notificationTriggers)
    return cdkBuilder.build()
  }
}
