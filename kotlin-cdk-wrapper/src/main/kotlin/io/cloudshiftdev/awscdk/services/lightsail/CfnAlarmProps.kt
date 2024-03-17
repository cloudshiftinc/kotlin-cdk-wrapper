@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAlarm`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnAlarmProps cfnAlarmProps = CfnAlarmProps.builder()
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
public interface CfnAlarmProps {
  /**
   * The name of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-alarmname)
   */
  public fun alarmName(): String

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-comparisonoperator)
   */
  public fun comparisonOperator(): String

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   *
   * *Allowed Values* : `Email` | `SMS`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
   */
  public fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?: emptyList()

  /**
   * The number of data points within the evaluation periods that must be breaching to cause the
   * alarm to go to the `ALARM` state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-datapointstoalarm)
   */
  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * The number of periods over which data is compared to the specified threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-evaluationperiods)
   */
  public fun evaluationPeriods(): Number

  /**
   * The name of the metric associated with the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-metricname)
   */
  public fun metricName(): String

  /**
   * The name of the Lightsail resource that the alarm monitors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-monitoredresourcename)
   */
  public fun monitoredResourceName(): String

  /**
   * A Boolean value indicating whether the alarm is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
   */
  public fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

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
   */
  public fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
      emptyList()

  /**
   * The value against which the specified statistic is compared.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-threshold)
   */
  public fun threshold(): Number

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
   */
  public fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  /**
   * A builder for [CfnAlarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmName The name of the alarm. 
     */
    public fun alarmName(alarmName: String)

    /**
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    public fun comparisonOperator(comparisonOperator: String)

    /**
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both.
     * *Allowed Values* : `Email` | `SMS`
     */
    public fun contactProtocols(contactProtocols: List<String>)

    /**
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both.
     * *Allowed Values* : `Email` | `SMS`
     */
    public fun contactProtocols(vararg contactProtocols: String)

    /**
     * @param datapointsToAlarm The number of data points within the evaluation periods that must be
     * breaching to cause the alarm to go to the `ALARM` state.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * @param metricName The name of the metric associated with the alarm. 
     */
    public fun metricName(metricName: String)

    /**
     * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
     */
    public fun monitoredResourceName(monitoredResourceName: String)

    /**
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
     */
    public fun notificationEnabled(notificationEnabled: Boolean)

    /**
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
     */
    public fun notificationEnabled(notificationEnabled: IResolvable)

    /**
     * @param notificationTriggers The alarm states that trigger a notification.
     *
     * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
     * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack
     * will drift.
     *
     *
     * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
     */
    public fun notificationTriggers(notificationTriggers: List<String>)

    /**
     * @param notificationTriggers The alarm states that trigger a notification.
     *
     * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
     * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack
     * will drift.
     *
     *
     * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
     */
    public fun notificationTriggers(vararg notificationTriggers: String)

    /**
     * @param threshold The value against which the specified statistic is compared. 
     */
    public fun threshold(threshold: Number)

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
    public fun treatMissingData(treatMissingData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnAlarmProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnAlarmProps.builder()

    /**
     * @param alarmName The name of the alarm. 
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both.
     * *Allowed Values* : `Email` | `SMS`
     */
    override fun contactProtocols(contactProtocols: List<String>) {
      cdkBuilder.contactProtocols(contactProtocols)
    }

    /**
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both.
     * *Allowed Values* : `Email` | `SMS`
     */
    override fun contactProtocols(vararg contactProtocols: String): Unit =
        contactProtocols(contactProtocols.toList())

    /**
     * @param datapointsToAlarm The number of data points within the evaluation periods that must be
     * breaching to cause the alarm to go to the `ALARM` state.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param metricName The name of the metric associated with the alarm. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
     */
    override fun monitoredResourceName(monitoredResourceName: String) {
      cdkBuilder.monitoredResourceName(monitoredResourceName)
    }

    /**
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
     */
    override fun notificationEnabled(notificationEnabled: Boolean) {
      cdkBuilder.notificationEnabled(notificationEnabled)
    }

    /**
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled.
     */
    override fun notificationEnabled(notificationEnabled: IResolvable) {
      cdkBuilder.notificationEnabled(notificationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param notificationTriggers The alarm states that trigger a notification.
     *
     * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
     * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack
     * will drift.
     *
     *
     * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
     */
    override fun notificationTriggers(notificationTriggers: List<String>) {
      cdkBuilder.notificationTriggers(notificationTriggers)
    }

    /**
     * @param notificationTriggers The alarm states that trigger a notification.
     *
     * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
     * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack
     * will drift.
     *
     *
     * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
     */
    override fun notificationTriggers(vararg notificationTriggers: String): Unit =
        notificationTriggers(notificationTriggers.toList())

    /**
     * @param threshold The value against which the specified statistic is compared. 
     */
    override fun threshold(threshold: Number) {
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
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnAlarmProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarmProps,
  ) : CdkObject(cdkObject), CfnAlarmProps {
    /**
     * The name of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-alarmname)
     */
    override fun alarmName(): String = unwrap(this).getAlarmName()

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-comparisonoperator)
     */
    override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

    /**
     * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
     *
     * *Allowed Values* : `Email` | `SMS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
     */
    override fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?:
        emptyList()

    /**
     * The number of data points within the evaluation periods that must be breaching to cause the
     * alarm to go to the `ALARM` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-datapointstoalarm)
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-evaluationperiods)
     */
    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    /**
     * The name of the metric associated with the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * The name of the Lightsail resource that the alarm monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-monitoredresourcename)
     */
    override fun monitoredResourceName(): String = unwrap(this).getMonitoredResourceName()

    /**
     * A Boolean value indicating whether the alarm is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
     */
    override fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

    /**
     * The alarm states that trigger a notification.
     *
     *
     * To specify the `OK` and `INSUFFICIENT_DATA` values, you must also specify `ContactProtocols`
     * values. Otherwise, the `OK` and `INSUFFICIENT_DATA` values will not take effect and the stack
     * will drift.
     *
     *
     * *Allowed Values* : `OK` | `ALARM` | `INSUFFICIENT_DATA`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationtriggers)
     */
    override fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
        emptyList()

    /**
     * The value against which the specified statistic is compared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-threshold)
     */
    override fun threshold(): Number = unwrap(this).getThreshold()

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
     */
    override fun treatMissingData(): String? = unwrap(this).getTreatMissingData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarmProps):
        CfnAlarmProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAlarmProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmProps):
        software.amazon.awscdk.services.lightsail.CfnAlarmProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lightsail.CfnAlarmProps
  }
}
