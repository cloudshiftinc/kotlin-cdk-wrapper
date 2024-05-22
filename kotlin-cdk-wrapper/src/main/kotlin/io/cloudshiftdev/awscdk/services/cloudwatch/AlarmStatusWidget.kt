@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A dashboard widget that displays alarms in a grid view.
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
public open class AlarmStatusWidget(
  cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget,
) : ConcreteWidget(cdkObject) {
  public constructor(props: AlarmStatusWidgetProps) :
      this(software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget(props.let(AlarmStatusWidgetProps.Companion::unwrap))
  )

  public constructor(props: AlarmStatusWidgetProps.Builder.() -> Unit) :
      this(AlarmStatusWidgetProps(props)
  )

  /**
   * Place the widget at a given position.
   *
   * @param x 
   * @param y 
   */
  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.AlarmStatusWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * Height of the widget.
     *
     * Default: 3
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Specifies how to sort the alarms in the widget.
     *
     * Default: - alphabetical order
     *
     * @param sortBy Specifies how to sort the alarms in the widget. 
     */
    public fun sortBy(sortBy: AlarmStatusWidgetSortBy)

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
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states. 
     */
    public fun states(states: List<AlarmState>)

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
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states. 
     */
    public fun states(vararg states: AlarmState)

    /**
     * The title of the widget.
     *
     * Default: 'Alarm Status'
     *
     * @param title The title of the widget. 
     */
    public fun title(title: String)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder.create()

    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm.Companion::unwrap))
    }

    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget. 
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * Height of the widget.
     *
     * Default: 3
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Specifies how to sort the alarms in the widget.
     *
     * Default: - alphabetical order
     *
     * @param sortBy Specifies how to sort the alarms in the widget. 
     */
    override fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
      cdkBuilder.sortBy(sortBy.let(AlarmStatusWidgetSortBy.Companion::unwrap))
    }

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
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states. 
     */
    override fun states(states: List<AlarmState>) {
      cdkBuilder.states(states.map(AlarmState.Companion::unwrap))
    }

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
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     * those alarms currently in the specified states. 
     */
    override fun states(vararg states: AlarmState): Unit = states(states.toList())

    /**
     * The title of the widget.
     *
     * Default: 'Alarm Status'
     *
     * @param title The title of the widget. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmStatusWidget {
      val builderImpl = BuilderImpl()
      return AlarmStatusWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget):
        AlarmStatusWidget = AlarmStatusWidget(cdkObject)

    internal fun unwrap(wrapped: AlarmStatusWidget):
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget
  }
}
