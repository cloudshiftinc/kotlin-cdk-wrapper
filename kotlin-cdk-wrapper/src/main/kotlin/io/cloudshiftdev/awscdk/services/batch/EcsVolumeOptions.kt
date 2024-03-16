@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options to configure an EcsVolume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * EcsVolumeOptions ecsVolumeOptions = EcsVolumeOptions.builder()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .readonly(false)
 * .build();
 * ```
 */
public interface EcsVolumeOptions {
  /**
   * the path on the container where this volume is mounted.
   */
  public fun containerPath(): String

  /**
   * the name of this volume.
   */
  public fun name(): String

  /**
   * if set, the container will have readonly access to the volume.
   *
   * Default: false
   */
  public fun readonly(): Boolean? = unwrap(this).getReadonly()

  /**
   * A builder for [EcsVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param name the name of this volume. 
     */
    public fun name(name: String)

    /**
     * @param readonly if set, the container will have readonly access to the volume.
     */
    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EcsVolumeOptions.builder()

    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param name the name of this volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readonly if set, the container will have readonly access to the volume.
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions,
  ) : CdkObject(cdkObject), EcsVolumeOptions {
    /**
     * the path on the container where this volume is mounted.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * the name of this volume.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     */
    override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions):
        EcsVolumeOptions = CdkObjectWrappers.wrap(cdkObject) as EcsVolumeOptions

    internal fun unwrap(wrapped: EcsVolumeOptions):
        software.amazon.awscdk.services.batch.EcsVolumeOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsVolumeOptions
  }
}
