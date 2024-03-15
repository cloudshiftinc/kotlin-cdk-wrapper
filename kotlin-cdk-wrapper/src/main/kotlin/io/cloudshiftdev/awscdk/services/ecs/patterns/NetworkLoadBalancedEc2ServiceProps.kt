@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface NetworkLoadBalancedEc2ServiceProps : NetworkLoadBalancedServiceBaseProps {
  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  public fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

  public fun placementConstraints(): List<PlacementConstraint> =
      unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

  public fun placementStrategies(): List<PlacementStrategy> =
      unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()

  public fun taskDefinition(): Ec2TaskDefinition? =
      unwrap(this).getTaskDefinition()?.let(Ec2TaskDefinition::wrap)

  @CdkDslMarker
  public interface Builder {
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b34dc6184fb9bc600080a658879133916a0a7f68f3bdc85f2d07d0a506082b22")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87a631b4de727f31cda80ea38f08a0678b2080e92f5b84f37bd29e97221a1e45")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun cpu(cpu: Number)

    public fun deploymentController(deploymentController: DeploymentController)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("371322252059d9b7ce8ae76421aa3e065727987b9bbaec595250a0e9f5fc3022")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    public fun desiredCount(desiredCount: Number)

    public fun domainName(domainName: String)

    public fun domainZone(domainZone: IHostedZone)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun listenerPort(listenerPort: Number)

    public fun loadBalancer(loadBalancer: INetworkLoadBalancer)

    public fun maxHealthyPercent(maxHealthyPercent: Number)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun memoryReservationMiB(memoryReservationMiB: Number)

    public fun minHealthyPercent(minHealthyPercent: Number)

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun publicLoadBalancer(publicLoadBalancer: Boolean)

    public fun recordType(recordType: NetworkLoadBalancedServiceRecordType)

    public fun serviceName(serviceName: String)

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition)

    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b521e050e717e56694f52d7b4243e1f55cdda3f5d7dbe59bdfe5e75febaf277b")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps.builder()

    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b34dc6184fb9bc600080a658879133916a0a7f68f3bdc85f2d07d0a506082b22")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87a631b4de727f31cda80ea38f08a0678b2080e92f5b84f37bd29e97221a1e45")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("371322252059d9b7ce8ae76421aa3e065727987b9bbaec595250a0e9f5fc3022")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer::unwrap))
    }

    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    override fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(NetworkLoadBalancedServiceRecordType::unwrap))
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b521e050e717e56694f52d7b4243e1f55cdda3f5d7dbe59bdfe5e75febaf277b")
    override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageOptions(taskImageOptions))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps,
  ) : CdkObject(cdkObject), NetworkLoadBalancedEc2ServiceProps {
    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

    override fun circuitBreaker(): DeploymentCircuitBreaker? =
        unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

    override fun cloudMapOptions(): CloudMapOptions? =
        unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun deploymentController(): DeploymentController? =
        unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    override fun healthCheckGracePeriod(): Duration? =
        unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    override fun loadBalancer(): INetworkLoadBalancer? =
        unwrap(this).getLoadBalancer()?.let(INetworkLoadBalancer::wrap)

    override fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

    override fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

    override fun placementConstraints(): List<PlacementConstraint> =
        unwrap(this).getPlacementConstraints()?.map(PlacementConstraint::wrap) ?: emptyList()

    override fun placementStrategies(): List<PlacementStrategy> =
        unwrap(this).getPlacementStrategies()?.map(PlacementStrategy::wrap) ?: emptyList()

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

    override fun recordType(): NetworkLoadBalancedServiceRecordType? =
        unwrap(this).getRecordType()?.let(NetworkLoadBalancedServiceRecordType::wrap)

    override fun serviceName(): String? = unwrap(this).getServiceName()

    override fun taskDefinition(): Ec2TaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(Ec2TaskDefinition::wrap)

    override fun taskImageOptions(): NetworkLoadBalancedTaskImageOptions? =
        unwrap(this).getTaskImageOptions()?.let(NetworkLoadBalancedTaskImageOptions::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancedEc2ServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps):
        NetworkLoadBalancedEc2ServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedEc2ServiceProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2ServiceProps
  }
}
