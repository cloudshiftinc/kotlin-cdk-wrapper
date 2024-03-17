@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * Repository.Builder.create(this, "Repo").imageTagMutability(TagMutability.IMMUTABLE).build();
 * ```
 */
public interface RepositoryProps {
  /**
   * (deprecated) Whether all images should be automatically deleted when the repository is removed
   * from the stack or when the stack is deleted.
   *
   * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
   *
   * Default: false
   *
   * @deprecated Use `emptyOnDelete` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun autoDeleteImages(): Boolean? = unwrap(this).getAutoDeleteImages()

  /**
   * If true, deleting the repository force deletes the contents of the repository.
   *
   * If false, the repository must be empty before attempting to delete it.
   *
   * Default: false
   */
  public fun emptyOnDelete(): Boolean? = unwrap(this).getEmptyOnDelete()

  /**
   * The kind of server-side encryption to apply to this repository.
   *
   * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
   * encryptionKey is not specified, an AWS managed KMS key is used.
   *
   * Default: - `KMS` if `encryptionKey` is specified, or `AES256` otherwise.
   */
  public fun encryption(): RepositoryEncryption? =
      unwrap(this).getEncryption()?.let(RepositoryEncryption::wrap)

  /**
   * External KMS key to use for repository encryption.
   *
   * The 'encryption' property must be either not specified or set to "KMS".
   * An error will be emitted if encryption is set to "AES256".
   *
   * Default: - If encryption is set to `KMS` and this property is undefined,
   * an AWS managed KMS key is used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Enable the scan on push when creating the repository.
   *
   * Default: false
   */
  public fun imageScanOnPush(): Boolean? = unwrap(this).getImageScanOnPush()

  /**
   * The tag mutability setting for the repository.
   *
   * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
   * image tags to be overwritten.
   *
   * Default: TagMutability.MUTABLE
   */
  public fun imageTagMutability(): TagMutability? =
      unwrap(this).getImageTagMutability()?.let(TagMutability::wrap)

  /**
   * The AWS account ID associated with the registry that contains the repository.
   *
   * Default: The default registry is assumed.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutLifecyclePolicy.html)
   */
  public fun lifecycleRegistryId(): String? = unwrap(this).getLifecycleRegistryId()

  /**
   * Life cycle rules to apply to this registry.
   *
   * Default: No life cycle rules
   */
  public fun lifecycleRules(): List<LifecycleRule> =
      unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  /**
   * Determine what happens to the repository when the resource/stack is deleted.
   *
   * Default: RemovalPolicy.Retain
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Name for this repository.
   *
   * The repository name must start with a letter and can only contain lowercase letters, numbers,
   * hyphens, underscores, and forward slashes.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * Default: Automatically generated name.
   */
  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * A builder for [RepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoDeleteImages Whether all images should be automatically deleted when the
     * repository is removed from the stack or when the stack is deleted.
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     * @deprecated Use `emptyOnDelete` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun autoDeleteImages(autoDeleteImages: Boolean)

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    public fun emptyOnDelete(emptyOnDelete: Boolean)

    /**
     * @param encryption The kind of server-side encryption to apply to this repository.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryptionKey is not specified, an AWS managed KMS key is used.
     */
    public fun encryption(encryption: RepositoryEncryption)

    /**
     * @param encryptionKey External KMS key to use for repository encryption.
     * The 'encryption' property must be either not specified or set to "KMS".
     * An error will be emitted if encryption is set to "AES256".
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param imageScanOnPush Enable the scan on push when creating the repository.
     */
    public fun imageScanOnPush(imageScanOnPush: Boolean)

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten.
     */
    public fun imageTagMutability(imageTagMutability: TagMutability)

    /**
     * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
     * repository.
     */
    public fun lifecycleRegistryId(lifecycleRegistryId: String)

    /**
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    /**
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    /**
     * @param removalPolicy Determine what happens to the repository when the resource/stack is
     * deleted.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param repositoryName Name for this repository.
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.RepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.RepositoryProps.builder()

    /**
     * @param autoDeleteImages Whether all images should be automatically deleted when the
     * repository is removed from the stack or when the stack is deleted.
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     * @deprecated Use `emptyOnDelete` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun autoDeleteImages(autoDeleteImages: Boolean) {
      cdkBuilder.autoDeleteImages(autoDeleteImages)
    }

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * @param encryption The kind of server-side encryption to apply to this repository.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryptionKey is not specified, an AWS managed KMS key is used.
     */
    override fun encryption(encryption: RepositoryEncryption) {
      cdkBuilder.encryption(encryption.let(RepositoryEncryption::unwrap))
    }

    /**
     * @param encryptionKey External KMS key to use for repository encryption.
     * The 'encryption' property must be either not specified or set to "KMS".
     * An error will be emitted if encryption is set to "AES256".
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param imageScanOnPush Enable the scan on push when creating the repository.
     */
    override fun imageScanOnPush(imageScanOnPush: Boolean) {
      cdkBuilder.imageScanOnPush(imageScanOnPush)
    }

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten.
     */
    override fun imageTagMutability(imageTagMutability: TagMutability) {
      cdkBuilder.imageTagMutability(imageTagMutability.let(TagMutability::unwrap))
    }

    /**
     * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
     * repository.
     */
    override fun lifecycleRegistryId(lifecycleRegistryId: String) {
      cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
    }

    /**
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    /**
     * @param lifecycleRules Life cycle rules to apply to this registry.
     */
    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    /**
     * @param removalPolicy Determine what happens to the repository when the resource/stack is
     * deleted.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param repositoryName Name for this repository.
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.ecr.RepositoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryProps,
  ) : CdkObject(cdkObject), RepositoryProps {
    /**
     * (deprecated) Whether all images should be automatically deleted when the repository is
     * removed from the stack or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * Default: false
     *
     * @deprecated Use `emptyOnDelete` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun autoDeleteImages(): Boolean? = unwrap(this).getAutoDeleteImages()

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * Default: false
     */
    override fun emptyOnDelete(): Boolean? = unwrap(this).getEmptyOnDelete()

    /**
     * The kind of server-side encryption to apply to this repository.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryptionKey is not specified, an AWS managed KMS key is used.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `AES256` otherwise.
     */
    override fun encryption(): RepositoryEncryption? =
        unwrap(this).getEncryption()?.let(RepositoryEncryption::wrap)

    /**
     * External KMS key to use for repository encryption.
     *
     * The 'encryption' property must be either not specified or set to "KMS".
     * An error will be emitted if encryption is set to "AES256".
     *
     * Default: - If encryption is set to `KMS` and this property is undefined,
     * an AWS managed KMS key is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Enable the scan on push when creating the repository.
     *
     * Default: false
     */
    override fun imageScanOnPush(): Boolean? = unwrap(this).getImageScanOnPush()

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten.
     *
     * Default: TagMutability.MUTABLE
     */
    override fun imageTagMutability(): TagMutability? =
        unwrap(this).getImageTagMutability()?.let(TagMutability::wrap)

    /**
     * The AWS account ID associated with the registry that contains the repository.
     *
     * Default: The default registry is assumed.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutLifecyclePolicy.html)
     */
    override fun lifecycleRegistryId(): String? = unwrap(this).getLifecycleRegistryId()

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     */
    override fun lifecycleRules(): List<LifecycleRule> =
        unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    /**
     * Determine what happens to the repository when the resource/stack is deleted.
     *
     * Default: RemovalPolicy.Retain
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Name for this repository.
     *
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * Default: Automatically generated name.
     */
    override fun repositoryName(): String? = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryProps):
        RepositoryProps = CdkObjectWrappers.wrap(cdkObject) as? RepositoryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryProps):
        software.amazon.awscdk.services.ecr.RepositoryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.RepositoryProps
  }
}
