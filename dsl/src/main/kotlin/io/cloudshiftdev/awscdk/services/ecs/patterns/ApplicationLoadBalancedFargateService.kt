package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateService
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.HealthCheck
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
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

public open class ApplicationLoadBalancedFargateService internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService,
) : ApplicationLoadBalancedServiceBase(cdkObject) {
  public open fun assignPublicIp(): Boolean = unwrap(this).getAssignPublicIp()

  public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean) {
    }

    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
    }

    public fun certificate(certificate: ICertificate) {
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53375900e698a89ed6c2a3bd5a02d9e2db2b85bbc1cfef87b3529798504e0e39")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit) {
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("891500c72276d1da3012f63b867e721424fc40548a70912e67a2bd2010251cd2")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun deploymentController(deploymentController: DeploymentController) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac2e1da145e387904c673f4de0d9b7971d2bcda436d17f56f9cc7af75d0e56d")
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

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7515d26f0a9c0956e510f4f2d5fa34ca3674d4b39f553013be02b3c1559947b")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit) {
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

    public fun minHealthyPercent(minHealthyPercent: Number) {
    }

    public fun openListener(openListener: Boolean) {
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
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

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3cc82030ac0709da2b9ee5e07afa65a1eb9cd8c76ba437d462e0e8b12ed6d6")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
    }

    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81c29c64cee2317741251630bc0e81fede33cbe8998ca166fc4147bb8c25f187")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit) {
    }

    public fun taskSubnets(taskSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe5899cd4936a8b50473450bbed213967262447ef083039c12af605e35a0088a")
    public fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService.Builder.create(scope,
        id)

    public override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

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
    @JvmName("53375900e698a89ed6c2a3bd5a02d9e2db2b85bbc1cfef87b3529798504e0e39")
    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit):
        Unit = circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("891500c72276d1da3012f63b867e721424fc40548a70912e67a2bd2010251cd2")
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
    @JvmName("0ac2e1da145e387904c673f4de0d9b7971d2bcda436d17f56f9cc7af75d0e56d")
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

    public override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7515d26f0a9c0956e510f4f2d5fa34ca3674d4b39f553013be02b3c1559947b")
    public override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

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

    public override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public override fun openListener(openListener: Boolean) {
      cdkBuilder.openListener(openListener)
    }

    public override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
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

    public override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3cc82030ac0709da2b9ee5e07afa65a1eb9cd8c76ba437d462e0e8b12ed6d6")
    public override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
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

    public override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81c29c64cee2317741251630bc0e81fede33cbe8998ca166fc4147bb8c25f187")
    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageOptions(taskImageOptions))

    public override fun taskSubnets(taskSubnets: SubnetSelection) {
      cdkBuilder.taskSubnets(taskSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe5899cd4936a8b50473450bbed213967262447ef083039c12af605e35a0088a")
    public override fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        taskSubnets(SubnetSelection(taskSubnets))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancedFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancedFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService):
        ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedFargateService):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService =
        wrapped.cdkObject
  }
}
