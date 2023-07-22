@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Linux-specific modifications that are applied to the container, such as details for device
 * mappings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * LinuxParametersProperty linuxParametersProperty = LinuxParametersProperty.builder()
 * .devices(List.of(DeviceProperty.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * .permissions(List.of("permissions"))
 * .build()))
 * .initProcessEnabled(false)
 * .maxSwap(123)
 * .sharedMemorySize(123)
 * .swappiness(123)
 * .tmpfs(List.of(TmpfsProperty.builder()
 * .containerPath("containerPath")
 * .size(123)
 * // the properties below are optional
 * .mountOptions(List.of("mountOptions"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-linuxparameters.html)
 */
@CdkDslMarker
public class CfnJobDefinitionLinuxParametersPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.LinuxParametersProperty.Builder =
      CfnJobDefinition.LinuxParametersProperty.builder()

  private val _devices: MutableList<Any> = mutableListOf()

  private val _tmpfs: MutableList<Any> = mutableListOf()

  /**
   * @param devices Any of the host devices to expose to the container.
   * This parameter maps to `Devices` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun devices(vararg devices: Any) {
    _devices.addAll(listOf(*devices))
  }

  /**
   * @param devices Any of the host devices to expose to the container.
   * This parameter maps to `Devices` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun devices(devices: Collection<Any>) {
    _devices.addAll(devices)
  }

  /**
   * @param devices Any of the host devices to expose to the container.
   * This parameter maps to `Devices` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--device`
   * option to [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/)
   * .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun devices(devices: IResolvable) {
    cdkBuilder.devices(devices)
  }

  /**
   * @param initProcessEnabled If true, run an `init` process inside the container that forwards
   * signals and reaps processes.
   * This parameter maps to the `--init` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This parameter
   * requires version 1.25 of the Docker Remote API or greater on your container instance. To check the
   * Docker Remote API version on your container instance, log in to your container instance and run
   * the following command: `sudo docker version | grep "Server API version"`
   */
  public fun initProcessEnabled(initProcessEnabled: Boolean) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  /**
   * @param initProcessEnabled If true, run an `init` process inside the container that forwards
   * signals and reaps processes.
   * This parameter maps to the `--init` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . This parameter
   * requires version 1.25 of the Docker Remote API or greater on your container instance. To check the
   * Docker Remote API version on your container instance, log in to your container instance and run
   * the following command: `sudo docker version | grep "Server API version"`
   */
  public fun initProcessEnabled(initProcessEnabled: IResolvable) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  /**
   * @param maxSwap The total amount of swap memory (in MiB) a container can use.
   * This parameter is translated to the `--memory-swap` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) where the value is
   * the sum of the container memory plus the `maxSwap` value. For more information, see
   * [`--memory-swap`
   * details](https://docs.aws.amazon.com/https://docs.docker.com/config/containers/resource_constraints/#--memory-swap-details)
   * in the Docker documentation.
   *
   * If a `maxSwap` value of `0` is specified, the container doesn't use swap. Accepted values are
   * `0` or any positive integer. If the `maxSwap` parameter is omitted, the container doesn't use the
   * swap configuration for the container instance that it's running on. A `maxSwap` value must be set
   * for the `swappiness` parameter to be used.
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun maxSwap(maxSwap: Number) {
    cdkBuilder.maxSwap(maxSwap)
  }

  /**
   * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume.
   * This parameter maps to the `--shm-size` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun sharedMemorySize(sharedMemorySize: Number) {
    cdkBuilder.sharedMemorySize(sharedMemorySize)
  }

  /**
   * @param swappiness You can use this parameter to tune a container's memory swappiness behavior.
   * A `swappiness` value of `0` causes swapping to not occur unless absolutely necessary. A
   * `swappiness` value of `100` causes pages to be swapped aggressively. Valid values are whole
   * numbers between `0` and `100` . If the `swappiness` parameter isn't specified, a default value of
   * `60` is used. If a value isn't specified for `maxSwap` , then this parameter is ignored. If
   * `maxSwap` is set to 0, the container doesn't use swap. This parameter maps to the
   * `--memory-swappiness` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   * Consider the following when you use a per-container swap configuration.
   *
   * * Swap space must be enabled and allocated on the container instance for the containers to use.
   *
   *
   * By default, the Amazon ECS optimized AMIs don't have swap enabled. You must enable swap on the
   * instance to use this feature. For more information, see [Instance store swap
   * volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-store-swap-volumes.html) in
   * the *Amazon EC2 User Guide for Linux Instances* or [How do I allocate memory to work as swap space
   * in an Amazon EC2 instance by using a swap
   * file?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/ec2-memory-swap-file/)
   *
   *
   * * The swap space parameters are only supported for job definitions using EC2 resources.
   * * If the `maxSwap` and `swappiness` parameters are omitted from a job definition, each
   * container has a default `swappiness` value of 60. Moreover, the total swap usage is limited to two
   * times the memory reservation of the container.
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it
   * for these jobs.
   */
  public fun swappiness(swappiness: Number) {
    cdkBuilder.swappiness(swappiness)
  }

  /**
   * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
   * This parameter maps to the `--tmpfs` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
   * this parameter for this resource type.
   */
  public fun tmpfs(vararg tmpfs: Any) {
    _tmpfs.addAll(listOf(*tmpfs))
  }

  /**
   * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
   * This parameter maps to the `--tmpfs` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
   * this parameter for this resource type.
   */
  public fun tmpfs(tmpfs: Collection<Any>) {
    _tmpfs.addAll(tmpfs)
  }

  /**
   * @param tmpfs The container path, mount options, and size (in MiB) of the `tmpfs` mount.
   * This parameter maps to the `--tmpfs` option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide
   * this parameter for this resource type.
   */
  public fun tmpfs(tmpfs: IResolvable) {
    cdkBuilder.tmpfs(tmpfs)
  }

  public fun build(): CfnJobDefinition.LinuxParametersProperty {
    if(_devices.isNotEmpty()) cdkBuilder.devices(_devices)
    if(_tmpfs.isNotEmpty()) cdkBuilder.tmpfs(_tmpfs)
    return cdkBuilder.build()
  }
}
