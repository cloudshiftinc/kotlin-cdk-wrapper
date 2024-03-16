@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String

/**
 * The interface for all task definitions.
 */
public interface ITaskDefinition : IResource {
  /**
   * What launch types this task definition should be compatible with.
   */
  public fun compatibility(): Compatibility

  /**
   * Execution role for this task definition.
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * Return true if the task definition can be run on an EC2 cluster.
   */
  public fun isEc2Compatible(): Boolean

  /**
   * Return true if the task definition can be run on a ECS Anywhere cluster.
   */
  public fun isExternalCompatible(): Boolean

  /**
   * Return true if the task definition can be run on a Fargate cluster.
   */
  public fun isFargateCompatible(): Boolean

  /**
   * The networking mode to use for the containers in the task.
   */
  public fun networkMode(): NetworkMode

  /**
   * ARN of this task definition.
   */
  public fun taskDefinitionArn(): String

  /**
   * The name of the IAM role that grants containers in the task permission to call AWS APIs on your
   * behalf.
   */
  public fun taskRole(): IRole

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinition):
        ITaskDefinition = CdkObjectWrappers.wrap(cdkObject) as ITaskDefinition

    internal fun unwrap(wrapped: ITaskDefinition):
        software.amazon.awscdk.services.ecs.ITaskDefinition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.ITaskDefinition
  }
}
