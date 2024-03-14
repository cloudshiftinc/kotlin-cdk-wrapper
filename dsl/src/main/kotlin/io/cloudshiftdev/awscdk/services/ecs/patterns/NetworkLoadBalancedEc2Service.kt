package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkLoadBalancedEc2Service internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service,
) : NetworkLoadBalancedServiceBase(cdkObject) {
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  public interface Builder {
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("170033e3d8e03f5757b83493a8490c1c2a467af1925a4ef72fedfca98baa7476")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit) {
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe9658ba9892d9a82ad9332467f23d0f7755cb4f620f053e433abd67e42a8b1c")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun deploymentController(deploymentController: DeploymentController) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81d88c7410fb5357671c170ecf5343cd6dbc7ab2d6c41f07d5357704e57d9786")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit) {
    }

    public fun desiredCount(desiredCount: Number) {
    }

    public fun domainName(domainName: String) {
    }

    public fun domainZone(domainZone: IHostedZone) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    }

    public fun listenerPort(listenerPort: Number) {
    }

    public fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
    }

    public fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fbd0d17da10f1f9925db997929dd51e2d7440fb91db976aeea5f603d3956b")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service.Builder.create(scope,
        id)

    public override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("170033e3d8e03f5757b83493a8490c1c2a467af1925a4ef72fedfca98baa7476")
    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit):
        Unit = circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe9658ba9892d9a82ad9332467f23d0f7755cb4f620f053e433abd67e42a8b1c")
    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81d88c7410fb5357671c170ecf5343cd6dbc7ab2d6c41f07d5357704e57d9786")
    public override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    public override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    public override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer::unwrap))
    }

    public override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    public override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public override fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(NetworkLoadBalancedServiceRecordType::unwrap))
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    public override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("492fbd0d17da10f1f9925db997929dd51e2d7440fb91db976aeea5f603d3956b")
    public override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageOptions(taskImageOptions))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkLoadBalancedEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkLoadBalancedEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service):
        NetworkLoadBalancedEc2Service = NetworkLoadBalancedEc2Service(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancedEc2Service):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedEc2Service =
        wrapped.cdkObject
  }
}
