@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new secret in AWS SecretsManager.
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
public open class Secret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.Secret,
) : Resource(cdkObject), ISecret {
  /**
   * Adds a replica region for the secret.
   *
   * @param region The name of the region. 
   * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
   * value.
   */
  public open fun addReplicaRegion(region: String) {
    unwrap(this).addReplicaRegion(region)
  }

  /**
   * Adds a replica region for the secret.
   *
   * @param region The name of the region. 
   * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
   * value.
   */
  public open fun addReplicaRegion(region: String, encryptionKey: IKey) {
    unwrap(this).addReplicaRegion(region, encryptionKey.let(IKey::unwrap))
  }

  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  public override fun addRotationSchedule(id: String, options: RotationScheduleOptions):
      RotationSchedule = unwrap(this).addRotationSchedule(id,
      options.let(RotationScheduleOptions::unwrap)).let(RotationSchedule::wrap)

  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public override fun addRotationSchedule(id: String,
      options: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
      addRotationSchedule(id, RotationScheduleOptions(options))

  /**
   * Adds a statement to the IAM resource policy associated with this secret.
   *
   * If this secret was created in this stack, a resource policy will be
   * automatically created upon the first call to `addToResourcePolicy`. If
   * the secret is imported, then this is a no-op.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the IAM resource policy associated with this secret.
   *
   * If this secret was created in this stack, a resource policy will be
   * automatically created upon the first call to `addToResourcePolicy`. If
   * the secret is imported, then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Attach a target to this secret.
   *
   * @return An attached secret
   * @param target The target to attach. 
   */
  public override fun attach(target: ISecretAttachmentTarget): ISecret =
      unwrap(this).attach(target.let(ISecretAttachmentTarget::unwrap)).let(ISecret::wrap)

  /**
   * Denies the `DeleteSecret` action to all principals within the current account.
   */
  public override fun denyAccountRootDelete() {
    unwrap(this).denyAccountRootDelete()
  }

  /**
   * The customer-managed encryption key that is used to encrypt this secret, if any.
   *
   * When not specified, the default
   * KMS key for the account and region is being used.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The string of the characters that are excluded in this secret when it is generated.
   */
  public open fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee 
   * @param versionStages
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee 
   * @param versionStages
   */
  public override fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap), versionStages).let(Grant::wrap)

  /**
   * Grants writing and updating the secret value to some role.
   *
   * @param grantee 
   */
  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the secret in AWS Secrets Manager.
   *
   * Will return the full ARN if available, otherwise a partial arn.
   * For secrets imported by the deprecated `fromSecretName`, it will return the `secretName`.
   */
  public override fun secretArn(): String = unwrap(this).getSecretArn()

  /**
   * The full ARN of the secret in AWS Secrets Manager, which is the ARN including the Secrets
   * Manager-supplied 6-character suffix.
   *
   * This is equal to `secretArn` in most cases, but is undefined when a full ARN is not available
   * (e.g., secrets imported by name).
   */
  public override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  /**
   * The name of the secret.
   *
   * For "owned" secrets, this will be the full resource name (secret name + suffix), unless the
   * '&#64;aws-cdk/aws-secretsmanager:parseOwnedSecretName' feature flag is set.
   */
  public override fun secretName(): String = unwrap(this).getSecretName()

  /**
   * Retrieve the value of the stored secret as a `SecretValue`.
   */
  public override fun secretValue(): SecretValue =
      unwrap(this).getSecretValue().let(SecretValue::wrap)

  /**
   * Interpret the secret as a JSON object and return a field's value from it as a `SecretValue`.
   *
   * @param jsonField 
   */
  public override fun secretValueFromJson(jsonField: String): SecretValue =
      unwrap(this).secretValueFromJson(jsonField).let(SecretValue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.Secret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional, human-friendly description of the secret.
     *
     * Default: - No description.
     *
     * @param description An optional, human-friendly description of the secret. 
     */
    public fun description(description: String)

    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     *
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each
     * category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value. 
     */
    public fun generateSecretString(generateSecretString: SecretStringGenerator)

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each
     * category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432bf523ce3cefc0354228b8978c1c1b0db664de7ca5a31b7c101f2cd30dc646")
    public fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit)

    /**
     * Policy to apply when the secret is removed from this stack.
     *
     * Default: - Not set.
     *
     * @param removalPolicy Policy to apply when the secret is removed from this stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    /**
     * A name for the secret.
     *
     * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
     * 30 days blackout period. During that period, it is not possible to create another secret that
     * shares the same name.
     *
     * Default: - A name is generated by CloudFormation.
     *
     * @param secretName A name for the secret. 
     */
    public fun secretName(secretName: String)

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
     *
     * @param secretObjectValue Initial value for a JSON secret. 
     */
    public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>)

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
     * @param secretStringBeta1 Initial value for the secret. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1)

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
     *
     * @param secretStringValue Initial value for the secret. 
     */
    public fun secretStringValue(secretStringValue: SecretValue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.Secret.Builder =
        software.amazon.awscdk.services.secretsmanager.Secret.Builder.create(scope, id)

    /**
     * An optional, human-friendly description of the secret.
     *
     * Default: - No description.
     *
     * @param description An optional, human-friendly description of the secret. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     *
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each
     * category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value. 
     */
    override fun generateSecretString(generateSecretString: SecretStringGenerator) {
      cdkBuilder.generateSecretString(generateSecretString.let(SecretStringGenerator::unwrap))
    }

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each
     * category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432bf523ce3cefc0354228b8978c1c1b0db664de7ca5a31b7c101f2cd30dc646")
    override
        fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit):
        Unit = generateSecretString(SecretStringGenerator(generateSecretString))

    /**
     * Policy to apply when the secret is removed from this stack.
     *
     * Default: - Not set.
     *
     * @param removalPolicy Policy to apply when the secret is removed from this stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    /**
     * A name for the secret.
     *
     * Note that deleting secrets from SecretsManager does not happen immediately, but after a 7 to
     * 30 days blackout period. During that period, it is not possible to create another secret that
     * shares the same name.
     *
     * Default: - A name is generated by CloudFormation.
     *
     * @param secretName A name for the secret. 
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

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
     *
     * @param secretObjectValue Initial value for a JSON secret. 
     */
    override fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
      cdkBuilder.secretObjectValue(secretObjectValue.mapValues{SecretValue.unwrap(it.value)})
    }

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
     * @param secretStringBeta1 Initial value for the secret. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
      cdkBuilder.secretStringBeta1(secretStringBeta1.let(SecretStringValueBeta1::unwrap))
    }

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
     *
     * @param secretStringValue Initial value for the secret. 
     */
    override fun secretStringValue(secretStringValue: SecretValue) {
      cdkBuilder.secretStringValue(secretStringValue.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.Secret = cdkBuilder.build()
  }

  public companion object {
    public fun fromSecretAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecretAttributes,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SecretAttributes::unwrap)).let(ISecret::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc9143f7f368629afa8c68f5cc797692785ded40710919292c6e0847b43e61e")
    public fun fromSecretAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecretAttributes.Builder.() -> Unit,
    ): ISecret = fromSecretAttributes(scope, id, SecretAttributes(attrs))

    public fun fromSecretCompleteArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretCompleteArn: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretCompleteArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretCompleteArn).let(ISecret::wrap)

    public fun fromSecretNameV2(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretName: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretNameV2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretName).let(ISecret::wrap)

    public fun fromSecretPartialArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretPartialArn: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretPartialArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretPartialArn).let(ISecret::wrap)

    public fun isSecret(x: Any): Boolean =
        software.amazon.awscdk.services.secretsmanager.Secret.isSecret(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Secret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Secret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.Secret): Secret =
        Secret(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.secretsmanager.Secret =
        wrapped.cdkObject
  }
}
