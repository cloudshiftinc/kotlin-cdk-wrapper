@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The Linux-specific options that are applied to the container, such as Linux
 * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * LinuxParametersProperty linuxParametersProperty = LinuxParametersProperty.builder()
 * .capabilities(KernelCapabilitiesProperty.builder()
 * .add(List.of("add"))
 * .drop(List.of("drop"))
 * .build())
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
 * .size(123)
 * // the properties below are optional
 * .containerPath("containerPath")
 * .mountOptions(List.of("mountOptions"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionLinuxParametersPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.LinuxParametersProperty.Builder =
        CfnTaskDefinition.LinuxParametersProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    private val _tmpfs: MutableList<Any> = mutableListOf()

    /**
     * @param capabilities The Linux capabilities for the container that are added to or dropped
     *   from the default configuration provided by Docker.
     *
     * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
     * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
     */
    public fun capabilities(capabilities: IResolvable) {
        cdkBuilder.capabilities(capabilities)
    }

    /**
     * @param capabilities The Linux capabilities for the container that are added to or dropped
     *   from the default configuration provided by Docker.
     *
     * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
     * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
     */
    public fun capabilities(capabilities: CfnTaskDefinition.KernelCapabilitiesProperty) {
        cdkBuilder.capabilities(capabilities)
    }

    /**
     * @param devices Any host devices to expose to the container. This parameter maps to `Devices`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--device` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
     * supported.
     */
    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    /**
     * @param devices Any host devices to expose to the container. This parameter maps to `Devices`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--device` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
     * supported.
     */
    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    /**
     * @param devices Any host devices to expose to the container. This parameter maps to `Devices`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--device` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
     * supported.
     */
    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    /**
     * @param initProcessEnabled Run an `init` process inside the container that forwards signals
     *   and reaps processes. This parameter maps to the `--init` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This parameter requires version 1.25 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     */
    public fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    /**
     * @param initProcessEnabled Run an `init` process inside the container that forwards signals
     *   and reaps processes. This parameter maps to the `--init` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This parameter requires version 1.25 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     */
    public fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    /**
     * @param maxSwap The total amount of swap memory (in MiB) a container can use. This parameter
     *   will be translated to the `--memory-swap` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   where the value would be the sum of the container memory plus the `maxSwap` value.
     *
     * If a `maxSwap` value of `0` is specified, the container will not use swap. Accepted values
     * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container will
     * use the swap configuration for the container instance it is running on. A `maxSwap` value
     * must be set for the `swappiness` parameter to be used.
     *
     * If you're using tasks that use the Fargate launch type, the `maxSwap` parameter isn't
     * supported.
     *
     * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
     */
    public fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
    }

    /**
     * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume. This
     *   parameter maps to the `--shm-size` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you are using tasks that use the Fargate launch type, the `sharedMemorySize` parameter is
     * not supported.
     */
    public fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    /**
     * @param swappiness This allows you to tune a container's memory swappiness behavior. A
     *   `swappiness` value of `0` will cause swapping to not happen unless absolutely necessary. A
     *   `swappiness` value of `100` will cause pages to be swapped very aggressively. Accepted
     *   values are whole numbers between `0` and `100` . If the `swappiness` parameter is not
     *   specified, a default value of `60` is used. If a value is not specified for `maxSwap` then
     *   this parameter is ignored. This parameter maps to the `--memory-swappiness` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `swappiness` parameter isn't
     * supported.
     *
     * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
     */
    public fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
    }

    /**
     * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount. This
     *   parameter maps to the `--tmpfs` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
     * supported.
     */
    public fun tmpfs(vararg tmpfs: Any) {
        _tmpfs.addAll(listOf(*tmpfs))
    }

    /**
     * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount. This
     *   parameter maps to the `--tmpfs` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
     * supported.
     */
    public fun tmpfs(tmpfs: Collection<Any>) {
        _tmpfs.addAll(tmpfs)
    }

    /**
     * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount. This
     *   parameter maps to the `--tmpfs` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
     * supported.
     */
    public fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs)
    }

    public fun build(): CfnTaskDefinition.LinuxParametersProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        if (_tmpfs.isNotEmpty()) cdkBuilder.tmpfs(_tmpfs)
        return cdkBuilder.build()
    }
}
