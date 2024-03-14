package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface IFargateTaskDefinition : ITaskDefinition {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.IFargateTaskDefinition,
  ) : CdkObject(cdkObject), IFargateTaskDefinition {
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
     * What launch types this task definition should be compatible with.
     */
    override fun compatibility(): Compatibility =
        unwrap(this).getCompatibility().let(Compatibility::wrap)

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
     * Execution role for this task definition.
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * Return true if the task definition can be run on an EC2 cluster.
     */
    override fun isEc2Compatible(): Boolean = unwrap(this).getIsEc2Compatible()

    /**
     * Return true if the task definition can be run on a ECS Anywhere cluster.
     */
    override fun isExternalCompatible(): Boolean = unwrap(this).getIsExternalCompatible()

    /**
     * Return true if the task definition can be run on a Fargate cluster.
     */
    override fun isFargateCompatible(): Boolean = unwrap(this).getIsFargateCompatible()

    /**
     * The networking mode to use for the containers in the task.
     */
    override fun networkMode(): NetworkMode = unwrap(this).getNetworkMode().let(NetworkMode::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * ARN of this task definition.
     */
    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     */
    override fun taskRole(): IRole = unwrap(this).getTaskRole().let(IRole::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IFargateTaskDefinition):
        IFargateTaskDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFargateTaskDefinition):
        software.amazon.awscdk.services.ecs.IFargateTaskDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IFargateTaskDefinition
  }
}
