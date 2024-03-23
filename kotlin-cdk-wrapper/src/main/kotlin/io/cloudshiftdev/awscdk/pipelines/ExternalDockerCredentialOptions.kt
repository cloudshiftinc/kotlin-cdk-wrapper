@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for defining credentials for a Docker Credential.
 *
 * Example:
 *
 * ```
 * ISecret dockerHubSecret = Secret.fromSecretCompleteArn(this, "DHSecret", "arn:aws:...");
 * // Only the image asset publishing actions will be granted read access to the secret.
 * DockerCredential creds = DockerCredential.dockerHub(dockerHubSecret,
 * ExternalDockerCredentialOptions.builder().usages(List.of(DockerCredentialUsage.ASSET_PUBLISHING)).build());
 * ```
 */
public interface ExternalDockerCredentialOptions {
  /**
   * An IAM role to assume prior to accessing the secret.
   *
   * Default: - none. The current execution role will be used.
   */
  public fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

  /**
   * The name of the JSON field of the secret which contains the secret/password.
   *
   * Default: 'secret'
   */
  public fun secretPasswordField(): String? = unwrap(this).getSecretPasswordField()

  /**
   * The name of the JSON field of the secret which contains the user/login name.
   *
   * Default: 'username'
   */
  public fun secretUsernameField(): String? = unwrap(this).getSecretUsernameField()

  /**
   * Defines which stages of the pipeline should be granted access to these credentials.
   *
   * Default: - all relevant stages (synth, self-update, asset publishing) are granted access.
   */
  public fun usages(): List<DockerCredentialUsage> =
      unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()

  /**
   * A builder for [ExternalDockerCredentialOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRole An IAM role to assume prior to accessing the secret.
     */
    public fun assumeRole(assumeRole: IRole)

    /**
     * @param secretPasswordField The name of the JSON field of the secret which contains the
     * secret/password.
     */
    public fun secretPasswordField(secretPasswordField: String)

    /**
     * @param secretUsernameField The name of the JSON field of the secret which contains the
     * user/login name.
     */
    public fun secretUsernameField(secretUsernameField: String)

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     * credentials.
     */
    public fun usages(usages: List<DockerCredentialUsage>)

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     * credentials.
     */
    public fun usages(vararg usages: DockerCredentialUsage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions.Builder
        = software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions.builder()

    /**
     * @param assumeRole An IAM role to assume prior to accessing the secret.
     */
    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    /**
     * @param secretPasswordField The name of the JSON field of the secret which contains the
     * secret/password.
     */
    override fun secretPasswordField(secretPasswordField: String) {
      cdkBuilder.secretPasswordField(secretPasswordField)
    }

    /**
     * @param secretUsernameField The name of the JSON field of the secret which contains the
     * user/login name.
     */
    override fun secretUsernameField(secretUsernameField: String) {
      cdkBuilder.secretUsernameField(secretUsernameField)
    }

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     * credentials.
     */
    override fun usages(usages: List<DockerCredentialUsage>) {
      cdkBuilder.usages(usages.map(DockerCredentialUsage::unwrap))
    }

    /**
     * @param usages Defines which stages of the pipeline should be granted access to these
     * credentials.
     */
    override fun usages(vararg usages: DockerCredentialUsage): Unit = usages(usages.toList())

    public fun build(): software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions,
  ) : CdkObject(cdkObject), ExternalDockerCredentialOptions {
    /**
     * An IAM role to assume prior to accessing the secret.
     *
     * Default: - none. The current execution role will be used.
     */
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    /**
     * The name of the JSON field of the secret which contains the secret/password.
     *
     * Default: 'secret'
     */
    override fun secretPasswordField(): String? = unwrap(this).getSecretPasswordField()

    /**
     * The name of the JSON field of the secret which contains the user/login name.
     *
     * Default: 'username'
     */
    override fun secretUsernameField(): String? = unwrap(this).getSecretUsernameField()

    /**
     * Defines which stages of the pipeline should be granted access to these credentials.
     *
     * Default: - all relevant stages (synth, self-update, asset publishing) are granted access.
     */
    override fun usages(): List<DockerCredentialUsage> =
        unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalDockerCredentialOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions):
        ExternalDockerCredentialOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ExternalDockerCredentialOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalDockerCredentialOptions):
        software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions
  }
}
