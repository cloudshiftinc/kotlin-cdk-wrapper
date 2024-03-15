@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLocationAzureBlobProps {
  public fun agentArns(): List<String>

  public fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

  public fun azureBlobAuthenticationType(): String

  public fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

  public fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

  public fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun azureAccessTier(azureAccessTier: String)

    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String)

    public fun azureBlobContainerUrl(azureBlobContainerUrl: String)

    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable)

    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit)

    public fun azureBlobType(azureBlobType: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.builder()

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun azureAccessTier(azureAccessTier: String) {
      cdkBuilder.azureAccessTier(azureAccessTier)
    }

    override fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
      cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    override fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
      cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    override fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(IResolvable::unwrap))
    }

    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit):
        Unit =
        azureBlobSasConfiguration(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty(azureBlobSasConfiguration))

    override fun azureBlobType(azureBlobType: String) {
      cdkBuilder.azureBlobType(azureBlobType)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps,
  ) : CdkObject(cdkObject), CfnLocationAzureBlobProps {
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    override fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

    override fun azureBlobAuthenticationType(): String =
        unwrap(this).getAzureBlobAuthenticationType()

    override fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

    override fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

    override fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationAzureBlobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps):
        CfnLocationAzureBlobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationAzureBlobProps):
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps
  }
}
