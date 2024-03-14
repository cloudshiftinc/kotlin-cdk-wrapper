package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EksVolumeOptions {
  /**
   * The path on the container where the volume is mounted.
   *
   * Default: - the volume is not mounted
   */
  public fun mountPath(): String? = unwrap(this).getMountPath()

  /**
   * The name of this volume.
   *
   * The name must be a valid DNS subdomain name.
   *
   * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
   */
  public fun name(): String

  /**
   * If specified, the container has readonly access to the volume.
   *
   * Otherwise, the container has read/write access.
   *
   * Default: false
   */
  public fun readonly(): Boolean? = unwrap(this).getReadonly()

  /**
   * A builder for [EksVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EksVolumeOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.EksVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EksVolumeOptions,
  ) : EksVolumeOptions {
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
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EksVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksVolumeOptions):
        EksVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksVolumeOptions):
        software.amazon.awscdk.services.batch.EksVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
