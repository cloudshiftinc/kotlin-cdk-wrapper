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
    public override fun addInstanceClass(arg0: InstanceClass) {
      unwrap(this).addInstanceClass(arg0.let(InstanceClass::unwrap))
    }

    public override fun addInstanceType(arg0: InstanceType) {
      unwrap(this).addInstanceType(arg0.let(InstanceType::unwrap))
    }

    public override fun allocationStrategy(): AllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun enabled(): Boolean = unwrap(this).getEnabled()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun images(): List<EcsMachineImage> =
        unwrap(this).getImages()?.map(EcsMachineImage::wrap) ?: emptyList()

    public override fun instanceClasses(): List<InstanceClass> =
        unwrap(this).getInstanceClasses().map(InstanceClass::wrap)

    public override fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

    public override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes().map(InstanceType::wrap)

    public override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    public override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

    public override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun placementGroup(): IPlacementGroup? =
        unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

    public override fun replaceComputeEnvironment(): Boolean? =
        unwrap(this).getReplaceComputeEnvironment()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

    public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    public override fun spot(): Boolean? = unwrap(this).getSpot()

    public override fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

    public override fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    public override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

    public override fun updateTimeout(): Duration? =
        unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

    public override fun updateToLatestImageVersion(): Boolean? =
        unwrap(this).getUpdateToLatestImageVersion()

    public override fun useOptimalInstanceClasses(): Boolean? =
        unwrap(this).getUseOptimalInstanceClasses()

    public override fun vpcSubnets(): SubnetSelection? =
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
