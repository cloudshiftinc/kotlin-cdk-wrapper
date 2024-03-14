package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CompositeAlarm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CompositeAlarm,
) : AlarmBase(cdkObject) {
  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  public override fun alarmName(): String = unwrap(this).getAlarmName()

  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsSuppressor(actionsSuppressor: IAlarm)

    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration)

    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmRule(alarmRule: IAlarmRule)

    public fun compositeAlarmName(compositeAlarmName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CompositeAlarm.Builder =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.CompositeAlarm =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromCompositeAlarmArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      compositeAlarmArn: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.fromCompositeAlarmArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, compositeAlarmArn).let(IAlarm::wrap)

    public open fun fromCompositeAlarmName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      compositeAlarmName: String,
    ): IAlarm =
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm.fromCompositeAlarmName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        software.amazon.awscdk.services.cloudwatch.CompositeAlarm = wrapped.cdkObject
  }
}
