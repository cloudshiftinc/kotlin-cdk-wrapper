@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNotebookInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
      emptyList()

  public open fun acceleratorTypes(`value`: List<String>) {
    unwrap(this).setAcceleratorTypes(`value`)
  }

  public open fun acceleratorTypes(vararg `value`: String): Unit =
      acceleratorTypes(`value`.toList())

  public open fun additionalCodeRepositories(): List<String> =
      unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

  public open fun additionalCodeRepositories(`value`: List<String>) {
    unwrap(this).setAdditionalCodeRepositories(`value`)
  }

  public open fun additionalCodeRepositories(vararg `value`: String): Unit =
      additionalCodeRepositories(`value`.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNotebookInstanceName(): String = unwrap(this).getAttrNotebookInstanceName()

  public open fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

  public open fun defaultCodeRepository(`value`: String) {
    unwrap(this).setDefaultCodeRepository(`value`)
  }

  public open fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

  public open fun directInternetAccess(`value`: String) {
    unwrap(this).setDirectInternetAccess(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceMetadataServiceConfiguration(): Any? =
      unwrap(this).getInstanceMetadataServiceConfiguration()

  public open fun instanceMetadataServiceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceMetadataServiceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun instanceMetadataServiceConfiguration(`value`: InstanceMetadataServiceConfigurationProperty) {
    unwrap(this).setInstanceMetadataServiceConfiguration(`value`.let(InstanceMetadataServiceConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a654bf445f32c7dad3090c266d5d28ed405877f27b7f291154b5cec706e8970")
  public open
      fun instanceMetadataServiceConfiguration(`value`: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
      Unit =
      instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty(`value`))

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

  public open fun lifecycleConfigName(`value`: String) {
    unwrap(this).setLifecycleConfigName(`value`)
  }

  public open fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

  public open fun notebookInstanceName(`value`: String) {
    unwrap(this).setNotebookInstanceName(`value`)
  }

  public open fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

  public open fun platformIdentifier(`value`: String) {
    unwrap(this).setPlatformIdentifier(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun rootAccess(): String? = unwrap(this).getRootAccess()

  public open fun rootAccess(`value`: String) {
    unwrap(this).setRootAccess(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

  public open fun volumeSizeInGb(`value`: Number) {
    unwrap(this).setVolumeSizeInGb(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun acceleratorTypes(acceleratorTypes: List<String>)

    public fun acceleratorTypes(vararg acceleratorTypes: String)

    public fun additionalCodeRepositories(additionalCodeRepositories: List<String>)

    public fun additionalCodeRepositories(vararg additionalCodeRepositories: String)

    public fun defaultCodeRepository(defaultCodeRepository: String)

    public fun directInternetAccess(directInternetAccess: String)

    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable)

    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b053446600724a418f0f24fc84443bf425e028cfacad0c06880bafcbd6a26f5")
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit)

    public fun instanceType(instanceType: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun lifecycleConfigName(lifecycleConfigName: String)

    public fun notebookInstanceName(notebookInstanceName: String)

    public fun platformIdentifier(platformIdentifier: String)

    public fun roleArn(roleArn: String)

    public fun rootAccess(rootAccess: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun volumeSizeInGb(volumeSizeInGb: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.Builder.create(scope, id)

    override fun acceleratorTypes(acceleratorTypes: List<String>) {
      cdkBuilder.acceleratorTypes(acceleratorTypes)
    }

    override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
        acceleratorTypes(acceleratorTypes.toList())

    override fun additionalCodeRepositories(additionalCodeRepositories: List<String>) {
      cdkBuilder.additionalCodeRepositories(additionalCodeRepositories)
    }

    override fun additionalCodeRepositories(vararg additionalCodeRepositories: String): Unit =
        additionalCodeRepositories(additionalCodeRepositories.toList())

    override fun defaultCodeRepository(defaultCodeRepository: String) {
      cdkBuilder.defaultCodeRepository(defaultCodeRepository)
    }

    override fun directInternetAccess(directInternetAccess: String) {
      cdkBuilder.directInternetAccess(directInternetAccess)
    }

    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(InstanceMetadataServiceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b053446600724a418f0f24fc84443bf425e028cfacad0c06880bafcbd6a26f5")
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty(instanceMetadataServiceConfiguration))

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun lifecycleConfigName(lifecycleConfigName: String) {
      cdkBuilder.lifecycleConfigName(lifecycleConfigName)
    }

    override fun notebookInstanceName(notebookInstanceName: String) {
      cdkBuilder.notebookInstanceName(notebookInstanceName)
    }

    override fun platformIdentifier(platformIdentifier: String) {
      cdkBuilder.platformIdentifier(platformIdentifier)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun rootAccess(rootAccess: String) {
      cdkBuilder.rootAccess(rootAccess)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun volumeSizeInGb(volumeSizeInGb: Number) {
      cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnNotebookInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotebookInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotebookInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance):
        CfnNotebookInstance = CfnNotebookInstance(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstance):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstance = wrapped.cdkObject
  }

  public interface InstanceMetadataServiceConfigurationProperty {
    public fun minimumInstanceMetadataServiceVersion(): String

    @CdkDslMarker
    public interface Builder {
      public
          fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder()

      override
          fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String) {
        cdkBuilder.minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty,
    ) : CdkObject(cdkObject), InstanceMetadataServiceConfigurationProperty {
      override fun minimumInstanceMetadataServiceVersion(): String =
          unwrap(this).getMinimumInstanceMetadataServiceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceMetadataServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty):
          InstanceMetadataServiceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMetadataServiceConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty
    }
  }
}
