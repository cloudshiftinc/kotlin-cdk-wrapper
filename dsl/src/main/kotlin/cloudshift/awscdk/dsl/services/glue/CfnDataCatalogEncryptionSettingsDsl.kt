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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataCatalogEncryptionSettings.Builder =
        CfnDataCatalogEncryptionSettings.Builder.create(scope, id)

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
        cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
    }

    public fun build(): CfnDataCatalogEncryptionSettings = cdkBuilder.build()
}
