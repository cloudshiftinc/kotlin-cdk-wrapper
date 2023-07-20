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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import kotlin.String

@CdkDslMarker
public class CfnDirectoryConfigServiceAccountCredentialsPropertyDsl {
    private val cdkBuilder: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder =
        CfnDirectoryConfig.ServiceAccountCredentialsProperty.builder()

    public fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
    }

    public fun accountPassword(accountPassword: String) {
        cdkBuilder.accountPassword(accountPassword)
    }

    public fun build(): CfnDirectoryConfig.ServiceAccountCredentialsProperty = cdkBuilder.build()
}
