@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import software.amazon.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationLoadBalancedServiceBasePropsDsl {
    private val cdkBuilder: ApplicationLoadBalancedServiceBaseProps.Builder =
        ApplicationLoadBalancedServiceBaseProps.builder()

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

    public fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
        _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
    }

    public fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
        _capacityProviderStrategies.addAll(capacityProviderStrategies)
    }

    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    public fun circuitBreaker(block: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
        val builder = DeploymentCircuitBreakerDsl()
        builder.apply(block)
        cdkBuilder.circuitBreaker(builder.build())
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
        cdkBuilder.circuitBreaker(circuitBreaker)
    }

    public fun cloudMapOptions(block: CloudMapOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapOptionsDsl()
        builder.apply(block)
        cdkBuilder.cloudMapOptions(builder.build())
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
        cdkBuilder.cloudMapOptions(cloudMapOptions)
    }

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun deploymentController(block: DeploymentControllerDsl.() -> Unit = {}) {
        val builder = DeploymentControllerDsl()
        builder.apply(block)
        cdkBuilder.deploymentController(builder.build())
    }

    public fun deploymentController(deploymentController: DeploymentController) {
        cdkBuilder.deploymentController(deploymentController)
    }

    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public fun openListener(openListener: Boolean) {
        cdkBuilder.openListener(openListener)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
        cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
        cdkBuilder.recordType(recordType)
    }

    public fun redirectHttp(redirectHttp: Boolean) {
        cdkBuilder.redirectHttp(redirectHttp)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
        cdkBuilder.targetProtocol(targetProtocol)
    }

    public fun taskImageOptions(block: ApplicationLoadBalancedTaskImageOptionsDsl.() -> Unit = {}) {
        val builder = ApplicationLoadBalancedTaskImageOptionsDsl()
        builder.apply(block)
        cdkBuilder.taskImageOptions(builder.build())
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
        cdkBuilder.taskImageOptions(taskImageOptions)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationLoadBalancedServiceBaseProps {
        if (_capacityProviderStrategies.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        }
        return cdkBuilder.build()
    }
}
