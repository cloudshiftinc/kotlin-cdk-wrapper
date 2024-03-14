package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EmptyDirVolumeOptions : EksVolumeOptions {
  /**
   * The storage type to use for this Volume.
   *
   * Default: `EmptyDirMediumType.DISK`
   */
  public fun medium(): EmptyDirMediumType? = unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

  /**
   * The maximum size for this Volume.
   *
   * Default: - no size limit
   */
  public fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)

  /**
   * A builder for [EmptyDirVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param medium The storage type to use for this Volume.
     */
    public fun medium(medium: EmptyDirMediumType)

    /**
     * @param mountPath The path on the container where the volume is mounted.
     */
    public fun mountPath(mountPath: String)

    /**
     * @param name The name of this volume. 
     * The name must be a valid DNS subdomain name.
     */
    public fun name(name: String)

    /**
     * @param readonly If specified, the container has readonly access to the volume.
     * Otherwise, the container has read/write access.
     */
    public fun readonly(readonly: Boolean)

    /**
     * @param sizeLimit The maximum size for this Volume.
     */
    public fun sizeLimit(sizeLimit: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EmptyDirVolumeOptions.builder()

    /**
     * @param medium The storage type to use for this Volume.
     */
    override fun medium(medium: EmptyDirMediumType) {
      cdkBuilder.medium(medium.let(EmptyDirMediumType::unwrap))
    }

    /**
     * @param mountPath The path on the container where the volume is mounted.
     */
    override fun mountPath(mountPath: String) {
      cdkBuilder.mountPath(mountPath)
    }

    /**
     * @param name The name of this volume. 
     * The name must be a valid DNS subdomain name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readonly If specified, the container has readonly access to the volume.
     * Otherwise, the container has read/write access.
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    /**
     * @param sizeLimit The maximum size for this Volume.
     */
    override fun sizeLimit(sizeLimit: Size) {
      cdkBuilder.sizeLimit(sizeLimit.let(Size::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.EmptyDirVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions,
  ) : EmptyDirVolumeOptions {
    /**
     * The storage type to use for this Volume.
     *
     * Default: `EmptyDirMediumType.DISK`
     */
    override fun medium(): EmptyDirMediumType? =
        unwrap(this).getMedium()?.let(EmptyDirMediumType::wrap)

    /**
     * The path on the container where the volume is mounted.
     *
     * Default: - the volume is not mounted
     */
    override fun mountPath(): String? = unwrap(this).getMountPath()

    /**
     * The name of this volume.
     *
     * The name must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     */
    override fun readonly(): Boolean? = unwrap(this).getReadonly()

    /**
     * The maximum size for this Volume.
     *
     * Default: - no size limit
     */
    override fun sizeLimit(): Size? = unwrap(this).getSizeLimit()?.let(Size::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EmptyDirVolumeOptions):
        EmptyDirVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmptyDirVolumeOptions):
        software.amazon.awscdk.services.batch.EmptyDirVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
