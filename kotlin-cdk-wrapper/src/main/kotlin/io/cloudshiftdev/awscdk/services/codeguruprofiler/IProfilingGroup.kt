@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * IResource represents a Profiling Group.
 */
public interface IProfilingGroup : IResource {
  /**
   * Grant access to publish profiling information to the Profiling Group to the given identity.
   *
   * This will grant the following permissions:
   *
   * * codeguru-profiler:ConfigureAgent
   * * codeguru-profiler:PostAgentProfile
   *
   * @param grantee Principal to grant publish rights to. 
   */
  public fun grantPublish(grantee: IGrantable): Grant

  /**
   * Grant access to read profiling information from the Profiling Group to the given identity.
   *
   * This will grant the following permissions:
   *
   * * codeguru-profiler:GetProfile
   * * codeguru-profiler:DescribeProfilingGroup
   *
   * @param grantee Principal to grant read rights to. 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * The ARN of the profiling group.
   */
  public fun profilingGroupArn(): String

  /**
   * The name of the profiling group.
   */
  public fun profilingGroupName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup,
  ) : CdkObject(cdkObject),
      IProfilingGroup {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

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

    /**
     * Grant access to publish profiling information to the Profiling Group to the given identity.
     *
     * This will grant the following permissions:
     *
     * * codeguru-profiler:ConfigureAgent
     * * codeguru-profiler:PostAgentProfile
     *
     * @param grantee Principal to grant publish rights to. 
     */
    override fun grantPublish(grantee: IGrantable): Grant =
        unwrap(this).grantPublish(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant access to read profiling information from the Profiling Group to the given identity.
     *
     * This will grant the following permissions:
     *
     * * codeguru-profiler:GetProfile
     * * codeguru-profiler:DescribeProfilingGroup
     *
     * @param grantee Principal to grant read rights to. 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of the profiling group.
     */
    override fun profilingGroupArn(): String = unwrap(this).getProfilingGroupArn()

    /**
     * The name of the profiling group.
     */
    override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup):
        IProfilingGroup = CdkObjectWrappers.wrap(cdkObject) as? IProfilingGroup ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProfilingGroup):
        software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup
  }
}
