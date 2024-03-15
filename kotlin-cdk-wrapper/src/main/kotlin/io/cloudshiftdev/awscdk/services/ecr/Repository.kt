@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Repository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.Repository,
) : RepositoryBase(cdkObject) {
  public open fun addLifecycleRule(rule: LifecycleRule) {
    unwrap(this).addLifecycleRule(rule.let(LifecycleRule::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("873c4e5f895f78c5f76539924eb613a3cc2e43a498283833e5b9897fef295672")
  public open fun addLifecycleRule(rule: LifecycleRule.Builder.() -> Unit): Unit =
      addLifecycleRule(LifecycleRule(rule))

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  @CdkDslMarker
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun autoDeleteImages(autoDeleteImages: Boolean)

    public fun emptyOnDelete(emptyOnDelete: Boolean)

    public fun encryption(encryption: RepositoryEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun imageScanOnPush(imageScanOnPush: Boolean)

    public fun imageTagMutability(imageTagMutability: TagMutability)

    public fun lifecycleRegistryId(lifecycleRegistryId: String)

    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.Repository.Builder =
        software.amazon.awscdk.services.ecr.Repository.Builder.create(scope, id)

    @Deprecated(message = "deprecated in CDK")
    override fun autoDeleteImages(autoDeleteImages: Boolean) {
      cdkBuilder.autoDeleteImages(autoDeleteImages)
    }

    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    override fun encryption(encryption: RepositoryEncryption) {
      cdkBuilder.encryption(encryption.let(RepositoryEncryption::unwrap))
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun imageScanOnPush(imageScanOnPush: Boolean) {
      cdkBuilder.imageScanOnPush(imageScanOnPush)
    }

    override fun imageTagMutability(imageTagMutability: TagMutability) {
      cdkBuilder.imageTagMutability(imageTagMutability.let(TagMutability::unwrap))
    }

    override fun lifecycleRegistryId(lifecycleRegistryId: String) {
      cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
    }

    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
