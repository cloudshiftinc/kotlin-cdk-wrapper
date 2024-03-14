package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IManagedEc2EcsComputeEnvironment : IManagedComputeEnvironment {
  public fun addInstanceClass(arg0: InstanceClass)

  public fun addInstanceType(arg0: InstanceType)

  public fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  public fun images(): List<EcsMachineImage> = unwrap(this).getImages()?.map(EcsMachineImage::wrap)
      ?: emptyList()

  public fun instanceClasses(): List<InstanceClass>

  public fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

  public fun instanceTypes(): List<InstanceType>

  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

  public fun placementGroup(): IPlacementGroup? =
      unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

  public fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  public fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

  public fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment,
  ) : IManagedEc2EcsComputeEnvironment {
    override fun addInstanceClass(arg0: InstanceClass) {
      unwrap(this).addInstanceClass(arg0.let(InstanceClass::unwrap))
    }

    override fun addInstanceType(arg0: InstanceType) {
      unwrap(this).addInstanceType(arg0.let(InstanceType::unwrap))
    }

    override fun allocationStrategy(): AllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun enabled(): Boolean = unwrap(this).getEnabled()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun images(): List<EcsMachineImage> =
        unwrap(this).getImages()?.map(EcsMachineImage::wrap) ?: emptyList()

    override fun instanceClasses(): List<InstanceClass> =
        unwrap(this).getInstanceClasses().map(InstanceClass::wrap)

    override fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes().map(InstanceType::wrap)

    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

    override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun placementGroup(): IPlacementGroup? =
        unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

    override fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun spot(): Boolean? = unwrap(this).getSpot()

    override fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

    override fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

    override fun updateTimeout(): Duration? = unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

    override fun updateToLatestImageVersion(): Boolean? =
        unwrap(this).getUpdateToLatestImageVersion()

    override fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment):
        IManagedEc2EcsComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedEc2EcsComputeEnvironment):
        software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment = (wrapped as
        Wrapper).cdkObject
  }
}
