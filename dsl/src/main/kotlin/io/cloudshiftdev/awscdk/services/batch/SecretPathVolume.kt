package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class SecretPathVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.SecretPathVolume,
) : EksVolume(cdkObject) {
  /**
   * Specifies whether the secret or the secret's keys must be defined.
   *
   * Default: true
   */
  public open fun optional(): Boolean? = unwrap(this).getOptional()

  /**
   * The name of the secret.
   *
   * Must be a valid DNS subdomain name.
   *
   * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
   */
  public open fun secretName(): String = unwrap(this).getSecretName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.SecretPathVolume].
   */
  @CdkDslMarker
  public interface Builder {
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
     * Specifies whether the secret or the secret's keys must be defined.
     *
     * Default: true
     *
     * @param optional Specifies whether the secret or the secret's keys must be defined. 
     */
    public fun optional(optional: Boolean)

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
     * The name of the secret.
     *
     * Must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * @param secretName The name of the secret. 
     */
    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretPathVolume.Builder =
        software.amazon.awscdk.services.batch.SecretPathVolume.Builder.create()

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
     * Specifies whether the secret or the secret's keys must be defined.
     *
     * Default: true
     *
     * @param optional Specifies whether the secret or the secret's keys must be defined. 
     */
    override fun optional(optional: Boolean) {
      cdkBuilder.optional(optional)
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
     * The name of the secret.
     *
     * Must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     * @param secretName The name of the secret. 
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretPathVolume = cdkBuilder.build()
  }

  public companion object {
    public fun isSecretPathVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.SecretPathVolume.isSecretPathVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretPathVolume {
      val builderImpl = BuilderImpl()
      return SecretPathVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretPathVolume):
        SecretPathVolume = SecretPathVolume(cdkObject)

    internal fun unwrap(wrapped: SecretPathVolume):
        software.amazon.awscdk.services.batch.SecretPathVolume = wrapped.cdkObject
  }
}
