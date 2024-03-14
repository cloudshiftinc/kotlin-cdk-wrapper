package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnResourceDefinitionVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceDefinitionId(): String = unwrap(this).getResourceDefinitionId()

  public open fun resourceDefinitionId(`value`: String) {
    unwrap(this).setResourceDefinitionId(`value`)
  }

  public open fun resources(): Any = unwrap(this).getResources()

  public open fun resources(`value`: IResolvable) {
    unwrap(this).setResources(`value`.let(IResolvable::unwrap))
  }

  public open fun resources(__idx_ac66f0: List<Any>) {
    unwrap(this).setResources(__idx_ac66f0)
  }

  public open fun resources(vararg __idx_ac66f0: Any): Unit = resources(__idx_ac66f0.toList())

  public interface Builder {
    public fun resourceDefinitionId(resourceDefinitionId: String)

    public fun resources(resources: IResolvable)

    public fun resources(resources: List<Any>)

    public fun resources(vararg resources: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder.create(scope,
        id)

    override fun resourceDefinitionId(resourceDefinitionId: String) {
      cdkBuilder.resourceDefinitionId(resourceDefinitionId)
    }

    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion):
        CfnResourceDefinitionVersion = CfnResourceDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion = wrapped.cdkObject
  }

  public interface SageMakerMachineLearningModelResourceDataProperty {
    public fun destinationPath(): String

    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    public fun sageMakerJobArn(): String

    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun ownerSetting(ownerSetting: IResolvable)

      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54e6b75466ee607f880457860e24a313e6760e9edf2dc2df9ad427159ddf598f")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      public fun sageMakerJobArn(sageMakerJobArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54e6b75466ee607f880457860e24a313e6760e9edf2dc2df9ad427159ddf598f")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      override fun sageMakerJobArn(sageMakerJobArn: String) {
        cdkBuilder.sageMakerJobArn(sageMakerJobArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty,
    ) : SageMakerMachineLearningModelResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      override fun sageMakerJobArn(): String = unwrap(this).getSageMakerJobArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerMachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty):
          SageMakerMachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerMachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SecretsManagerSecretResourceDataProperty {
    public fun additionalStagingLabelsToDownload(): List<String> =
        unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

    public fun arn(): String

    public interface Builder {
      public fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: List<String>)

      public fun additionalStagingLabelsToDownload(vararg additionalStagingLabelsToDownload: String)

      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.builder()

      override
          fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: List<String>) {
        cdkBuilder.additionalStagingLabelsToDownload(additionalStagingLabelsToDownload)
      }

      override fun additionalStagingLabelsToDownload(vararg
          additionalStagingLabelsToDownload: String): Unit =
          additionalStagingLabelsToDownload(additionalStagingLabelsToDownload.toList())

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty,
    ) : SecretsManagerSecretResourceDataProperty {
      override fun additionalStagingLabelsToDownload(): List<String> =
          unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecretsManagerSecretResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty):
          SecretsManagerSecretResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretsManagerSecretResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LocalDeviceResourceDataProperty {
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    public fun sourcePath(): String

    public interface Builder {
      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9500b9e7ac082eea20debb618ffe7e4852da9f334d5e31fdfdceec6519c341cd")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.builder()

      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9500b9e7ac082eea20debb618ffe7e4852da9f334d5e31fdfdceec6519c341cd")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty,
    ) : LocalDeviceResourceDataProperty {
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocalDeviceResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty):
          LocalDeviceResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalDeviceResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LocalVolumeResourceDataProperty {
    public fun destinationPath(): String

    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    public fun sourcePath(): String

    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b552e152365010d3ad7186cfc68a45aa431a0941294a73b2320fe01ebd7e08")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b552e152365010d3ad7186cfc68a45aa431a0941294a73b2320fe01ebd7e08")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty,
    ) : LocalVolumeResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocalVolumeResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty):
          LocalVolumeResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalVolumeResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GroupOwnerSettingProperty {
    public fun autoAddGroupOwner(): Any

    public fun groupOwner(): String? = unwrap(this).getGroupOwner()

    public interface Builder {
      public fun autoAddGroupOwner(autoAddGroupOwner: Boolean)

      public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable)

      public fun groupOwner(groupOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty.builder()

      override fun autoAddGroupOwner(autoAddGroupOwner: Boolean) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
      }

      override fun autoAddGroupOwner(autoAddGroupOwner: IResolvable) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner.let(IResolvable::unwrap))
      }

      override fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty,
    ) : GroupOwnerSettingProperty {
      override fun autoAddGroupOwner(): Any = unwrap(this).getAutoAddGroupOwner()

      override fun groupOwner(): String? = unwrap(this).getGroupOwner()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GroupOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty):
          GroupOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceDownloadOwnerSettingProperty {
    public fun groupOwner(): String

    public fun groupPermission(): String

    public interface Builder {
      public fun groupOwner(groupOwner: String)

      public fun groupPermission(groupPermission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.builder()

      override fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
      }

      override fun groupPermission(groupPermission: String) {
        cdkBuilder.groupPermission(groupPermission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty,
    ) : ResourceDownloadOwnerSettingProperty {
      override fun groupOwner(): String = unwrap(this).getGroupOwner()

      override fun groupPermission(): String = unwrap(this).getGroupPermission()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceDownloadOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty):
          ResourceDownloadOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDownloadOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3MachineLearningModelResourceDataProperty {
    public fun destinationPath(): String

    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    public fun s3Uri(): String

    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun ownerSetting(ownerSetting: IResolvable)

      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("946ddc93f0bcb1ce4cb9c4c5d6d9f5d0f60ea1b65a2b99ec523290de60c52417")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("946ddc93f0bcb1ce4cb9c4c5d6d9f5d0f60ea1b65a2b99ec523290de60c52417")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty,
    ) : S3MachineLearningModelResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3MachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty):
          S3MachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceDataContainerProperty {
    public fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

    public fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

    public fun s3MachineLearningModelResourceData(): Any? =
        unwrap(this).getS3MachineLearningModelResourceData()

    public fun sageMakerMachineLearningModelResourceData(): Any? =
        unwrap(this).getSageMakerMachineLearningModelResourceData()

    public fun secretsManagerSecretResourceData(): Any? =
        unwrap(this).getSecretsManagerSecretResourceData()

    public interface Builder {
      public fun localDeviceResourceData(localDeviceResourceData: IResolvable)

      public fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a71b6d3b8d67a0864a39ed7bf094e9eee952e7c37558a5404a511860a585bc5d")
      public
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty.Builder.() -> Unit)

      public fun localVolumeResourceData(localVolumeResourceData: IResolvable)

      public fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3fe498ffd1c13631b929d0429ab0ec0b617126be20da1d0a11b8a5fb40f4368")
      public
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty.Builder.() -> Unit)

      public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable)

      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9002d2b37239a4c2725aca61a597c9dbf8567a4cf12b3ffccc43ece59cea3c4a")
      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty.Builder.() -> Unit)

      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable)

      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d4481c0beb7f1a56a3d4a576e952f7e92219b31dc1c6f418d5748ec3e8955f2")
      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty.Builder.() -> Unit)

      public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable)

      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01e5af1250a7b41f1920ed49b1655fc9c96ad41d4357df5ab3557a8b8947e98")
      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty.builder()

      override fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(IResolvable::unwrap))
      }

      override
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(LocalDeviceResourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a71b6d3b8d67a0864a39ed7bf094e9eee952e7c37558a5404a511860a585bc5d")
      override
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty.Builder.() -> Unit):
          Unit = localDeviceResourceData(LocalDeviceResourceDataProperty(localDeviceResourceData))

      override fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData.let(IResolvable::unwrap))
      }

      override
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData.let(LocalVolumeResourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3fe498ffd1c13631b929d0429ab0ec0b617126be20da1d0a11b8a5fb40f4368")
      override
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty.Builder.() -> Unit):
          Unit = localVolumeResourceData(LocalVolumeResourceDataProperty(localVolumeResourceData))

      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.let(IResolvable::unwrap))
      }

      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.let(S3MachineLearningModelResourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9002d2b37239a4c2725aca61a597c9dbf8567a4cf12b3ffccc43ece59cea3c4a")
      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty.Builder.() -> Unit):
          Unit =
          s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty(s3MachineLearningModelResourceData))

      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.let(IResolvable::unwrap))
      }

      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.let(SageMakerMachineLearningModelResourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d4481c0beb7f1a56a3d4a576e952f7e92219b31dc1c6f418d5748ec3e8955f2")
      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty.Builder.() -> Unit):
          Unit =
          sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty(sageMakerMachineLearningModelResourceData))

      override fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData.let(IResolvable::unwrap))
      }

      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData.let(SecretsManagerSecretResourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01e5af1250a7b41f1920ed49b1655fc9c96ad41d4357df5ab3557a8b8947e98")
      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit):
          Unit =
          secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty(secretsManagerSecretResourceData))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty,
    ) : ResourceDataContainerProperty {
      override fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

      override fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

      override fun s3MachineLearningModelResourceData(): Any? =
          unwrap(this).getS3MachineLearningModelResourceData()

      override fun sageMakerMachineLearningModelResourceData(): Any? =
          unwrap(this).getSageMakerMachineLearningModelResourceData()

      override fun secretsManagerSecretResourceData(): Any? =
          unwrap(this).getSecretsManagerSecretResourceData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceDataContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty):
          ResourceDataContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDataContainerProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceInstanceProperty {
    public fun id(): String

    public fun name(): String

    public fun resourceDataContainer(): Any

    public interface Builder {
      public fun id(id: String)

      public fun name(name: String)

      public fun resourceDataContainer(resourceDataContainer: IResolvable)

      public fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c40aa6c325d7f2cecf940cacf9a1f9b124c85d905f7c2071aaf6b6a695f32f9f")
      public
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun resourceDataContainer(resourceDataContainer: IResolvable) {
        cdkBuilder.resourceDataContainer(resourceDataContainer.let(IResolvable::unwrap))
      }

      override fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty) {
        cdkBuilder.resourceDataContainer(resourceDataContainer.let(ResourceDataContainerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c40aa6c325d7f2cecf940cacf9a1f9b124c85d905f7c2071aaf6b6a695f32f9f")
      override
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit):
          Unit = resourceDataContainer(ResourceDataContainerProperty(resourceDataContainer))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty,
    ) : ResourceInstanceProperty {
      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun resourceDataContainer(): Any = unwrap(this).getResourceDataContainer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty):
          ResourceInstanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceInstanceProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
