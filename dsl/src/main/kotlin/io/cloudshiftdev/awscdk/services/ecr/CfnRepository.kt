package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepository internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.CfnRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrRepositoryUri(): String = unwrap(this).getAttrRepositoryUri()

  public open fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

  public open fun emptyOnDelete(`value`: Boolean) {
    unwrap(this).setEmptyOnDelete(`value`)
  }

  public open fun emptyOnDelete(`value`: IResolvable) {
    unwrap(this).setEmptyOnDelete(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("39dd363c70038da85126a1d4a9fcf4d613001f9fb07226e7c1a9e30677cb03ed")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  public open fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  public open fun imageScanningConfiguration(`value`: IResolvable) {
    unwrap(this).setImageScanningConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty) {
    unwrap(this).setImageScanningConfiguration(`value`.let(ImageScanningConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37192333b8b8d5db2630c4f244dd47d6fa572217f709b461057b2f1a075bc8f9")
  public open
      fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty.Builder.() -> Unit):
      Unit = imageScanningConfiguration(ImageScanningConfigurationProperty(`value`))

  public open fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  public open fun imageTagMutability(`value`: String) {
    unwrap(this).setImageTagMutability(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

  public open fun lifecyclePolicy(`value`: IResolvable) {
    unwrap(this).setLifecyclePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecyclePolicy(`value`: LifecyclePolicyProperty) {
    unwrap(this).setLifecyclePolicy(`value`.let(LifecyclePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c9dbfb2bffec0c4bf33cc86e51887501840be1674a262e5948ee9e2a0f5b6076")
  public open fun lifecyclePolicy(`value`: LifecyclePolicyProperty.Builder.() -> Unit): Unit =
      lifecyclePolicy(LifecyclePolicyProperty(`value`))

  public open fun repositoryName(): String? = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public open fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  public open fun repositoryPolicyText(`value`: Any) {
    unwrap(this).setRepositoryPolicyText(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun emptyOnDelete(emptyOnDelete: Boolean) {
    }

    public fun emptyOnDelete(emptyOnDelete: IResolvable) {
    }

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    }

    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f046f772f75aad2be55954f3bcf4f694ce2bca4c76ae59c5fa5f4e279125e61")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit) {
    }

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
    }

    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7ac0672aa0b91e56a9eb254121c32b1a4ecb95b1da632ff7ed429a394df2743")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit) {
    }

    public fun imageTagMutability(imageTagMutability: String) {
    }

    public fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
    }

    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6ad27a65aea65dbb4d8f833113f05c5dc1799ae2056ee03563388b4b0003725")
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty.Builder.() -> Unit) {
    }

    public fun repositoryName(repositoryName: String) {
    }

    public fun repositoryPolicyText(repositoryPolicyText: Any) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRepository.Builder =
        software.amazon.awscdk.services.ecr.CfnRepository.Builder.create(scope, id)

    public override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    public override fun emptyOnDelete(emptyOnDelete: IResolvable) {
      cdkBuilder.emptyOnDelete(emptyOnDelete.let(IResolvable::unwrap))
    }

    public override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f046f772f75aad2be55954f3bcf4f694ce2bca4c76ae59c5fa5f4e279125e61")
    public override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    public override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(ImageScanningConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7ac0672aa0b91e56a9eb254121c32b1a4ecb95b1da632ff7ed429a394df2743")
    public override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(ImageScanningConfigurationProperty(imageScanningConfiguration))

    public override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    public override fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(IResolvable::unwrap))
    }

    public override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6ad27a65aea65dbb4d8f833113f05c5dc1799ae2056ee03563388b4b0003725")
    public override
        fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty.Builder.() -> Unit): Unit =
        lifecyclePolicy(LifecyclePolicyProperty(lifecyclePolicy))

    public override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepository = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository): CfnRepository =
        CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository): software.amazon.awscdk.services.ecr.CfnRepository =
        wrapped.cdkObject
  }

  public interface ImageScanningConfigurationProperty {
    public fun scanOnPush(): Any? = unwrap(this).getScanOnPush()

    public interface Builder {
      public fun scanOnPush(scanOnPush: Boolean) {
      }

      public fun scanOnPush(scanOnPush: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty.builder()

      public override fun scanOnPush(scanOnPush: Boolean) {
        cdkBuilder.scanOnPush(scanOnPush)
      }

      public override fun scanOnPush(scanOnPush: IResolvable) {
        cdkBuilder.scanOnPush(scanOnPush.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty,
    ) : ImageScanningConfigurationProperty {
      public override fun scanOnPush(): Any? = unwrap(this).getScanOnPush()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LifecyclePolicyProperty {
    public fun lifecyclePolicyText(): String? = unwrap(this).getLifecyclePolicyText()

    public fun registryId(): String? = unwrap(this).getRegistryId()

    public interface Builder {
      public fun lifecyclePolicyText(lifecyclePolicyText: String) {
      }

      public fun registryId(registryId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder =
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.builder()

      public override fun lifecyclePolicyText(lifecyclePolicyText: String) {
        cdkBuilder.lifecyclePolicyText(lifecyclePolicyText)
      }

      public override fun registryId(registryId: String) {
        cdkBuilder.registryId(registryId)
      }

      public fun build(): software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty,
    ) : LifecyclePolicyProperty {
      public override fun lifecyclePolicyText(): String? = unwrap(this).getLifecyclePolicyText()

      public override fun registryId(): String? = unwrap(this).getRegistryId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LifecyclePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty):
          LifecyclePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecyclePolicyProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun encryptionType(): String

    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    public interface Builder {
      public fun encryptionType(encryptionType: String) {
      }

      public fun kmsKey(kmsKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty.builder()

      public override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      public override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      public override fun encryptionType(): String = unwrap(this).getEncryptionType()

      public override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
