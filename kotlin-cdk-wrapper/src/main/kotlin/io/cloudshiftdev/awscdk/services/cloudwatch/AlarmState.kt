@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class AlarmState(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmState,
) {
  ALARM(software.amazon.awscdk.services.cloudwatch.AlarmState.ALARM),
  OK(software.amazon.awscdk.services.cloudwatch.AlarmState.OK),
  INSUFFICIENT_DATA(software.amazon.awscdk.services.cloudwatch.AlarmState.INSUFFICIENT_DATA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmState): AlarmState
        = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.AlarmState.ALARM -> AlarmState.ALARM
      software.amazon.awscdk.services.cloudwatch.AlarmState.OK -> AlarmState.OK
      software.amazon.awscdk.services.cloudwatch.AlarmState.INSUFFICIENT_DATA ->
          AlarmState.INSUFFICIENT_DATA
    }

    internal fun unwrap(wrapped: AlarmState): software.amazon.awscdk.services.cloudwatch.AlarmState
        = wrapped.cdkObject
  }
}
