@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IpAddressType
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for the base ApplicationLoadBalancedEc2Service or
 * ApplicationLoadBalancedFargateService service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * ApplicationLoadBalancer applicationLoadBalancer;
 * Certificate certificate;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * ContainerImage containerImage;
 * HostedZone hostedZone;
 * LogDriver logDriver;
 * INamespace namespace;
 * Role role;
 * Secret secret;
 * Vpc vpc;
 * ApplicationLoadBalancedServiceBaseProps applicationLoadBalancedServiceBaseProps =
 * ApplicationLoadBalancedServiceBaseProps.builder()
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .certificate(certificate)
 * .circuitBreaker(DeploymentCircuitBreaker.builder()
 * .enable(false)
 * .rollback(false)
 * .build())
 * .cloudMapOptions(CloudMapOptions.builder()
 * .cloudMapNamespace(namespace)
 * .container(containerDefinition)
 * .containerPort(123)
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.minutes(30))
 * .failureThreshold(123)
 * .name("name")
 * .build())
 * .cluster(cluster)
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.ECS)
 * .build())
 * .desiredCount(123)
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .healthCheckGracePeriod(Duration.minutes(30))
 * .idleTimeout(Duration.minutes(30))
 * .ipAddressType(IpAddressType.IPV4)
 * .listenerPort(123)
 * .loadBalancer(applicationLoadBalancer)
 * .loadBalancerName("loadBalancerName")
 * .maxHealthyPercent(123)
 * .minHealthyPercent(123)
 * .openListener(false)
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .protocol(ApplicationProtocol.HTTP)
 * .protocolVersion(ApplicationProtocolVersion.GRPC)
 * .publicLoadBalancer(false)
 * .recordType(ApplicationLoadBalancedServiceRecordType.ALIAS)
 * .redirectHTTP(false)
 * .serviceName("serviceName")
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .targetProtocol(ApplicationProtocol.HTTP)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .command(List.of("command"))
 * .containerName("containerName")
 * .containerPort(123)
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .enableLogging(false)
 * .entryPoint(List.of("entryPoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .executionRole(role)
 * .family("family")
 * .logDriver(logDriver)
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .taskRole(role)
 * .build())
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface ApplicationLoadBalancedServiceBaseProps {
  /**
   * A list of Capacity Provider strategies used to place a service.
   *
   * Default: - undefined
   */
  public fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
      unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
      emptyList()

  /**
   * Certificate Manager certificate to associate with the load balancer.
   *
   * Setting this option will set the load balancer protocol to HTTPS.
   *
   * Default: - No certificate associated with the load balancer, if using
   * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
   * created for the load balancer's specified domain name if a domain name
   * and domain zone are specified.
   */
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * Whether to enable the deployment circuit breaker.
   *
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   *
   * Default: - disabled
   */
  public fun circuitBreaker(): DeploymentCircuitBreaker? =
      unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

  /**
   * The options for configuring an Amazon ECS service to use service discovery.
   *
   * Default: - AWS Cloud Map service discovery is not enabled.
   */
  public fun cloudMapOptions(): CloudMapOptions? =
      unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

  /**
   * The name of the cluster that hosts the service.
   *
   * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
   * both cluster and vpc.
   *
   * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be created
   * for you.
   */
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  /**
   * Specifies which deployment controller to use for the service.
   *
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   *
   * Default: - Rolling update (ECS)
   */
  public fun deploymentController(): DeploymentController? =
      unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * The minimum value is 1
   *
   * Default: - The default is 1 for all new services and uses the existing service's desired count
   * when updating an existing service.
   */
  public fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  /**
   * The domain name for the service, e.g. "api.example.com.".
   *
   * Default: - No domain name.
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The Route53 hosted zone for the domain, e.g. "example.com.".
   *
   * Default: - No Route53 hosted domain zone.
   */
  public fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

  /**
   * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
   *
   * For more information, see
   * [Tagging Your Amazon ECS
   * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
   *
   * Default: false
   */
  public fun enableECSManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

  /**
   * Whether ECS Exec should be enabled.
   *
   * Default: - false
   */
  public fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
   *
   * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not already
   * set
   */
  public fun healthCheckGracePeriod(): Duration? =
      unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

  /**
   * The load balancer idle timeout, in seconds.
   *
   * Can be between 1 and 4000 seconds
   *
   * Default: - CloudFormation sets idle timeout to 60 seconds
   */
  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  /**
   * The type of IP address to use.
   *
   * Default: - IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * Listener port of the application load balancer that will serve traffic to the service.
   *
   * Default: - The default listener port is determined from the protocol (port 80 for HTTP,
   * port 443 for HTTPS). A domain name and zone must be also be specified if using HTTPS.
   */
  public fun listenerPort(): Number? = unwrap(this).getListenerPort()

  /**
   * The application load balancer that will serve traffic to the service.
   *
   * The VPC attribute of a load balancer must be specified for it to be used
   * to create a new service with this pattern.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: - a new load balancer will be created.
   */
  public fun loadBalancer(): IApplicationLoadBalancer? =
      unwrap(this).getLoadBalancer()?.let(IApplicationLoadBalancer::wrap)

  /**
   * Name of the load balancer.
   *
   * Default: - Automatically generated name.
   */
  public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  /**
   * The maximum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that can run in a service during a deployment.
   *
   * Default: - 100 if daemon, otherwise 200
   */
  public fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

  /**
   * The minimum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that must continue to run and remain healthy during a deployment.
   *
   * Default: - 0 if daemon, otherwise 50
   */
  public fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

  /**
   * Determines whether or not the Security Group for the Load Balancer's Listener will be open to
   * all traffic by default.
   *
   * Default: true -- The security group allows ingress from all IP addresses.
   */
  public fun openListener(): Boolean? = unwrap(this).getOpenListener()

  /**
   * Specifies whether to propagate the tags from the task definition or the service to the tasks in
   * the service.
   *
   * Tags can only be propagated to the tasks within the service during service creation.
   *
   * Default: - none
   */
  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  /**
   * The protocol for connections from clients to the load balancer.
   *
   * The load balancer port is determined from the protocol (port 80 for
   * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
   * name and domain zone must also be specified.
   *
   * Default: HTTP. If a certificate is specified, the protocol will be
   * set by default to HTTPS.
   */
  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The protocol version to use.
   *
   * Default: ApplicationProtocolVersion.HTTP1
   */
  public fun protocolVersion(): ApplicationProtocolVersion? =
      unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

  /**
   * Determines whether the Load Balancer will be internet-facing.
   *
   * Default: true
   */
  public fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

  /**
   * Specifies whether the Route53 record should be a CNAME, an A record using the Alias feature or
   * no record at all.
   *
   * This is useful if you need to work with DNS systems that do not support alias records.
   *
   * Default: ApplicationLoadBalancedServiceRecordType.ALIAS
   */
  public fun recordType(): ApplicationLoadBalancedServiceRecordType? =
      unwrap(this).getRecordType()?.let(ApplicationLoadBalancedServiceRecordType::wrap)

  /**
   * Specifies whether the load balancer should redirect traffic on port 80 to port 443 to support
   * HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is HTTPS.
   *
   * Default: false
   */
  public fun redirectHTTP(): Boolean? = unwrap(this).getRedirectHTTP()

  /**
   * The name of the service.
   *
   * Default: - CloudFormation-generated name.
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * The security policy that defines which ciphers and protocols are supported by the ALB Listener.
   *
   * Default: - The recommended elastic load balancing security policy
   */
  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  /**
   * The protocol for connections from the load balancer to the ECS tasks.
   *
   * The default target port is determined from the protocol (port 80 for
   * HTTP, port 443 for HTTPS).
   *
   * Default: HTTP.
   */
  public fun targetProtocol(): ApplicationProtocol? =
      unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The properties required to create a new task definition.
   *
   * TaskDefinition or TaskImageOptions must be specified, but not both.
   *
   * Default: none
   */
  public fun taskImageOptions(): ApplicationLoadBalancedTaskImageOptions? =
      unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageOptions::wrap)

  /**
   * The VPC where the container instances will be launched or the elastic network interfaces (ENIs)
   * will be deployed.
   *
   * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
   * both vpc and cluster.
   *
   * Default: - uses the VPC defined in the cluster or creates a new VPC.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [ApplicationLoadBalancedServiceBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * @param certificate Certificate Manager certificate to associate with the load balancer.
     * Setting this option will set the load balancer protocol to HTTPS.
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad0ddb76cc0d6cfd571c215bd94bf4aaf090dc74c7daaab20ec8c890000798bc")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f890049db68d9ee638d8b346356e141b74df1021642f930004676eafd4b51e8c")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c7fa8ebd733d8585be7dc12500217db83e9d5d0a79d91fcfdaf188a7cec2848")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     * The minimum value is 1
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * @param domainName The domain name for the service, e.g. "api.example.com.".
     */
    public fun domainName(domainName: String)

    /**
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.".
     */
    public fun domainZone(domainZone: IHostedZone)

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds.
     * Can be between 1 and 4000 seconds
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * @param ipAddressType The type of IP address to use.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param listenerPort Listener port of the application load balancer that will serve traffic to
     * the service.
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * @param loadBalancer The application load balancer that will serve traffic to the service.
     * The VPC attribute of a load balancer must be specified for it to be used
     * to create a new service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     */
    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

    /**
     * @param openListener Determines whether or not the Security Group for the Load Balancer's
     * Listener will be open to all traffic by default.
     */
    public fun openListener(openListener: Boolean)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
     * name and domain zone must also be specified.
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * @param protocolVersion The protocol version to use.
     */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion)

    /**
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing.
     */
    public fun publicLoadBalancer(publicLoadBalancer: Boolean)

    /**
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all.
     * This is useful if you need to work with DNS systems that do not support alias records.
     */
    public fun recordType(recordType: ApplicationLoadBalancedServiceRecordType)

    /**
     * @param redirectHttp Specifies whether the load balancer should redirect traffic on port 80 to
     * port 443 to support HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is
     * HTTPS.
     */
    public fun redirectHttp(redirectHttp: Boolean)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener.
     */
    public fun sslPolicy(sslPolicy: SslPolicy)

    /**
     * @param targetProtocol The protocol for connections from the load balancer to the ECS tasks.
     * The default target port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).
     */
    public fun targetProtocol(targetProtocol: ApplicationProtocol)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2fbec0d79be10532d7bc1b7032e5f666f25a0df2be3abf78c9e29a244908be5")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit)

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps.builder()

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * @param certificate Certificate Manager certificate to associate with the load balancer.
     * Setting this option will set the load balancer protocol to HTTPS.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker.Companion::unwrap))
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad0ddb76cc0d6cfd571c215bd94bf4aaf090dc74c7daaab20ec8c890000798bc")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions.Companion::unwrap))
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f890049db68d9ee638d8b346356e141b74df1021642f930004676eafd4b51e8c")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController.Companion::unwrap))
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c7fa8ebd733d8585be7dc12500217db83e9d5d0a79d91fcfdaf188a7cec2848")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     * The minimum value is 1
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param domainName The domain name for the service, e.g. "api.example.com.".
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.".
     */
    override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone.Companion::unwrap))
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds.
     * Can be between 1 and 4000 seconds
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param ipAddressType The type of IP address to use.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * @param listenerPort Listener port of the application load balancer that will serve traffic to
     * the service.
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param loadBalancer The application load balancer that will serve traffic to the service.
     * The VPC attribute of a load balancer must be specified for it to be used
     * to create a new service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer.Companion::unwrap))
    }

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * @param openListener Determines whether or not the Security Group for the Load Balancer's
     * Listener will be open to all traffic by default.
     */
    override fun openListener(openListener: Boolean) {
      cdkBuilder.openListener(openListener)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
     * name and domain zone must also be specified.
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol.Companion::unwrap))
    }

    /**
     * @param protocolVersion The protocol version to use.
     */
    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion.Companion::unwrap))
    }

    /**
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing.
     */
    override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    /**
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     * the Alias feature or no record at all.
     * This is useful if you need to work with DNS systems that do not support alias records.
     */
    override fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
      cdkBuilder.recordType(recordType.let(ApplicationLoadBalancedServiceRecordType.Companion::unwrap))
    }

    /**
     * @param redirectHttp Specifies whether the load balancer should redirect traffic on port 80 to
     * port 443 to support HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is
     * HTTPS.
     */
    override fun redirectHttp(redirectHttp: Boolean) {
      cdkBuilder.redirectHttp(redirectHttp)
    }

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     * by the ALB Listener.
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy.Companion::unwrap))
    }

    /**
     * @param targetProtocol The protocol for connections from the load balancer to the ECS tasks.
     * The default target port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).
     */
    override fun targetProtocol(targetProtocol: ApplicationProtocol) {
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol.Companion::unwrap))
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageOptions.Companion::unwrap))
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2fbec0d79be10532d7bc1b7032e5f666f25a0df2be3abf78c9e29a244908be5")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageOptions(taskImageOptions))

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     * interfaces (ENIs) will be deployed.
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps,
  ) : CdkObject(cdkObject),
      ApplicationLoadBalancedServiceBaseProps {
    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     */
    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

    /**
     * Certificate Manager certificate to associate with the load balancer.
     *
     * Setting this option will set the load balancer protocol to HTTPS.
     *
     * Default: - No certificate associated with the load balancer, if using
     * the HTTP protocol. For HTTPS, a DNS-validated certificate will be
     * created for the load balancer's specified domain name if a domain name
     * and domain zone are specified.
     */
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     */
    override fun circuitBreaker(): DeploymentCircuitBreaker? =
        unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     */
    override fun cloudMapOptions(): CloudMapOptions? =
        unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     */
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     */
    override fun deploymentController(): DeploymentController? =
        unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * The minimum value is 1
     *
     * Default: - The default is 1 for all new services and uses the existing service's desired
     * count
     * when updating an existing service.
     */
    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    /**
     * The domain name for the service, e.g. "api.example.com.".
     *
     * Default: - No domain name.
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The Route53 hosted zone for the domain, e.g. "example.com.".
     *
     * Default: - No Route53 hosted domain zone.
     */
    override fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     */
    override fun enableECSManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     */
    override fun healthCheckGracePeriod(): Duration? =
        unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Can be between 1 and 4000 seconds
     *
     * Default: - CloudFormation sets idle timeout to 60 seconds
     */
    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    /**
     * The type of IP address to use.
     *
     * Default: - IpAddressType.IPV4
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * Listener port of the application load balancer that will serve traffic to the service.
     *
     * Default: - The default listener port is determined from the protocol (port 80 for HTTP,
     * port 443 for HTTPS). A domain name and zone must be also be specified if using HTTPS.
     */
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * The VPC attribute of a load balancer must be specified for it to be used
     * to create a new service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - a new load balancer will be created.
     */
    override fun loadBalancer(): IApplicationLoadBalancer? =
        unwrap(this).getLoadBalancer()?.let(IApplicationLoadBalancer::wrap)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     */
    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     */
    override fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     */
    override fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

    /**
     * Determines whether or not the Security Group for the Load Balancer's Listener will be open to
     * all traffic by default.
     *
     * Default: true -- The security group allows ingress from all IP addresses.
     */
    override fun openListener(): Boolean? = unwrap(this).getOpenListener()

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * The load balancer port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).  If HTTPS, either a certificate or domain
     * name and domain zone must also be specified.
     *
     * Default: HTTP. If a certificate is specified, the protocol will be
     * set by default to HTTPS.
     */
    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     */
    override fun protocolVersion(): ApplicationProtocolVersion? =
        unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

    /**
     * Determines whether the Load Balancer will be internet-facing.
     *
     * Default: true
     */
    override fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

    /**
     * Specifies whether the Route53 record should be a CNAME, an A record using the Alias feature
     * or no record at all.
     *
     * This is useful if you need to work with DNS systems that do not support alias records.
     *
     * Default: ApplicationLoadBalancedServiceRecordType.ALIAS
     */
    override fun recordType(): ApplicationLoadBalancedServiceRecordType? =
        unwrap(this).getRecordType()?.let(ApplicationLoadBalancedServiceRecordType::wrap)

    /**
     * Specifies whether the load balancer should redirect traffic on port 80 to port 443 to support
     * HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB is HTTPS.
     *
     * Default: false
     */
    override fun redirectHTTP(): Boolean? = unwrap(this).getRedirectHTTP()

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * The security policy that defines which ciphers and protocols are supported by the ALB
     * Listener.
     *
     * Default: - The recommended elastic load balancing security policy
     */
    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

    /**
     * The protocol for connections from the load balancer to the ECS tasks.
     *
     * The default target port is determined from the protocol (port 80 for
     * HTTP, port 443 for HTTPS).
     *
     * Default: HTTP.
     */
    override fun targetProtocol(): ApplicationProtocol? =
        unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The properties required to create a new task definition.
     *
     * TaskDefinition or TaskImageOptions must be specified, but not both.
     *
     * Default: none
     */
    override fun taskImageOptions(): ApplicationLoadBalancedTaskImageOptions? =
        unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageOptions::wrap)

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancedServiceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps):
        ApplicationLoadBalancedServiceBaseProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationLoadBalancedServiceBaseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancedServiceBaseProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceBaseProps
  }
}
