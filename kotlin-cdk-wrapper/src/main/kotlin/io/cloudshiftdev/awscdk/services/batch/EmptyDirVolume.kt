@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A Kubernetes EmptyDir volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * Size size;
 * EmptyDirVolume emptyDirVolume = EmptyDirVolume.Builder.create()
 * .name("name")
 * // the properties below are optional
 * .medium(EmptyDirMediumType.DISK)
 * .mountPath("mountPath")
 * .readonly(false)
 * .sizeLimit(size)
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
 */
public open class EmptyDirVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolume,
) : EksVolume(cdkObject) {
  public constructor(options: EmptyDirVolumeOptions) :
      this(software.amazon.awscdk.services.batch.EmptyDirVolume(options.let(EmptyDirVolumeOptions::unwrap))
  )

  public constructor(options: EmptyDirVolumeOptions.Builder.() -> Unit) :
      this(EmptyDirVolumeOptions(options)
  )

  /**
   * The storage type to use for this Volume.
   *
   * Default: `EmptyDirMediumType.DISK`
   */
  public open fun medium(): EmptyDirMediumType? =
      unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

  /**
   * The maximum size for this Volume.
   *
   * Default: - no size limit
   */
  public open fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EmptyDirVolume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The storage type to use for this Volume.
     *
     * Default: `EmptyDirMediumType.DISK`
     *
     * @param medium The storage type to use for this Volume. 
     */
    public fun medium(medium: EmptyDirMediumType)

    /**
     * The path on the container where the volume is mounted.
     *
     * Default: - the volume is not mounted
     *
     * @param mountPath The path on the container where the volume is mounted. 
     */
    public fun mountPath(mountPath: String)

    /**
     * The name of this volume.
     *
     * The name must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * @param name The name of this volume. 
     */
    public fun name(name: String)

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     *
     * @param readonly If specified, the container has readonly access to the volume. 
     */
    public fun readonly(readonly: Boolean)

    /**
     * The maximum size for this Volume.
     *
     * Default: - no size limit
     *
     * @param sizeLimit The maximum size for this Volume. 
     */
    public fun sizeLimit(sizeLimit: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EmptyDirVolume.Builder =
        software.amazon.awscdk.services.batch.EmptyDirVolume.Builder.create()

    /**
     * The storage type to use for this Volume.
     *
     * Default: `EmptyDirMediumType.DISK`
     *
     * @param medium The storage type to use for this Volume. 
     */
    override fun medium(medium: EmptyDirMediumType) {
      cdkBuilder.medium(medium.let(EmptyDirMediumType::unwrap))
    }

    /**
     * The path on the container where the volume is mounted.
     *
     * Default: - the volume is not mounted
     *
     * @param mountPath The path on the container where the volume is mounted. 
     */
    override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    /**
     * The name of this volume.
     *
     * The name must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * @param name The name of this volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     *
     * @param readonly If specified, the container has readonly access to the volume. 
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    /**
     * The maximum size for this Volume.
     *
     * Default: - no size limit
     *
     * @param sizeLimit The maximum size for this Volume. 
     */
    override fun sizeLimit(sizeLimit: Size) {
      cdkBuilder.sizeLimit(sizeLimit.let(Size::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EmptyDirVolume = cdkBuilder.build()
  }

  public companion object {
    public fun isEmptyDirVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.EmptyDirVolume.isEmptyDirVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirVolume {
      val builderImpl = BuilderImpl()
      return EmptyDirVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolume):
        EmptyDirVolume = EmptyDirVolume(cdkObject)

    internal fun unwrap(wrapped: EmptyDirVolume):
        software.amazon.awscdk.services.batch.EmptyDirVolume = wrapped.cdkObject
  }
}
