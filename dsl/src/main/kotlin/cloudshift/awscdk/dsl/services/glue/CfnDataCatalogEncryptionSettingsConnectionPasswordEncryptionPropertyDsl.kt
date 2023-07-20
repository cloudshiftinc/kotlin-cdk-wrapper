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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl {
    private val cdkBuilder:
        CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder =
        CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
    }

    public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
    }

    public fun build(): CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty =
        cdkBuilder.build()
}
