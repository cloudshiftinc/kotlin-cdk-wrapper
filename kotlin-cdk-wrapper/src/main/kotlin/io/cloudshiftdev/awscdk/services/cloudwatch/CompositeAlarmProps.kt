@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CompositeAlarmProps {
  public fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

  public fun actionsSuppressor(): IAlarm? = unwrap(this).getActionsSuppressor()?.let(IAlarm::wrap)

  public fun actionsSuppressorExtensionPeriod(): Duration? =
      unwrap(this).getActionsSuppressorExtensionPeriod()?.let(Duration::wrap)

  public fun actionsSuppressorWaitPeriod(): Duration? =
      unwrap(this).getActionsSuppressorWaitPeriod()?.let(Duration::wrap)

  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public fun alarmRule(): IAlarmRule

  public fun compositeAlarmName(): String? = unwrap(this).getCompositeAlarmName()

  @CdkDslMarker
  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsSuppressor(actionsSuppressor: IAlarm)

    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration)

    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmRule(alarmRule: IAlarmRule)

    public fun compositeAlarmName(compositeAlarmName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.builder()

    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    override fun actionsSuppressor(actionsSuppressor: IAlarm) {
      cdkBuilder.actionsSuppressor(actionsSuppressor.let(IAlarm::unwrap))
    }

    override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
      cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod.let(Duration::unwrap))
    }

    override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
      cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod.let(Duration::unwrap))
    }

    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    override fun alarmRule(alarmRule: IAlarmRule) {
      cdkBuilder.alarmRule(alarmRule.let(IAlarmRule::unwrap))
    }

    override fun compositeAlarmName(compositeAlarmName: String) {
      cdkBuilder.compositeAlarmName(compositeAlarmName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps,
  ) : CdkObject(cdkObject), CompositeAlarmProps {
    override fun actionsEnabled(): Boolean? = unwrap(this).getActionsEnabled()

    override fun actionsSuppressor(): IAlarm? =
        unwrap(this).getActionsSuppressor()?.let(IAlarm::wrap)

    override fun actionsSuppressorExtensionPeriod(): Duration? =
        unwrap(this).getActionsSuppressorExtensionPeriod()?.let(Duration::wrap)

    override fun actionsSuppressorWaitPeriod(): Duration? =
        unwrap(this).getActionsSuppressorWaitPeriod()?.let(Duration::wrap)

    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    override fun alarmRule(): IAlarmRule = unwrap(this).getAlarmRule().let(IAlarmRule::wrap)

    override fun compositeAlarmName(): String? = unwrap(this).getCompositeAlarmName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CompositeAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps):
        CompositeAlarmProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CompositeAlarmProps):
        software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
  }
}
