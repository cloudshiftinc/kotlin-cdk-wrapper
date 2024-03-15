@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class AlarmStatusWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget,
) : ConcreteWidget(cdkObject) {
  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget.Builder.create()

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
        software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget = wrapped.cdkObject
  }
}
