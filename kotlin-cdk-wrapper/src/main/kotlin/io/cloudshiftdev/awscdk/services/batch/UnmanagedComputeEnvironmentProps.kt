@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Represents an UnmanagedComputeEnvironment.
 *
 * Batch will not provision instances on your behalf
 * in this ComputeEvironment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * UnmanagedComputeEnvironmentProps unmanagedComputeEnvironmentProps =
 * UnmanagedComputeEnvironmentProps.builder()
 * .computeEnvironmentName("computeEnvironmentName")
 * .enabled(false)
 * .serviceRole(role)
 * .unmanagedvCpus(123)
 * .build();
 * ```
 */
public interface UnmanagedComputeEnvironmentProps : ComputeEnvironmentProps {
  /**
   * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
   * `Queue`s that use `FairshareSchedulingPolicy`s.
   *
   * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
   * that is, the `FairshareSchedulingPolicy` is ignored.
   *
   * Default: 0
   */
  public fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()

  /**
   * A builder for [UnmanagedComputeEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeEnvironmentName The name of the ComputeEnvironment.
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue.
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
    public fun enabled(enabled: Boolean)

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs.
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * @param unmanagedvCpus The vCPUs this Compute Environment provides. Used only by the scheduler
     * to schedule jobs in `Queue`s that use `FairshareSchedulingPolicy`s.
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     */
    public fun unmanagedvCpus(unmanagedvCpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps.builder()

    /**
     * @param computeEnvironmentName The name of the ComputeEnvironment.
     */
    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue.
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
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param unmanagedvCpus The vCPUs this Compute Environment provides. Used only by the scheduler
     * to schedule jobs in `Queue`s that use `FairshareSchedulingPolicy`s.
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     */
    override fun unmanagedvCpus(unmanagedvCpus: Number) {
      cdkBuilder.unmanagedvCpus(unmanagedvCpus)
    }

    public fun build(): software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps,
  ) : CdkObject(cdkObject), UnmanagedComputeEnvironmentProps {
    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     */
    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

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
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    /**
     * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
     * `Queue`s that use `FairshareSchedulingPolicy`s.
     *
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     *
     * Default: 0
     */
    override fun unmanagedvCpus(): Number? = unwrap(this).getUnmanagedvCpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UnmanagedComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps):
        UnmanagedComputeEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        UnmanagedComputeEnvironmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UnmanagedComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps
  }
}
