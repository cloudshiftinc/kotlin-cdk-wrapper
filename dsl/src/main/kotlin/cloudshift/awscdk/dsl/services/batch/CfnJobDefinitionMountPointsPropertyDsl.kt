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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Details for a Docker volume mount point that's used in a job's container properties.
 *
 * This parameter maps to `Volumes` in the
 * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container)
 * section of the *Docker Remote API* and the `--volume` option to docker run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * MountPointsProperty mountPointsProperty = MountPointsProperty.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .sourceVolume("sourceVolume")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html)
 */
@CdkDslMarker
public class CfnJobDefinitionMountPointsPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.MountPointsProperty.Builder =
        CfnJobDefinition.MountPointsProperty.builder()

    /** @param containerPath The path on the container where the host volume is mounted. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param readOnly If this value is `true` , the container has read-only access to the volume.
     *   Otherwise, the container can write to the volume. The default value is `false` .
     */
    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param readOnly If this value is `true` , the container has read-only access to the volume.
     *   Otherwise, the container can write to the volume. The default value is `false` .
     */
    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    /** @param sourceVolume The name of the volume to mount. */
    public fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
    }

    public fun build(): CfnJobDefinition.MountPointsProperty = cdkBuilder.build()
}
