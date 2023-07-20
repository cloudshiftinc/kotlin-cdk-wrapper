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
public class CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.ExternalDataFilteringAllowListProperty.Builder =
        CfnDataLakeSettings.ExternalDataFilteringAllowListProperty.builder()

    public fun build(): CfnDataLakeSettings.ExternalDataFilteringAllowListProperty =
        cdkBuilder.build()
}
