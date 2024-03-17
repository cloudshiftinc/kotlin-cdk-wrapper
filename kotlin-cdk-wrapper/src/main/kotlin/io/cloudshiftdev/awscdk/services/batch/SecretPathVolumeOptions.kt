@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for a Kubernetes SecretPath Volume.
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
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#secret)
 */
public interface SecretPathVolumeOptions : EksVolumeOptions {
  /**
   * Specifies whether the secret or the secret's keys must be defined.
   *
   * Default: true
   */
  public fun optional(): Boolean? = unwrap(this).getOptional()

  /**
   * The name of the secret.
   *
   * Must be a valid DNS subdomain name.
   *
   * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
   */
  public fun secretName(): String

  /**
   * A builder for [SecretPathVolumeOptions]
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
     * @param optional Specifies whether the secret or the secret's keys must be defined.
     */
    public fun optional(optional: Boolean)

    /**
     * @param readonly If specified, the container has readonly access to the volume.
     * Otherwise, the container has read/write access.
     */
    public fun readonly(readonly: Boolean)

    /**
     * @param secretName The name of the secret. 
     * Must be a valid DNS subdomain name.
     */
    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretPathVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions.builder()

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
     * @param optional Specifies whether the secret or the secret's keys must be defined.
     */
    override fun optional(optional: Boolean) {
      cdkBuilder.optional(optional)
    }

    /**
     * @param readonly If specified, the container has readonly access to the volume.
     * Otherwise, the container has read/write access.
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    /**
     * @param secretName The name of the secret. 
     * Must be a valid DNS subdomain name.
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretPathVolumeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions,
  ) : CdkObject(cdkObject), SecretPathVolumeOptions {
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
     * Specifies whether the secret or the secret's keys must be defined.
     *
     * Default: true
     */
    override fun optional(): Boolean? = unwrap(this).getOptional()

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     */
    override fun readonly(): Boolean? = unwrap(this).getReadonly()

    /**
     * The name of the secret.
     *
     * Must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     */
    override fun secretName(): String = unwrap(this).getSecretName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretPathVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretPathVolumeOptions):
        SecretPathVolumeOptions = CdkObjectWrappers.wrap(cdkObject) as? SecretPathVolumeOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretPathVolumeOptions):
        software.amazon.awscdk.services.batch.SecretPathVolumeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.SecretPathVolumeOptions
  }
}
