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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateLocalNavigationConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.LocalNavigationConfigurationProperty.Builder =
        CfnTemplate.LocalNavigationConfigurationProperty.builder()

    public fun targetSheetId(targetSheetId: String) {
        cdkBuilder.targetSheetId(targetSheetId)
    }

    public fun build(): CfnTemplate.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
