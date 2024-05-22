@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a Composite Alarm.
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
public interface CompositeAlarmProps {
  /**
   * Whether the actions for this alarm are enabled.
   *
   * Default: true
   */
  public fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

  /**
   * Actions will be suppressed if the suppressor alarm is in the ALARM state.
   *
   * Default: - alarm will not be suppressed.
   */
  public fun actionsSuppressor(): IAlarm? = unwrap(this).getActionsSuppressor()?.let(IAlarm::wrap)

  /**
   * The maximum duration that the composite alarm waits after suppressor alarm goes out of the
   * ALARM state.
   *
   * After this time, the composite alarm performs its actions.
   *
   * Default: - 1 minute extension period will be set.
   */
  public fun actionsSuppressorExtensionPeriod(): Duration? =
      unwrap(this).getActionsSuppressorExtensionPeriod()?.let(Duration::wrap)

  /**
   * The maximum duration that the composite alarm waits for the suppressor alarm to go into the
   * ALARM state.
   *
   * After this time, the composite alarm performs its actions.
   *
   * Default: - 1 minute wait period will be set.
   */
  public fun actionsSuppressorWaitPeriod(): Duration? =
      unwrap(this).getActionsSuppressorWaitPeriod()?.let(Duration::wrap)

  /**
   * Description for the alarm.
   *
   * Default: - No description.
   */
  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  /**
   * Expression that specifies which other alarms are to be evaluated to determine this composite
   * alarm's state.
   */
  public fun alarmRule(): IAlarmRule

  /**
   * Name of the alarm.
   *
   * Default: - Automatically generated name.
   */
  public fun compositeAlarmName(): String? = unwrap(this).getCompositeAlarmName()

  /**
   * A builder for [CompositeAlarmProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionsEnabled Whether the actions for this alarm are enabled.
     */
    public fun actionsEnabled(actionsEnabled: Boolean)

    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM
     * state.
     */
    public fun actionsSuppressor(actionsSuppressor: IAlarm)

    /**
     * @param actionsSuppressorExtensionPeriod The maximum duration that the composite alarm waits
     * after suppressor alarm goes out of the ALARM state.
     * After this time, the composite alarm performs its actions.
     */
    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration)

    /**
     * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for
     * the suppressor alarm to go into the ALARM state.
     * After this time, the composite alarm performs its actions.
     */
    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration)

    /**
     * @param alarmDescription Description for the alarm.
     */
    public fun alarmDescription(alarmDescription: String)

    /**
     * @param alarmRule Expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     */
    public fun alarmRule(alarmRule: IAlarmRule)

    /**
     * @param compositeAlarmName Name of the alarm.
     */
    public fun compositeAlarmName(compositeAlarmName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.builder()

    /**
     * @param actionsEnabled Whether the actions for this alarm are enabled.
     */
    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    /**
     * @param actionsSuppressor Actions will be suppressed if the suppressor alarm is in the ALARM
     * state.
     */
    override fun actionsSuppressor(actionsSuppressor: IAlarm) {
      cdkBuilder.actionsSuppressor(actionsSuppressor.let(IAlarm.Companion::unwrap))
    }

    /**
     * @param actionsSuppressorExtensionPeriod The maximum duration that the composite alarm waits
     * after suppressor alarm goes out of the ALARM state.
     * After this time, the composite alarm performs its actions.
     */
    override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
      cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param actionsSuppressorWaitPeriod The maximum duration that the composite alarm waits for
     * the suppressor alarm to go into the ALARM state.
     * After this time, the composite alarm performs its actions.
     */
    override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
      cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param alarmDescription Description for the alarm.
     */
    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    /**
     * @param alarmRule Expression that specifies which other alarms are to be evaluated to
     * determine this composite alarm's state. 
     */
    override fun alarmRule(alarmRule: IAlarmRule) {
      cdkBuilder.alarmRule(alarmRule.let(IAlarmRule.Companion::unwrap))
    }

    /**
     * @param compositeAlarmName Name of the alarm.
     */
    override fun compositeAlarmName(compositeAlarmName: String) {
      cdkBuilder.compositeAlarmName(compositeAlarmName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps,
  ) : CdkObject(cdkObject), CompositeAlarmProps {
    /**
     * Whether the actions for this alarm are enabled.
     *
     * Default: true
     */
    override fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

    /**
     * Actions will be suppressed if the suppressor alarm is in the ALARM state.
     *
     * Default: - alarm will not be suppressed.
     */
    override fun actionsSuppressor(): IAlarm? =
        unwrap(this).getActionsSuppressor()?.let(IAlarm::wrap)

    /**
     * The maximum duration that the composite alarm waits after suppressor alarm goes out of the
     * ALARM state.
     *
     * After this time, the composite alarm performs its actions.
     *
     * Default: - 1 minute extension period will be set.
     */
    override fun actionsSuppressorExtensionPeriod(): Duration? =
        unwrap(this).getActionsSuppressorExtensionPeriod()?.let(Duration::wrap)

    /**
     * The maximum duration that the composite alarm waits for the suppressor alarm to go into the
     * ALARM state.
     *
     * After this time, the composite alarm performs its actions.
     *
     * Default: - 1 minute wait period will be set.
     */
    override fun actionsSuppressorWaitPeriod(): Duration? =
        unwrap(this).getActionsSuppressorWaitPeriod()?.let(Duration::wrap)

    /**
     * Description for the alarm.
     *
     * Default: - No description.
     */
    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    /**
     * Expression that specifies which other alarms are to be evaluated to determine this composite
     * alarm's state.
     */
    override fun alarmRule(): IAlarmRule = unwrap(this).getAlarmRule().let(IAlarmRule::wrap)

    /**
     * Name of the alarm.
     *
     * Default: - Automatically generated name.
     */
    override fun compositeAlarmName(): String? = unwrap(this).getCompositeAlarmName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CompositeAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps):
        CompositeAlarmProps = CdkObjectWrappers.wrap(cdkObject) as? CompositeAlarmProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CompositeAlarmProps):
        software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
  }
}
