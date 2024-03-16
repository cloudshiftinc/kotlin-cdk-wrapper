@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for a Lambda deployment groups.
 */
public interface ILambdaDeploymentGroup : IResource {
  /**
   * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
   */
  public fun application(): ILambdaApplication

  /**
   * The Deployment Configuration this Group uses.
   */
  public fun deploymentConfig(): ILambdaDeploymentConfig

  /**
   * The ARN of this Deployment Group.
   */
  public fun deploymentGroupArn(): String

  /**
   * The physical name of the CodeDeploy Deployment Group.
   */
  public fun deploymentGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup):
        ILambdaDeploymentGroup = CdkObjectWrappers.wrap(cdkObject) as ILambdaDeploymentGroup

    internal fun unwrap(wrapped: ILambdaDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup
  }
}
