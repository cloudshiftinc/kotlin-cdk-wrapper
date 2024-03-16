@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The details of data volume mount points for a container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * MountPoint mountPoint = MountPoint.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .sourceVolume("sourceVolume")
 * .build();
 * ```
 */
public interface MountPoint : BaseMountPoint {
  /**
   * The name of the volume to mount.
   *
   * Must be a volume name referenced in the name parameter of task definition volume.
   */
  public fun sourceVolume(): String

  /**
   * A builder for [MountPoint]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath The path on the container to mount the host volume at. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    public fun readOnly(readOnly: Boolean)

    /**
     * @param sourceVolume The name of the volume to mount. 
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    public fun sourceVolume(sourceVolume: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.MountPoint.Builder =
        software.amazon.awscdk.services.ecs.MountPoint.builder()

    /**
     * @param containerPath The path on the container to mount the host volume at. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param sourceVolume The name of the volume to mount. 
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    override fun sourceVolume(sourceVolume: String) {
      cdkBuilder.sourceVolume(sourceVolume)
    }

    public fun build(): software.amazon.awscdk.services.ecs.MountPoint = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.MountPoint,
  ) : CdkObject(cdkObject), MountPoint {
    /**
     * The path on the container to mount the host volume at.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * Specifies whether to give the container read-only access to the volume.
     *
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    /**
     * The name of the volume to mount.
     *
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    override fun sourceVolume(): String = unwrap(this).getSourceVolume()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.MountPoint): MountPoint =
        CdkObjectWrappers.wrap(cdkObject) as MountPoint

    internal fun unwrap(wrapped: MountPoint): software.amazon.awscdk.services.ecs.MountPoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.MountPoint
  }
}
