@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Composite Alarm based on Alarm Rule.
 *
 * Example:
 *
 * ```
 * Alarm alarm1;
 * Alarm alarm2;
 * Alarm alarm3;
 * Alarm alarm4;
 * IAlarmRule alarmRule = AlarmRule.anyOf(AlarmRule.allOf(AlarmRule.anyOf(alarm1,
 * AlarmRule.fromAlarm(alarm2, AlarmState.OK), alarm3), AlarmRule.not(AlarmRule.fromAlarm(alarm4,
 * AlarmState.INSUFFICIENT_DATA))), AlarmRule.fromBoolean(false));
 * CompositeAlarm.Builder.create(this, "MyAwesomeCompositeAlarm")
 * .alarmRule(alarmRule)
 * .build();
 * ```
 */
public open class CompositeAlarm(
  cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarm,
) : AlarmBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CompositeAlarmProps,
  ) :
      this(software.amazon.awscdk.services.cloudwatch.CompositeAlarm(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CompositeAlarmProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CompositeAlarmProps.Builder.() -> Unit,
  ) : this(scope, id, CompositeAlarmProps(props)
  )

  /**
   * ARN of this alarm.
   */
  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  /**
   * Name of this alarm.
   */
  public override fun alarmName(): String = unwrap(this).getAlarmName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CompositeAlarm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     *
     * @param actionsEnabled Whether the actions for this alarm are enabled. 
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * Actions will be suppressed if the suppressor alarm is in the ALARM state.
     *
     * Default: - alarm will not be suppressed.
     *
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM
     * state. 
     */
    public fun actionsSuppressor(actionsSuppressor: IAlarm)

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
    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration)

    /**
     * The maximum duration that the composite alarm waits for the suppressor alarm to go into the
     * ALARM state.
     *
     * After this time, the composite alarm performs its actions.
     *
     * Default: - 1 minute wait period will be set.
     *
     * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for
     * the suppressor alarm to go into the ALARM state. 
     */
    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration)

    /**
     * Description for the alarm.
     *
     * Default: - No description.
     *
     * @param alarmDescription Description for the alarm. 
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * Expression that specifies which other alarms are to be evaluated to determine this composite
     * alarm's state.
     *
     * @param alarmRule Expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     */
    public fun alarmRule(alarmRule: IAlarmRule)

    /**
     * Name of the alarm.
     *
     * Default: - Automatically generated name.
     *
     * @param compositeAlarmName Name of the alarm. 
     */
    public fun compositeAlarmName(compositeAlarmName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CompositeAlarm.Builder =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.Builder.create(scope, id)

    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     *
     * @param actionsEnabled Whether the actions for this alarm are enabled. 
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
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
    override fun actionsSuppressor(actionsSuppressor: IAlarm) {
      cdkBuilder.actionsSuppressor(actionsSuppressor.let(IAlarm.Companion::unwrap))
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
    override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
      cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum duration that the composite alarm waits for the suppressor alarm to go into the
     * ALARM state.
     *
     * After this time, the composite alarm performs its actions.
     *
     * Default: - 1 minute wait period will be set.
     *
     * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for
     * the suppressor alarm to go into the ALARM state. 
     */
    override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
      cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * Description for the alarm.
     *
     * Default: - No description.
     *
     * @param alarmDescription Description for the alarm. 
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * Expression that specifies which other alarms are to be evaluated to determine this composite
     * alarm's state.
     *
     * @param alarmRule Expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     */
    override fun alarmRule(alarmRule: IAlarmRule) {
      cdkBuilder.alarmRule(alarmRule.let(IAlarmRule.Companion::unwrap))
    }

    /**
     * Name of the alarm.
     *
     * Default: - Automatically generated name.
     *
     * @param compositeAlarmName Name of the alarm. 
     */
    override fun compositeAlarmName(compositeAlarmName: String) {
      cdkBuilder.compositeAlarmName(compositeAlarmName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CompositeAlarm =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.PROPERTY_INJECTION_ID

    public fun fromCompositeAlarmArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      compositeAlarmArn: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.fromCompositeAlarmArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, compositeAlarmArn).let(IAlarm::wrap)

    public fun fromCompositeAlarmName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      compositeAlarmName: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.fromCompositeAlarmName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, compositeAlarmName).let(IAlarm::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CompositeAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CompositeAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarm):
        CompositeAlarm = CompositeAlarm(cdkObject)

    internal fun unwrap(wrapped: CompositeAlarm):
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm
  }
}
