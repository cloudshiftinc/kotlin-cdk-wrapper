@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlob
import software.constructs.Construct

/**
 * Creates a transfer *location* for a Microsoft Azure Blob Storage container.
 *
 * AWS DataSync can use this location as a transfer source or destination.
 *
 * Before you begin, make sure you know
 * [how DataSync accesses Azure Blob Storage](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access)
 * and works with
 * [access tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
 * and
 * [blob types](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#blob-types)
 * . You also need a
 * [DataSync agent](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-creating-agent)
 * that can connect to your container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
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
@CdkDslMarker
public class CfnLocationAzureBlobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationAzureBlob.Builder =
        CfnLocationAzureBlob.Builder.create(scope, id)

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see
     * [Using multiple agents for your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     *
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     *   connect with your Azure Blob Storage container.
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with your
     * Azure Blob Storage container.
     *
     * You can specify more than one agent. For more information, see
     * [Using multiple agents for your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     *
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     *   connect with your Azure Blob Storage container.
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    /**
     * Specifies the access tier that you want your objects or files transferred into.
     *
     * This only applies when using the location as a transfer destination. For more information,
     * see
     * [Access tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     *
     * Default: - "HOT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureaccesstier)
     *
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     *   transferred into.
     */
    public fun azureAccessTier(azureAccessTier: String) {
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
     *
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     *   access your Azure Blob Storage.
     */
    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
        cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    /**
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
     *
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     *   in your transfer.
     */
    public fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
        cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     *
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     *   access your Azure Blob Storage.
     */
    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
        cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration)
    }

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     *
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     *   access your Azure Blob Storage.
     */
    public fun azureBlobSasConfiguration(
        azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
    ) {
        cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration)
    }

    /**
     * Specifies the type of blob that you want your objects or files to be when transferring them
     * into Azure Blob Storage.
     *
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the
     * [Azure Blob Storage documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     *
     * Default: - "BLOCK"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobtype)
     *
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     *   when transferring them into Azure Blob Storage.
     */
    public fun azureBlobType(azureBlobType: String) {
        cdkBuilder.azureBlobType(azureBlobType)
    }

    /**
     * Specifies path segments if you want to limit your transfer to a virtual directory in your
     * container (for example, `/my/images` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
     *
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     *   directory in your container (for example, `/my/images` ).
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     *
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationAzureBlob {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
