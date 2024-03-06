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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.batch.LinuxParameters
import software.constructs.Construct

/**
 * Linux-specific options that are applied to the container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.batch.*;
 * Size size;
 * LinuxParameters linuxParameters = LinuxParameters.Builder.create(this, "MyLinuxParameters")
 * .initProcessEnabled(false)
 * .maxSwap(size)
 * .sharedMemorySize(size)
 * .swappiness(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LinuxParametersDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LinuxParameters.Builder = LinuxParameters.Builder.create(scope, id)

    /**
     * Specifies whether to run an init process inside the container that forwards signals and reaps
     * processes.
     *
     * Default: false
     *
     * @param initProcessEnabled Specifies whether to run an init process inside the container that
     *   forwards signals and reaps processes.
     */
    public fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    /**
     * The total amount of swap memory a container can use.
     *
     * This parameter will be translated to the --memory-swap option to docker run.
     *
     * This parameter is only supported when you are using the EC2 launch type. Accepted values are
     * positive integers.
     *
     * Default: No swap.
     *
     * @param maxSwap The total amount of swap memory a container can use.
     */
    public fun maxSwap(maxSwap: Size) {
        cdkBuilder.maxSwap(maxSwap)
    }

    /**
     * The value for the size of the /dev/shm volume.
     *
     * Default: No shared memory.
     *
     * @param sharedMemorySize The value for the size of the /dev/shm volume.
     */
    public fun sharedMemorySize(sharedMemorySize: Size) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    /**
     * This allows you to tune a container's memory swappiness behavior.
     *
     * This parameter maps to the --memory-swappiness option to docker run. The swappiness relates
     * to the kernel's tendency to swap memory. A value of 0 will cause swapping to not happen
     * unless absolutely necessary. A value of 100 will cause pages to be swapped very aggressively.
     *
     * This parameter is only supported when you are using the EC2 launch type. Accepted values are
     * whole numbers between 0 and 100. If a value is not specified for maxSwap then this parameter
     * is ignored.
     *
     * Default: 60
     *
     * @param swappiness This allows you to tune a container's memory swappiness behavior.
     */
    public fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
    }

    public fun build(): LinuxParameters = cdkBuilder.build()
}
