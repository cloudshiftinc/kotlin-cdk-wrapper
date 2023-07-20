@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl {
    private val cdkBuilder:
        CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder =
        CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder()

    public fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption)
    }

    public fun connectionPasswordEncryption(connectionPasswordEncryption: CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption)
    }

    public fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    public fun encryptionAtRest(encryptionAtRest: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    public fun build(): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty =
        cdkBuilder.build()
}
