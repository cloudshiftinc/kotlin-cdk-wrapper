@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class Ec2InstanceType(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType,
) {
  EC2(software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType.EC2),
  SSM_MANAGED_NODE(software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType.SSM_MANAGED_NODE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType):
        Ec2InstanceType = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType.EC2 ->
          Ec2InstanceType.EC2
      software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType.SSM_MANAGED_NODE ->
          Ec2InstanceType.SSM_MANAGED_NODE
    }

    internal fun unwrap(wrapped: Ec2InstanceType):
        software.amazon.awscdk.services.codepipeline.actions.Ec2InstanceType = wrapped.cdkObject
  }
}
