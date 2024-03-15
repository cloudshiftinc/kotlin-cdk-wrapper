@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RepositoryProps {
  @Deprecated(message = "deprecated in CDK")
  public fun autoDeleteImages(): Boolean? = unwrap(this).getAutoDeleteImages()

  public fun emptyOnDelete(): Boolean? = unwrap(this).getEmptyOnDelete()

  public fun encryption(): RepositoryEncryption? =
      unwrap(this).getEncryption()?.let(RepositoryEncryption::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun imageScanOnPush(): Boolean? = unwrap(this).getImageScanOnPush()

  public fun imageTagMutability(): TagMutability? =
      unwrap(this).getImageTagMutability()?.let(TagMutability::wrap)

  public fun lifecycleRegistryId(): String? = unwrap(this).getLifecycleRegistryId()

  public fun lifecycleRules(): List<LifecycleRule> =
      unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.RepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.RepositoryProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecr.RepositoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryProps,
  ) : CdkObject(cdkObject), RepositoryProps {
    @Deprecated(message = "deprecated in CDK")
    override fun autoDeleteImages(): Boolean? = unwrap(this).getAutoDeleteImages()

    override fun emptyOnDelete(): Boolean? = unwrap(this).getEmptyOnDelete()

    override fun encryption(): RepositoryEncryption? =
        unwrap(this).getEncryption()?.let(RepositoryEncryption::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun imageScanOnPush(): Boolean? = unwrap(this).getImageScanOnPush()

    override fun imageTagMutability(): TagMutability? =
        unwrap(this).getImageTagMutability()?.let(TagMutability::wrap)

    override fun lifecycleRegistryId(): String? = unwrap(this).getLifecycleRegistryId()

    override fun lifecycleRules(): List<LifecycleRule> =
        unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun repositoryName(): String? = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryProps):
        RepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryProps):
        software.amazon.awscdk.services.ecr.RepositoryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.RepositoryProps
  }
}
