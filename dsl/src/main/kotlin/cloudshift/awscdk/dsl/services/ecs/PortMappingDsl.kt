@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.AppProtocol
import software.amazon.awscdk.services.ecs.PortMapping
import software.amazon.awscdk.services.ecs.Protocol

/**
 * Port mappings allow containers to access ports on the host container instance to send or receive
 * traffic.
 *
 * Example:
 *
 * ```
 * TaskDefinition taskDefinition;
 * Cluster cluster;
 * // Add a container to the task definition
 * ContainerDefinition specificContainer = taskDefinition.addContainer("Container",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("/aws/aws-example-app"))
 * .memoryLimitMiB(2048)
 * .build());
 * // Add a port mapping
 * specificContainer.addPortMappings(PortMapping.builder()
 * .containerPort(7600)
 * .protocol(Protocol.TCP)
 * .build());
 * Ec2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .cloudMapOptions(CloudMapOptions.builder()
 * // Create SRV records - useful for bridge networking
 * .dnsRecordType(DnsRecordType.SRV)
 * // Targets port TCP port 7600 `specificContainer`
 * .container(specificContainer)
 * .containerPort(7600)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class PortMappingDsl {
  private val cdkBuilder: PortMapping.Builder = PortMapping.builder()

  /**
   * @param appProtocol The protocol used by Service Connect.
   * Valid values are AppProtocol.http, AppProtocol.http2, and
   * AppProtocol.grpc. The protocol determines what telemetry will be shown in the ECS Console for
   * Service Connect services using this port mapping.
   *
   * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
   */
  public fun appProtocol(appProtocol: AppProtocol) {
    cdkBuilder.appProtocol(appProtocol)
  }

  /**
   * @param containerPort The port number on the container that is bound to the user-specified or
   * automatically assigned host port. 
   * If you are using containers in a task with the awsvpc or host network mode, exposed ports
   * should be specified using containerPort.
   * If you are using containers in a task with the bridge network mode and you specify a container
   * port and not a host port,
   * your container automatically receives a host port in the ephemeral port range.
   *
   * For more information, see hostPort.
   * Port mappings that are automatically assigned in this way do not count toward the 100 reserved
   * ports limit of a container instance.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param hostPort The port number on the container instance to reserve for your container.
   * If you are using containers in a task with the awsvpc or host network mode,
   * the hostPort can either be left blank or set to the same value as the containerPort.
   *
   * If you are using containers in a task with the bridge network mode,
   * you can specify a non-reserved host port for your container port mapping, or
   * you can omit the hostPort (or set it to 0) while specifying a containerPort and
   * your container automatically receives a port in the ephemeral port range for
   * your container instance operating system and Docker version.
   */
  public fun hostPort(hostPort: Number) {
    cdkBuilder.hostPort(hostPort)
  }

  /**
   * @param name The name to give the port mapping.
   * Name is required in order to use the port mapping with ECS Service Connect.
   * This field may only be set when the task definition uses Bridge or Awsvpc network modes.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param protocol The protocol used for the port mapping.
   * Valid values are Protocol.TCP and Protocol.UDP.
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): PortMapping = cdkBuilder.build()
}
