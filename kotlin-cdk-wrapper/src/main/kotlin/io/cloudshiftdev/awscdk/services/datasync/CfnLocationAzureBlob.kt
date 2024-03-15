@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationAzureBlob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

  public open fun azureAccessTier(`value`: String) {
    unwrap(this).setAzureAccessTier(`value`)
  }

  public open fun azureBlobAuthenticationType(): String =
      unwrap(this).getAzureBlobAuthenticationType()

  public open fun azureBlobAuthenticationType(`value`: String) {
    unwrap(this).setAzureBlobAuthenticationType(`value`)
  }

  public open fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

  public open fun azureBlobContainerUrl(`value`: String) {
    unwrap(this).setAzureBlobContainerUrl(`value`)
  }

  public open fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

  public open fun azureBlobSasConfiguration(`value`: IResolvable) {
    unwrap(this).setAzureBlobSasConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun azureBlobSasConfiguration(`value`: AzureBlobSasConfigurationProperty) {
    unwrap(this).setAzureBlobSasConfiguration(`value`.let(AzureBlobSasConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cada99c19279ebff001010bf700bca5e722eb542e50b35ea2d0eb41ad3fc4b65")
  public open
      fun azureBlobSasConfiguration(`value`: AzureBlobSasConfigurationProperty.Builder.() -> Unit):
      Unit = azureBlobSasConfiguration(AzureBlobSasConfigurationProperty(`value`))

  public open fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

  public open fun azureBlobType(`value`: String) {
    unwrap(this).setAzureBlobType(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun azureAccessTier(azureAccessTier: String)

    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String)

    public fun azureBlobContainerUrl(azureBlobContainerUrl: String)

    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable)

    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd97209bbceaee8714b90bab2d971e3b0e0cab0fb697fdc1e7a493df4b5704fb")
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty.Builder.() -> Unit)

    public fun azureBlobType(azureBlobType: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.Builder.create(scope, id)

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
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(AzureBlobSasConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd97209bbceaee8714b90bab2d971e3b0e0cab0fb697fdc1e7a493df4b5704fb")
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty.Builder.() -> Unit):
        Unit =
        azureBlobSasConfiguration(AzureBlobSasConfigurationProperty(azureBlobSasConfiguration))

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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationAzureBlob =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationAzureBlob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationAzureBlob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob):
        CfnLocationAzureBlob = CfnLocationAzureBlob(cdkObject)

    internal fun unwrap(wrapped: CfnLocationAzureBlob):
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlob = wrapped.cdkObject
  }

  public interface AzureBlobSasConfigurationProperty {
    public fun azureBlobSasToken(): String

    @CdkDslMarker
    public interface Builder {
      public fun azureBlobSasToken(azureBlobSasToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.builder()

      override fun azureBlobSasToken(azureBlobSasToken: String) {
        cdkBuilder.azureBlobSasToken(azureBlobSasToken)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty,
    ) : CdkObject(cdkObject), AzureBlobSasConfigurationProperty {
      override fun azureBlobSasToken(): String = unwrap(this).getAzureBlobSasToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AzureBlobSasConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty):
          AzureBlobSasConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AzureBlobSasConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
    }
  }
}
