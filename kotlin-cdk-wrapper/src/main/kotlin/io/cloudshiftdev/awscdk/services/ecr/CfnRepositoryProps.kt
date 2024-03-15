@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRepositoryProps {
  public fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  public fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  public fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  public fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun emptyOnDelete(emptyOnDelete: Boolean)

    public fun emptyOnDelete(emptyOnDelete: IResolvable)

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7f36d752f56955edfe0025b1a9908ee8542425c0d1379177764700c8b832694")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit)

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49f0be97e9428f2e67799de6769d6bff0341ad295b3ac9d6fd3cdef8468577ec")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit)

    public fun imageTagMutability(imageTagMutability: String)

    public fun lifecyclePolicy(lifecyclePolicy: IResolvable)

    public fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c62f429d64bc7f256441fc625717a8ef174982dc49aceb3d0513fa8af1589f8")
    public
        fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit)

    public fun repositoryName(repositoryName: String)

    public fun repositoryPolicyText(repositoryPolicyText: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRepositoryProps.builder()

    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    override fun emptyOnDelete(emptyOnDelete: IResolvable) {
      cdkBuilder.emptyOnDelete(emptyOnDelete.let(IResolvable::unwrap))
    }

    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnRepository.EncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7f36d752f56955edfe0025b1a9908ee8542425c0d1379177764700c8b832694")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnRepository.EncryptionConfigurationProperty(encryptionConfiguration))

    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnRepository.ImageScanningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49f0be97e9428f2e67799de6769d6bff0341ad295b3ac9d6fd3cdef8468577ec")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnRepository.ImageScanningConfigurationProperty(imageScanningConfiguration))

    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    override fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(IResolvable::unwrap))
    }

    override fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(CfnRepository.LifecyclePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c62f429d64bc7f256441fc625717a8ef174982dc49aceb3d0513fa8af1589f8")
    override
        fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit):
        Unit = lifecyclePolicy(CfnRepository.LifecyclePolicyProperty(lifecyclePolicy))

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepositoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    override fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    override fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

    override fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

    override fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    override fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryProps):
        CfnRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.ecr.CfnRepositoryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.CfnRepositoryProps
  }
}
