@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.MountPoint

/**
 * The details of data volume mount points for a container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * MountPoint mountPoint = MountPoint.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .sourceVolume("sourceVolume")
 * .build();
 * ```
 */
@CdkDslMarker
public class MountPointDsl {
  private val cdkBuilder: MountPoint.Builder = MountPoint.builder()

  /**
   * @param containerPath The path on the container to mount the host volume at. 
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param readOnly Specifies whether to give the container read-only access to the volume. 
   * If this value is true, the container has read-only access to the volume.
   * If this value is false, then the container can write to the volume.
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param sourceVolume The name of the volume to mount. 
   * Must be a volume name referenced in the name parameter of task definition volume.
   */
  public fun sourceVolume(sourceVolume: String) {
    cdkBuilder.sourceVolume(sourceVolume)
  }

  public fun build(): MountPoint = cdkBuilder.build()
}
