@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The details on a data volume from another container in the same task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * VolumeFrom volumeFrom = VolumeFrom.builder()
 * .readOnly(false)
 * .sourceContainer("sourceContainer")
 * .build();
 * ```
 */
public interface VolumeFrom {
  /**
   * Specifies whether the container has read-only access to the volume.
   *
   * If this value is true, the container has read-only access to the volume.
   * If this value is false, then the container can write to the volume.
   */
  public fun readOnly(): Boolean

  /**
   * The name of another container within the same task definition from which to mount volumes.
   */
  public fun sourceContainer(): String

  /**
   * A builder for [VolumeFrom]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param readOnly Specifies whether the container has read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    public fun readOnly(readOnly: Boolean)

    /**
     * @param sourceContainer The name of another container within the same task definition from
     * which to mount volumes. 
     */
    public fun sourceContainer(sourceContainer: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.VolumeFrom.Builder =
        software.amazon.awscdk.services.ecs.VolumeFrom.builder()

    /**
     * @param readOnly Specifies whether the container has read-only access to the volume. 
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    /**
     * @param sourceContainer The name of another container within the same task definition from
     * which to mount volumes. 
     */
    override fun sourceContainer(sourceContainer: String) {
      cdkBuilder.sourceContainer(sourceContainer)
    }

    public fun build(): software.amazon.awscdk.services.ecs.VolumeFrom = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.VolumeFrom,
  ) : CdkObject(cdkObject), VolumeFrom {
    /**
     * Specifies whether the container has read-only access to the volume.
     *
     * If this value is true, the container has read-only access to the volume.
     * If this value is false, then the container can write to the volume.
     */
    override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    /**
     * The name of another container within the same task definition from which to mount volumes.
     */
    override fun sourceContainer(): String = unwrap(this).getSourceContainer()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VolumeFrom {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.VolumeFrom): VolumeFrom =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VolumeFrom): software.amazon.awscdk.services.ecs.VolumeFrom =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.VolumeFrom
  }
}
