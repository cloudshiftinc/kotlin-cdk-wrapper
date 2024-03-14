package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SecretsManagerSecretOptions {
  /**
   * The key of a JSON field to retrieve.
   *
   * This can only be used if the secret
   * stores a JSON object.
   *
   * Default: - returns all the content stored in the Secrets Manager secret.
   */
  public fun jsonField(): String? = unwrap(this).getJsonField()

  /**
   * Specifies the unique identifier of the version of the secret you want to use.
   *
   * Can specify at most one of `versionId` and `versionStage`.
   *
   * Default: AWSCURRENT
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * Specifies the secret version that you want to retrieve by the staging label attached to the
   * version.
   *
   * Can specify at most one of `versionId` and `versionStage`.
   *
   * Default: AWSCURRENT
   */
  public fun versionStage(): String? = unwrap(this).getVersionStage()

  /**
   * A builder for [SecretsManagerSecretOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param jsonField The key of a JSON field to retrieve.
     * This can only be used if the secret
     * stores a JSON object.
     */
    public fun jsonField(jsonField: String)

    /**
     * @param versionId Specifies the unique identifier of the version of the secret you want to
     * use.
     * Can specify at most one of `versionId` and `versionStage`.
     */
    public fun versionId(versionId: String)

    /**
     * @param versionStage Specifies the secret version that you want to retrieve by the staging
     * label attached to the version.
     * Can specify at most one of `versionId` and `versionStage`.
     */
    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SecretsManagerSecretOptions.Builder =
        software.amazon.awscdk.SecretsManagerSecretOptions.builder()

    /**
     * @param jsonField The key of a JSON field to retrieve.
     * This can only be used if the secret
     * stores a JSON object.
     */
    override fun jsonField(jsonField: String) {
      cdkBuilder.jsonField(jsonField)
    }

    /**
     * @param versionId Specifies the unique identifier of the version of the secret you want to
     * use.
     * Can specify at most one of `versionId` and `versionStage`.
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    /**
     * @param versionStage Specifies the secret version that you want to retrieve by the staging
     * label attached to the version.
     * Can specify at most one of `versionId` and `versionStage`.
     */
    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.SecretsManagerSecretOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions,
  ) : CdkObject(cdkObject), SecretsManagerSecretOptions {
    /**
     * The key of a JSON field to retrieve.
     *
     * This can only be used if the secret
     * stores a JSON object.
     *
     * Default: - returns all the content stored in the Secrets Manager secret.
     */
    override fun jsonField(): String? = unwrap(this).getJsonField()

    /**
     * Specifies the unique identifier of the version of the secret you want to use.
     *
     * Can specify at most one of `versionId` and `versionStage`.
     *
     * Default: AWSCURRENT
     */
    override fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * Specifies the secret version that you want to retrieve by the staging label attached to the
     * version.
     *
     * Can specify at most one of `versionId` and `versionStage`.
     *
     * Default: AWSCURRENT
     */
    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretsManagerSecretOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SecretsManagerSecretOptions):
        SecretsManagerSecretOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretsManagerSecretOptions):
        software.amazon.awscdk.SecretsManagerSecretOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.SecretsManagerSecretOptions
  }
}
