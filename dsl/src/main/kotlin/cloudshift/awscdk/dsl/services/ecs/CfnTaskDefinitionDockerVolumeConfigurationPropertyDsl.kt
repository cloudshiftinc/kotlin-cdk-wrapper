@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `DockerVolumeConfiguration` property specifies a Docker volume configuration and is used when
 * you use Docker volumes.
 *
 * Docker volumes are only supported when you are using the EC2 launch type. Windows containers only
 * support the use of the `local` driver. To use bind mounts, specify a `host` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DockerVolumeConfigurationProperty dockerVolumeConfigurationProperty =
 * DockerVolumeConfigurationProperty.builder()
 * .autoprovision(false)
 * .driver("driver")
 * .driverOpts(Map.of(
 * "driverOptsKey", "driverOpts"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .scope("scope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder =
      CfnTaskDefinition.DockerVolumeConfigurationProperty.builder()

  /**
   * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
   * already exist.
   *
   * This field is only used if the `scope` is `shared` .
   */
  public fun autoprovision(autoprovision: Boolean) {
    cdkBuilder.autoprovision(autoprovision)
  }

  /**
   * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
   * already exist.
   *
   * This field is only used if the `scope` is `shared` .
   */
  public fun autoprovision(autoprovision: IResolvable) {
    cdkBuilder.autoprovision(autoprovision)
  }

  /**
   * @param driver The Docker volume driver to use.
   * The driver value must match the driver name provided by Docker because it is used for task
   * placement. If the driver was installed using the Docker plugin CLI, use `docker plugin ls` to
   * retrieve the driver name from your container instance. If the driver was installed using another
   * method, use Docker plugin discovery to retrieve the driver name. For more information, see [Docker
   * plugin
   * discovery](https://docs.aws.amazon.com/https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery)
   * . This parameter maps to `Driver` in the [Create a
   * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxdriver`
   * option to [docker volume
   * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
   * .
   */
  public fun driver(driver: String) {
    cdkBuilder.driver(driver)
  }

  /**
   * @param driverOpts A map of Docker driver-specific options passed through.
   * This parameter maps to `DriverOpts` in the [Create a
   * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt` option
   * to [docker volume
   * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
   * .
   */
  public fun driverOpts(driverOpts: Map<String, String>) {
    cdkBuilder.driverOpts(driverOpts)
  }

  /**
   * @param driverOpts A map of Docker driver-specific options passed through.
   * This parameter maps to `DriverOpts` in the [Create a
   * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt` option
   * to [docker volume
   * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
   * .
   */
  public fun driverOpts(driverOpts: IResolvable) {
    cdkBuilder.driverOpts(driverOpts)
  }

  /**
   * @param labels Custom metadata to add to your Docker volume.
   * This parameter maps to `Labels` in the [Create a
   * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
   * option to [docker volume
   * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
   * .
   */
  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param labels Custom metadata to add to your Docker volume.
   * This parameter maps to `Labels` in the [Create a
   * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
   * option to [docker volume
   * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
   * .
   */
  public fun labels(labels: IResolvable) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param scope The scope for the Docker volume that determines its lifecycle.
   * Docker volumes that are scoped to a `task` are automatically provisioned when the task starts
   * and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the
   * task stops.
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun build(): CfnTaskDefinition.DockerVolumeConfigurationProperty = cdkBuilder.build()
}
