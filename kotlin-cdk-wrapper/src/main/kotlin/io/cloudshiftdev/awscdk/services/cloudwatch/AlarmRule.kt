@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

public open class AlarmRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmRule,
) : CdkObject(cdkObject) {
  public companion object {
    public fun allOf(operands: IAlarmRule): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.allOf(operands.let(IAlarmRule::unwrap)).let(IAlarmRule::wrap)

    public fun anyOf(operands: IAlarmRule): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.anyOf(operands.let(IAlarmRule::unwrap)).let(IAlarmRule::wrap)

    public fun fromAlarm(alarm: IAlarm, alarmState: AlarmState): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.fromAlarm(alarm.let(IAlarm::unwrap),
        alarmState.let(AlarmState::unwrap)).let(IAlarmRule::wrap)

    public fun fromBoolean(`value`: Boolean): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.fromBoolean(`value`).let(IAlarmRule::wrap)

    public fun fromString(alarmRule: String): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.fromString(alarmRule).let(IAlarmRule::wrap)

    public fun not(operand: IAlarmRule): IAlarmRule =
        software.amazon.awscdk.services.cloudwatch.AlarmRule.not(operand.let(IAlarmRule::unwrap)).let(IAlarmRule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmRule): AlarmRule =
        AlarmRule(cdkObject)

    internal fun unwrap(wrapped: AlarmRule): software.amazon.awscdk.services.cloudwatch.AlarmRule =
        wrapped.cdkObject
  }
}
