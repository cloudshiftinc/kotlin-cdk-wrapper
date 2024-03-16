@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Options for configuring a new container.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.Certificate;
 * import io.cloudshiftdev.awscdk.services.ec2.InstanceType;
 * import io.cloudshiftdev.awscdk.services.ecs.Cluster;
 * import io.cloudshiftdev.awscdk.services.ecs.ContainerImage;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.SslPolicy;
 * import io.cloudshiftdev.awscdk.services.route53.PublicHostedZone;
 * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
 * ApplicationMultipleTargetGroupsFargateService loadBalancedFargateService =
 * ApplicationMultipleTargetGroupsFargateService.Builder.create(this, "myService")
 * .cluster(Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build())
 * .memoryLimitMiB(256)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .enableExecuteCommand(true)
 * .loadBalancers(List.of(ApplicationLoadBalancerProps.builder()
 * .name("lb")
 * .idleTimeout(Duration.seconds(400))
 * .domainName("api.example.com")
 * .domainZone(PublicHostedZone.Builder.create(this, "HostedZone").zoneName("example.com").build())
 * .listeners(List.of(ApplicationListenerProps.builder()
 * .name("listener")
 * .protocol(ApplicationProtocol.HTTPS)
 * .certificate(Certificate.fromCertificateArn(this, "Cert", "helloworld"))
 * .sslPolicy(SslPolicy.TLS12_EXT)
 * .build()))
 * .build(), ApplicationLoadBalancerProps.builder()
 * .name("lb2")
 * .idleTimeout(Duration.seconds(120))
 * .domainName("frontend.com")
 * .domainZone(PublicHostedZone.Builder.create(this, "HostedZone").zoneName("frontend.com").build())
 * .listeners(List.of(ApplicationListenerProps.builder()
 * .name("listener2")
 * .protocol(ApplicationProtocol.HTTPS)
 * .certificate(Certificate.fromCertificateArn(this, "Cert2", "helloworld"))
 * .sslPolicy(SslPolicy.TLS12_EXT)
 * .build()))
 * .build()))
 * .targetGroups(List.of(ApplicationTargetProps.builder()
 * .containerPort(80)
 * .listener("listener")
 * .build(), ApplicationTargetProps.builder()
 * .containerPort(90)
 * .pathPattern("a/b/c")
 * .priority(10)
 * .listener("listener")
 * .build(), ApplicationTargetProps.builder()
 * .containerPort(443)
 * .listener("listener2")
 * .build(), ApplicationTargetProps.builder()
 * .containerPort(80)
 * .pathPattern("a/b/c")
 * .priority(10)
 * .listener("listener2")
 * .build()))
 * .build();
 * ```
 */
public interface ApplicationLoadBalancedTaskImageProps {
  /**
   * The container name value to be specified in the task definition.
   *
   * Default: - web
   */
  public fun containerName(): String? = unwrap(this).getContainerName()

  /**
   * A list of port numbers on the container that is bound to the user-specified or automatically
   * assigned host port.
   *
   * If you are using containers in a task with the awsvpc or host network mode, exposed ports
   * should be specified using containerPort.
   * If you are using containers in a task with the bridge network mode and you specify a container
   * port and not a host port,
   * your container automatically receives a host port in the ephemeral port range.
   *
   * Port mappings that are automatically assigned in this way do not count toward the 100 reserved
   * ports limit of a container instance.
   *
   * For more information, see
   * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
   *
   * Default: - [80]
   */
  public fun containerPorts(): List<Number> = unwrap(this).getContainerPorts() ?: emptyList()

  /**
   * A key/value map of labels to add to the container.
   *
   * Default: - No labels.
   */
  public fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

  /**
   * Flag to indicate whether to enable logging.
   *
   * Default: true
   */
  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  /**
   * The environment variables to pass to the container.
   *
   * Default: - No environment variables.
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The name of the task execution IAM role that grants the Amazon ECS container agent permission
   * to call AWS APIs on your behalf.
   *
   * Default: - No value
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The name of a family that this task definition is registered to.
   *
   * A family groups multiple versions of a task definition.
   *
   * Default: - Automatically generated name.
   */
  public fun family(): String? = unwrap(this).getFamily()

  /**
   * The image used to start a container.
   *
   * Image or taskDefinition must be specified, not both.
   *
   * Default: - none
   */
  public fun image(): ContainerImage

  /**
   * The log driver to use.
   *
   * Default: - AwsLogDriver if enableLogging is true
   */
  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  /**
   * The secrets to expose to the container as an environment variable.
   *
   * Default: - No secret environment variables.
   */
  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * The name of the task IAM role that grants containers in the task permission to call AWS APIs on
   * your behalf.
   *
   * Default: - A task role is automatically created for you.
   */
  public fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)

  /**
   * A builder for [ApplicationLoadBalancedTaskImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerName The container name value to be specified in the task definition.
     */
    public fun containerName(containerName: String)

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     * user-specified or automatically assigned host port.
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    public fun containerPorts(containerPorts: List<Number>)

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     * user-specified or automatically assigned host port.
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    public fun containerPorts(vararg containerPorts: Number)

    /**
     * @param dockerLabels A key/value map of labels to add to the container.
     */
    public fun dockerLabels(dockerLabels: Map<String, String>)

    /**
     * @param enableLogging Flag to indicate whether to enable logging.
     */
    public fun enableLogging(enableLogging: Boolean)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param executionRole The name of the task execution IAM role that grants the Amazon ECS
     * container agent permission to call AWS APIs on your behalf.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    public fun family(family: String)

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, not both.
     */
    public fun image(image: ContainerImage)

    /**
     * @param logDriver The log driver to use.
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * @param secrets The secrets to expose to the container as an environment variable.
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * @param taskRole The name of the task IAM role that grants containers in the task permission
     * to call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps.builder()

    /**
     * @param containerName The container name value to be specified in the task definition.
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     * user-specified or automatically assigned host port.
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    override fun containerPorts(containerPorts: List<Number>) {
      cdkBuilder.containerPorts(containerPorts)
    }

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     * user-specified or automatically assigned host port.
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    override fun containerPorts(vararg containerPorts: Number): Unit =
        containerPorts(containerPorts.toList())

    /**
     * @param dockerLabels A key/value map of labels to add to the container.
     */
    override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * @param enableLogging Flag to indicate whether to enable logging.
     */
    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param executionRole The name of the task execution IAM role that grants the Amazon ECS
     * container agent permission to call AWS APIs on your behalf.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * @param family The name of a family that this task definition is registered to.
     * A family groups multiple versions of a task definition.
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, not both.
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * @param logDriver The log driver to use.
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * @param secrets The secrets to expose to the container as an environment variable.
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * @param taskRole The name of the task IAM role that grants containers in the task permission
     * to call AWS APIs on your behalf.
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps,
  ) : CdkObject(cdkObject), ApplicationLoadBalancedTaskImageProps {
    /**
     * The container name value to be specified in the task definition.
     *
     * Default: - web
     */
    override fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * A list of port numbers on the container that is bound to the user-specified or automatically
     * assigned host port.
     *
     * If you are using containers in a task with the awsvpc or host network mode, exposed ports
     * should be specified using containerPort.
     * If you are using containers in a task with the bridge network mode and you specify a
     * container port and not a host port,
     * your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     *
     * Default: - [80]
     */
    override fun containerPorts(): List<Number> = unwrap(this).getContainerPorts() ?: emptyList()

    /**
     * A key/value map of labels to add to the container.
     *
     * Default: - No labels.
     */
    override fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

    /**
     * Flag to indicate whether to enable logging.
     *
     * Default: true
     */
    override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    /**
     * The environment variables to pass to the container.
     *
     * Default: - No environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The name of the task execution IAM role that grants the Amazon ECS container agent permission
     * to call AWS APIs on your behalf.
     *
     * Default: - No value
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The name of a family that this task definition is registered to.
     *
     * A family groups multiple versions of a task definition.
     *
     * Default: - Automatically generated name.
     */
    override fun family(): String? = unwrap(this).getFamily()

    /**
     * The image used to start a container.
     *
     * Image or taskDefinition must be specified, not both.
     *
     * Default: - none
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     */
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    /**
     * The secrets to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     */
    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    /**
     * The name of the task IAM role that grants containers in the task permission to call AWS APIs
     * on your behalf.
     *
     * Default: - A task role is automatically created for you.
     */
    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancedTaskImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps):
        ApplicationLoadBalancedTaskImageProps = CdkObjectWrappers.wrap(cdkObject) as
        ApplicationLoadBalancedTaskImageProps

    internal fun unwrap(wrapped: ApplicationLoadBalancedTaskImageProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
  }
}
