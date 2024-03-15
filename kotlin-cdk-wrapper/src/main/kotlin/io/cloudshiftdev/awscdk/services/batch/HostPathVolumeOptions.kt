@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for a kubernetes HostPath volume.
 *
 * Example:
 *
 * ```
 * EksJobDefinition jobDefn;
 * jobDefn.container.addVolume(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("emptyDir")
 * .mountPath("/Volumes/emptyDir")
 * .build()));
 * jobDefn.container.addVolume(EksVolume.hostPath(HostPathVolumeOptions.builder()
 * .name("hostPath")
 * .hostPath("/sys")
 * .mountPath("/Volumes/hostPath")
 * .build()));
 * jobDefn.container.addVolume(EksVolume.secret(SecretPathVolumeOptions.builder()
 * .name("secret")
 * .optional(true)
 * .mountPath("/Volumes/secret")
 * .secretName("mySecret")
 * .build()));
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
 */
public interface HostPathVolumeOptions : EksVolumeOptions {
  /**
   * The path of the file or directory on the host to mount into containers on the pod.
   *
   * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
   *
   * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
   */
  public fun hostPath(): String

  /**
   * A builder for [HostPathVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostPath The path of the file or directory on the host to mount into containers on the
     * pod. 
     * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
     */
    public fun hostPath(hostPath: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostPathVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.HostPathVolumeOptions.builder()

    /**
     * @param hostPath The path of the file or directory on the host to mount into containers on the
     * pod. 
     * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
     */
    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
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

    public fun build(): software.amazon.awscdk.services.batch.HostPathVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.HostPathVolumeOptions,
  ) : CdkObject(cdkObject), HostPathVolumeOptions {
    /**
     * The path of the file or directory on the host to mount into containers on the pod.
     *
     * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     */
    override fun hostPath(): String = unwrap(this).getHostPath()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): HostPathVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostPathVolumeOptions):
        HostPathVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostPathVolumeOptions):
        software.amazon.awscdk.services.batch.HostPathVolumeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.HostPathVolumeOptions
  }
}
