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
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps

/**
 * Properties for defining a `CfnLocationAzureBlob`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
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
@CdkDslMarker
public class CfnLocationAzureBlobPropsDsl {
    private val cdkBuilder: CfnLocationAzureBlobProps.Builder = CfnLocationAzureBlobProps.builder()

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     *   connect with your Azure Blob Storage container. You can specify more than one agent. For
     *   more information, see
     *   [Using multiple agents for your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     *   .
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that can
     *   connect with your Azure Blob Storage container. You can specify more than one agent. For
     *   more information, see
     *   [Using multiple agents for your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     *   .
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    /**
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     *   transferred into. This only applies when using the location as a transfer destination. For
     *   more information, see
     *   [Access tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     *   .
     */
    public fun azureAccessTier(azureAccessTier: String) {
        cdkBuilder.azureAccessTier(azureAccessTier)
    }

    /**
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     *   access your Azure Blob Storage. DataSync can access blob storage using a shared access
     *   signature (SAS).
     */
    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
        cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    /**
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     *   in your transfer.
     */
    public fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
        cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     *   access your Azure Blob Storage.
     */
    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
        cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration)
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     *   access your Azure Blob Storage.
     */
    public fun azureBlobSasConfiguration(
        azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty
    ) {
        cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration)
    }

    /**
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     *   when transferring them into Azure Blob Storage. Currently, DataSync only supports moving
     *   data into Azure Blob Storage as block blobs. For more information on blob types, see the
     *   [Azure Blob Storage documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     *   .
     */
    public fun azureBlobType(azureBlobType: String) {
        cdkBuilder.azureBlobType(azureBlobType)
    }

    /**
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     *   directory in your container (for example, `/my/images` ).
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationAzureBlobProps {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
