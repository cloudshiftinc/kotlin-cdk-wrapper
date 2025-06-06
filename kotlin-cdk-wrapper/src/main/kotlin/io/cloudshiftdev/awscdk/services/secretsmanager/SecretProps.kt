@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * The properties required to create a new secret in AWS Secrets Manager.
 *
 * Example:
 *
 * ```
 * Stack stack;
 * User user = new User(this, "User");
 * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
 * Secret.Builder.create(this, "Secret")
 * .secretObjectValue(Map.of(
 * "username", SecretValue.unsafePlainText(user.getUserName()),
 * "database", SecretValue.unsafePlainText("foo"),
 * "password", accessKey.getSecretAccessKey()))
 * .build();
 * ```
 */
public interface SecretProps {
  /**
   * An optional, human-friendly description of the secret.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The customer-managed encryption key to use for encrypting the secret value.
   *
   * Default: - A default KMS key for the account and region is used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Configuration for how to generate a secret value.
   *
   * Only one of `secretString` and `generateSecretString` can be provided.
   *
   * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
   * (at least one from each
   * category), per the default values of ``SecretStringGenerator``.
   */
  public fun generateSecretString(): SecretStringGenerator? =
      unwrap(this).getGenerateSecretString()?.let(SecretStringGenerator::wrap)

  /**
   * Policy to apply when the secret is removed from this stack.
   *
   * Default: - Not set.
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A list of regions where to replicate this secret.
   *
   * Default: - Secret is not replicated
   */
  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  /**
   * A name for the secret.
   *
   * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
   * 30 days blackout period. During that period, it is not possible to create another secret that
   * shares the same name.
   *
   * Default: - A name is generated by CloudFormation.
   */
  public fun secretName(): String? = unwrap(this).getSecretName()

  /**
   * Initial value for a JSON secret.
   *
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret object -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies a JSON object that you want to encrypt and store in this new version of the secret.
   * To specify a simple string value instead, use `SecretProps.secretStringValue`
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
   * `generateSecretString` can be provided.
   *
   * Default: - SecretsManager generates a new secret value.
   *
   * Example:
   *
   * ```
   * User user;
   * AccessKey accessKey;
   * Stack stack;
   * Secret.Builder.create(stack, "JSONSecret")
   * .secretObjectValue(Map.of(
   * "username", SecretValue.unsafePlainText(user.getUserName()),  // intrinsic reference, not
   * exposed as plaintext
   * "database", SecretValue.unsafePlainText("foo"),  // rendered as plain text, but not a secret
   * "password", accessKey.getSecretAccessKey()))
   * .build();
   * ```
   */
  public fun secretObjectValue(): Map<String, SecretValue> =
      unwrap(this).getSecretObjectValue()?.mapValues{SecretValue.wrap(it.value)} ?: emptyMap()

  /**
   * (deprecated) Initial value for the secret.
   *
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret string -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies text data that you want to encrypt and store in this new version of the secret.
   * May be a simple string value, or a string representation of a JSON structure.
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
   * provided.
   *
   * Default: - SecretsManager generates a new secret value.
   *
   * @deprecated Use `secretStringValue` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun secretStringBeta1(): SecretStringValueBeta1? =
      unwrap(this).getSecretStringBeta1()?.let(SecretStringValueBeta1::wrap)

  /**
   * Initial value for the secret.
   *
   * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
   * to create the secret value.
   * The secret string -- if provided -- will be included in the output of the cdk as part of
   * synthesis,
   * and will appear in the CloudFormation template in the console. This can be secure(-ish) if that
   * value is merely reference to
   * another resource (or one of its attributes), but if the value is a plaintext string, it will be
   * visible to anyone with access
   * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
   *
   * Specifies text data that you want to encrypt and store in this new version of the secret.
   * May be a simple string value. To provide a string representation of JSON structure, use
   * `SecretProps.secretObjectValue` instead.
   *
   * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
   * `generateSecretString` can be provided.
   *
   * Default: - SecretsManager generates a new secret value.
   */
  public fun secretStringValue(): SecretValue? =
      unwrap(this).getSecretStringValue()?.let(SecretValue::wrap)

  /**
   * A builder for [SecretProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional, human-friendly description of the secret.
     */
    public fun description(description: String)

    /**
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param generateSecretString Configuration for how to generate a secret value.
     * Only one of `secretString` and `generateSecretString` can be provided.
     */
    public fun generateSecretString(generateSecretString: SecretStringGenerator)

    /**
     * @param generateSecretString Configuration for how to generate a secret value.
     * Only one of `secretString` and `generateSecretString` can be provided.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8af2d5073b6ec6287167783559d11ff0eff5112d334f13eb677be14bc6c75a3e")
    public fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit)

    /**
     * @param removalPolicy Policy to apply when the secret is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    /**
     * @param secretName A name for the secret.
     * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
     * 30 days blackout period. During that period, it is not possible to create another secret that
     * shares the same name.
     */
    public fun secretName(secretName: String)

    /**
     * @param secretObjectValue Initial value for a JSON secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret object -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies a JSON object that you want to encrypt and store in this new version of the secret.
     * To specify a simple string value instead, use `SecretProps.secretStringValue`
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     */
    public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>)

    /**
     * @param secretStringBeta1 Initial value for the secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value, or a string representation of a JSON structure.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
     * provided.
     * @deprecated Use `secretStringValue` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1)

    /**
     * @param secretStringValue Initial value for the secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value. To provide a string representation of JSON structure, use
     * `SecretProps.secretObjectValue` instead.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     */
    public fun secretStringValue(secretStringValue: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretProps.builder()

    /**
     * @param description An optional, human-friendly description of the secret.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param generateSecretString Configuration for how to generate a secret value.
     * Only one of `secretString` and `generateSecretString` can be provided.
     */
    override fun generateSecretString(generateSecretString: SecretStringGenerator) {
      cdkBuilder.generateSecretString(generateSecretString.let(SecretStringGenerator.Companion::unwrap))
    }

    /**
     * @param generateSecretString Configuration for how to generate a secret value.
     * Only one of `secretString` and `generateSecretString` can be provided.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8af2d5073b6ec6287167783559d11ff0eff5112d334f13eb677be14bc6c75a3e")
    override
        fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit):
        Unit = generateSecretString(SecretStringGenerator(generateSecretString))

    /**
     * @param removalPolicy Policy to apply when the secret is removed from this stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion.Companion::unwrap))
    }

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    /**
     * @param secretName A name for the secret.
     * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
     * 30 days blackout period. During that period, it is not possible to create another secret that
     * shares the same name.
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    /**
     * @param secretObjectValue Initial value for a JSON secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret object -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies a JSON object that you want to encrypt and store in this new version of the secret.
     * To specify a simple string value instead, use `SecretProps.secretStringValue`
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     */
    override fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
      cdkBuilder.secretObjectValue(secretObjectValue.mapValues{SecretValue.unwrap(it.value)})
    }

    /**
     * @param secretStringBeta1 Initial value for the secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value, or a string representation of a JSON structure.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
     * provided.
     * @deprecated Use `secretStringValue` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
      cdkBuilder.secretStringBeta1(secretStringBeta1.let(SecretStringValueBeta1.Companion::unwrap))
    }

    /**
     * @param secretStringValue Initial value for the secret.
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value. To provide a string representation of JSON structure, use
     * `SecretProps.secretObjectValue` instead.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     */
    override fun secretStringValue(secretStringValue: SecretValue) {
      cdkBuilder.secretStringValue(secretStringValue.let(SecretValue.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.SecretProps,
  ) : CdkObject(cdkObject),
      SecretProps {
    /**
     * An optional, human-friendly description of the secret.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each
     * category), per the default values of ``SecretStringGenerator``.
     */
    override fun generateSecretString(): SecretStringGenerator? =
        unwrap(this).getGenerateSecretString()?.let(SecretStringGenerator::wrap)

    /**
     * Policy to apply when the secret is removed from this stack.
     *
     * Default: - Not set.
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     */
    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

    /**
     * A name for the secret.
     *
     * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
     * 30 days blackout period. During that period, it is not possible to create another secret that
     * shares the same name.
     *
     * Default: - A name is generated by CloudFormation.
     */
    override fun secretName(): String? = unwrap(this).getSecretName()

    /**
     * Initial value for a JSON secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret object -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies a JSON object that you want to encrypt and store in this new version of the secret.
     * To specify a simple string value instead, use `SecretProps.secretStringValue`
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     *
     * Default: - SecretsManager generates a new secret value.
     *
     * Example:
     *
     * ```
     * User user;
     * AccessKey accessKey;
     * Stack stack;
     * Secret.Builder.create(stack, "JSONSecret")
     * .secretObjectValue(Map.of(
     * "username", SecretValue.unsafePlainText(user.getUserName()),  // intrinsic reference, not
     * exposed as plaintext
     * "database", SecretValue.unsafePlainText("foo"),  // rendered as plain text, but not a secret
     * "password", accessKey.getSecretAccessKey()))
     * .build();
     * ```
     */
    override fun secretObjectValue(): Map<String, SecretValue> =
        unwrap(this).getSecretObjectValue()?.mapValues{SecretValue.wrap(it.value)} ?: emptyMap()

    /**
     * (deprecated) Initial value for the secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value, or a string representation of a JSON structure.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
     * provided.
     *
     * Default: - SecretsManager generates a new secret value.
     *
     * @deprecated Use `secretStringValue` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun secretStringBeta1(): SecretStringValueBeta1? =
        unwrap(this).getSecretStringBeta1()?.let(SecretStringValueBeta1::wrap)

    /**
     * Initial value for the secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value.
     * The secret string -- if provided -- will be included in the output of the cdk as part of
     * synthesis,
     * and will appear in the CloudFormation template in the console. This can be secure(-ish) if
     * that value is merely reference to
     * another resource (or one of its attributes), but if the value is a plaintext string, it will
     * be visible to anyone with access
     * to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret.
     * May be a simple string value. To provide a string representation of JSON structure, use
     * `SecretProps.secretObjectValue` instead.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     *
     * Default: - SecretsManager generates a new secret value.
     */
    override fun secretStringValue(): SecretValue? =
        unwrap(this).getSecretStringValue()?.let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretProps):
        SecretProps = CdkObjectWrappers.wrap(cdkObject) as? SecretProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretProps):
        software.amazon.awscdk.services.secretsmanager.SecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretProps
  }
}
