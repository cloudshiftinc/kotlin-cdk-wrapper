@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for the base ApplicationMultipleTargetGroupsEc2Service or
 * ApplicationMultipleTargetGroupsFargateService service.
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
 * ApplicationMultipleTargetGroupsServiceBaseProps applicationMultipleTargetGroupsServiceBaseProps =
 * ApplicationMultipleTargetGroupsServiceBaseProps.builder()
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
 * .desiredCount(123)
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .healthCheckGracePeriod(Duration.minutes(30))
 * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
 * .listeners(List.of(ApplicationListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .certificate(certificate)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .idleTimeout(Duration.minutes(30))
 * .publicLoadBalancer(false)
 * .build()))
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .serviceName("serviceName")
 * .targetGroups(List.of(ApplicationTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .hostHeader("hostHeader")
 * .listener("listener")
 * .pathPattern("pathPattern")
 * .priority(123)
 * .protocol(Protocol.TCP)
 * .build()))
 * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .containerName("containerName")
 * .containerPorts(List.of(123))
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .enableLogging(false)
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
public interface ApplicationMultipleTargetGroupsServiceBaseProps {
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
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * Default: - The default is 1 for all new services and uses the existing service's desired count
   * when updating an existing service.
   */
  public fun desiredCount(): Number? = unwrap(this).getDesiredCount()

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
   * The application load balancer that will serve traffic to the service.
   *
   * Default: - a new load balancer with a listener will be created.
   */
  public fun loadBalancers(): List<ApplicationLoadBalancerProps> =
      unwrap(this).getLoadBalancers()?.map(ApplicationLoadBalancerProps::wrap) ?: emptyList()

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
   * The name of the service.
   *
   * Default: - CloudFormation-generated name.
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * Properties to specify ALB target groups.
   *
   * Default: - default portMapping registered as target group and attached to the first defined
   * listener
   */
  public fun targetGroups(): List<ApplicationTargetProps> =
      unwrap(this).getTargetGroups()?.map(ApplicationTargetProps::wrap) ?: emptyList()

  /**
   * The properties required to create a new task definition.
   *
   * Only one of TaskDefinition or TaskImageOptions must be specified.
   *
   * Default: none
   */
  public fun taskImageOptions(): ApplicationLoadBalancedTaskImageProps? =
      unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageProps::wrap)

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
   * A builder for [ApplicationMultipleTargetGroupsServiceBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("098bcfe6e487ac472a11a4102683ddb20eb5dc694fbfbe26288f3d6d4c562cc1")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * @param cluster The name of the cluster that hosts the service.
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    public fun desiredCount(desiredCount: Number)

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
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>)

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(targetGroups: List<ApplicationTargetProps>)

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(vararg targetGroups: ApplicationTargetProps)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps)

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("104ce746e95740cc349f76735478ef47af51c6603d0276753eba05d92d37941d")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit)

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
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps.builder()

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
    @JvmName("098bcfe6e487ac472a11a4102683ddb20eb5dc694fbfbe26288f3d6d4c562cc1")
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
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
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
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps.Companion::unwrap))
    }

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    override fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Tags can only be propagated to the tasks within the service during service creation.
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps.Companion::unwrap))
    }

    /**
     * @param targetGroups Properties to specify ALB target groups.
     */
    override fun targetGroups(vararg targetGroups: ApplicationTargetProps): Unit =
        targetGroups(targetGroups.toList())

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageProps.Companion::unwrap))
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("104ce746e95740cc349f76735478ef47af51c6603d0276753eba05d92d37941d")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

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
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps,
  ) : CdkObject(cdkObject),
      ApplicationMultipleTargetGroupsServiceBaseProps {
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
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - The default is 1 for all new services and uses the existing service's desired
     * count
     * when updating an existing service.
     */
    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

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
     * The application load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     */
    override fun loadBalancers(): List<ApplicationLoadBalancerProps> =
        unwrap(this).getLoadBalancers()?.map(ApplicationLoadBalancerProps::wrap) ?: emptyList()

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
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * Properties to specify ALB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     */
    override fun targetGroups(): List<ApplicationTargetProps> =
        unwrap(this).getTargetGroups()?.map(ApplicationTargetProps::wrap) ?: emptyList()

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: none
     */
    override fun taskImageOptions(): ApplicationLoadBalancedTaskImageProps? =
        unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageProps::wrap)

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
        ApplicationMultipleTargetGroupsServiceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps):
        ApplicationMultipleTargetGroupsServiceBaseProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationMultipleTargetGroupsServiceBaseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsServiceBaseProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
  }
}
