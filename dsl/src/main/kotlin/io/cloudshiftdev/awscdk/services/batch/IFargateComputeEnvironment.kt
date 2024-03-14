package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IFargateComputeEnvironment : IManagedComputeEnvironment {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IFargateComputeEnvironment,
  ) : IFargateComputeEnvironment {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun enabled(): Boolean = unwrap(this).getEnabled()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun spot(): Boolean? = unwrap(this).getSpot()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

    override fun updateTimeout(): Duration? = unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

    override fun updateToLatestImageVersion(): Boolean? =
        unwrap(this).getUpdateToLatestImageVersion()

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IFargateComputeEnvironment):
        IFargateComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFargateComputeEnvironment):
        software.amazon.awscdk.services.batch.IFargateComputeEnvironment = (wrapped as
        Wrapper).cdkObject
  }
}
