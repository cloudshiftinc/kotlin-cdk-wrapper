package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Resource
import kotlin.String

public abstract class AlarmBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
) : Resource(cdkObject), IAlarm {
  public open fun addAlarmAction(actions: IAlarmAction) {
    unwrap(this).addAlarmAction(actions.let(IAlarmAction::unwrap))
  }

  public open fun addInsufficientDataAction(actions: IAlarmAction) {
    unwrap(this).addInsufficientDataAction(actions.let(IAlarmAction::unwrap))
  }

  public open fun addOkAction(actions: IAlarmAction) {
    unwrap(this).addOkAction(actions.let(IAlarmAction::unwrap))
  }

  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  public override fun alarmName(): String = unwrap(this).getAlarmName()

  public override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
  ) : AlarmBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase): AlarmBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmBase): software.amazon.awscdk.services.cloudwatch.AlarmBase =
        (wrapped as Wrapper).cdkObject
  }
}
