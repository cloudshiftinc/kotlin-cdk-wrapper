package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Repository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.Repository,
) : RepositoryBase(cdkObject) {
  /**
   * Add a life cycle rule to the repository.
   *
   * Life cycle rules automatically expire images from the repository that match
   * certain conditions.
   *
   * @param rule 
   */
  public open fun addLifecycleRule(rule: LifecycleRule) {
    unwrap(this).addLifecycleRule(rule.let(LifecycleRule::unwrap))
  }

  /**
   * Add a life cycle rule to the repository.
   *
   * Life cycle rules automatically expire images from the repository that match
   * certain conditions.
   *
   * @param rule 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("873c4e5f895f78c5f76539924eb613a3cc2e43a498283833e5b9897fef295672")
  public open fun addLifecycleRule(rule: LifecycleRule.Builder.() -> Unit): Unit =
      addLifecycleRule(LifecycleRule(rule))

  /**
   * Add a policy statement to the repository's resource policy.
   *
   * While other resources policies in AWS either require or accept a resource section,
   * Cfn for ECR does not allow us to specify a resource policy.
   * It will fail if a resource section is present at all.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Add a policy statement to the repository's resource policy.
   *
   * While other resources policies in AWS either require or accept a resource section,
   * Cfn for ECR does not allow us to specify a resource policy.
   * It will fail if a resource section is present at all.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * The ARN of the repository.
   */
  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  /**
   * The name of the repository.
   */
  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.Repository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (deprecated) Whether all images should be automatically deleted when the repository is
     * removed from the stack or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * Default: false
     *
     * @deprecated Use `emptyOnDelete` instead.
     * @param autoDeleteImages Whether all images should be automatically deleted when the
     * repository is removed from the stack or when the stack is deleted. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun autoDeleteImages(autoDeleteImages: Boolean)

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * Default: false
     *
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    public fun emptyOnDelete(emptyOnDelete: Boolean)

    /**
     * The kind of server-side encryption to apply to this repository.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryptionKey is not specified, an AWS managed KMS key is used.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `AES256` otherwise.
     *
     * @param encryption The kind of server-side encryption to apply to this repository. 
     */
    public fun encryption(encryption: RepositoryEncryption)

    /**
     * External KMS key to use for repository encryption.
     *
     * The 'encryption' property must be either not specified or set to "KMS".
     * An error will be emitted if encryption is set to "AES256".
     *
     * Default: - If encryption is set to `KMS` and this property is undefined,
     * an AWS managed KMS key is used.
     *
     * @param encryptionKey External KMS key to use for repository encryption. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Enable the scan on push when creating the repository.
     *
     * Default: false
     *
     * @param imageScanOnPush Enable the scan on push when creating the repository. 
     */
    public fun imageScanOnPush(imageScanOnPush: Boolean)

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
    public fun imageTagMutability(imageTagMutability: TagMutability)

    /**
     * The AWS account ID associated with the registry that contains the repository.
     *
     * Default: The default registry is assumed.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutLifecyclePolicy.html)
     * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
     * repository. 
     */
    public fun lifecycleRegistryId(lifecycleRegistryId: String)

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry. 
     */
    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry. 
     */
    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    /**
     * Determine what happens to the repository when the resource/stack is deleted.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine what happens to the repository when the resource/stack is
     * deleted. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

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
     *
     * @param repositoryName Name for this repository. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.Repository.Builder =
        software.amazon.awscdk.services.ecr.Repository.Builder.create(scope, id)

    /**
     * (deprecated) Whether all images should be automatically deleted when the repository is
     * removed from the stack or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * Default: false
     *
     * @deprecated Use `emptyOnDelete` instead.
     * @param autoDeleteImages Whether all images should be automatically deleted when the
     * repository is removed from the stack or when the stack is deleted. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun autoDeleteImages(autoDeleteImages: Boolean) {
      cdkBuilder.autoDeleteImages(autoDeleteImages)
    }

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * Default: false
     *
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * The kind of server-side encryption to apply to this repository.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryptionKey is not specified, an AWS managed KMS key is used.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `AES256` otherwise.
     *
     * @param encryption The kind of server-side encryption to apply to this repository. 
     */
    override fun encryption(encryption: RepositoryEncryption) {
      cdkBuilder.encryption(encryption.let(RepositoryEncryption::unwrap))
    }

    /**
     * External KMS key to use for repository encryption.
     *
     * The 'encryption' property must be either not specified or set to "KMS".
     * An error will be emitted if encryption is set to "AES256".
     *
     * Default: - If encryption is set to `KMS` and this property is undefined,
     * an AWS managed KMS key is used.
     *
     * @param encryptionKey External KMS key to use for repository encryption. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Enable the scan on push when creating the repository.
     *
     * Default: false
     *
     * @param imageScanOnPush Enable the scan on push when creating the repository. 
     */
    override fun imageScanOnPush(imageScanOnPush: Boolean) {
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
    override fun imageTagMutability(imageTagMutability: TagMutability) {
      cdkBuilder.imageTagMutability(imageTagMutability.let(TagMutability::unwrap))
    }

    /**
     * The AWS account ID associated with the registry that contains the repository.
     *
     * Default: The default registry is assumed.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutLifecyclePolicy.html)
     * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
     * repository. 
     */
    override fun lifecycleRegistryId(lifecycleRegistryId: String) {
      cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
    }

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry. 
     */
    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    /**
     * Life cycle rules to apply to this registry.
     *
     * Default: No life cycle rules
     *
     * @param lifecycleRules Life cycle rules to apply to this registry. 
     */
    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    /**
     * Determine what happens to the repository when the resource/stack is deleted.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine what happens to the repository when the resource/stack is
     * deleted. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

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
     *
     * @param repositoryName Name for this repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.ecr.Repository = cdkBuilder.build()
  }

  public companion object {
    public fun arnForLocalRepository(repositoryName: String, scope: IConstruct): String =
        software.amazon.awscdk.services.ecr.Repository.arnForLocalRepository(repositoryName,
        scope.let(IConstruct::unwrap))

    public fun arnForLocalRepository(
      repositoryName: String,
      scope: IConstruct,
      account: String,
    ): String = software.amazon.awscdk.services.ecr.Repository.arnForLocalRepository(repositoryName,
        scope.let(IConstruct::unwrap), account)

    public fun fromRepositoryArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryArn: String,
    ): IRepository =
        software.amazon.awscdk.services.ecr.Repository.fromRepositoryArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, repositoryArn).let(IRepository::wrap)

    public fun fromRepositoryAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RepositoryAttributes,
    ): IRepository =
        software.amazon.awscdk.services.ecr.Repository.fromRepositoryAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(RepositoryAttributes::unwrap)).let(IRepository::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405954211f1a7ef3be4216b322ae86130da7e17ded90391dc304207d9ba2e528")
    public fun fromRepositoryAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RepositoryAttributes.Builder.() -> Unit,
    ): IRepository = fromRepositoryAttributes(scope, id, RepositoryAttributes(attrs))

    public fun fromRepositoryName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryName: String,
    ): IRepository =
        software.amazon.awscdk.services.ecr.Repository.fromRepositoryName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, repositoryName).let(IRepository::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Repository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Repository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.Repository): Repository =
        Repository(cdkObject)

    internal fun unwrap(wrapped: Repository): software.amazon.awscdk.services.ecr.Repository =
        wrapped.cdkObject
  }
}
