@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole

/**
 * A basic lifecycle hook object.
 */
public interface ILifecycleHook : IResource {
  /**
   * The role for the lifecycle hook to execute.
   *
   * Default: - A default role is created if 'notificationTarget' is specified.
   * Otherwise, no role is created.
   */
  public fun role(): IRole

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ILifecycleHook):
        ILifecycleHook = CdkObjectWrappers.wrap(cdkObject) as ILifecycleHook

    internal fun unwrap(wrapped: ILifecycleHook):
        software.amazon.awscdk.services.autoscaling.ILifecycleHook = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ILifecycleHook
  }
}
