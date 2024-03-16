@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for an ECS deployment group.
 */
public interface IEcsDeploymentGroup : IResource {
  /**
   * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
   */
  public fun application(): IEcsApplication

  /**
   * The Deployment Configuration this Group uses.
   */
  public fun deploymentConfig(): IEcsDeploymentConfig

  /**
   * The ARN of this Deployment Group.
   */
  public fun deploymentGroupArn(): String

  /**
   * The physical name of the CodeDeploy Deployment Group.
   */
  public fun deploymentGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup):
        IEcsDeploymentGroup = CdkObjectWrappers.wrap(cdkObject) as IEcsDeploymentGroup

    internal fun unwrap(wrapped: IEcsDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup
  }
}
