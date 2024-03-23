@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationAzureBlob`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationAzureBlobProps cfnLocationAzureBlobProps = CfnLocationAzureBlobProps.builder()
 * .agentArns(List.of("agentArns"))
 * .azureBlobAuthenticationType("azureBlobAuthenticationType")
 * // the properties below are optional
 * .azureAccessTier("azureAccessTier")
 * .azureBlobContainerUrl("azureBlobContainerUrl")
 * .azureBlobSasConfiguration(AzureBlobSasConfigurationProperty.builder()
 * .azureBlobSasToken("azureBlobSasToken")
 * .build())
 * .azureBlobType("azureBlobType")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html)
 */
public interface CfnLocationAzureBlobProps {
  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure
   * Blob Storage container.
   *
   * You can specify more than one agent. For more information, see [Using multiple agents for your
   * transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * Specifies the access tier that you want your objects or files transferred into.
   *
   * This only applies when using the location as a transfer destination. For more information, see
   * [Access
   * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
   * .
   *
   * Default: - "HOT"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureaccesstier)
   */
  public fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

  /**
   * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
   *
   * DataSync can access blob storage using a shared access signature (SAS).
   *
   * Default: - "SAS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
   */
  public fun azureBlobAuthenticationType(): String

  /**
   * Specifies the URL of the Azure Blob Storage container involved in your transfer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
   */
  public fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
   */
  public fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

  /**
   * Specifies the type of blob that you want your objects or files to be when transferring them
   * into Azure Blob Storage.
   *
   * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
   * information on blob types, see the [Azure Blob Storage
   * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
   * .
   *
   * Default: - "BLOCK"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobtype)
   */
  public fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

  /**
   * Specifies path segments if you want to limit your transfer to a virtual directory in your
   * container (for example, `/my/images` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your transfer location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationAzureBlobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into.
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     */
    public fun azureAccessTier(azureAccessTier: String)

    /**
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     * DataSync can access blob storage using a shared access signature (SAS).
     */
    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String)

    /**
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer.
     */
    public fun azureBlobContainerUrl(azureBlobContainerUrl: String)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit)

    /**
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     */
    public fun azureBlobType(azureBlobType: String)

    /**
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.builder()

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into.
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     */
    override fun azureAccessTier(azureAccessTier: String) {
      cdkBuilder.azureAccessTier(azureAccessTier)
    }

    /**
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     * DataSync can access blob storage using a shared access signature (SAS).
     */
    override fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
      cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    /**
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer.
     */
    override fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
      cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    override fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty::unwrap))
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit):
        Unit =
        azureBlobSasConfiguration(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty(azureBlobSasConfiguration))

    /**
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     */
    override fun azureBlobType(azureBlobType: String) {
      cdkBuilder.azureBlobType(azureBlobType)
    }

    /**
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps,
  ) : CdkObject(cdkObject), CfnLocationAzureBlobProps {
    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * Specifies the access tier that you want your objects or files transferred into.
     *
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     *
     * Default: - "HOT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureaccesstier)
     */
    override fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

    /**
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
     *
     * DataSync can access blob storage using a shared access signature (SAS).
     *
     * Default: - "SAS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
     */
    override fun azureBlobAuthenticationType(): String =
        unwrap(this).getAzureBlobAuthenticationType()

    /**
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
     */
    override fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     */
    override fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

    /**
     * Specifies the type of blob that you want your objects or files to be when transferring them
     * into Azure Blob Storage.
     *
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     *
     * Default: - "BLOCK"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobtype)
     */
    override fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

    /**
     * Specifies path segments if you want to limit your transfer to a virtual directory in your
     * container (for example, `/my/images` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationAzureBlobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps):
        CfnLocationAzureBlobProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationAzureBlobProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationAzureBlobProps):
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps
  }
}
