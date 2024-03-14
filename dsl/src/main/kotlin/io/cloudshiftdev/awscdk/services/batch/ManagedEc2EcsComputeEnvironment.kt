package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ManagedEc2EcsComputeEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment,
) : Resource(cdkObject), IManagedEc2EcsComputeEnvironment, IManagedComputeEnvironment,
    IComputeEnvironment {
  public override fun addInstanceClass(instanceClass: InstanceClass) {
    unwrap(this).addInstanceClass(instanceClass.let(InstanceClass::unwrap))
  }

  public override fun addInstanceType(instanceType: InstanceType) {
    unwrap(this).addInstanceType(instanceType.let(InstanceType::unwrap))
  }

  public override fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

  public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun enabled(): Boolean = unwrap(this).getEnabled()

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

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

  public override fun updateTimeout(): Duration? =
      unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

  public override fun updateToLatestImageVersion(): Boolean? =
      unwrap(this).getUpdateToLatestImageVersion()

  public interface Builder {
    public fun allocationStrategy(allocationStrategy: AllocationStrategy) {
    }

    public fun computeEnvironmentName(computeEnvironmentName: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun images(images: List<EcsMachineImage>) {
    }

    public fun instanceClasses(instanceClasses: List<InstanceClass>) {
    }

    public fun instanceRole(instanceRole: IRole) {
    }

    public fun instanceTypes(instanceTypes: List<InstanceType>) {
    }

    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
    }

    public fun maxvCpus(maxvCpus: Number) {
    }

    public fun minvCpus(minvCpus: Number) {
    }

    public fun placementGroup(placementGroup: IPlacementGroup) {
    }

    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun serviceRole(serviceRole: IRole) {
    }

    public fun spot(spot: Boolean) {
    }

    public fun spotBidPercentage(spotBidPercentage: Number) {
    }

    public fun spotFleetRole(spotFleetRole: IRole) {
    }

    public fun terminateOnUpdate(terminateOnUpdate: Boolean) {
    }

    public fun updateTimeout(updateTimeout: Duration) {
    }

    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
    }

    public fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cc25013bf069d07c2b54336f36872a2c1c59f514aa2c9405e84413b84593b91")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment.Builder.create(scope,
        id)

    public override fun allocationStrategy(allocationStrategy: AllocationStrategy) {
      cdkBuilder.allocationStrategy(allocationStrategy.let(AllocationStrategy::unwrap))
    }

    public override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun images(images: List<EcsMachineImage>) {
      cdkBuilder.images(images.map(EcsMachineImage::unwrap))
    }

    public override fun instanceClasses(instanceClasses: List<InstanceClass>) {
      cdkBuilder.instanceClasses(instanceClasses.map(InstanceClass::unwrap))
    }

    public override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    public override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    public override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    public override fun maxvCpus(maxvCpus: Number) {
      cdkBuilder.maxvCpus(maxvCpus)
    }

    public override fun minvCpus(minvCpus: Number) {
      cdkBuilder.minvCpus(minvCpus)
    }

    public override fun placementGroup(placementGroup: IPlacementGroup) {
      cdkBuilder.placementGroup(placementGroup.let(IPlacementGroup::unwrap))
    }

    public override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public override fun spot(spot: Boolean) {
      cdkBuilder.spot(spot)
    }

    public override fun spotBidPercentage(spotBidPercentage: Number) {
      cdkBuilder.spotBidPercentage(spotBidPercentage)
    }

    public override fun spotFleetRole(spotFleetRole: IRole) {
      cdkBuilder.spotFleetRole(spotFleetRole.let(IRole::unwrap))
    }

    public override fun terminateOnUpdate(terminateOnUpdate: Boolean) {
      cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

    public override fun updateTimeout(updateTimeout: Duration) {
      cdkBuilder.updateTimeout(updateTimeout.let(Duration::unwrap))
    }

    public override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
      cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    public override fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
      cdkBuilder.useOptimalInstanceClasses(useOptimalInstanceClasses)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cc25013bf069d07c2b54336f36872a2c1c59f514aa2c9405e84413b84593b91")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromManagedEc2EcsComputeEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      managedEc2EcsComputeEnvironmentArn: String,
    ): IManagedEc2EcsComputeEnvironment =
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment.fromManagedEc2EcsComputeEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, managedEc2EcsComputeEnvironmentArn).let(IManagedEc2EcsComputeEnvironment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ManagedEc2EcsComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ManagedEc2EcsComputeEnvironment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment):
        ManagedEc2EcsComputeEnvironment = ManagedEc2EcsComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: ManagedEc2EcsComputeEnvironment):
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment = wrapped.cdkObject
  }
}
