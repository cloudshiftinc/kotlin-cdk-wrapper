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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a transfer *location* for a Microsoft Azure Blob Storage container.
 *
 * AWS DataSync can use this location as a transfer source or destination.
 *
 * Before you begin, make sure you know [how DataSync accesses Azure Blob
 * Storage](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access)
 * and works with [access
 * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
 * and [blob
 * types](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#blob-types)
 * . You also need a [DataSync
 * agent](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-creating-agent)
 * that can connect to your container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationAzureBlob cfnLocationAzureBlob = CfnLocationAzureBlob.Builder.create(this,
 * "MyCfnLocationAzureBlob")
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
public open class CfnLocationAzureBlob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure
   * Blob Storage container.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure
   * Blob Storage container.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your Azure
   * Blob Storage container.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * The ARN of the Azure Blob Storage transfer location that you created.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the Azure Blob Storage transfer location that you created.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Specifies the access tier that you want your objects or files transferred into.
   */
  public open fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

  /**
   * Specifies the access tier that you want your objects or files transferred into.
   */
  public open fun azureAccessTier(`value`: String) {
    unwrap(this).setAzureAccessTier(`value`)
  }

  /**
   * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
   */
  public open fun azureBlobAuthenticationType(): String =
      unwrap(this).getAzureBlobAuthenticationType()

  /**
   * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
   */
  public open fun azureBlobAuthenticationType(`value`: String) {
    unwrap(this).setAzureBlobAuthenticationType(`value`)
  }

  /**
   * Specifies the URL of the Azure Blob Storage container involved in your transfer.
   */
  public open fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

  /**
   * Specifies the URL of the Azure Blob Storage container involved in your transfer.
   */
  public open fun azureBlobContainerUrl(`value`: String) {
    unwrap(this).setAzureBlobContainerUrl(`value`)
  }

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   */
  public open fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   */
  public open fun azureBlobSasConfiguration(`value`: IResolvable) {
    unwrap(this).setAzureBlobSasConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   */
  public open fun azureBlobSasConfiguration(`value`: AzureBlobSasConfigurationProperty) {
    unwrap(this).setAzureBlobSasConfiguration(`value`.let(AzureBlobSasConfigurationProperty::unwrap))
  }

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cada99c19279ebff001010bf700bca5e722eb542e50b35ea2d0eb41ad3fc4b65")
  public open
      fun azureBlobSasConfiguration(`value`: AzureBlobSasConfigurationProperty.Builder.() -> Unit):
      Unit = azureBlobSasConfiguration(AzureBlobSasConfigurationProperty(`value`))

  /**
   * Specifies the type of blob that you want your objects or files to be when transferring them
   * into Azure Blob Storage.
   */
  public open fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

  /**
   * Specifies the type of blob that you want your objects or files to be when transferring them
   * into Azure Blob Storage.
   */
  public open fun azureBlobType(`value`: String) {
    unwrap(this).setAzureBlobType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies path segments if you want to limit your transfer to a virtual directory in your
   * container (for example, `/my/images` ).
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies path segments if you want to limit your transfer to a virtual directory in your
   * container (for example, `/my/images` ).
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationAzureBlob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     */
    public fun agentArns(vararg agentArns: String)

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
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into. 
     */
    public fun azureAccessTier(azureAccessTier: String)

    /**
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
     *
     * DataSync can access blob storage using a shared access signature (SAS).
     *
     * Default: - "SAS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     */
    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String)

    /**
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer. 
     */
    public fun azureBlobContainerUrl(azureBlobContainerUrl: String)

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable)

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty)

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd97209bbceaee8714b90bab2d971e3b0e0cab0fb697fdc1e7a493df4b5704fb")
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty.Builder.() -> Unit)

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
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage. 
     */
    public fun azureBlobType(azureBlobType: String)

    /**
     * Specifies path segments if you want to limit your transfer to a virtual directory in your
     * container (for example, `/my/images` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ). 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.Builder.create(scope, id)

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     * connect with your Azure Blob Storage container. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

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
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into. 
     */
    override fun azureAccessTier(azureAccessTier: String) {
      cdkBuilder.azureAccessTier(azureAccessTier)
    }

    /**
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
     *
     * DataSync can access blob storage using a shared access signature (SAS).
     *
     * Default: - "SAS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     */
    override fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
      cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    /**
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer. 
     */
    override fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
      cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    override fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(AzureBlobSasConfigurationProperty::unwrap))
    }

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd97209bbceaee8714b90bab2d971e3b0e0cab0fb697fdc1e7a493df4b5704fb")
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: AzureBlobSasConfigurationProperty.Builder.() -> Unit):
        Unit =
        azureBlobSasConfiguration(AzureBlobSasConfigurationProperty(azureBlobSasConfiguration))

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
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage. 
     */
    override fun azureBlobType(azureBlobType: String) {
      cdkBuilder.azureBlobType(azureBlobType)
    }

    /**
     * Specifies path segments if you want to limit your transfer to a virtual directory in your
     * container (for example, `/my/images` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ). 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
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

  /**
   * The shared access signature (SAS) configuration that allows AWS DataSync to access your
   * Microsoft Azure Blob Storage.
   *
   * For more information, see [SAS
   * tokens](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-sas-tokens)
   * for accessing your Azure Blob Storage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * AzureBlobSasConfigurationProperty azureBlobSasConfigurationProperty =
   * AzureBlobSasConfigurationProperty.builder()
   * .azureBlobSasToken("azureBlobSasToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationazureblob-azureblobsasconfiguration.html)
   */
  public interface AzureBlobSasConfigurationProperty {
    /**
     * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
     *
     * The token is part of the SAS URI string that comes after the storage resource URI and a
     * question mark. A token looks something like this:
     *
     * `sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationazureblob-azureblobsasconfiguration.html#cfn-datasync-locationazureblob-azureblobsasconfiguration-azureblobsastoken)
     */
    public fun azureBlobSasToken(): String

    /**
     * A builder for [AzureBlobSasConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param azureBlobSasToken Specifies a SAS token that provides permissions to access your
       * Azure Blob Storage. 
       * The token is part of the SAS URI string that comes after the storage resource URI and a
       * question mark. A token looks something like this:
       *
       * `sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D`
       */
      public fun azureBlobSasToken(azureBlobSasToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.builder()

      /**
       * @param azureBlobSasToken Specifies a SAS token that provides permissions to access your
       * Azure Blob Storage. 
       * The token is part of the SAS URI string that comes after the storage resource URI and a
       * question mark. A token looks something like this:
       *
       * `sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D`
       */
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
      /**
       * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
       *
       * The token is part of the SAS URI string that comes after the storage resource URI and a
       * question mark. A token looks something like this:
       *
       * `sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationazureblob-azureblobsasconfiguration.html#cfn-datasync-locationazureblob-azureblobsasconfiguration-azureblobsastoken)
       */
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
          AzureBlobSasConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          AzureBlobSasConfigurationProperty

      internal fun unwrap(wrapped: AzureBlobSasConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
    }
  }
}
