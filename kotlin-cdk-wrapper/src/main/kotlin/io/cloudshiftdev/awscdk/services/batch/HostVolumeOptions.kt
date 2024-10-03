@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for configuring an ECS HostVolume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * HostVolumeOptions hostVolumeOptions = HostVolumeOptions.builder()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .hostPath("hostPath")
 * .readonly(false)
 * .build();
 * ```
 */
public interface HostVolumeOptions : EcsVolumeOptions {
  /**
   * The path on the host machine this container will have access to.
   *
   * Default: - Docker will choose the host path.
   * The data may not persist after the containers that use it stop running.
   */
  public fun hostPath(): String? = unwrap(this).getHostPath()

  /**
   * A builder for [HostVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param hostPath The path on the host machine this container will have access to.
     */
    public fun hostPath(hostPath: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.HostVolumeOptions.builder()

    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param hostPath The path on the host machine this container will have access to.
     */
    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
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

    public fun build(): software.amazon.awscdk.services.batch.HostVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions,
  ) : CdkObject(cdkObject),
      HostVolumeOptions {
    /**
     * the path on the container where this volume is mounted.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * The path on the host machine this container will have access to.
     *
     * Default: - Docker will choose the host path.
     * The data may not persist after the containers that use it stop running.
     */
    override fun hostPath(): String? = unwrap(this).getHostPath()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions):
        HostVolumeOptions = CdkObjectWrappers.wrap(cdkObject) as? HostVolumeOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostVolumeOptions):
        software.amazon.awscdk.services.batch.HostVolumeOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.HostVolumeOptions
  }
}
