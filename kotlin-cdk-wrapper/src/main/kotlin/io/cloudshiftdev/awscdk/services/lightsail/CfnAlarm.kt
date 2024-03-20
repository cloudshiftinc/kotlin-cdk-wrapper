@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::Alarm` resource specifies an alarm that can be used to monitor a single
 * metric for one of your Lightsail resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
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
public open class CfnAlarm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarm,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAlarmProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnAlarm(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAlarmProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAlarmProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAlarmProps(props)
  )

  /**
   * The name of the alarm.
   */
  public open fun alarmName(): String = unwrap(this).getAlarmName()

  /**
   * The name of the alarm.
   */
  public open fun alarmName(`value`: String) {
    unwrap(this).setAlarmName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the alarm.
   */
  public open fun attrAlarmArn(): String = unwrap(this).getAttrAlarmArn()

  /**
   * The current state of the alarm.
   *
   * An alarm has the following possible states:
   *
   * * `ALARM` - The metric is outside of the defined threshold.
   * * `INSUFFICIENT_DATA` - The alarm has recently started, the metric is not available, or not
   * enough data is available for the metric to determine the alarm state.
   * * `OK` - The metric is within the defined threshold.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   */
  public open fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

  /**
   * The arithmetic operation to use when comparing the specified statistic and threshold.
   */
  public open fun comparisonOperator(`value`: String) {
    unwrap(this).setComparisonOperator(`value`)
  }

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   */
  public open fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?:
      emptyList()

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   */
  public open fun contactProtocols(`value`: List<String>) {
    unwrap(this).setContactProtocols(`value`)
  }

  /**
   * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
   */
  public open fun contactProtocols(vararg `value`: String): Unit =
      contactProtocols(`value`.toList())

  /**
   * The number of data points within the evaluation periods that must be breaching to cause the
   * alarm to go to the `ALARM` state.
   */
  public open fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * The number of data points within the evaluation periods that must be breaching to cause the
   * alarm to go to the `ALARM` state.
   */
  public open fun datapointsToAlarm(`value`: Number) {
    unwrap(this).setDatapointsToAlarm(`value`)
  }

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

  /**
   * The number of periods over which data is compared to the specified threshold.
   */
  public open fun evaluationPeriods(`value`: Number) {
    unwrap(this).setEvaluationPeriods(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * The name of the metric associated with the alarm.
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * The name of the Lightsail resource that the alarm monitors.
   */
  public open fun monitoredResourceName(): String = unwrap(this).getMonitoredResourceName()

  /**
   * The name of the Lightsail resource that the alarm monitors.
   */
  public open fun monitoredResourceName(`value`: String) {
    unwrap(this).setMonitoredResourceName(`value`)
  }

  /**
   * A Boolean value indicating whether the alarm is enabled.
   */
  public open fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

  /**
   * A Boolean value indicating whether the alarm is enabled.
   */
  public open fun notificationEnabled(`value`: Boolean) {
    unwrap(this).setNotificationEnabled(`value`)
  }

  /**
   * A Boolean value indicating whether the alarm is enabled.
   */
  public open fun notificationEnabled(`value`: IResolvable) {
    unwrap(this).setNotificationEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The alarm states that trigger a notification.
   */
  public open fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
      emptyList()

  /**
   * The alarm states that trigger a notification.
   */
  public open fun notificationTriggers(`value`: List<String>) {
    unwrap(this).setNotificationTriggers(`value`)
  }

  /**
   * The alarm states that trigger a notification.
   */
  public open fun notificationTriggers(vararg `value`: String): Unit =
      notificationTriggers(`value`.toList())

  /**
   * The value against which the specified statistic is compared.
   */
  public open fun threshold(): Number = unwrap(this).getThreshold()

  /**
   * The value against which the specified statistic is compared.
   */
  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  /**
   * Specifies how the alarm handles missing data points.
   */
  public open fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  /**
   * Specifies how the alarm handles missing data points.
   */
  public open fun treatMissingData(`value`: String) {
    unwrap(this).setTreatMissingData(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnAlarm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-alarmname)
     * @param alarmName The name of the alarm. 
     */
    public fun alarmName(alarmName: String)

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-comparisonoperator)
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    public fun comparisonOperator(comparisonOperator: String)

    /**
     * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
     *
     * *Allowed Values* : `Email` | `SMS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both. 
     */
    public fun contactProtocols(contactProtocols: List<String>)

    /**
     * The contact protocols for the alarm, such as `Email` , `SMS` (text messaging), or both.
     *
     * *Allowed Values* : `Email` | `SMS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-contactprotocols)
     * @param contactProtocols The contact protocols for the alarm, such as `Email` , `SMS` (text
     * messaging), or both. 
     */
    public fun contactProtocols(vararg contactProtocols: String)

    /**
     * The number of data points within the evaluation periods that must be breaching to cause the
     * alarm to go to the `ALARM` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-datapointstoalarm)
     * @param datapointsToAlarm The number of data points within the evaluation periods that must be
     * breaching to cause the alarm to go to the `ALARM` state. 
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-evaluationperiods)
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * The name of the metric associated with the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    public fun metricName(metricName: String)

    /**
     * The name of the Lightsail resource that the alarm monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-monitoredresourcename)
     * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
     */
    public fun monitoredResourceName(monitoredResourceName: String)

    /**
     * A Boolean value indicating whether the alarm is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
     */
    public fun notificationEnabled(notificationEnabled: Boolean)

    /**
     * A Boolean value indicating whether the alarm is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
     */
    public fun notificationEnabled(notificationEnabled: IResolvable)

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
     * @param notificationTriggers The alarm states that trigger a notification. 
     */
    public fun notificationTriggers(notificationTriggers: List<String>)

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
     * @param notificationTriggers The alarm states that trigger a notification. 
     */
    public fun notificationTriggers(vararg notificationTriggers: String)

    /**
     * The value against which the specified statistic is compared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-threshold)
     * @param threshold The value against which the specified statistic is compared. 
     */
    public fun threshold(threshold: Number)

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
    public fun treatMissingData(treatMissingData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnAlarm.Builder =
        software.amazon.awscdk.services.lightsail.CfnAlarm.Builder.create(scope, id)

    /**
     * The name of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-alarmname)
     * @param alarmName The name of the alarm. 
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * The arithmetic operation to use when comparing the specified statistic and threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-comparisonoperator)
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     * statistic and threshold. 
     */
    override fun comparisonOperator(comparisonOperator: String) {
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
    override fun contactProtocols(contactProtocols: List<String>) {
      cdkBuilder.contactProtocols(contactProtocols)
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
    override fun contactProtocols(vararg contactProtocols: String): Unit =
        contactProtocols(contactProtocols.toList())

    /**
     * The number of data points within the evaluation periods that must be breaching to cause the
     * alarm to go to the `ALARM` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-datapointstoalarm)
     * @param datapointsToAlarm The number of data points within the evaluation periods that must be
     * breaching to cause the alarm to go to the `ALARM` state. 
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-evaluationperiods)
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     * threshold. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * The name of the metric associated with the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-metricname)
     * @param metricName The name of the metric associated with the alarm. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * The name of the Lightsail resource that the alarm monitors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-monitoredresourcename)
     * @param monitoredResourceName The name of the Lightsail resource that the alarm monitors. 
     */
    override fun monitoredResourceName(monitoredResourceName: String) {
      cdkBuilder.monitoredResourceName(monitoredResourceName)
    }

    /**
     * A Boolean value indicating whether the alarm is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
     */
    override fun notificationEnabled(notificationEnabled: Boolean) {
      cdkBuilder.notificationEnabled(notificationEnabled)
    }

    /**
     * A Boolean value indicating whether the alarm is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-notificationenabled)
     * @param notificationEnabled A Boolean value indicating whether the alarm is enabled. 
     */
    override fun notificationEnabled(notificationEnabled: IResolvable) {
      cdkBuilder.notificationEnabled(notificationEnabled.let(IResolvable::unwrap))
    }

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
     * @param notificationTriggers The alarm states that trigger a notification. 
     */
    override fun notificationTriggers(notificationTriggers: List<String>) {
      cdkBuilder.notificationTriggers(notificationTriggers)
    }

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
     * @param notificationTriggers The alarm states that trigger a notification. 
     */
    override fun notificationTriggers(vararg notificationTriggers: String): Unit =
        notificationTriggers(notificationTriggers.toList())

    /**
     * The value against which the specified statistic is compared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-alarm.html#cfn-lightsail-alarm-threshold)
     * @param threshold The value against which the specified statistic is compared. 
     */
    override fun threshold(threshold: Number) {
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
    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnAlarm = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnAlarm.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarm): CfnAlarm =
        CfnAlarm(cdkObject)

    internal fun unwrap(wrapped: CfnAlarm): software.amazon.awscdk.services.lightsail.CfnAlarm =
        wrapped.cdkObject
  }
}
