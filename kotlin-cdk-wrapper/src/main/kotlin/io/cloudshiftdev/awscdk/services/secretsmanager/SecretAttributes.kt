@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Attributes required to import an existing secret into the Stack.
 *
 * One ARN format (`secretArn`, `secretCompleteArn`, `secretPartialArn`) must be provided.
 *
 * Example:
 *
 * ```
 * UserPool userpool = new UserPool(this, "Pool");
 * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
 * SecretAttributes.builder()
 * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
 * .build()).getSecretValue();
 * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
 * "Google")
 * .clientId("amzn-client-id")
 * .clientSecretValue(secret)
 * .userPool(userpool)
 * .build();
 * ```
 */
public interface SecretAttributes {
  /**
   * The encryption key that is used to encrypt the secret, unless the default SecretsManager key is
   * used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The complete ARN of the secret in SecretsManager.
   *
   * This is the ARN including the Secrets Manager 6-character suffix.
   * Cannot be used with `secretArn` or `secretPartialArn`.
   */
  public fun secretCompleteArn(): String? = unwrap(this).getSecretCompleteArn()

  /**
   * The partial ARN of the secret in SecretsManager.
   *
   * This is the ARN without the Secrets Manager 6-character suffix.
   * Cannot be used with `secretArn` or `secretCompleteArn`.
   */
  public fun secretPartialArn(): String? = unwrap(this).getSecretPartialArn()

  /**
   * A builder for [SecretAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey The encryption key that is used to encrypt the secret, unless the
     * default SecretsManager key is used.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param secretCompleteArn The complete ARN of the secret in SecretsManager.
     * This is the ARN including the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretPartialArn`.
     */
    public fun secretCompleteArn(secretCompleteArn: String)

    /**
     * @param secretPartialArn The partial ARN of the secret in SecretsManager.
     * This is the ARN without the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretCompleteArn`.
     */
    public fun secretPartialArn(secretPartialArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretAttributes.Builder
        = software.amazon.awscdk.services.secretsmanager.SecretAttributes.builder()

    /**
     * @param encryptionKey The encryption key that is used to encrypt the secret, unless the
     * default SecretsManager key is used.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param secretCompleteArn The complete ARN of the secret in SecretsManager.
     * This is the ARN including the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretPartialArn`.
     */
    override fun secretCompleteArn(secretCompleteArn: String) {
      cdkBuilder.secretCompleteArn(secretCompleteArn)
    }

    /**
     * @param secretPartialArn The partial ARN of the secret in SecretsManager.
     * This is the ARN without the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretCompleteArn`.
     */
    override fun secretPartialArn(secretPartialArn: String) {
      cdkBuilder.secretPartialArn(secretPartialArn)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttributes,
  ) : CdkObject(cdkObject),
      SecretAttributes {
    /**
     * The encryption key that is used to encrypt the secret, unless the default SecretsManager key
     * is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The complete ARN of the secret in SecretsManager.
     *
     * This is the ARN including the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretPartialArn`.
     */
    override fun secretCompleteArn(): String? = unwrap(this).getSecretCompleteArn()

    /**
     * The partial ARN of the secret in SecretsManager.
     *
     * This is the ARN without the Secrets Manager 6-character suffix.
     * Cannot be used with `secretArn` or `secretCompleteArn`.
     */
    override fun secretPartialArn(): String? = unwrap(this).getSecretPartialArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttributes):
        SecretAttributes = CdkObjectWrappers.wrap(cdkObject) as? SecretAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretAttributes):
        software.amazon.awscdk.services.secretsmanager.SecretAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretAttributes
  }
}
