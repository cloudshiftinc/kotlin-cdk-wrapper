@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class AlarmBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
  ) : AlarmBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase): AlarmBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmBase): software.amazon.awscdk.services.cloudwatch.AlarmBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmBase
  }
}
