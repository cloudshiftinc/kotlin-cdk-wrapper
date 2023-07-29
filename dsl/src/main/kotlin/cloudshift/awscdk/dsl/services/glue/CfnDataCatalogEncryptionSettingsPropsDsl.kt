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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps

/**
 * Properties for defining a `CfnDataCatalogEncryptionSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnDataCatalogEncryptionSettingsProps cfnDataCatalogEncryptionSettingsProps =
 * CfnDataCatalogEncryptionSettingsProps.builder()
 * .catalogId("catalogId")
 * .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty.builder()
 * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .returnConnectionPasswordEncrypted(false)
 * .build())
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .catalogEncryptionMode("catalogEncryptionMode")
 * .sseAwsKmsKeyId("sseAwsKmsKeyId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html)
 */
@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsPropsDsl {
    private val cdkBuilder: CfnDataCatalogEncryptionSettingsProps.Builder =
        CfnDataCatalogEncryptionSettingsProps.builder()

    /** @param catalogId The ID of the Data Catalog in which the settings are created. */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     *   Catalog security.
     */
    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     *   Catalog security.
     */
    public fun dataCatalogEncryptionSettings(
        dataCatalogEncryptionSettings:
            CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
    ) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    public fun build(): CfnDataCatalogEncryptionSettingsProps = cdkBuilder.build()
}
