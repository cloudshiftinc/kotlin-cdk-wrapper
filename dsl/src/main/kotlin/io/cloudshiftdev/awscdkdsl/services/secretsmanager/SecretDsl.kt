@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
import software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1
import software.constructs.Construct

/**
 * Creates a new secret in AWS SecretsManager.
 *
 * Example:
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
@CdkDslMarker
public class SecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Secret.Builder = Secret.Builder.create(scope, id)

    private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

    /**
     * An optional, human-friendly description of the secret.
     *
     * Default: - No description.
     *
     * @param description An optional, human-friendly description of the secret.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     *
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     *   value.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value.
     */
    public fun generateSecretString(
        generateSecretString: SecretStringGeneratorDsl.() -> Unit = {}
    ) {
        val builder = SecretStringGeneratorDsl()
        builder.apply(generateSecretString)
        cdkBuilder.generateSecretString(builder.build())
    }

    /**
     * Configuration for how to generate a secret value.
     *
     * Only one of `secretString` and `generateSecretString` can be provided.
     *
     * Default: - 32 characters with upper-case letters, lower-case letters, punctuation and numbers
     * (at least one from each category), per the default values of ``SecretStringGenerator``.
     *
     * @param generateSecretString Configuration for how to generate a secret value.
     */
    public fun generateSecretString(generateSecretString: SecretStringGenerator) {
        cdkBuilder.generateSecretString(generateSecretString)
    }

    /**
     * Policy to apply when the secret is removed from this stack.
     *
     * Default: - Not set.
     *
     * @param removalPolicy Policy to apply when the secret is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
        _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
        _replicaRegions.addAll(replicaRegions)
    }

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
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    /**
     * Initial value for a JSON secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value. The secret object -- if provided -- will be included in the
     * output of the cdk as part of synthesis, and will appear in the CloudFormation template in the
     * console. This can be secure(-ish) if that value is merely reference to another resource (or
     * one of its attributes), but if the value is a plaintext string, it will be visible to anyone
     * with access to the CloudFormation template (via the AWS Console, SDKs, or CLI).
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
    public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
        cdkBuilder.secretObjectValue(secretObjectValue)
    }

    /**
     * (deprecated) Initial value for the secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value. The secret string -- if provided -- will be included in the
     * output of the cdk as part of synthesis, and will appear in the CloudFormation template in the
     * console. This can be secure(-ish) if that value is merely reference to another resource (or
     * one of its attributes), but if the value is a plaintext string, it will be visible to anyone
     * with access to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret. May
     * be a simple string value, or a string representation of a JSON structure.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, and `generateSecretString` can be
     * provided.
     *
     * Default: - SecretsManager generates a new secret value.
     *
     * @param secretStringBeta1 Initial value for the secret.
     * @deprecated Use `secretStringValue` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
        cdkBuilder.secretStringBeta1(secretStringBeta1)
    }

    /**
     * Initial value for the secret.
     *
     * **NOTE:** *It is **highly** encouraged to leave this field undefined and allow SecretsManager
     * to create the secret value. The secret string -- if provided -- will be included in the
     * output of the cdk as part of synthesis, and will appear in the CloudFormation template in the
     * console. This can be secure(-ish) if that value is merely reference to another resource (or
     * one of its attributes), but if the value is a plaintext string, it will be visible to anyone
     * with access to the CloudFormation template (via the AWS Console, SDKs, or CLI).
     *
     * Specifies text data that you want to encrypt and store in this new version of the secret. May
     * be a simple string value. To provide a string representation of JSON structure, use
     * `SecretProps.secretObjectValue` instead.
     *
     * Only one of `secretStringBeta1`, `secretStringValue`, 'secretObjectValue', and
     * `generateSecretString` can be provided.
     *
     * Default: - SecretsManager generates a new secret value.
     *
     * @param secretStringValue Initial value for the secret.
     */
    public fun secretStringValue(secretStringValue: SecretValue) {
        cdkBuilder.secretStringValue(secretStringValue)
    }

    public fun build(): Secret {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        return cdkBuilder.build()
    }
}
