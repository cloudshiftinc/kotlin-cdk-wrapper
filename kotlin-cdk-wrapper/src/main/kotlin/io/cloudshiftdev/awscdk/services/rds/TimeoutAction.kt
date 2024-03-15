@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class TimeoutAction(
  private val cdkObject: software.amazon.awscdk.services.rds.TimeoutAction,
) {
  FORCE_APPLY_CAPACITY_CHANGE(software.amazon.awscdk.services.rds.TimeoutAction.FORCE_APPLY_CAPACITY_CHANGE),
  ROLLBACK_CAPACITY_CHANGE(software.amazon.awscdk.services.rds.TimeoutAction.ROLLBACK_CAPACITY_CHANGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.TimeoutAction): TimeoutAction =
        when (cdkObject) {
      software.amazon.awscdk.services.rds.TimeoutAction.FORCE_APPLY_CAPACITY_CHANGE ->
          TimeoutAction.FORCE_APPLY_CAPACITY_CHANGE
      software.amazon.awscdk.services.rds.TimeoutAction.ROLLBACK_CAPACITY_CHANGE ->
          TimeoutAction.ROLLBACK_CAPACITY_CHANGE
    }

    internal fun unwrap(wrapped: TimeoutAction): software.amazon.awscdk.services.rds.TimeoutAction =
        wrapped.cdkObject
  }
}
