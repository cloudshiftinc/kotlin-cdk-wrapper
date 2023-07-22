@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.constructs.Construct

@CdkDslMarker
public class CfnCompositeAlarmDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCompositeAlarm.Builder = CfnCompositeAlarm.Builder.create(scope, id)

  private val _alarmActions: MutableList<String> = mutableListOf()

  private val _insufficientDataActions: MutableList<String> = mutableListOf()

  private val _okActions: MutableList<String> = mutableListOf()

  /**
   * Indicates whether actions should be executed during any changes to the alarm state of the
   * composite alarm.
   *
   * The default is TRUE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
   * @param actionsEnabled Indicates whether actions should be executed during any changes to the
   * alarm state of the composite alarm. 
   */
  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * Indicates whether actions should be executed during any changes to the alarm state of the
   * composite alarm.
   *
   * The default is TRUE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
   * @param actionsEnabled Indicates whether actions should be executed during any changes to the
   * alarm state of the composite alarm. 
   */
  public fun actionsEnabled(actionsEnabled: IResolvable) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  /**
   * Actions will be suppressed if the suppressor alarm is in the `ALARM` state.
   *
   * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
   * alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressor)
   * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the `ALARM`
   * state. 
   */
  public fun actionsSuppressor(actionsSuppressor: String) {
    cdkBuilder.actionsSuppressor(actionsSuppressor)
  }

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
   * @param actionsSuppressorExtensionPeriod The maximum time in seconds that the composite alarm
   * waits after suppressor alarm goes out of the `ALARM` state. 
   */
  public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number) {
    cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
  }

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
   * @param actionsSuppressorWaitPeriod The maximum time in seconds that the composite alarm waits
   * for the suppressor alarm to go into the `ALARM` state. 
   */
  public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number) {
    cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
  }

  /**
   * The actions to execute when this alarm transitions to the ALARM state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
   * @param alarmActions The actions to execute when this alarm transitions to the ALARM state from
   * any other state. 
   */
  public fun alarmActions(vararg alarmActions: String) {
    _alarmActions.addAll(listOf(*alarmActions))
  }

  /**
   * The actions to execute when this alarm transitions to the ALARM state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
   * @param alarmActions The actions to execute when this alarm transitions to the ALARM state from
   * any other state. 
   */
  public fun alarmActions(alarmActions: Collection<String>) {
    _alarmActions.addAll(alarmActions)
  }

  /**
   * The description for the composite alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription)
   * @param alarmDescription The description for the composite alarm. 
   */
  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  /**
   * The name for the composite alarm.
   *
   * This name must be unique within your AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname)
   * @param alarmName The name for the composite alarm. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

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
   * @param alarmRule An expression that specifies which other alarms are to be evaluated to
   * determine this composite alarm's state. 
   */
  public fun alarmRule(alarmRule: String) {
    cdkBuilder.alarmRule(alarmRule)
  }

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
   * @param insufficientDataActions The actions to execute when this alarm transitions to the
   * INSUFFICIENT_DATA state from any other state. 
   */
  public fun insufficientDataActions(vararg insufficientDataActions: String) {
    _insufficientDataActions.addAll(listOf(*insufficientDataActions))
  }

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
   * @param insufficientDataActions The actions to execute when this alarm transitions to the
   * INSUFFICIENT_DATA state from any other state. 
   */
  public fun insufficientDataActions(insufficientDataActions: Collection<String>) {
    _insufficientDataActions.addAll(insufficientDataActions)
  }

  /**
   * The actions to execute when this alarm transitions to the OK state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
   * @param okActions The actions to execute when this alarm transitions to the OK state from any
   * other state. 
   */
  public fun okActions(vararg okActions: String) {
    _okActions.addAll(listOf(*okActions))
  }

  /**
   * The actions to execute when this alarm transitions to the OK state from any other state.
   *
   * Each action is specified as an Amazon Resource Name (ARN). For more information about creating
   * alarms and the actions that you can specify, see
   * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
   * in the *Amazon CloudWatch API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
   * @param okActions The actions to execute when this alarm transitions to the OK state from any
   * other state. 
   */
  public fun okActions(okActions: Collection<String>) {
    _okActions.addAll(okActions)
  }

  public fun build(): CfnCompositeAlarm {
    if(_alarmActions.isNotEmpty()) cdkBuilder.alarmActions(_alarmActions)
    if(_insufficientDataActions.isNotEmpty())
        cdkBuilder.insufficientDataActions(_insufficientDataActions)
    if(_okActions.isNotEmpty()) cdkBuilder.okActions(_okActions)
    return cdkBuilder.build()
  }
}
