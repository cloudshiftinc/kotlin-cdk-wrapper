@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String

/**
 * Represents a ComputeEnvironment.
 */
public interface IComputeEnvironment : IResource {
  /**
   * The ARN of this compute environment.
   */
  public fun computeEnvironmentArn(): String

  /**
   * The name of the ComputeEnvironment.
   */
  public fun computeEnvironmentName(): String

  /**
   * Whether or not this ComputeEnvironment can accept jobs from a Queue.
   *
   * Enabled ComputeEnvironments can accept jobs from a Queue and
   * can scale instances up or down.
   * Disabled ComputeEnvironments cannot accept jobs from a Queue or
   * scale instances up or down.
   *
   * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs,
   * Jobs in the `STARTED` or `RUNNING` states will not
   * be interrupted. As jobs complete, the ComputeEnvironment will scale instances down to
   * `minvCpus`.
   *
   * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
   */
  public fun enabled(): Boolean

  /**
   * The role Batch uses to perform actions on your behalf in your account, such as provision
   * instances to run your jobs.
   *
   * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
   */
  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IComputeEnvironment):
        IComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as IComputeEnvironment

    internal fun unwrap(wrapped: IComputeEnvironment):
        software.amazon.awscdk.services.batch.IComputeEnvironment = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.IComputeEnvironment
  }
}
