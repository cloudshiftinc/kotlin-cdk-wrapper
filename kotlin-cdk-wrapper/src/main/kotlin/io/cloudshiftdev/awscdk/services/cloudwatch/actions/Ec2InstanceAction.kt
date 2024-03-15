@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

public enum class Ec2InstanceAction(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction,
) {
  STOP(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.STOP),
  TERMINATE(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.TERMINATE),
  RECOVER(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.RECOVER),
  REBOOT(software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.REBOOT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction):
        Ec2InstanceAction = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.STOP ->
          Ec2InstanceAction.STOP
      software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.TERMINATE ->
          Ec2InstanceAction.TERMINATE
      software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.RECOVER ->
          Ec2InstanceAction.RECOVER
      software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction.REBOOT ->
          Ec2InstanceAction.REBOOT
    }

    internal fun unwrap(wrapped: Ec2InstanceAction):
        software.amazon.awscdk.services.cloudwatch.actions.Ec2InstanceAction = wrapped.cdkObject
  }
}
