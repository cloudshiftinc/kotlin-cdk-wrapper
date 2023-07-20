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
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
import kotlin.String

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsPropsDsl {
    private val cdkBuilder: CfnDataCatalogEncryptionSettingsProps.Builder =
        CfnDataCatalogEncryptionSettingsProps.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    public fun build(): CfnDataCatalogEncryptionSettingsProps = cdkBuilder.build()
}
