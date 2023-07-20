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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

@CdkDslMarker
public class CfnDataLakeSettingsCreateTableDefaultPermissionsPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.CreateTableDefaultPermissionsProperty.Builder =
        CfnDataLakeSettings.CreateTableDefaultPermissionsProperty.builder()

    public fun build(): CfnDataLakeSettings.CreateTableDefaultPermissionsProperty = cdkBuilder.build()
}
