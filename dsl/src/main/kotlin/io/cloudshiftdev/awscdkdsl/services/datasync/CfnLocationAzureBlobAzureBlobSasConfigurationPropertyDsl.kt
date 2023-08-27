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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationAzureBlob

/**
 * The shared access signature (SAS) configuration that allows AWS DataSync to access your Microsoft
 * Azure Blob Storage.
 *
 * For more information, see
 * [SAS tokens](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-sas-tokens)
 * for accessing your Azure Blob Storage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * AzureBlobSasConfigurationProperty azureBlobSasConfigurationProperty =
 * AzureBlobSasConfigurationProperty.builder()
 * .azureBlobSasToken("azureBlobSasToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationazureblob-azureblobsasconfiguration.html)
 */
@CdkDslMarker
public class CfnLocationAzureBlobAzureBlobSasConfigurationPropertyDsl {
    private val cdkBuilder: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder =
        CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.builder()

    /**
     * @param azureBlobSasToken Specifies a SAS token that provides permissions to access your Azure
     *   Blob Storage. The token is part of the SAS URI string that comes after the storage resource
     *   URI and a question mark. A token looks something like this:
     *
     * `sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D`
     */
    public fun azureBlobSasToken(azureBlobSasToken: String) {
        cdkBuilder.azureBlobSasToken(azureBlobSasToken)
    }

    public fun build(): CfnLocationAzureBlob.AzureBlobSasConfigurationProperty = cdkBuilder.build()
}
