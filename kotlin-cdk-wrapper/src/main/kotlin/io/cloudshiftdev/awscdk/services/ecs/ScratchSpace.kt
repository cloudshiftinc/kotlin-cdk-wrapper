@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The temporary disk space mounted to the container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ScratchSpace scratchSpace = ScratchSpace.builder()
 * .containerPath("containerPath")
 * .name("name")
 * .readOnly(false)
 * .sourcePath("sourcePath")
 * .build();
 * ```
 */
public interface ScratchSpace {
  /**
   * The path on the container to mount the scratch volume at.
   */
  public fun containerPath(): String

  /**
   * The name of the scratch volume to mount.
   *
   * Must be a volume name referenced in the name parameter of task definition volume.
   */
  public fun name(): String

  /**
   * Specifies whether to give the container read-only access to the scratch volume.
   *
   * If this value is true, the container has read-only access to the scratch volume.
   * If this value is false, then the container can write to the scratch volume.
   */
  public fun readOnly(): Boolean

  /**
   *
   */
  public fun sourcePath(): String

  /**
   * A builder for [ScratchSpace]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath The path on the container to mount the scratch volume at. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param name The name of the scratch volume to mount. 
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    public fun name(name: String)

    /**
     * @param readOnly Specifies whether to give the container read-only access to the scratch
     * volume. 
     * If this value is true, the container has read-only access to the scratch volume.
     * If this value is false, then the container can write to the scratch volume.
     */
    public fun readOnly(readOnly: Boolean)

    /**
     * @param sourcePath the value to be set. 
     */
    public fun sourcePath(sourcePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ScratchSpace.Builder =
        software.amazon.awscdk.services.ecs.ScratchSpace.builder()

    /**
     * @param containerPath The path on the container to mount the scratch volume at. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param name The name of the scratch volume to mount. 
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readOnly Specifies whether to give the container read-only access to the scratch
     * volume. 
     * If this value is true, the container has read-only access to the scratch volume.
     * If this value is false, then the container can write to the scratch volume.
     */
    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param sourcePath the value to be set. 
     */
    override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ScratchSpace = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ScratchSpace,
  ) : CdkObject(cdkObject), ScratchSpace {
    /**
     * The path on the container to mount the scratch volume at.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * The name of the scratch volume to mount.
     *
     * Must be a volume name referenced in the name parameter of task definition volume.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies whether to give the container read-only access to the scratch volume.
     *
     * If this value is true, the container has read-only access to the scratch volume.
     * If this value is false, then the container can write to the scratch volume.
     */
    override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    /**
     *
     */
    override fun sourcePath(): String = unwrap(this).getSourcePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScratchSpace {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ScratchSpace): ScratchSpace =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScratchSpace): software.amazon.awscdk.services.ecs.ScratchSpace =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ScratchSpace
  }
}
