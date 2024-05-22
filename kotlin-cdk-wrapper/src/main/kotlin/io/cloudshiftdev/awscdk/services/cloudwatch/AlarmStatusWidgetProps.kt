@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for an Alarm Status Widget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * dashboard.addWidgets(
 * AlarmStatusWidget.Builder.create()
 * .alarms(List.of(errorAlarm))
 * .build());
 * ```
 */
public interface AlarmStatusWidgetProps {
  /**
   * CloudWatch Alarms to show in widget.
   */
  public fun alarms(): List<IAlarm>

  /**
   * Height of the widget.
   *
   * Default: 3
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * Specifies how to sort the alarms in the widget.
   *
   * Default: - alphabetical order
   */
  public fun sortBy(): AlarmStatusWidgetSortBy? =
      unwrap(this).getSortBy()?.let(AlarmStatusWidgetSortBy::wrap)

  /**
   * Use this field to filter the list of alarms displayed in the widget to only those alarms
   * currently in the specified states.
   *
   * You can specify one or more alarm states in the value for this field.
   * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
   *
   * If you omit this field or specify an empty array, all the alarms specifed in alarms are
   * displayed.
   *
   * Default: -  all the alarms specified in alarms are displayed.
   */
  public fun states(): List<AlarmState> = unwrap(this).getStates()?.map(AlarmState::wrap) ?:
      emptyList()

  /**
   * The title of the widget.
   *
   * Default: 'Alarm Status'
   */
  public fun title(): String? = unwrap(this).getTitle()

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [AlarmStatusWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param sortBy Specifies how to sort the alarms in the widget.
     */
    public fun sortBy(sortBy: AlarmStatusWidgetSortBy)

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states.
     * You can specify one or more alarm states in the value for this field.
     * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    public fun states(states: List<AlarmState>)

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states.
     * You can specify one or more alarm states in the value for this field.
     * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    public fun states(vararg states: AlarmState)

    /**
     * @param title The title of the widget.
     */
    public fun title(title: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps.builder()

    /**
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm.Companion::unwrap))
    }

    /**
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param sortBy Specifies how to sort the alarms in the widget.
     */
    override fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
      cdkBuilder.sortBy(sortBy.let(AlarmStatusWidgetSortBy.Companion::unwrap))
    }

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states.
     * You can specify one or more alarm states in the value for this field.
     * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    override fun states(states: List<AlarmState>) {
      cdkBuilder.states(states.map(AlarmState.Companion::unwrap))
    }

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states.
     * You can specify one or more alarm states in the value for this field.
     * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    override fun states(vararg states: AlarmState): Unit = states(states.toList())

    /**
     * @param title The title of the widget.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps,
  ) : CdkObject(cdkObject), AlarmStatusWidgetProps {
    /**
     * CloudWatch Alarms to show in widget.
     */
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms().map(IAlarm::wrap)

    /**
     * Height of the widget.
     *
     * Default: 3
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Specifies how to sort the alarms in the widget.
     *
     * Default: - alphabetical order
     */
    override fun sortBy(): AlarmStatusWidgetSortBy? =
        unwrap(this).getSortBy()?.let(AlarmStatusWidgetSortBy::wrap)

    /**
     * Use this field to filter the list of alarms displayed in the widget to only those alarms
     * currently in the specified states.
     *
     * You can specify one or more alarm states in the value for this field.
     * The alarm states that you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     *
     * Default: -  all the alarms specified in alarms are displayed.
     */
    override fun states(): List<AlarmState> = unwrap(this).getStates()?.map(AlarmState::wrap) ?:
        emptyList()

    /**
     * The title of the widget.
     *
     * Default: 'Alarm Status'
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmStatusWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps):
        AlarmStatusWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? AlarmStatusWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmStatusWidgetProps):
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps
  }
}
