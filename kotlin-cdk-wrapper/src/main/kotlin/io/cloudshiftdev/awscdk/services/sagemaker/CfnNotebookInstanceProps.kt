@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnNotebookInstanceProps {
  public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

  public fun additionalCodeRepositories(): List<String> =
      unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

  public fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

  public fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

  public fun instanceMetadataServiceConfiguration(): Any? =
      unwrap(this).getInstanceMetadataServiceConfiguration()

  public fun instanceType(): String

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

  public fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

  public fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

  public fun roleArn(): String

  public fun rootAccess(): String? = unwrap(this).getRootAccess()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()

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
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("795c4de11fe65f03fc2056ae5ec3bc870153a301dc5c3252a1098abbfc310766")
    public
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.builder()

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
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty) {
      cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration.let(CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("795c4de11fe65f03fc2056ae5ec3bc870153a301dc5c3252a1098abbfc310766")
    override
        fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataServiceConfiguration(CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty(instanceMetadataServiceConfiguration))

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

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps,
  ) : CdkObject(cdkObject), CfnNotebookInstanceProps {
    override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
        emptyList()

    override fun additionalCodeRepositories(): List<String> =
        unwrap(this).getAdditionalCodeRepositories() ?: emptyList()

    override fun defaultCodeRepository(): String? = unwrap(this).getDefaultCodeRepository()

    override fun directInternetAccess(): String? = unwrap(this).getDirectInternetAccess()

    override fun instanceMetadataServiceConfiguration(): Any? =
        unwrap(this).getInstanceMetadataServiceConfiguration()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun lifecycleConfigName(): String? = unwrap(this).getLifecycleConfigName()

    override fun notebookInstanceName(): String? = unwrap(this).getNotebookInstanceName()

    override fun platformIdentifier(): String? = unwrap(this).getPlatformIdentifier()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun rootAccess(): String? = unwrap(this).getRootAccess()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun volumeSizeInGb(): Number? = unwrap(this).getVolumeSizeInGb()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotebookInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps):
        CfnNotebookInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstanceProps):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
  }
}
