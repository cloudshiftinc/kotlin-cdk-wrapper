@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AlarmStatusWidgetProps {
  public fun alarms(): List<IAlarm>

  public fun height(): Number? = unwrap(this).getHeight()

  public fun sortBy(): AlarmStatusWidgetSortBy? =
      unwrap(this).getSortBy()?.let(AlarmStatusWidgetSortBy::wrap)

  public fun states(): List<AlarmState> = unwrap(this).getStates()?.map(AlarmState::wrap) ?:
      emptyList()

  public fun title(): String? = unwrap(this).getTitle()

  public fun width(): Number? = unwrap(this).getWidth()

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun height(height: Number)

    public fun sortBy(sortBy: AlarmStatusWidgetSortBy)

    public fun states(states: List<AlarmState>)

    public fun states(vararg states: AlarmState)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps.builder()

    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
      cdkBuilder.sortBy(sortBy.let(AlarmStatusWidgetSortBy::unwrap))
    }

    override fun states(states: List<AlarmState>) {
      cdkBuilder.states(states.map(AlarmState::unwrap))
    }

    override fun states(vararg states: AlarmState): Unit = states(states.toList())

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps,
  ) : CdkObject(cdkObject), AlarmStatusWidgetProps {
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms().map(IAlarm::wrap)

    override fun height(): Number? = unwrap(this).getHeight()

    override fun sortBy(): AlarmStatusWidgetSortBy? =
        unwrap(this).getSortBy()?.let(AlarmStatusWidgetSortBy::wrap)

    override fun states(): List<AlarmState> = unwrap(this).getStates()?.map(AlarmState::wrap) ?:
        emptyList()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmStatusWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps):
        AlarmStatusWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmStatusWidgetProps):
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps
  }
}
