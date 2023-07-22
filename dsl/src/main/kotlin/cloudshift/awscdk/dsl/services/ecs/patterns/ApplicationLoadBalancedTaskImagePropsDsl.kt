@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for configuring a new container.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.certificatemanager.Certificate;
 * import software.amazon.awscdk.services.ec2.InstanceType;
 * import software.amazon.awscdk.services.ecs.Cluster;
 * import software.amazon.awscdk.services.ecs.ContainerImage;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy;
 * import software.amazon.awscdk.services.route53.PublicHostedZone;
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
@CdkDslMarker
public class ApplicationLoadBalancedTaskImagePropsDsl {
  private val cdkBuilder: ApplicationLoadBalancedTaskImageProps.Builder =
      ApplicationLoadBalancedTaskImageProps.builder()

  private val _containerPorts: MutableList<Number> = mutableListOf()

  /**
   * @param containerName The container name value to be specified in the task definition.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param containerPorts A list of port numbers on the container that is bound to the
   * user-specified or automatically assigned host port.
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
   */
  public fun containerPorts(vararg containerPorts: Number) {
    _containerPorts.addAll(listOf(*containerPorts))
  }

  /**
   * @param containerPorts A list of port numbers on the container that is bound to the
   * user-specified or automatically assigned host port.
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
   */
  public fun containerPorts(containerPorts: Collection<Number>) {
    _containerPorts.addAll(containerPorts)
  }

  /**
   * @param dockerLabels A key/value map of labels to add to the container.
   */
  public fun dockerLabels(dockerLabels: Map<String, String>) {
    cdkBuilder.dockerLabels(dockerLabels)
  }

  /**
   * @param enableLogging Flag to indicate whether to enable logging.
   */
  public fun enableLogging(enableLogging: Boolean) {
    cdkBuilder.enableLogging(enableLogging)
  }

  /**
   * @param environment The environment variables to pass to the container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param executionRole The name of the task execution IAM role that grants the Amazon ECS
   * container agent permission to call AWS APIs on your behalf.
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param family The name of a family that this task definition is registered to.
   * A family groups multiple versions of a task definition.
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param image The image used to start a container. 
   * Image or taskDefinition must be specified, not both.
   */
  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  /**
   * @param logDriver The log driver to use.
   */
  public fun logDriver(logDriver: LogDriver) {
    cdkBuilder.logDriver(logDriver)
  }

  /**
   * @param secrets The secrets to expose to the container as an environment variable.
   */
  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  /**
   * @param taskRole The name of the task IAM role that grants containers in the task permission to
   * call AWS APIs on your behalf.
   */
  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun build(): ApplicationLoadBalancedTaskImageProps {
    if(_containerPorts.isNotEmpty()) cdkBuilder.containerPorts(_containerPorts)
    return cdkBuilder.build()
  }
}
