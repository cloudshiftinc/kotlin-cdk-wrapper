@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.collections.List

/**
 *
 */
public interface IServerDeploymentGroup : IResource {
  /**
   *
   */
  public fun application(): IServerApplication

  /**
   *
   */
  public fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  /**
   *
   */
  public fun deploymentConfig(): IServerDeploymentConfig

  /**
   *
   */
  public fun deploymentGroupArn(): String

  /**
   *
   */
  public fun deploymentGroupName(): String

  /**
   *
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup):
        IServerDeploymentGroup = CdkObjectWrappers.wrap(cdkObject) as IServerDeploymentGroup

    internal fun unwrap(wrapped: IServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
  }
}
