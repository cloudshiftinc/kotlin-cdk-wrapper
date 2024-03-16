@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

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
 * Properties for defining a `CfnCompositeAlarm`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * CfnCompositeAlarmProps cfnCompositeAlarmProps = CfnCompositeAlarmProps.builder()
 * .alarmRule("alarmRule")
 * // the properties below are optional
 * .actionsEnabled(false)
 * .actionsSuppressor("actionsSuppressor")
 * .actionsSuppressorExtensionPeriod(123)
 * .actionsSuppressorWaitPeriod(123)
 * .alarmActions(List.of("alarmActions"))
 * .alarmDescription("alarmDescription")
 * .alarmName("alarmName")
 * .insufficientDataActions(List.of("insufficientDataActions"))
 * .okActions(List.of("okActions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html)
 */
public interface CfnCompositeAlarmProps {
  /**
   * Indicates whether actions should be executed during any changes to the alarm state of the
   * composite alarm.
   *
   * The default is TRUE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
   */
  public fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  /**
   * Actions will be suppressed if the suppressor alarm is in the `ALARM` state.
   *
   * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
   * alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressor)
   */
  public fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

  /**
   * The maximum time in seconds that the composite alarm waits after suppressor alarm goes out of
   * the `ALARM` state.
   *
   * After this time, the composite alarm performs its actions.
   *
   *
   * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorextensionperiod)
   */
  public fun actionsSuppressorExtensionPeriod(): Number? =
      unwrap(this).getActionsSuppressorExtensionPeriod()

  /**
   * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go into
   * the `ALARM` state.
   *
   * After this time, the composite alarm performs its actions.
   *
   *
   * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorwaitperiod)
   */
  public fun actionsSuppressorWaitPeriod(): Number? = unwrap(this).getActionsSuppressorWaitPeriod()

  /**
   * The actions to execute when this alarm transitions to the ALARM state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
   */
  public fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  /**
   * The description for the composite alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription)
   */
  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  /**
   * The name for the composite alarm.
   *
   * This name must be unique within your AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname)
   */
  public fun alarmName(): String? = unwrap(this).getAlarmName()

  /**
   * An expression that specifies which other alarms are to be evaluated to determine this composite
   * alarm's state.
   *
   * For each alarm that you reference, you designate a function that specifies whether that alarm
   * needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR
   * and NOT) to combine multiple functions in a single expression. You can use parenthesis to
   * logically group the functions in your expression.
   *
   * You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
   *
   * Functions can include the following:
   *
   * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
   * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
   * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
   * INSUFFICIENT_DATA state.
   * * TRUE always evaluates to TRUE.
   * * FALSE always evaluates to FALSE.
   *
   * TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your alarm
   * actions.
   *
   * For more information about `AlarmRule` syntax, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule)
   */
  public fun alarmRule(): String

  /**
   * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any
   * other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
   */
  public fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions() ?:
      emptyList()

  /**
   * The actions to execute when this alarm transitions to the OK state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
   */
  public fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  /**
   * A builder for [CfnCompositeAlarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state of the composite alarm.
     * The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state of the composite alarm.
     * The default is TRUE.
     */
    public fun actionsEnabled(actionsEnabled: IResolvable)

    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the `ALARM`
     * state.
     * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
     * alarm.
     */
    public fun actionsSuppressor(actionsSuppressor: String)

    /**
     * @param actionsSuppressorExtensionPeriod The maximum time in seconds that the composite alarm
     * waits after suppressor alarm goes out of the `ALARM` state.
     * After this time, the composite alarm performs its actions.
     *
     *
     * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
     */
    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number)

    /**
     * @param actionsSuppressorWaitPeriod The maximum time in seconds that the composite alarm waits
     * for the suppressor alarm to go into the `ALARM` state.
     * After this time, the composite alarm performs its actions.
     *
     *
     * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
     */
    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number)

    /**
     * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
     * from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(alarmActions: List<String>)

    /**
     * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
     * from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmActions(vararg alarmActions: String)

    /**
     * @param alarmDescription The description for the composite alarm.
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * @param alarmName The name for the composite alarm.
     * This name must be unique within your AWS account.
     */
    public fun alarmName(alarmName: String)

    /**
     * @param alarmRule An expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     * For each alarm that you reference, you designate a function that specifies whether that alarm
     * needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR
     * and NOT) to combine multiple functions in a single expression. You can use parenthesis to
     * logically group the functions in your expression.
     *
     * You can use either alarm names or ARNs to reference the other alarms that are to be
     * evaluated.
     *
     * Functions can include the following:
     *
     * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
     * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
     * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * * TRUE always evaluates to TRUE.
     * * FALSE always evaluates to FALSE.
     *
     * TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your
     * alarm actions.
     *
     * For more information about `AlarmRule` syntax, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun alarmRule(alarmRule: String)

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * INSUFFICIENT_DATA state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun insufficientDataActions(insufficientDataActions: List<String>)

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * INSUFFICIENT_DATA state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun insufficientDataActions(vararg insufficientDataActions: String)

    /**
     * @param okActions The actions to execute when this alarm transitions to the OK state from any
     * other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun okActions(okActions: List<String>)

    /**
     * @param okActions The actions to execute when this alarm transitions to the OK state from any
     * other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    public fun okActions(vararg okActions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.builder()

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state of the composite alarm.
     * The default is TRUE.
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param actionsEnabled Indicates whether actions should be executed during any changes to the
     * alarm state of the composite alarm.
     * The default is TRUE.
     */
    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the `ALARM`
     * state.
     * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
     * alarm.
     */
    override fun actionsSuppressor(actionsSuppressor: String) {
      cdkBuilder.actionsSuppressor(actionsSuppressor)
    }

    /**
     * @param actionsSuppressorExtensionPeriod The maximum time in seconds that the composite alarm
     * waits after suppressor alarm goes out of the `ALARM` state.
     * After this time, the composite alarm performs its actions.
     *
     *
     * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
     */
    override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number) {
      cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
    }

    /**
     * @param actionsSuppressorWaitPeriod The maximum time in seconds that the composite alarm waits
     * for the suppressor alarm to go into the `ALARM` state.
     * After this time, the composite alarm performs its actions.
     *
     *
     * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
     */
    override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number) {
      cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
    }

    /**
     * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
     * from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
    }

    /**
     * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
     * from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun alarmActions(vararg alarmActions: String): Unit =
        alarmActions(alarmActions.toList())

    /**
     * @param alarmDescription The description for the composite alarm.
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * @param alarmName The name for the composite alarm.
     * This name must be unique within your AWS account.
     */
    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    /**
     * @param alarmRule An expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     * For each alarm that you reference, you designate a function that specifies whether that alarm
     * needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR
     * and NOT) to combine multiple functions in a single expression. You can use parenthesis to
     * logically group the functions in your expression.
     *
     * You can use either alarm names or ARNs to reference the other alarms that are to be
     * evaluated.
     *
     * Functions can include the following:
     *
     * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
     * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
     * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * * TRUE always evaluates to TRUE.
     * * FALSE always evaluates to FALSE.
     *
     * TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your
     * alarm actions.
     *
     * For more information about `AlarmRule` syntax, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun alarmRule(alarmRule: String) {
      cdkBuilder.alarmRule(alarmRule)
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * INSUFFICIENT_DATA state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
    }

    /**
     * @param insufficientDataActions The actions to execute when this alarm transitions to the
     * INSUFFICIENT_DATA state from any other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
        insufficientDataActions(insufficientDataActions.toList())

    /**
     * @param okActions The actions to execute when this alarm transitions to the OK state from any
     * other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    /**
     * @param okActions The actions to execute when this alarm transitions to the OK state from any
     * other state.
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     */
    override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps,
  ) : CdkObject(cdkObject), CfnCompositeAlarmProps {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the
     * composite alarm.
     *
     * The default is TRUE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
     */
    override fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

    /**
     * Actions will be suppressed if the suppressor alarm is in the `ALARM` state.
     *
     * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
     * alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressor)
     */
    override fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

    /**
     * The maximum time in seconds that the composite alarm waits after suppressor alarm goes out of
     * the `ALARM` state.
     *
     * After this time, the composite alarm performs its actions.
     *
     *
     * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorextensionperiod)
     */
    override fun actionsSuppressorExtensionPeriod(): Number? =
        unwrap(this).getActionsSuppressorExtensionPeriod()

    /**
     * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go
     * into the `ALARM` state.
     *
     * After this time, the composite alarm performs its actions.
     *
     *
     * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorwaitperiod)
     */
    override fun actionsSuppressorWaitPeriod(): Number? =
        unwrap(this).getActionsSuppressorWaitPeriod()

    /**
     * The actions to execute when this alarm transitions to the ALARM state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
     */
    override fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

    /**
     * The description for the composite alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription)
     */
    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    /**
     * The name for the composite alarm.
     *
     * This name must be unique within your AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname)
     */
    override fun alarmName(): String? = unwrap(this).getAlarmName()

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this
     * composite alarm's state.
     *
     * For each alarm that you reference, you designate a function that specifies whether that alarm
     * needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR
     * and NOT) to combine multiple functions in a single expression. You can use parenthesis to
     * logically group the functions in your expression.
     *
     * You can use either alarm names or ARNs to reference the other alarms that are to be
     * evaluated.
     *
     * Functions can include the following:
     *
     * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
     * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
     * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * * TRUE always evaluates to TRUE.
     * * FALSE always evaluates to FALSE.
     *
     * TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your
     * alarm actions.
     *
     * For more information about `AlarmRule` syntax, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule)
     */
    override fun alarmRule(): String = unwrap(this).getAlarmRule()

    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any
     * other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
     */
    override fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions()
        ?: emptyList()

    /**
     * The actions to execute when this alarm transitions to the OK state from any other state.
     *
     * Each action is specified as an Amazon Resource Name (ARN). For more information about
     * creating alarms and the actions that you can specify, see
     * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
     * in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
     */
    override fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCompositeAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps):
        CfnCompositeAlarmProps = CdkObjectWrappers.wrap(cdkObject) as CfnCompositeAlarmProps

    internal fun unwrap(wrapped: CfnCompositeAlarmProps):
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
  }
}
