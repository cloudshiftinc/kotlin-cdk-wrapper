package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCompositeAlarm
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm,
) : CfnResource(cdkObject), IInspectable {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the
     * composite alarm.
     */
    public open fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the
     * composite alarm.
     */
    public open fun actionsEnabled(`value`: Boolean) {
        unwrap(this).setActionsEnabled(`value`)
    }

    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the
     * composite alarm.
     */
    public open fun actionsEnabled(`value`: IResolvable) {
        unwrap(this).setActionsEnabled(`value`.let(IResolvable::unwrap))
    }

    /** Actions will be suppressed if the suppressor alarm is in the `ALARM` state. */
    public open fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

    /** Actions will be suppressed if the suppressor alarm is in the `ALARM` state. */
    public open fun actionsSuppressor(`value`: String) {
        unwrap(this).setActionsSuppressor(`value`)
    }

    /**
     * The maximum time in seconds that the composite alarm waits after suppressor alarm goes out of
     * the `ALARM` state.
     */
    public open fun actionsSuppressorExtensionPeriod(): Number? =
        unwrap(this).getActionsSuppressorExtensionPeriod()

    /**
     * The maximum time in seconds that the composite alarm waits after suppressor alarm goes out of
     * the `ALARM` state.
     */
    public open fun actionsSuppressorExtensionPeriod(`value`: Number) {
        unwrap(this).setActionsSuppressorExtensionPeriod(`value`)
    }

    /**
     * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go
     * into the `ALARM` state.
     */
    public open fun actionsSuppressorWaitPeriod(): Number? =
        unwrap(this).getActionsSuppressorWaitPeriod()

    /**
     * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go
     * into the `ALARM` state.
     */
    public open fun actionsSuppressorWaitPeriod(`value`: Number) {
        unwrap(this).setActionsSuppressorWaitPeriod(`value`)
    }

    /**
     * The actions to execute when this alarm transitions to the ALARM state from any other state.
     */
    public open fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

    /**
     * The actions to execute when this alarm transitions to the ALARM state from any other state.
     */
    public open fun alarmActions(`value`: List<String>) {
        unwrap(this).setAlarmActions(`value`)
    }

    /**
     * The actions to execute when this alarm transitions to the ALARM state from any other state.
     */
    public open fun alarmActions(vararg `value`: String): Unit = alarmActions(`value`.toList())

    /** The description for the composite alarm. */
    public open fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    /** The description for the composite alarm. */
    public open fun alarmDescription(`value`: String) {
        unwrap(this).setAlarmDescription(`value`)
    }

    /** The name for the composite alarm. */
    public open fun alarmName(): String? = unwrap(this).getAlarmName()

    /** The name for the composite alarm. */
    public open fun alarmName(`value`: String) {
        unwrap(this).setAlarmName(`value`)
    }

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this
     * composite alarm's state.
     */
    public open fun alarmRule(): String = unwrap(this).getAlarmRule()

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this
     * composite alarm's state.
     */
    public open fun alarmRule(`value`: String) {
        unwrap(this).setAlarmRule(`value`)
    }

    /**
     * The ARN of the composite alarm, such as
     * `arn:aws:cloudwatch:us-west-2:123456789012:alarm/CompositeAlarmName` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any
     * other state.
     */
    public open fun insufficientDataActions(): List<String> =
        unwrap(this).getInsufficientDataActions() ?: emptyList()

    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any
     * other state.
     */
    public open fun insufficientDataActions(`value`: List<String>) {
        unwrap(this).setInsufficientDataActions(`value`)
    }

    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any
     * other state.
     */
    public open fun insufficientDataActions(vararg `value`: String): Unit =
        insufficientDataActions(`value`.toList())

    /** The actions to execute when this alarm transitions to the OK state from any other state. */
    public open fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

    /** The actions to execute when this alarm transitions to the OK state from any other state. */
    public open fun okActions(`value`: List<String>) {
        unwrap(this).setOkActions(`value`)
    }

    /** The actions to execute when this alarm transitions to the OK state from any other state. */
    public open fun okActions(vararg `value`: String): Unit = okActions(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnCompositeAlarm]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Indicates whether actions should be executed during any changes to the alarm state of the
         * composite alarm.
         *
         * The default is TRUE.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
         *
         * @param actionsEnabled Indicates whether actions should be executed during any changes to
         *   the alarm state of the composite alarm.
         */
        public fun actionsEnabled(actionsEnabled: Boolean)

        /**
         * Indicates whether actions should be executed during any changes to the alarm state of the
         * composite alarm.
         *
         * The default is TRUE.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
         *
         * @param actionsEnabled Indicates whether actions should be executed during any changes to
         *   the alarm state of the composite alarm.
         */
        public fun actionsEnabled(actionsEnabled: IResolvable)

        /**
         * Actions will be suppressed if the suppressor alarm is in the `ALARM` state.
         *
         * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
         * alarm.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressor)
         *
         * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the
         *   `ALARM` state.
         */
        public fun actionsSuppressor(actionsSuppressor: String)

        /**
         * The maximum time in seconds that the composite alarm waits after suppressor alarm goes
         * out of the `ALARM` state.
         *
         * After this time, the composite alarm performs its actions.
         *
         * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorextensionperiod)
         *
         * @param actionsSuppressorExtensionPeriod The maximum time in seconds that the composite
         *   alarm waits after suppressor alarm goes out of the `ALARM` state.
         */
        public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number)

        /**
         * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go
         * into the `ALARM` state.
         *
         * After this time, the composite alarm performs its actions.
         *
         * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorwaitperiod)
         *
         * @param actionsSuppressorWaitPeriod The maximum time in seconds that the composite alarm
         *   waits for the suppressor alarm to go into the `ALARM` state.
         */
        public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number)

        /**
         * The actions to execute when this alarm transitions to the ALARM state from any other
         * state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
         *
         * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
         *   from any other state.
         */
        public fun alarmActions(alarmActions: List<String>)

        /**
         * The actions to execute when this alarm transitions to the ALARM state from any other
         * state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
         *
         * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
         *   from any other state.
         */
        public fun alarmActions(vararg alarmActions: String)

        /**
         * The description for the composite alarm.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription)
         *
         * @param alarmDescription The description for the composite alarm.
         */
        public fun alarmDescription(alarmDescription: String)

        /**
         * The name for the composite alarm.
         *
         * This name must be unique within your AWS account.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname)
         *
         * @param alarmName The name for the composite alarm.
         */
        public fun alarmName(alarmName: String)

        /**
         * An expression that specifies which other alarms are to be evaluated to determine this
         * composite alarm's state.
         *
         * For each alarm that you reference, you designate a function that specifies whether that
         * alarm needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use
         * operators (AND, OR and NOT) to combine multiple functions in a single expression. You can
         * use parenthesis to logically group the functions in your expression.
         *
         * You can use either alarm names or ARNs to reference the other alarms that are to be
         * evaluated.
         *
         * Functions can include the following:
         * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
         * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
         * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
         *   INSUFFICIENT_DATA state.
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
         *
         * @param alarmRule An expression that specifies which other alarms are to be evaluated to
         *   determine this composite alarm's state.
         */
        public fun alarmRule(alarmRule: String)

        /**
         * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from
         * any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
         *
         * @param insufficientDataActions The actions to execute when this alarm transitions to the
         *   INSUFFICIENT_DATA state from any other state.
         */
        public fun insufficientDataActions(insufficientDataActions: List<String>)

        /**
         * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from
         * any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
         *
         * @param insufficientDataActions The actions to execute when this alarm transitions to the
         *   INSUFFICIENT_DATA state from any other state.
         */
        public fun insufficientDataActions(vararg insufficientDataActions: String)

        /**
         * The actions to execute when this alarm transitions to the OK state from any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
         *
         * @param okActions The actions to execute when this alarm transitions to the OK state from
         *   any other state.
         */
        public fun okActions(okActions: List<String>)

        /**
         * The actions to execute when this alarm transitions to the OK state from any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
         *
         * @param okActions The actions to execute when this alarm transitions to the OK state from
         *   any other state.
         */
        public fun okActions(vararg okActions: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm.Builder =
            software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm.Builder.create(scope, id)

        /**
         * Indicates whether actions should be executed during any changes to the alarm state of the
         * composite alarm.
         *
         * The default is TRUE.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
         *
         * @param actionsEnabled Indicates whether actions should be executed during any changes to
         *   the alarm state of the composite alarm.
         */
        override fun actionsEnabled(actionsEnabled: Boolean) {
            cdkBuilder.actionsEnabled(actionsEnabled)
        }

        /**
         * Indicates whether actions should be executed during any changes to the alarm state of the
         * composite alarm.
         *
         * The default is TRUE.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled)
         *
         * @param actionsEnabled Indicates whether actions should be executed during any changes to
         *   the alarm state of the composite alarm.
         */
        override fun actionsEnabled(actionsEnabled: IResolvable) {
            cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
        }

        /**
         * Actions will be suppressed if the suppressor alarm is in the `ALARM` state.
         *
         * `ActionsSuppressor` can be an AlarmName or an Amazon Resource Name (ARN) from an existing
         * alarm.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressor)
         *
         * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the
         *   `ALARM` state.
         */
        override fun actionsSuppressor(actionsSuppressor: String) {
            cdkBuilder.actionsSuppressor(actionsSuppressor)
        }

        /**
         * The maximum time in seconds that the composite alarm waits after suppressor alarm goes
         * out of the `ALARM` state.
         *
         * After this time, the composite alarm performs its actions.
         *
         * `ExtensionPeriod` is required only when `ActionsSuppressor` is specified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorextensionperiod)
         *
         * @param actionsSuppressorExtensionPeriod The maximum time in seconds that the composite
         *   alarm waits after suppressor alarm goes out of the `ALARM` state.
         */
        override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number) {
            cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
        }

        /**
         * The maximum time in seconds that the composite alarm waits for the suppressor alarm to go
         * into the `ALARM` state.
         *
         * After this time, the composite alarm performs its actions.
         *
         * `WaitPeriod` is required only when `ActionsSuppressor` is specified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionssuppressorwaitperiod)
         *
         * @param actionsSuppressorWaitPeriod The maximum time in seconds that the composite alarm
         *   waits for the suppressor alarm to go into the `ALARM` state.
         */
        override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number) {
            cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
        }

        /**
         * The actions to execute when this alarm transitions to the ALARM state from any other
         * state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
         *
         * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
         *   from any other state.
         */
        override fun alarmActions(alarmActions: List<String>) {
            cdkBuilder.alarmActions(alarmActions)
        }

        /**
         * The actions to execute when this alarm transitions to the ALARM state from any other
         * state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions)
         *
         * @param alarmActions The actions to execute when this alarm transitions to the ALARM state
         *   from any other state.
         */
        override fun alarmActions(vararg alarmActions: String): Unit =
            alarmActions(alarmActions.toList())

        /**
         * The description for the composite alarm.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription)
         *
         * @param alarmDescription The description for the composite alarm.
         */
        override fun alarmDescription(alarmDescription: String) {
            cdkBuilder.alarmDescription(alarmDescription)
        }

        /**
         * The name for the composite alarm.
         *
         * This name must be unique within your AWS account.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname)
         *
         * @param alarmName The name for the composite alarm.
         */
        override fun alarmName(alarmName: String) {
            cdkBuilder.alarmName(alarmName)
        }

        /**
         * An expression that specifies which other alarms are to be evaluated to determine this
         * composite alarm's state.
         *
         * For each alarm that you reference, you designate a function that specifies whether that
         * alarm needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use
         * operators (AND, OR and NOT) to combine multiple functions in a single expression. You can
         * use parenthesis to logically group the functions in your expression.
         *
         * You can use either alarm names or ARNs to reference the other alarms that are to be
         * evaluated.
         *
         * Functions can include the following:
         * * ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.
         * * OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.
         * * INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in
         *   INSUFFICIENT_DATA state.
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
         *
         * @param alarmRule An expression that specifies which other alarms are to be evaluated to
         *   determine this composite alarm's state.
         */
        override fun alarmRule(alarmRule: String) {
            cdkBuilder.alarmRule(alarmRule)
        }

        /**
         * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from
         * any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
         *
         * @param insufficientDataActions The actions to execute when this alarm transitions to the
         *   INSUFFICIENT_DATA state from any other state.
         */
        override fun insufficientDataActions(insufficientDataActions: List<String>) {
            cdkBuilder.insufficientDataActions(insufficientDataActions)
        }

        /**
         * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from
         * any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions)
         *
         * @param insufficientDataActions The actions to execute when this alarm transitions to the
         *   INSUFFICIENT_DATA state from any other state.
         */
        override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
            insufficientDataActions(insufficientDataActions.toList())

        /**
         * The actions to execute when this alarm transitions to the OK state from any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
         *
         * @param okActions The actions to execute when this alarm transitions to the OK state from
         *   any other state.
         */
        override fun okActions(okActions: List<String>) {
            cdkBuilder.okActions(okActions)
        }

        /**
         * The actions to execute when this alarm transitions to the OK state from any other state.
         *
         * Each action is specified as an Amazon Resource Name (ARN). For more information about
         * creating alarms and the actions that you can specify, see
         * [PutCompositeAlarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutCompositeAlarm.html)
         * in the *Amazon CloudWatch API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions)
         *
         * @param okActions The actions to execute when this alarm transitions to the OK state from
         *   any other state.
         */
        override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

        public fun build(): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCompositeAlarm {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCompositeAlarm(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
        ): CfnCompositeAlarm = CfnCompositeAlarm(cdkObject)

        internal fun unwrap(
            wrapped: CfnCompositeAlarm
        ): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm = wrapped.cdkObject
    }
}
