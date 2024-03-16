@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number

/**
 * Represents an UnmanagedComputeEnvironment.
 *
 * Batch will not provision instances on your behalf
 * in this ComputeEvironment.
 */
public interface IUnmanagedComputeEnvironment : IComputeEnvironment {
  /**
   * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
   * `Queue`s that use `FairshareSchedulingPolicy`s.
   *
   * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
   * that is, the `FairshareSchedulingPolicy` is ignored.
   */
  public fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment):
        IUnmanagedComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as
        IUnmanagedComputeEnvironment

    internal fun unwrap(wrapped: IUnmanagedComputeEnvironment):
        software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment
  }
}
