package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
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
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
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

public open class ApplicationLoadBalancedEc2Service internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service,
) : ApplicationLoadBalancedServiceBase(cdkObject) {
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  public interface Builder {
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
    }

    public fun certificate(certificate: ICertificate) {
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10fc607083a037dc7ec01db13219b492bc154729222e2b53fe636491435e641b")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit) {
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e4e413a0412f83a2292e49e025145ab40fa59d499afeccb6e840e6735154f31")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun deploymentController(deploymentController: DeploymentController) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a08a85e2c468ad5b38fa1b056b1624f26d42a104eb07346cf1d24d6ec940bbd2")
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

    public fun idleTimeout(idleTimeout: Duration) {
    }

    public fun listenerPort(listenerPort: Number) {
    }

    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
    }

    public fun loadBalancerName(loadBalancerName: String) {
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
    }

    public fun openListener(openListener: Boolean) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun protocol(protocol: ApplicationProtocol) {
    }

    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
    }

    public fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
    }

    public fun redirectHttp(redirectHttp: Boolean) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
    }

    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
    }

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91615b6dc8e9961ce73bccf342b514a0d888a094c81fb61aa66b06d473035e70")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service.Builder.create(scope,
        id)

    public override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    public override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10fc607083a037dc7ec01db13219b492bc154729222e2b53fe636491435e641b")
    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit):
        Unit = circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e4e413a0412f83a2292e49e025145ab40fa59d499afeccb6e840e6735154f31")
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
    @JvmName("a08a85e2c468ad5b38fa1b056b1624f26d42a104eb07346cf1d24d6ec940bbd2")
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

    public override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    public override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
    }

    public override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
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

    public override fun openListener(openListener: Boolean) {
      cdkBuilder.openListener(openListener)
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

    public override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    public override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
    }

    public override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public override fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(ApplicationLoadBalancedServiceRecordType::unwrap))
    }

    public override fun redirectHttp(redirectHttp: Boolean) {
      cdkBuilder.redirectHttp(redirectHttp)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public override fun targetProtocol(targetProtocol: ApplicationProtocol) {
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol::unwrap))
    }

    public override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91615b6dc8e9961ce73bccf342b514a0d888a094c81fb61aa66b06d473035e70")
    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageOptions(taskImageOptions))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancedEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancedEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service):
        ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedEc2Service):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service =
        wrapped.cdkObject
  }
}
