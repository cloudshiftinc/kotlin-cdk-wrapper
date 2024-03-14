package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String

public interface IUnmanagedComputeEnvironment : IComputeEnvironment {
  /**
   * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
   * `Queue`s that use `FairshareSchedulingPolicy`s.
   *
   * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
   * that is, the `FairshareSchedulingPolicy` is ignored.
   */
  public fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment,
  ) : CdkObject(cdkObject), IUnmanagedComputeEnvironment {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ARN of this compute environment.
     */
    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    /**
     * The name of the ComputeEnvironment.
     */
    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

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
    override fun enabled(): Boolean = unwrap(this).getEnabled()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The vCPUs this Compute Environment provides. Used only by the scheduler to schedule jobs in
     * `Queue`s that use `FairshareSchedulingPolicy`s.
     *
     * **If this parameter is not provided on a fairshare queue, no capacity is reserved**;
     * that is, the `FairshareSchedulingPolicy` is ignored.
     */
    override fun unmanagedvCpUs(): Number? = unwrap(this).getUnmanagedvCPUs()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment):
        IUnmanagedComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUnmanagedComputeEnvironment):
        software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IUnmanagedComputeEnvironment
  }
}
