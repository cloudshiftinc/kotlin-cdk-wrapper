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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryEncryption
import software.amazon.awscdk.services.ecr.TagMutability
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * Define an ECR repository.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecr.*;
 * Service.Builder.create(this, "Service")
 * .source(Source.fromEcr(EcrProps.builder()
 * .imageConfiguration(ImageConfiguration.builder().port(80).build())
 * .repository(Repository.fromRepositoryName(this, "NginxRepository", "nginx"))
 * .tagOrDigest("latest")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class RepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Repository.Builder = Repository.Builder.create(scope, id)

    private val _lifecycleRules: MutableList<LifecycleRule> = mutableListOf()

    /**
     * Whether all images should be automatically deleted when the repository is removed from the
     * stack or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * Default: false
     *
     * @param autoDeleteImages Whether all images should be automatically deleted when the
     *   repository is removed from the stack or when the stack is deleted.
     */
    public fun autoDeleteImages(autoDeleteImages: Boolean) {
        cdkBuilder.autoDeleteImages(autoDeleteImages)
    }

    /**
     * The kind of server-side encryption to apply to this repository.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If encryptionKey is not
     * specified, an AWS managed KMS key is used.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `AES256` otherwise.
     *
     * @param encryption The kind of server-side encryption to apply to this repository.
     */
    public fun encryption(encryption: RepositoryEncryption) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * External KMS key to use for repository encryption.
     *
     * The 'encryption' property must be either not specified or set to "KMS". An error will be
     * emitted if encryption is set to "AES256".
     *
     * Default: - If encryption is set to `KMS` and this property is undefined, an AWS managed KMS
     * key is used.
     *
     * @param encryptionKey External KMS key to use for repository encryption.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Enable the scan on push when creating the repository.
     *
     * Default: false
     *
     * @param imageScanOnPush Enable the scan on push when creating the repository.
     */
    public fun imageScanOnPush(imageScanOnPush: Boolean) {
        cdkBuilder.imageScanOnPush(imageScanOnPush)
    }

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten.
     *
     * Default: TagMutability.MUTABLE
     *
     * @param imageTagMutability The tag mutability setting for the repository.
     */
    public fun imageTagMutability(imageTagMutability: TagMutability) {
        cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * The AWS account ID associated with the registry that contains the repository.
     *
     * Default: The default registry is assumed.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutLifecyclePolicy.html)
     *
     * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
     *   repository.
     */
    public fun lifecycleRegistryId(lifecycleRegistryId: String) {
        cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
    }

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
        _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
    }

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
        _lifecycleRules.addAll(lifecycleRules)
    }

    /**
     * Determine what happens to the repository when the resource/stack is deleted.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine what happens to the repository when the resource/stack is
     *   deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Name for this repository.
     *
     * Default: Automatically generated name.
     *
     * @param repositoryName Name for this repository.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): Repository {
        if (_lifecycleRules.isNotEmpty()) cdkBuilder.lifecycleRules(_lifecycleRules)
        return cdkBuilder.build()
    }
}
