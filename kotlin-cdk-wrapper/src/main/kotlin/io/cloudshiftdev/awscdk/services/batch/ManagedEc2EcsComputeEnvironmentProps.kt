@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ManagedEc2EcsComputeEnvironmentProps : ManagedComputeEnvironmentProps {
  public fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  public fun images(): List<EcsMachineImage> = unwrap(this).getImages()?.map(EcsMachineImage::wrap)
      ?: emptyList()

  public fun instanceClasses(): List<InstanceClass> =
      unwrap(this).getInstanceClasses()?.map(InstanceClass::wrap) ?: emptyList()

  public fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

  public fun instanceTypes(): List<InstanceType> =
      unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

  public fun placementGroup(): IPlacementGroup? =
      unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

  public fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  public fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

  public fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

  @CdkDslMarker
  public interface Builder {
    public fun allocationStrategy(allocationStrategy: AllocationStrategy)

    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun enabled(enabled: Boolean)

    public fun images(images: List<EcsMachineImage>)

    public fun images(vararg images: EcsMachineImage)

    public fun instanceClasses(instanceClasses: List<InstanceClass>)

    public fun instanceClasses(vararg instanceClasses: InstanceClass)

    public fun instanceRole(instanceRole: IRole)

    public fun instanceTypes(instanceTypes: List<InstanceType>)

    public fun instanceTypes(vararg instanceTypes: InstanceType)

    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    public fun maxvCpus(maxvCpus: Number)

    public fun minvCpus(minvCpus: Number)

    public fun placementGroup(placementGroup: IPlacementGroup)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serviceRole(serviceRole: IRole)

    public fun spot(spot: Boolean)

    public fun spotBidPercentage(spotBidPercentage: Number)

    public fun spotFleetRole(spotFleetRole: IRole)

    public fun terminateOnUpdate(terminateOnUpdate: Boolean)

    public fun updateTimeout(updateTimeout: Duration)

    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

    public fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2612bc97625ac6a51bd6b731bebbe96f032039b1275643f9d4f910aa8d6f19")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps.builder()

    override fun allocationStrategy(allocationStrategy: AllocationStrategy) {
      cdkBuilder.allocationStrategy(allocationStrategy.let(AllocationStrategy::unwrap))
    }

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun images(images: List<EcsMachineImage>) {
      cdkBuilder.images(images.map(EcsMachineImage::unwrap))
    }

    override fun images(vararg images: EcsMachineImage): Unit = images(images.toList())

    override fun instanceClasses(instanceClasses: List<InstanceClass>) {
      cdkBuilder.instanceClasses(instanceClasses.map(InstanceClass::unwrap))
    }

    override fun instanceClasses(vararg instanceClasses: InstanceClass): Unit =
        instanceClasses(instanceClasses.toList())

    override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    override fun maxvCpus(maxvCpus: Number) {
      cdkBuilder.maxvCpus(maxvCpus)
    }

    override fun minvCpus(minvCpus: Number) {
      cdkBuilder.minvCpus(minvCpus)
    }

    override fun placementGroup(placementGroup: IPlacementGroup) {
      cdkBuilder.placementGroup(placementGroup.let(IPlacementGroup::unwrap))
    }

    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    override fun spot(spot: Boolean) {
      cdkBuilder.spot(spot)
    }

    override fun spotBidPercentage(spotBidPercentage: Number) {
      cdkBuilder.spotBidPercentage(spotBidPercentage)
    }

    override fun spotFleetRole(spotFleetRole: IRole) {
      cdkBuilder.spotFleetRole(spotFleetRole.let(IRole::unwrap))
    }

    override fun terminateOnUpdate(terminateOnUpdate: Boolean) {
      cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

    override fun updateTimeout(updateTimeout: Duration) {
      cdkBuilder.updateTimeout(updateTimeout.let(Duration::unwrap))
    }

    override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
      cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    override fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
      cdkBuilder.useOptimalInstanceClasses(useOptimalInstanceClasses)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2612bc97625ac6a51bd6b731bebbe96f032039b1275643f9d4f910aa8d6f19")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps,
  ) : CdkObject(cdkObject), ManagedEc2EcsComputeEnvironmentProps {
    override fun allocationStrategy(): AllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun images(): List<EcsMachineImage> =
        unwrap(this).getImages()?.map(EcsMachineImage::wrap) ?: emptyList()

    override fun instanceClasses(): List<InstanceClass> =
        unwrap(this).getInstanceClasses()?.map(InstanceClass::wrap) ?: emptyList()

    override fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    override fun maxvCpus(): Number? = unwrap(this).getMaxvCpus()

    override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    override fun placementGroup(): IPlacementGroup? =
        unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

    override fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun spot(): Boolean? = unwrap(this).getSpot()

    override fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

    override fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

    override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

    override fun updateTimeout(): Duration? = unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

    override fun updateToLatestImageVersion(): Boolean? =
        unwrap(this).getUpdateToLatestImageVersion()

    override fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ManagedEc2EcsComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps):
        ManagedEc2EcsComputeEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedEc2EcsComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps
  }
}
