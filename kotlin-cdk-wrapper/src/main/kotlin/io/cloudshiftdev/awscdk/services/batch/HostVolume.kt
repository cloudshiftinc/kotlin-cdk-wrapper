@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Creates a Host volume.
 *
 * This volume will persist on the host at the specified `hostPath`.
 * If the `hostPath` is not specified, Docker will choose the host path. In this case,
 * the data may not persist after the containers that use it stop running.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * HostVolume hostVolume = HostVolume.Builder.create()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .hostPath("hostPath")
 * .readonly(false)
 * .build();
 * ```
 */
public open class HostVolume(
  cdkObject: software.amazon.awscdk.services.batch.HostVolume,
) : EcsVolume(cdkObject) {
  public constructor(options: HostVolumeOptions) :
      this(software.amazon.awscdk.services.batch.HostVolume(options.let(HostVolumeOptions.Companion::unwrap))
  )

  public constructor(options: HostVolumeOptions.Builder.() -> Unit) :
      this(HostVolumeOptions(options)
  )

  /**
   * The path on the host machine this container will have access to.
   */
  public open fun hostPath(): String? = unwrap(this).getHostPath()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.HostVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * the path on the container where this volume is mounted.
     *
     * @param containerPath the path on the container where this volume is mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * The path on the host machine this container will have access to.
     *
     * Default: - Docker will choose the host path.
     * The data may not persist after the containers that use it stop running.
     *
     * @param hostPath The path on the host machine this container will have access to. 
     */
    public fun hostPath(hostPath: String)

    /**
     * the name of this volume.
     *
     * @param name the name of this volume. 
     */
    public fun name(name: String)

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     *
     * @param readonly if set, the container will have readonly access to the volume. 
     */
    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostVolume.Builder =
        software.amazon.awscdk.services.batch.HostVolume.Builder.create()

    /**
     * the path on the container where this volume is mounted.
     *
     * @param containerPath the path on the container where this volume is mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * The path on the host machine this container will have access to.
     *
     * Default: - Docker will choose the host path.
     * The data may not persist after the containers that use it stop running.
     *
     * @param hostPath The path on the host machine this container will have access to. 
     */
    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    /**
     * the name of this volume.
     *
     * @param name the name of this volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     *
     * @param readonly if set, the container will have readonly access to the volume. 
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.HostVolume = cdkBuilder.build()
  }

  public companion object {
    public fun isHostVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.HostVolume.isHostVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): HostVolume {
      val builderImpl = BuilderImpl()
      return HostVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostVolume): HostVolume =
        HostVolume(cdkObject)

    internal fun unwrap(wrapped: HostVolume): software.amazon.awscdk.services.batch.HostVolume =
        wrapped.cdkObject as software.amazon.awscdk.services.batch.HostVolume
  }
}
