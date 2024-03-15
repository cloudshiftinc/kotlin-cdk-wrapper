@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: ResourceDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(ResourceDefinitionVersionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("50867f78352fa50d48fb6743b07d1411a531a0a211172f41ce7254c10180603f")
  public open fun initialVersion(`value`: ResourceDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(ResourceDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: ResourceDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b45c7964550cb0ecf3f5f1a733f690a533a66561ec64ac86c995487386ae899")
    public fun initialVersion(initialVersion: ResourceDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.Builder
        = software.amazon.awscdk.services.greengrass.CfnResourceDefinition.Builder.create(scope, id)

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: ResourceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(ResourceDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b45c7964550cb0ecf3f5f1a733f690a533a66561ec64ac86c995487386ae899")
    override
        fun initialVersion(initialVersion: ResourceDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(ResourceDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition):
        CfnResourceDefinition = CfnResourceDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinition):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinition = wrapped.cdkObject
  }

  public interface ResourceDefinitionVersionProperty {
    public fun resources(): Any

    @CdkDslMarker
    public interface Builder {
      public fun resources(resources: IResolvable)

      public fun resources(resources: List<Any>)

      public fun resources(vararg resources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.builder()

      override fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources.let(IResolvable::unwrap))
      }

      override fun resources(resources: List<Any>) {
        cdkBuilder.resources(resources)
      }

      override fun resources(vararg resources: Any): Unit = resources(resources.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty,
    ) : CdkObject(cdkObject), ResourceDefinitionVersionProperty {
      override fun resources(): Any = unwrap(this).getResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty):
          ResourceDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
    }
  }

  public interface SecretsManagerSecretResourceDataProperty {
    public fun additionalStagingLabelsToDownload(): List<String> =
        unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

    public fun arn(): String

    @CdkDslMarker
    public interface Builder {
      public fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: List<String>)

      public fun additionalStagingLabelsToDownload(vararg additionalStagingLabelsToDownload: String)

      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty,
    ) : CdkObject(cdkObject), SecretsManagerSecretResourceDataProperty {
      override fun additionalStagingLabelsToDownload(): List<String> =
          unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecretsManagerSecretResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty):
          SecretsManagerSecretResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretsManagerSecretResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
    }
  }

  public interface S3MachineLearningModelResourceDataProperty {
    public fun destinationPath(): String

    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    public fun s3Uri(): String

    @CdkDslMarker
    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun ownerSetting(ownerSetting: IResolvable)

      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b322291179e4c0587cd6764ee886a458c1e495c94e49aad683966fdfe3e2a6b")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b322291179e4c0587cd6764ee886a458c1e495c94e49aad683966fdfe3e2a6b")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), S3MachineLearningModelResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3MachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty):
          S3MachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
    }
  }

  public interface SageMakerMachineLearningModelResourceDataProperty {
    public fun destinationPath(): String

    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    public fun sageMakerJobArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun ownerSetting(ownerSetting: IResolvable)

      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e80aef52452dc8b668b395a82205060b415ac013a2d979f12ca8b3720a6af7e8")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      public fun sageMakerJobArn(sageMakerJobArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e80aef52452dc8b668b395a82205060b415ac013a2d979f12ca8b3720a6af7e8")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      override fun sageMakerJobArn(sageMakerJobArn: String) {
        cdkBuilder.sageMakerJobArn(sageMakerJobArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), SageMakerMachineLearningModelResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      override fun sageMakerJobArn(): String = unwrap(this).getSageMakerJobArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerMachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty):
          SageMakerMachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerMachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
    }
  }

  public interface LocalVolumeResourceDataProperty {
    public fun destinationPath(): String

    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    public fun sourcePath(): String

    @CdkDslMarker
    public interface Builder {
      public fun destinationPath(destinationPath: String)

      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2ba809514e8753cc7b3c36c4756ea36411805335e2f2e214e4b3a274cca3c2f")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty.builder()

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2ba809514e8753cc7b3c36c4756ea36411805335e2f2e214e4b3a274cca3c2f")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty,
    ) : CdkObject(cdkObject), LocalVolumeResourceDataProperty {
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalVolumeResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty):
          LocalVolumeResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalVolumeResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
    }
  }

  public interface LocalDeviceResourceDataProperty {
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    public fun sourcePath(): String

    @CdkDslMarker
    public interface Builder {
      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aa219c6edc900b545d41570be768782e2e9cccf35bda45acb6abddf3a2155e4")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty.builder()

      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3aa219c6edc900b545d41570be768782e2e9cccf35bda45acb6abddf3a2155e4")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty,
    ) : CdkObject(cdkObject), LocalDeviceResourceDataProperty {
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalDeviceResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty):
          LocalDeviceResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalDeviceResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
    }
  }

  public interface ResourceInstanceProperty {
    public fun id(): String

    public fun name(): String

    public fun resourceDataContainer(): Any

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun name(name: String)

      public fun resourceDataContainer(resourceDataContainer: IResolvable)

      public fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f37c08c90f935f1f997b4f8c90ea5149cdc55f38601647c2878651ff719535a")
      public
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.builder()

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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f37c08c90f935f1f997b4f8c90ea5149cdc55f38601647c2878651ff719535a")
      override
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit):
          Unit = resourceDataContainer(ResourceDataContainerProperty(resourceDataContainer))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty,
    ) : CdkObject(cdkObject), ResourceInstanceProperty {
      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun resourceDataContainer(): Any = unwrap(this).getResourceDataContainer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty):
          ResourceInstanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceInstanceProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun localDeviceResourceData(localDeviceResourceData: IResolvable)

      public fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f18045f1a07083f608f8030c060c6ce07e5582e55faceb64f61aca27f171b8e2")
      public
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty.Builder.() -> Unit)

      public fun localVolumeResourceData(localVolumeResourceData: IResolvable)

      public fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e671e3203a0dd456cfd14a4c2526402225b1aa9d59f134b8479ce9b1159955b")
      public
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty.Builder.() -> Unit)

      public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable)

      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0db1d9d931fd3c1477d3a734d7fb1f94b5658b2191fe5941d654f0c1a196a1ad")
      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty.Builder.() -> Unit)

      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable)

      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d765df094e5bca3ebc387e99ef4bcf53f5556f1662b724d4ad3cdb9393a53ac2")
      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty.Builder.() -> Unit)

      public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable)

      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7b73f807c94710295a55c1b244c751cbad3689f0201541e7e78f9bf18b3182")
      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty.builder()

      override fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(IResolvable::unwrap))
      }

      override
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(LocalDeviceResourceDataProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f18045f1a07083f608f8030c060c6ce07e5582e55faceb64f61aca27f171b8e2")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e671e3203a0dd456cfd14a4c2526402225b1aa9d59f134b8479ce9b1159955b")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0db1d9d931fd3c1477d3a734d7fb1f94b5658b2191fe5941d654f0c1a196a1ad")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d765df094e5bca3ebc387e99ef4bcf53f5556f1662b724d4ad3cdb9393a53ac2")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7b73f807c94710295a55c1b244c751cbad3689f0201541e7e78f9bf18b3182")
      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit):
          Unit =
          secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty(secretsManagerSecretResourceData))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty,
    ) : CdkObject(cdkObject), ResourceDataContainerProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceDataContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty):
          ResourceDataContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDataContainerProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
    }
  }

  public interface ResourceDownloadOwnerSettingProperty {
    public fun groupOwner(): String

    public fun groupPermission(): String

    @CdkDslMarker
    public interface Builder {
      public fun groupOwner(groupOwner: String)

      public fun groupPermission(groupPermission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.builder()

      override fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
      }

      override fun groupPermission(groupPermission: String) {
        cdkBuilder.groupPermission(groupPermission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty,
    ) : CdkObject(cdkObject), ResourceDownloadOwnerSettingProperty {
      override fun groupOwner(): String = unwrap(this).getGroupOwner()

      override fun groupPermission(): String = unwrap(this).getGroupPermission()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceDownloadOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty):
          ResourceDownloadOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDownloadOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
    }
  }

  public interface GroupOwnerSettingProperty {
    public fun autoAddGroupOwner(): Any

    public fun groupOwner(): String? = unwrap(this).getGroupOwner()

    @CdkDslMarker
    public interface Builder {
      public fun autoAddGroupOwner(autoAddGroupOwner: Boolean)

      public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable)

      public fun groupOwner(groupOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty,
    ) : CdkObject(cdkObject), GroupOwnerSettingProperty {
      override fun autoAddGroupOwner(): Any = unwrap(this).getAutoAddGroupOwner()

      override fun groupOwner(): String? = unwrap(this).getGroupOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty):
          GroupOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
    }
  }
}
