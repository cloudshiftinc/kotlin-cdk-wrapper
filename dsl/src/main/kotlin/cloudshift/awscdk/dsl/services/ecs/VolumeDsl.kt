@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration
import software.amazon.awscdk.services.ecs.Host
import software.amazon.awscdk.services.ecs.Volume

/**
 * A data volume used in a task definition.
 *
 * For tasks that use a Docker volume, specify a DockerVolumeConfiguration.
 * For tasks that use a bind mount host volume, specify a host and optional sourcePath.
 *
 * For more information, see [Using Data Volumes in
 * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html).
 *
 * Example:
 *
 * ```
 * FargateTaskDefinition fargateTaskDefinition = FargateTaskDefinition.Builder.create(this,
 * "TaskDef")
 * .memoryLimitMiB(512)
 * .cpu(256)
 * .build();
 * Map&lt;String, Object&gt; volume = Map.of(
 * // Use an Elastic FileSystem
 * "name", "mydatavolume",
 * "efsVolumeConfiguration", Map.of(
 * "fileSystemId", "EFS"));
 * void container = fargateTaskDefinition.addVolume(volume);
 * ```
 */
@CdkDslMarker
public class VolumeDsl {
  private val cdkBuilder: Volume.Builder = Volume.builder()

  /**
   * @param dockerVolumeConfiguration This property is specified when you are using Docker volumes.
   * Docker volumes are only supported when you are using the EC2 launch type.
   * Windows containers only support the use of the local driver.
   * To use bind mounts, specify a host instead.
   */
  public
      fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationDsl.() -> Unit
      = {}) {
    val builder = DockerVolumeConfigurationDsl()
    builder.apply(dockerVolumeConfiguration)
    cdkBuilder.dockerVolumeConfiguration(builder.build())
  }

  /**
   * @param dockerVolumeConfiguration This property is specified when you are using Docker volumes.
   * Docker volumes are only supported when you are using the EC2 launch type.
   * Windows containers only support the use of the local driver.
   * To use bind mounts, specify a host instead.
   */
  public fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration) {
    cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
  }

  /**
   * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
   * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
   * Fargate creates a supervisor container that is responsible for managing the Amazon EFS volume.
   * The supervisor container uses a small amount of the task's memory.
   * The supervisor container is visible when querying the task metadata version 4 endpoint,
   * but is not visible in CloudWatch Container Insights.
   */
  public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationDsl.() -> Unit =
      {}) {
    val builder = EfsVolumeConfigurationDsl()
    builder.apply(efsVolumeConfiguration)
    cdkBuilder.efsVolumeConfiguration(builder.build())
  }

  /**
   * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
   * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
   * Fargate creates a supervisor container that is responsible for managing the Amazon EFS volume.
   * The supervisor container uses a small amount of the task's memory.
   * The supervisor container is visible when querying the task metadata version 4 endpoint,
   * but is not visible in CloudWatch Container Insights.
   */
  public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration) {
    cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
  }

  /**
   * @param host This property is specified when you are using bind mount host volumes.
   * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
   * types.
   * The contents of the host parameter determine whether your bind mount host volume persists on
   * the
   * host container instance and where it is stored. If the host parameter is empty, then the Docker
   * daemon assigns a host path for your data volume. However, the data is not guaranteed to persist
   * after the containers associated with it stop running.
   */
  public fun host(host: HostDsl.() -> Unit = {}) {
    val builder = HostDsl()
    builder.apply(host)
    cdkBuilder.host(builder.build())
  }

  /**
   * @param host This property is specified when you are using bind mount host volumes.
   * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
   * types.
   * The contents of the host parameter determine whether your bind mount host volume persists on
   * the
   * host container instance and where it is stored. If the host parameter is empty, then the Docker
   * daemon assigns a host path for your data volume. However, the data is not guaranteed to persist
   * after the containers associated with it stop running.
   */
  public fun host(host: Host) {
    cdkBuilder.host(host)
  }

  /**
   * @param name The name of the volume. 
   * Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
   * This name is referenced in the sourceVolume parameter of container definition mountPoints.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): Volume = cdkBuilder.build()
}
